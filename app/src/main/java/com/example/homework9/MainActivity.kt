package com.example.homework9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.homework9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var gridView: GridView
    private val products = mutableListOf<Product>()
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        gridView = binding.productGridView
        productAdapter = ProductAdapter(applicationContext, products)
        gridView.adapter = productAdapter

        setProducts()

    }

    private fun setProducts(){
        products.also {
            it.add(
                Product(
                    image = "asdasd",
                    title = "Belt suit blazer",
                    price = 120,
                    category = "zamtariaaa"

            ))
            it.add(
                Product(
                    image = "asdasd",
                    title = "Belt suit blazer",
                    price = 120,
                    category = "zamtariaaa"

                ))
            it.add(
                Product(
                    image = "asdasd",
                    title = "Belt suit blazer",
                    price = 120,
                    category = "zamtariaaa"

                ))
            it.add(
                Product(
                    image = "asdasd",
                    title = "Belt suit blazer",
                    price = 120,
                    category = "zamtariaaa"

                ))
        }
    }
}