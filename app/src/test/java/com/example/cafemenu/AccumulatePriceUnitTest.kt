package com.example.cafemenu

import com.example.cafemenu.entities.Product
import com.example.cafemenu.utilities.AccumulatePrice
import org.junit.Test

import org.junit.Assert.*

class AccumulatePriceUnitTest {
    @Test
    fun accumulate_zero_is_correct() {
        val products: ArrayList<Product> = arrayListOf()

        val result = AccumulatePrice.accumulate(products)

        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun accumulate_some_is_correct() {
        val products: ArrayList<Product> = arrayListOf(
            Product(0, "Ice Cream", 100.0),
            Product(1, "Pancake", 93.45),
            Product(2, "Susi", 33.11),
        )

        val result = AccumulatePrice.accumulate(products)

        assertEquals(226.56, result, 0.0)
    }
}