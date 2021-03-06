/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl.ha;

import java.time.Duration;

import org.apache.camel.util.ObjectHelper;

public class ClusteredRouteConfiguration implements Cloneable {
    private String namespace;
    private Duration initialDelay;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Duration getInitialDelay() {
        return initialDelay;
    }

    public void setInitialDelay(Duration initialDelay) {
        this.initialDelay = initialDelay;
    }

    // ****************************************
    // Copy
    // ****************************************

    public ClusteredRouteConfiguration copy() {
        try {
            return (ClusteredRouteConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw ObjectHelper.wrapRuntimeCamelException(e);
        }
    }
}
