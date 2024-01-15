package com.designer.fashion.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.designer.fashion.R
import com.designer.fashion.databinding.ToplayoutBinding
import com.designer.fashion.models.Category
import com.designer.fashion.utils.clickWithDebounce

class CategoryAdapter(private val homeData: ArrayList<Category>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    internal class TopLayoutHolder(val topLayoutbinding: ToplayoutBinding) : RecyclerView.ViewHolder(topLayoutbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ToplayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val layoutParams = binding.cv.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
        layoutParams.topMargin = 10
        layoutParams.bottomMargin = 10
        binding.cv.layoutParams = layoutParams
        return TopLayoutHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TopLayoutHolder -> {
                with(holder) {
                    with(homeData) {
                        Glide.with(topLayoutbinding.image.context)
                            .load(this[position].category_id)
                            .centerCrop()
                            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(holder.topLayoutbinding.image.context.resources.getDimension(com.intuit.sdp.R.dimen._5sdp).toInt())))
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .error(AppCompatResources.getDrawable(holder.topLayoutbinding.image.context, R.drawable.ic_dashboard_black_24dp))
                            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                            .into(holder.topLayoutbinding.image)

                        topLayoutbinding.tvDescription.text = this[position].category_name

                        topLayoutbinding.image.isClickable = true
                        topLayoutbinding.image.isFocusable = true
                        topLayoutbinding.image.clickWithDebounce {
//                            videoFolderClick.onVideoClick(this)
                        }
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return homeData.size
    }
}