package com.designer.fashion.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.designer.fashion.databinding.MiddlelayoutBinding
import com.designer.fashion.models.ShopByCategoryX

class MiddleAdapter(private val middleData: ArrayList<ShopByCategoryX>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    internal class MiddleLayoutHolder(val middleLayoutBinding: MiddlelayoutBinding) : RecyclerView.ViewHolder(middleLayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = MiddlelayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MiddleLayoutHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MiddleLayoutHolder -> {
                with(holder) {
                    with(middleData) {
                        Glide.with(middleLayoutBinding.tourImage.context)
                            .load(this[position].image)
                            .priority(Priority.IMMEDIATE)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(middleLayoutBinding.tourImage)

                        middleLayoutBinding.tourImage.resume()
                        middleLayoutBinding.tourTitle.text = this[position].name
                        middleLayoutBinding.tourDescription.text = this[position].category_id
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return middleData.size
    }
}