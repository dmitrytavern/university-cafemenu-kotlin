package com.example.cafemenu

import com.example.cafemenu.entities.Order
import com.example.cafemenu.entities.Product
import org.junit.Test

class OrderUnitTest {
    @Test(expected = Exception::class)
    fun init_with_negative_index() {
        Order(1, -1, arrayListOf(
            Product(1, "Ice Cream", 100.0)
        ))
    }

    @Test(expected = Exception::class)
    fun init_with_empty_list() {
        Order(1, 1, arrayListOf())
    }
}
