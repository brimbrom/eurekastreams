/*
 * Copyright (c) 2009 Lockheed Martin Corporation
 *
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
 */
/**
 * 
 */
package org.eurekastreams.server.service.actions.strategies;

import java.io.Serializable;
import java.util.Map;

/**
 *
 */
public interface UpdaterStrategy
{
    /** 
     * The method that will set properties on an instance.
     * The values in the map may be Strings that need to be parsed.
     * 
     * @param instance target on which to set values.
     * @param properties the key/value map for which properties to set to what.
     */
    void setProperties(final Object instance, final Map<String, Serializable> properties);
}
