package com.designer.fashion.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.designer.fashion.databinding.BottomlayoutBinding
import com.designer.fashion.models.RangeOfPattern

class BottomAdapter(
    private val bottomDataA: ArrayList<RangeOfPattern>,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    internal class MiddleLayoutHolder(val bottomlayoutBinding: BottomlayoutBinding) :
        RecyclerView.ViewHolder(bottomlayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = BottomlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MiddleLayoutHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MiddleLayoutHolder -> {
                with(holder) {
                    with(bottomDataA) {
                        Glide.with(bottomlayoutBinding.image.context)
                            .load(this[position].image)
                            .into(bottomlayoutBinding.image)

                        bottomlayoutBinding.title.text = this[position].name
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return bottomDataA.size
    }
}