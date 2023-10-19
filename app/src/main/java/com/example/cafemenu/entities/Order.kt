package com.example.cafemenu.entities

data class Order(
    val id: Int,
    val index: Int,
    val products: Collection<Product>,
) {
    init {
        require(index > 0) { "Index is less than zero" }
        require(products.isNotEmpty()) { "Product list is empty" }
    }
}
