package com.example.cafemenu

import com.example.cafemenu.entities.Order
import com.example.cafemenu.entities.Product

class Store {
    private val cart: ArrayList<Product> = arrayListOf()

    fun getSize(): Int {
        return cart.size
    }

    fun addProduct(product: Product) {
        if (cart.contains(product)) {
            throw Exception("Product already exists in cart.")
        }

        cart.add(product)
    }

    fun removeProduct(product: Product) {
        if (!cart.contains(product)) {
            throw Exception("Product not exists in cart.")
        }

        cart.remove(product)
    }

    fun containsProduct(product: Product): Boolean {
        return cart.contains(product)
    }

    fun createOrder(): Order {
        if (getSize() == 0) {
            throw Exception("Cart is empty")
        }

        val order = Order(1, 1, cart.toList())

        cart.clear()
        
        return order
    }
}
