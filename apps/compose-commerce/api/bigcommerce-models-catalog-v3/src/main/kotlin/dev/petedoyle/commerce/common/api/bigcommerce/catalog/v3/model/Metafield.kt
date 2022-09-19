/**
 * Catalog
 *
 * Manage products, brands and categories. To learn more about catalog resources see [Catalog Overview](https://developer.bigcommerce.com/api-docs/catalog/products-overview).  - [Authentication](#authentication) - [Differentiating Variants and Modifiers](#differentiating-variants-and-modifiers) - [Available Endpoints](#available-endpoints) - [Resources](#resources)  ## Authentication Requests can be authenticated by sending an `access_token` via `X-Auth-Token` HTTP header:  ```http GET /stores/{$$.env.store_hash}/v3/catalog/summary host: api.bigcommerce.com Accept: application/json X-Auth-Token: {access_token} ```  |Header|Parameter|Description| |-|-|-| |`X-Auth-Token`|`access_token `|Obtained by creating an API account or installing an app in a BigCommerce control panel.|  ### OAuth Scopes | UI Name  | Permission | Parameter                     | |----------|------------|-------------------------------| | Products | modify     | `store_v2_products`           | | Products | read-only  | `store_v2_products_read_only` |  For more information on OAuth Scopes, see: [Authentication](https://developer.bigcommerce.com/api-docs/getting-started/authentication).  For more information on Authenticating BigCommerce APIs, see: [Authentication](https://developer.bigcommerce.com/api-docs/getting-started/authentication).  ## Differentiating Variants and Modifiers [Variants](https://support.bigcommerce.com/s/article/Product-Options-v3#variations) represent a physical product made up of [Product Option](https://support.bigcommerce.com/s/article/Product-Options-v3) choices, i.e. a large blue t-shirt. Each variant can have a unique SKU.  Modifiers represent a choice a customer makes about a product that doesn't represent a physical item, i.e. text to be printed on a t-shirt. Assigning a SKU to a modifier will turn it into a variant.  See [Variant Options](https://developer.bigcommerce.com/api-docs/catalog/products-overview#variant-options) and [Modifier Options](https://developer.bigcommerce.com/api-docs/catalog/products-overview#modifier-options) for more information.  ## Available Endpoints | Resource / Endpoint                     | Description                                                             | |-----------------------------------------|-------------------------------------------------------------------------| | Brand Images                            | Create and manage brand images                                          | | Brand Metafields                        | Create and manage brand metafields                                      | | Brands                                  | Create and manage brands                                                | | Catalog                                 | Create and manage store categories, products, and brands                | | Categories                              | Create and manage categorties                                           | | Category Images                         | Create and manage category images                                       | | Category Metafields                     | Create and manage category metafields                                   | | Product Bulk Pricing Rules              | Create and manage product bulk pricing rules                            | | Product Complex Rules                   | Create and manage product complex rules                                 | | Product Custom Fields                   | Create and manage product custom fields                                 | | Product Images                          | Create and manage product images                                        | | Product Metafields                      | Create and manage product meta fields                                   | | Product Modifier Images                 | Create and manage product modifer images                                | | Product Modifier Values                 | Create and manage product modifier values                               | | Product Modifiers                       | Create and manage product midifiers                                     | | Product Reviews                         | Create and manage product reviews                                       | | Product Variant Option Values           | Create and manage product variant option values                         | | Product Variant Options                 | Create and manage product variant options                               | | Product Variants                        | Create and manage product variants                                      | | Product Videos                          | Create and manage product videos                                        | | Products                                | Create and manage products                                              | | ProductVariant Metafields               | Create and manage product meta flields                                  | | Variants                                | Get and update all variants                                             |  ## Resources  ### Webhooks * [Products](/api-docs/store-management/webhooks/events#products) * [Categories](/api-docs/store-management/webhooks/events#category) * [SKU](/api-docs/store-management/webhooks/events#sku)
 *
 * The version of the OpenAPI document: 3.0-noerrors
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

package dev.petedoyle.commerce.common.api.bigcommerce.catalog.v3.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Common Metafield properties.
 *
 * @param key The name of the field, for example: `location_id`, `color`. Required for POST. 
 * @param namespace Namespace for the metafield, for organizational purposes. This is set set by the developer. Required for POST. 
 * @param permissionSet Determines the visibility and writeability of the field by other API consumers.  |Value|Description |-|-| |`app_only`|Private to the app that owns the field| |`read`|Visible to other API consumers| |`write`|Open for reading and writing by other API consumers| |`read_and_sf_access`|Visible to other API consumers, including on storefront| |`write_and_sf_access`|Open for reading and writing by other API consumers, including on storefront|
 * @param `value` The value of the field, for example: `1`, `blue`. Required for POST. 
 * @param dateCreated Date and time of the metafield's creation. Read-Only. 
 * @param dateModified Date and time when the metafield was last updated. Read-Only. 
 * @param description Description for the metafields. 
 * @param id Unique ID of the *Metafield*. Read-Only.
 * @param resourceId The ID for the resource with which the metafield is associated. 
 * @param resourceType The type of resource with which the metafield is associated. 
 */
