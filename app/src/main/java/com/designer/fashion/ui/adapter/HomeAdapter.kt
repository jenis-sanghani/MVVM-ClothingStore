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
import com.designer.fashion.models.MainStickyMenu
import com.designer.fashion.models.UnstitchedX
import com.designer.fashion.utils.clickWithDebounce

class HomeAdapter(private val homeData: ArrayList<MainStickyMenu>?, private val middleData: ArrayList<UnstitchedX>?, isAdapter: Int) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var isAdapter: Int

    init {
        this.isAdapter = isAdapter
    }

    internal class TopLayoutHolder(val topLayoutbinding: ToplayoutBinding) : RecyclerView.ViewHolder(topLayoutbinding.root)
//    internal class MiddleLayoutHolder(val topLayoutbinding: ToplayoutBinding) : RecyclerView.ViewHolder(topLayoutbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        /*return when (isAdapter){
            1 -> {
                val binding = ToplayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TopLayoutHolder(binding)
            }

            else -> {
                val binding = MiddlelayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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
                        Glide.with(topLayoutbinding.image.context)
                            .load(this!![position].image)
                            .centerCrop()
                            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(holder.topLayoutbinding.image.context.resources.getDimension(com.intuit.sdp.R.dimen._5sdp).toInt())))
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .error(AppCompatResources.getDrawable(topLayoutbinding.image.context, R.drawable.ic_dashboard_black_24dp))
                            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                            .into(topLayoutbinding.image)

                        topLayoutbinding.tvDescription.text = this[position].title

                        topLayoutbinding.image.isClickable = true
                        topLayoutbinding.image.isFocusable = true
                        topLayoutbinding.image.clickWithDebounce {
                        }
                    }
                }
            }
            /*is MiddleLayoutHolder -> {
                with(holder) {
                    with(middleData) {
                        Glide.with(topLayoutbinding.image.context)
                            .load(this!![position].image)
                            .centerCrop()
                            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(context.resources.getDimension(com.intuit.sdp.R.dimen._5sdp).toInt())))
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .error(AppCompatResources.getDrawable(context, R.drawable.ic_dashboard_black_24dp))
                            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                            .into(holder.topLayoutbinding.image)

                        topLayoutbinding.tvDescription.text = this[position].name

                        topLayoutbinding.image.isClickable = true
                        topLayoutbinding.image.isFocusable = true
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