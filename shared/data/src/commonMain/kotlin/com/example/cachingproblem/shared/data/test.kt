package com.example.cachingproblem.shared.data

import com.example.cachingproblem.shared.data.common.sharedDataCommonDependency
import com.example.cachingproblem.shared.data.local.sharedDataLocalDependency
import com.example.cachingproblem.shared.data.network.sharedDataNetworkDependency

val sharedDataDependency = listOf("sharedDataDependency") + sharedDataCommonDependency + sharedDataLocalDependency + sharedDataNetworkDependency
