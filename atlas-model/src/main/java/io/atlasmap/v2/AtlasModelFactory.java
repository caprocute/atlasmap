/**
 * Copyright (C) 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atlasmap.v2;

import io.atlasmap.v2.MockField;
import io.atlasmap.v2.AtlasMapping;
import io.atlasmap.v2.Collection;
import io.atlasmap.v2.Mapping;
import io.atlasmap.v2.Mappings;
import io.atlasmap.v2.LookupTables;
import io.atlasmap.v2.Properties;

public class AtlasModelFactory {

    @SuppressWarnings("unchecked")
    public static <T extends BaseMapping> T createMapping(MappingType type) {
        T fm = null;
        if (type == null) {
            return null;
        }

        switch(type) {
        case COLLECTION: fm = (T) new Collection(); ((Collection)fm).setMappingType(type); return fm;
        case COMBINE: fm = (T) new Mapping(); ((Mapping)fm).setMappingType(type); return fm;
        case LOOKUP: fm = (T) new Mapping(); ((Mapping)fm).setMappingType(type); return fm;
        case MAP: fm = (T) new Mapping(); ((Mapping)fm).setMappingType(type); return fm;
        case SEPARATE: fm = (T) new Mapping(); ((Mapping)fm).setMappingType(type); return fm;
        default:
            throw new IllegalStateException(String.format("Unsupported mappingType=%s", type.value()));
        }
    }

    public static AtlasMapping createAtlasMapping() {
        AtlasMapping mapping = new AtlasMapping();
        mapping.setMappings(new Mappings());
        mapping.setProperties(new Properties());
        mapping.setLookupTables(new LookupTables());
        return mapping;
    }

    public static Collection createCollection() {
        Collection collectionMapping = new Collection();
        collectionMapping.setMappings(new Mappings());
        collectionMapping.setMappingType(MappingType.COLLECTION);
        return collectionMapping;
    }

    public static MockDocument createMockDocument() {
        MockDocument mockDocument = new MockDocument();
        mockDocument.setFields(new Fields());
        return mockDocument;
    }

    public static MockField createMockField() {
        return new MockField();
    }
    
    public static Mapping cloneMapping(Mapping mapping) {
        Mapping clone = new Mapping();
        clone.setAlias(mapping.getAlias());
        clone.setDelimiter(mapping.getDelimiter());
        clone.setDelimiterString(mapping.getDelimiterString());
        clone.setDescription(mapping.getDescription());
        clone.setLookupTableName(mapping.getLookupTableName());
        clone.setMappingType(MappingType.fromValue(mapping.getMappingType().value()));
        clone.setStrategy(mapping.getStrategy());
        clone.setStrategyClassName(mapping.getStrategyClassName());
        return clone;
    }
}