@JsonClass(generateAdapter = true)
data class Metafield (

    /* The name of the field, for example: `location_id`, `color`. Required for POST.  */
    @Json(name = "key")
    val key: kotlin.String,

    /* Namespace for the metafield, for organizational purposes. This is set set by the developer. Required for POST.  */
    @Json(name = "namespace")
    val namespace: kotlin.String,

    /* Determines the visibility and writeability of the field by other API consumers.  |Value|Description |-|-| |`app_only`|Private to the app that owns the field| |`read`|Visible to other API consumers| |`write`|Open for reading and writing by other API consumers| |`read_and_sf_access`|Visible to other API consumers, including on storefront| |`write_and_sf_access`|Open for reading and writing by other API consumers, including on storefront| */
    @Json(name = "permission_set")
    val permissionSet: Metafield.PermissionSet,

    /* The value of the field, for example: `1`, `blue`. Required for POST.  */
    @Json(name = "value")
    val `value`: kotlin.String,

    /* Date and time of the metafield's creation. Read-Only.  */
    @Json(name = "date_created")
    val dateCreated: java.time.OffsetDateTime? = null,

    /* Date and time when the metafield was last updated. Read-Only.  */
    @Json(name = "date_modified")
    val dateModified: java.time.OffsetDateTime? = null,

    /* Description for the metafields.  */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Unique ID of the *Metafield*. Read-Only. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The ID for the resource with which the metafield is associated.  */
    @Json(name = "resource_id")
    val resourceId: kotlin.Int? = null,

    /* The type of resource with which the metafield is associated.  */
    @Json(name = "resource_type")
    val resourceType: Metafield.ResourceType? = null

) {

    /**
     * Determines the visibility and writeability of the field by other API consumers.  |Value|Description |-|-| |`app_only`|Private to the app that owns the field| |`read`|Visible to other API consumers| |`write`|Open for reading and writing by other API consumers| |`read_and_sf_access`|Visible to other API consumers, including on storefront| |`write_and_sf_access`|Open for reading and writing by other API consumers, including on storefront|
     *
     * Values: appOnly,read,write,readAndSfAccess,writeAndSfAccess
     */
    enum class PermissionSet(val value: kotlin.String) {
        @Json(name = "app_only") appOnly("app_only"),
        @Json(name = "read") read("read"),
        @Json(name = "write") write("write"),
        @Json(name = "read_and_sf_access") readAndSfAccess("read_and_sf_access"),
        @Json(name = "write_and_sf_access") writeAndSfAccess("write_and_sf_access");
    }
    /**
     * The type of resource with which the metafield is associated. 
     *
     * Values: category,brand,product,variant
     */
    enum class ResourceType(val value: kotlin.String) {
        @Json(name = "category") category("category"),
        @Json(name = "brand") brand("brand"),
        @Json(name = "product") product("product"),
        @Json(name = "variant") variant("variant");
    }
}

