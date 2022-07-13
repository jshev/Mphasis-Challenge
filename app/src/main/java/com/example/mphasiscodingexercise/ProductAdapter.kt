package com.example.mphasiscodingexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductAdapter(var productList: List<Product>):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var itemVM = productList[position]
        holder.title.text = itemVM.title
        Picasso.get().load(itemVM.image).into(holder.thumbnail);
        holder.desc.text = itemVM.itemDescription
        holder.price.text = "Price: $" + itemVM.itemPrice
        holder.quantity.text = "Available Quantity: " + itemVM.itemQuantity
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val thumbnail : ImageView
        val desc: TextView
        val quantity: TextView
        val price: TextView

        init {
            title = view.findViewById(R.id.productTitle)
            thumbnail = view.findViewById(R.id.imageView)
            desc = view.findViewById(R.id.productDesc)
            quantity = view.findViewById(R.id.productQuantity)
            price = view.findViewById(R.id.productPrice)
        }
    }
}