package com.designer.fashion.ui.category

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.designer.fashion.FashionApplication
import com.designer.fashion.databinding.FragmentCategoryBinding
import com.designer.fashion.ui.adapter.CategoryAdapter

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val repository = (requireActivity().application as FashionApplication).categoryRepo
        val categoryViewModel = ViewModelProvider(this, CategoryModelFactory(repository)).get(CategoryViewModel::class.java)

        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        categoryViewModel.homeCategories.observe(viewLifecycleOwner) {
            if (it != null) {
                Log.d("data", "HomeCategories : ${it.categories}")
                binding.rcView.adapter = CategoryAdapter(it.categories)
            } else {
                Log.d("data", "HomeCategories is NULL")
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}