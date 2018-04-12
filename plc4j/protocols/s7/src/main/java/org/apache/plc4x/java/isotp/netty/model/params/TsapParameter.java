/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.plc4x.java.isotp.netty.model.params;

/**
 * Base class for calling and called TSAPs
 * TODO: I find it strange to have these parameters directly relate to S7 specifics as they should not need to be known in the IsoTP protocol.
 * Optionally it might be a good idea to have some mechanism
 */
public abstract class TsapParameter implements Parameter {

    private final short tsapId;

    public TsapParameter(short tsapId) {
        this.tsapId = tsapId;
    }

    public short getTsapId() {
        return tsapId;
    }

}
