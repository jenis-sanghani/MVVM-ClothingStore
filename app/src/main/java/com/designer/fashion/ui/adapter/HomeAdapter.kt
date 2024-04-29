package com.designer.fashion.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.designer.fashion.R
import com.designer.fashion.databinding.ToplayoutBinding
import com.designer.fashion.models.MainStickyMenu
import com.designer.fashion.models.UnstitchedX
import com.designer.fashion.utils.clickWithDebounce

class HomeAdapter(private val homeData: ArrayList<MainStickyMenu>?, private val middleData: ArrayList<UnstitchedX>?, isAdapter: Int) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var isAdapter: Int

    init {
        this.isAdapter = isAdapter
    }

    internal class TopLayoutHolder(val topLayoutBinding: ToplayoutBinding) : RecyclerView.ViewHolder(topLayoutBinding.root)
//    internal class MiddleLayoutHolder(val topLayoutBinding: TopLayoutBinding) : RecyclerView.ViewHolder(topLayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        /*return when (isAdapter){
            1 -> {
                val binding = TopLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TopLayoutHolder(binding)
            }

            else -> {
                val binding = MiddleLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                MiddleLayoutHolder(binding)
            }
        }*/

        val binding = ToplayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopLayoutHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TopLayoutHolder -> {
                with(holder) {
                    with(homeData) {
                        Glide.with(topLayoutBinding.image.context)
                            .load(this!![position].image)
                            .priority(Priority.IMMEDIATE)
                            .centerCrop()
                            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(holder.topLayoutBinding.image.context.resources.getDimension(com.intuit.sdp.R.dimen._5sdp).toInt())))
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .error(AppCompatResources.getDrawable(topLayoutBinding.image.context, R.drawable.ic_dashboard_black_24dp))
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(topLayoutBinding.image)

                        topLayoutBinding.tvDescription.text = this[position].title

                        topLayoutBinding.image.isClickable = true
                        topLayoutBinding.image.isFocusable = true
                        topLayoutBinding.image.clickWithDebounce {
                        }
                    }
                }
            }
            /*is MiddleLayoutHolder -> {
                with(holder) {
                    with(middleData) {
                        Glide.with(topLayoutBinding.image.context)
                            .load(this!![position].image)
                            .centerCrop()
                            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(context.resources.getDimension(com.intuit.sdp.R.dimen._5sdp).toInt())))
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .error(AppCompatResources.getDrawable(context, R.drawable.ic_dashboard_black_24dp))
                            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                            .into(holder.topLayoutBinding.image)

                        topLayoutBinding.tvDescription.text = this[position].name

                        topLayoutBinding.image.isClickable = true
                        topLayoutBinding.image.isFocusable = true
                    }
                }
            }*/
        }
    }

    override fun getItemCount(): Int {
        return when (isAdapter){
            1 -> {
                homeData!!.size
            }
            else -> {
                middleData!!.size
            }
        }
    }
}