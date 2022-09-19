/**
 * Carts
 *
 * Create a cart using BigCommerce cart logic.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.petedoyle.commerce.common.api.bigcommerce.carts.v3.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param code The [transactional currency](https://developer.bigcommerce.com/api-docs/multi-currency/guide/introduction#multi-currency-definitions) code for the cart as a [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html) formatted string; required when multi-currency is enabled. Passing in a non-transactional display currency will result in a `400` error.
 */
@JsonClass(generateAdapter = true)
data class CartCreatePostDataCurrency (

    /* The [transactional currency](https://developer.bigcommerce.com/api-docs/multi-currency/guide/introduction#multi-currency-definitions) code for the cart as a [ISO-4217](https://www.iso.org/iso-4217-currency-codes.html) formatted string; required when multi-currency is enabled. Passing in a non-transactional display currency will result in a `400` error. */
    @Json(name = "code")
    val code: kotlin.String? = null

)

