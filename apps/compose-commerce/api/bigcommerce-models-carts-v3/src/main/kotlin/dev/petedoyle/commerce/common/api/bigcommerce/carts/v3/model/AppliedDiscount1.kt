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
 * Example as part of a Cart response:  ``` \"discounts\": [   {     \"id\": 2,     \"discounted_amount\": 2   },   {     \"id\": \"coupon\",     \"discounted_amount\": 0.42   } ] ```
 *
 * @param id ID of the applied discount. Will return
 * @param discountedAmount The discounted amount.
 */
@JsonClass(generateAdapter = true)
data class AppliedDiscount1 (

    /* ID of the applied discount. Will return */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The discounted amount. */
    @Json(name = "discounted_amount")
    val discountedAmount: java.math.BigDecimal? = null

)

