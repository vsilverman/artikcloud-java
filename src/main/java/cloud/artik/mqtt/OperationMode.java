/*
 * Copyright (C) 2017 Samsung Electronics Co., Ltd.
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

package cloud.artik.mqtt;

public enum OperationMode {
    CONNECT,    // connect to broker
    DISCONNECT, // disconnect from broker
    PUBLISH,    // publish a data message
    SUBSCRIBE_ACTIONS,   // subscribe to receive action type messages (AKA Action)
    SUBSCRIBE_ERRORS, // subscribe to receive error messages from error topics
    UNKNOWN
}

