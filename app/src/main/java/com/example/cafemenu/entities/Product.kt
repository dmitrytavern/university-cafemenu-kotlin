package com.example.cafemenu.entities

data class Product(
    val id: Int,
    val name: String,
    val cost: Double,
) {
    init {
        require(name.isNotBlank()) { "Name is blank" }
        require(cost > 0.0) { "Cost is less than zero" }
    }
}
