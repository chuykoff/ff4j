package org.ff4j.property.domain;

import org.ff4j.property.Property;
import org.ff4j.property.exception.InvalidPropertyTypeException;

/*
 * #%L
 * ff4j-core
 * %%
 * Copyright (C) 2013 - 2015 Ff4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Représentation of a property double
 *
 * @author Cedrick Lunven (@clunven)
 */
public class PropertyDouble extends Property < Double > {

    /** serial. */
    private static final long serialVersionUID = -134543098672660987L;
    
    /**
     * Constructor by property name.
     *
     * @param name
     *      property name
     */
    public PropertyDouble(String name) {
        super(name);
    }
    
    /**
     * Constructor by string expression.
     *
     * @param uid
     *      unique name
     * @param lvl
     *      current double value
     */
    public PropertyDouble(String uid, String value) {
       super(uid, value);
    }
    
    /**
     * Constructor by T expression.
     *
     * @param uid
     *      unique name
     * @param lvl
     *      current double value
     */
    public PropertyDouble(String uid, Double value) {
       super(uid, value);
    }
    
    /** {@inheritDoc} */
    @Override
    public Double fromString(String v) {
        try {
            return new Double(v);
        } catch(NumberFormatException nbe) {
            throw new InvalidPropertyTypeException("Cannot cast " + v + "to expected " + Double.class, nbe);
        }
    }

}
