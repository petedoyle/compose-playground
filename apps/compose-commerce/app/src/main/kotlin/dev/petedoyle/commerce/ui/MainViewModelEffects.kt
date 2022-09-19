/*
 * Copyright (C) 2022 Pete Doyle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.petedoyle.commerce.ui

import com.google.android.play.core.appupdate.AppUpdateInfo
import dev.petedoyle.common.mvi.ViewModelEffect

sealed class MainViewModelEffects : ViewModelEffect {
    data class AppUpdateAvailableEffect(val appUpdateInfo: AppUpdateInfo) : MainViewModelEffects()
    object AppUpdateNotAvailableEffect : MainViewModelEffects()
    data class AppUpdateCheckFailedEffect(val e: Exception?) : MainViewModelEffects()
}
