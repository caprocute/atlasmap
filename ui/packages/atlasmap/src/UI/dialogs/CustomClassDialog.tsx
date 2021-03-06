import React, {
  FunctionComponent,
  useState,
  useEffect,
  useCallback,
} from "react";

import {
  Form,
  FormGroup,
  FormSelect,
  FormSelectOption,
} from "@patternfly/react-core";

import {
  ConfirmationDialog,
  IConfirmationDialogProps,
} from "./ConfirmationDialog";

interface ValueTypeOption {
  label: string;
  value: string;
}

export interface ICustomClass {
  customClassName: string;
  collectionType: string;
}

export interface ICustomClassDialogProps {
  title: string;
  customClassName: string;
  customClassNames: string[] | null;
  collectionType?: string;
  collectionTypeOptions: ValueTypeOption[];
  isOpen: IConfirmationDialogProps["isOpen"];
  onCancel: IConfirmationDialogProps["onCancel"];
  onConfirm: (constant: ICustomClass) => void;
}
export const CustomClassDialog: FunctionComponent<ICustomClassDialogProps> = ({
  title,
  customClassName: initialCustomClassName = "",
  customClassNames,
  collectionType: initialCollectionType = "",
  collectionTypeOptions,
  isOpen,
  onCancel,
  onConfirm,
}) => {
  const [customClassName, setCustomClassName] = useState(
    initialCustomClassName,
  );
  const [collectionType, setCollectionType] = useState(initialCollectionType);

  const reset = useCallback(() => {
    setCustomClassName(initialCustomClassName);
    setCollectionType(initialCollectionType);
  }, [initialCustomClassName, initialCollectionType]);

  const handleOnConfirm = useCallback(() => {
    onConfirm({
      customClassName: customClassName,
      collectionType: collectionType,
    });
    reset();
  }, [onConfirm, reset, customClassName, collectionType]);

  const handleOnCancel = useCallback(() => {
    onCancel();
    reset();
  }, [onCancel, reset]);

  // make sure to resync the internal state to the values passed in as props
  useEffect(reset, [reset]);

  return (
    <ConfirmationDialog
      title={title}
      onCancel={handleOnCancel}
      onConfirm={customClassName.length > 0 ? handleOnConfirm : undefined}
      isOpen={isOpen}
    >
      <Form>
        <FormGroup
          label={"Custom class name"}
          fieldId={"custom-class-name"}
          isRequired={true}
        >
          <FormSelect
            value={customClassName}
            aria-label={"Select class name"}
            autoFocus={true}
            onChange={setCustomClassName}
            data-testid={"custom-class-name-form-select"}
          >
            {isOpen &&
              customClassNames &&
              customClassNames.map((value, idx) => (
                <FormSelectOption key={idx} value={value} label={value} />
              ))}
          </FormSelect>
        </FormGroup>
        <FormGroup label={"Collection type"} fieldId={"valueType"}>
          <FormSelect
            value={collectionType}
            aria-label={"Select value type"}
            onChange={setCollectionType}
            data-testid={"collection-type-form-select"}
          >
            {collectionTypeOptions.map(({ label, value }, idx) => (
              <FormSelectOption key={idx} value={value} label={label} />
            ))}
          </FormSelect>
        </FormGroup>
      </Form>
    </ConfirmationDialog>
  );
};
