package com.example.cafemenu.utilities

import com.example.cafemenu.entities.Product

class AccumulatePrice {
    companion object {
        fun accumulate(products: Collection<Product>): Double {
            var cost = 0.0
            for (product in products) cost += product.cost
            return cost
        }
    }
}