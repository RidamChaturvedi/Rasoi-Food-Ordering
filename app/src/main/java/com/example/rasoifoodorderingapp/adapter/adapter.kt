package com.example.rasoifoodorderingapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.rasoifoodorderingapp.databinding.PopularItemBinding

class adapter (private val items:List<String>,private val price:List<String>,private val image:List<Int>):RecyclerView.Adapter<adapter.PopularViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }




    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item= items[position]
        val images = image[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class PopularViewHolder(private val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {
       private  val imagesView= binding.imageView5
        fun bind(item: String, price: List<String>, images: Int) {
            binding.food.text=item
            binding.menuPrice.text = price.toString()
            imagesView.setImageResource(images)

        }

    }

}






