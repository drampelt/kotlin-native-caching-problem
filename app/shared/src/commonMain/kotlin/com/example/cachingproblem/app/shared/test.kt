package com.example.cachingproblem.app.shared

import com.example.cachingproblem.shared.data.common.sharedDataCommonDependency
import com.example.cachingproblem.shared.data.sharedDataDependency

val appSharedDependency = listOf("appShared") + sharedDataDependency + sharedDataCommonDependency
