package com.designer.fashion.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.designer.fashion.FashionApplication
import com.designer.fashion.databinding.FragmentHomeBinding
import com.designer.fashion.ui.adapter.BottomAdapter
import com.designer.fashion.ui.adapter.HomeAdapter
import com.designer.fashion.ui.adapter.MiddleAdapter
import kotlin.math.abs

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val repository = (requireActivity().application as FashionApplication).homeRepo
        val homeViewModel = ViewModelProvider(this, HomeViewModelFactory(repository)).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeViewModel.homeData.observe(viewLifecycleOwner) {
            if (it != null) {
                Log.d("data", "HomeData : ${it.main_sticky_menu}")
                binding.rcTop.adapter = HomeAdapter(it.main_sticky_menu, null, 1)
            } else {
                Log.d("data", "HomeData is NULL")
            }
        }
        homeViewModel.middleData.observe(viewLifecycleOwner) {
            if (it != null) {
                Log.d("data", "middleData : $it")
                binding.vpMiddle.adapter = MiddleAdapter(it.shop_by_category)
                binding.vpMiddle.currentItem = 1
                binding.vpMiddle.clipToPadding = false
                binding.vpMiddle.clipChildren = false
                binding.vpMiddle.offscreenPageLimit = 3
                binding.vpMiddle.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
                val compositePageTransformer = CompositePageTransformer()
                compositePageTransformer.addTransformer(MarginPageTransformer(35))
                compositePageTransformer.addTransformer { page, position ->
                    val r = 1 - abs(position)
                    page.scaleY = 0.90f + r * 0.10f
                }
                binding.vpMiddle.setPageTransformer(compositePageTransformer)

            } else {
                Log.d("data", "middleData is NULL")
            }
        }
        homeViewModel.bottomData.observe(viewLifecycleOwner) {
            if (it != null) {
                Log.d("data", "bottomData : $it")
                binding.rcBottomA.adapter = BottomAdapter(it.range_of_pattern)
            } else {
                Log.d("data", "bottomData is NULL")
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}