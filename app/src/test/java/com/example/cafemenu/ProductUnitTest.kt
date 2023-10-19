package com.example.cafemenu

import com.example.cafemenu.entities.Product
import org.junit.Test

class ProductUnitTest {
    @Test(expected = Exception::class)
    fun init_with_blank_name() {
        Product(1, "", 100.0)
    }

    @Test(expected = Exception::class)
    fun init_with_negative_cost() {
        Product(1, "Ice Cream", -100.0)
    }
}