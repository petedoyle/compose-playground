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
package dev.petedoyle.commerce.common.api.bigcommerce.models
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.MetaCollectionFull
import dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model.ProductFull

@JsonClass(generateAdapter = true)
data class ProductCollectionResponse(
    @Json(name = "data")
    val data: List<ProductFull>? = null,

    @Json(name = "meta")
    val meta: MetaCollectionFull? = null,
)
