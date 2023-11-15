package com.example.homework9

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.example.homework9.databinding.ItemProductBinding

class ProductAdapter(private var c: Context, private var productList: MutableList<Product>) : BaseAdapter() {

    override fun getCount(): Int {
        return productList.size
    }

    override fun getItem(position: Int): Any {
        return productList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var v: View = View.inflate(c, R.layout.item_product,null)
        var title = v.findViewById<TextView>(R.id.title)
        var price = v.findViewById<TextView>(R.id.price)
        var product = productList[position]

        title.text = product.title
        price.text = "$ ${product.price.toString()}"
        return v
    }

}