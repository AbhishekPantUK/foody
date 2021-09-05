package com.abhishek.foody.ui.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhishek.foody.R
import com.abhishek.foody.databinding.FragmentMenusBinding
import com.abhishek.foody.model.restaurantmenu.Category
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment : Fragment(R.layout.fragment_menus), CategoryAdapter.OnItemClickListener {

    private val viewModel: CategoryViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMenusBinding.bind(view)
        val categoryAdapter = CategoryAdapter(this)

        binding.apply {
            recyclerViewCuisineItems.apply {
                adapter = categoryAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }
        viewModel.category.observe(viewLifecycleOwner) {
            categoryAdapter.submitList(it)
        }
    }

    override fun onItemClick(category: Category) {
        viewModel.onCategorySelected(category)
    }
}