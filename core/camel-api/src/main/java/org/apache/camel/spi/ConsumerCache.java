/*
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
package org.apache.camel.spi;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.PollingConsumer;
import org.apache.camel.Service;

public interface ConsumerCache extends Service {

    PollingConsumer acquirePollingConsumer(Endpoint endpoint);

    void releasePollingConsumer(Endpoint endpoint, PollingConsumer pollingConsumer);

    Exchange receive(Endpoint endpoint);

    Exchange receive(Endpoint endpoint, long timeout);

    Exchange receiveNoWait(Endpoint endpoint);

    Object getSource();

    int size();

    int getCapacity();

    long getHits();

    long getMisses();

    long getEvicted();

    void resetCacheStatistics();

    void purge();

    void cleanUp();

    EndpointUtilizationStatistics getEndpointUtilizationStatistics();
}