/**
 * Copyright 2004 - 2017 Syncleus, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.syncleus.ferma.graphtypes.javaclass;

import com.syncleus.ferma.GenericClassInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rqpa
 */
public class JavaTypeVertexInitializer<T extends JavaTypeVertex> extends GenericClassInitializer<T>{

    private static Map<String, Object> makeProperties(Map<String, Object> additionalProperties) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("accessModifier", JavaAccessModifier.PUBLIC);
        properties.putAll(additionalProperties);
        return properties;
    }
    
    public JavaTypeVertexInitializer(Class<T> type) {
        this(type, Collections.emptyMap());
    }
    
    public JavaTypeVertexInitializer(Class<T> type, Map<String, Object> additionalProperties) {
        super(type, makeProperties(additionalProperties));
    }
    
}
