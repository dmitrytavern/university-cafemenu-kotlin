package com.example.cafemenu

import com.example.cafemenu.entities.Product
import org.junit.Assert.*
import org.junit.Test

class StoreUnitTest {
    @Test()
    fun add_product() {
        val store = Store()
        val product = Product(1, "Ice Cream", 100.0)

        store.addProduct(product)

        assertTrue(store.containsProduct(product))
    }

    @Test(expected = Exception::class)
    fun add_already_exists_product() {
        val store = Store()
        val product = Product(1, "Ice Cream", 100.0)
        store.addProduct(product)
        store.addProduct(product)
    }

    @Test()
    fun remove_exists_product() {
        val store = Store()
        val product = Product(1, "Ice Cream", 100.0)

        store.addProduct(product)

        assertEquals(1, store.getSize())

        store.removeProduct(product)

        assertEquals(0, store.getSize())
    }

    @Test(expected = Exception::class)
    fun remove_not_exists_product() {
        val store = Store()
        val product = Product(1, "Ice Cream", 100.0)
        store.removeProduct(product)
    }

    @Test()
    fun create_order() {
        val store = Store()
        val product = Product(1, "Ice Cream", 100.0)

        store.addProduct(product)

        val order = store.createOrder()

        assertTrue(order.products.contains(product))
    }

    @Test(expected = Exception::class)
    fun create_empty_order() {
        val store = Store()
        store.createOrder()
    }
}