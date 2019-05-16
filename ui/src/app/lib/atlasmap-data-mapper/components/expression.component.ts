/*
Copyright (C) 2017 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
import { Component, ViewChild, Input, HostListener, ElementRef, OnInit } from '@angular/core';
import { ConfigModel } from '../models/config.model';
import { FieldMappingPair } from '../models/mapping.model';
import { ExpressionModel, FieldNode } from '../models/expression.model';
import { Field } from '../models/field.model';

@Component({
  selector: 'expression',
  templateUrl: 'expression.component.html'
})

export class ExpressionComponent implements OnInit {

  @Input()
  configModel: ConfigModel;

  @ViewChild('expressionMarkupRef')
  markup: ElementRef;

  private mapping: FieldMappingPair;

  ngOnInit() {
    this.mapping = this.configModel.mappings.activeMapping.getCurrentFieldMapping();
    if (!this.mapping.transition.expression) {
      this.mapping.transition.expression = new ExpressionModel(this.mapping);
    }
    this.markup.nativeElement.focus();
  }

  @HostListener('keydown', ['$event'])
  onKeydown(event: KeyboardEvent) {
    const expression = this.mapping.transition.expression;
    if ('Enter' === event.key) {
      event.preventDefault();
    } else if ('Backspace' === event.key) {
      // TODO handle cursor position
      event.preventDefault();
      expression.removeLastToken();
    } else if ('Delete' === event.key) {
      // TODO
    }
    this.updateExpressionMarkup();
    this.moveCaretToEnd();
  }

  @HostListener('keypress', ['$event'])
  onKeypress(event: KeyboardEvent) {
    if (event.ctrlKey || event.metaKey || event.altKey) {
      return;
    }
    if (event.key.length > 1) {
      return;
    }

    event.preventDefault();
    const range = window.getSelection().getRangeAt(0);
    const startContainer = range.startContainer;
    const startOffset = range.startOffset;
    const endContainer = range.endContainer;
    const endOffset = range.endOffset;
    // TODO handle cursor position... for now just append to the end
    this.mapping.transition.expression.addText(event.key);
    this.updateExpressionMarkup();
    this.moveCaretToEnd();
  }

  @HostListener('cut', ['$event'])
  onCut(event: ClipboardEvent) {
    // TODO remove only selected area
    this.mapping.transition.expression.clear();
    this.updateExpressionMarkup();
  }

  @HostListener('paste', ['$event'])
  onPaste(event: ClipboardEvent) {
    event.preventDefault();
    const pasted = event.clipboardData.getData('text/plain')
      || window['clipboardData'].getData('Text');
    // TODO handle cursor position... for now just append to the end
    this.mapping.transition.expression.addText(pasted);
    this.updateExpressionMarkup();
    this.moveCaretToEnd();
  }

  @HostListener('dragover', ['$event'])
  allowDrop(event: any): void {
    if (event.preventDefault) {
      event.preventDefault();
    }
    if (event.stopPropagation) {
      event.stopPropagation();
    }
  }

  @HostListener('drop', ['$event'])
  endDrag(event: MouseEvent): void {

    const droppedField: Field = this.configModel.currentDraggedField;
    const currentFieldMapping = this.configModel.mappings.activeMapping.getCurrentFieldMapping();
    if (droppedField === null || currentFieldMapping === null || !droppedField.isSource) {
      return;
    }

    if (droppedField.partOfMapping) {

      // The selected field is part of a different mapping.
      if (!currentFieldMapping.isFieldMapped(droppedField)) {
        return;
      }

    // Pulling an unmapped field into a transition expression evaluation implies a compound selection.
    } else {
      this.configModel.mappingService.fieldSelected(droppedField, true);
    }
    const mappedField = currentFieldMapping.getMappedFieldForField(droppedField, true);
    // TODO handle drop position - for now just append to the end
    this.configModel.mappings.activeMapping.getCurrentFieldMapping().transition.expression.addNode(new FieldNode(mappedField));
    this.updateExpressionMarkup();
    this.moveCaretToEnd();
  }

  private updateExpressionMarkup() {
    this.markup.nativeElement.innerHTML = this.mapping.transition.expression.toHTML();
  }

  private setSelectionRange(startNode: Node, startOffset: number, endNode: Node, endOffset: number) {
    this.markup.nativeElement.focus();
    const selection = window.getSelection();
    const range = selection.getRangeAt(0);
    range.setStart(startNode, startOffset);
    range.setEnd(endNode, endOffset);
  }

  private moveCaretToEnd() {
    this.markup.nativeElement.focus();
    const lastNodeIndex = this.markup.nativeElement.childNodes.length - 1;
    const lastNode = lastNodeIndex > -1 ? this.markup.nativeElement.childNodes[lastNodeIndex] : this.markup.nativeElement;
    const range = window.getSelection().getRangeAt(0);
    range.selectNode(lastNode);
    range.collapse(false);
  }
}
