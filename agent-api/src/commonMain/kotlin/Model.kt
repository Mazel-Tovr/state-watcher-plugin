/**
 * Copyright 2020 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.epam.drill.plugins.tracer.common.api

import kotlinx.serialization.*

@Serializable
data class TracerConfig(
    val message: String = "",
)

@Serializable
data class ActionPayload(
    val id: String,
    val name: String,
)

@Serializable
data class StartRecordPayload(
    val recordId: String,
    val refreshRate: Long = 5000L,
)

@Serializable
data class StopRecordPayload(
    val recordId: String,
)

@Serializable
data class StatePayload(
    val recordId: String,
    val agentMetric: AgentMetric,
)

@Serializable
data class AgentMetric(
    val timeStamp: Long,
    val memory: Memory,
)

@Serializable
data class Memory(
    val heap: Long,
)


