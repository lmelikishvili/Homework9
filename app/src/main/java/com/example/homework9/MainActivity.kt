package com.example.homework9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.homework9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var gridView: GridView
    private val products = mutableListOf<Product>()
    private val storedProducts = mutableListOf<Product>()
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setProducts()
        products.addAll(storedProducts)



        gridView = binding.productGridView
        productAdapter = ProductAdapter(applicationContext, products)
        gridView.adapter = productAdapter



        val btnParty: LinearLayout = findViewById(R.id.catParty)
        val btnBeach: LinearLayout = findViewById(R.id.catBeach)
        val btnCamp: LinearLayout = findViewById(R.id.catCamping)
        val btnAll: TextView = findViewById(R.id.imgAll)


        btnParty.setOnClickListener {
            products.clear()
            for (p in storedProducts) {
                if (p.category == "party")
                    products.add(p)
            }
            println(products)
            productAdapter.notifyDataSetChanged()
        }

        btnBeach.setOnClickListener {
            products.clear()
            for (p in storedProducts) {
                if (p.category == "beach")
                    products.add(p)
            }
            println(products)
            productAdapter.notifyDataSetChanged()
        }

        btnCamp.setOnClickListener {
            products.clear()
            for (p in storedProducts) {
                if (p.category == "camp")
                    products.add(p)
            }
            println(products)
            productAdapter.notifyDataSetChanged()
        }

        btnAll.setOnClickListener {
            products.clear()
            products.addAll(storedProducts)
            productAdapter.notifyDataSetChanged()
        }
    }

    private fun actionsBtns(){

    }

    private fun setProducts(){
        storedProducts.also {
            it.add(
                Product(
                    image = R.drawable.camp_11,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "camp"

            ))
            it.add(
                Product(
                    image = R.drawable.beach_1,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "beach"

                ))
            it.add(
                Product(
                    image = R.drawable.party_1,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "party"

                ))
            it.add(
                Product(
                    image = R.drawable.camp_2,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "camp"

                ))

            it.add(
                Product(
                    image = R.drawable.camp_11,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "camp"

                ))
            it.add(
                Product(
                    image = R.drawable.beach_1,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "beach"

                ))
            it.add(
                Product(
                    image = R.drawable.party_1,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "party"

                ))
            it.add(
                Product(
                    image = R.drawable.camp_2,
                    title = "Belt suit blazer",
                    price = 120,
                    category = "camp"

                ))
        }

    }
}