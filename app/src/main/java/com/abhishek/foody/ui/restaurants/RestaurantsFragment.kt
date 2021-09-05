package com.abhishek.foody.ui.restaurants

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhishek.foody.R
import com.abhishek.foody.databinding.FragmentRestaurantsBinding
import com.abhishek.foody.model.restaurant.Restaurant
import com.abhishek.foody.util.onQueryTextChanged
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RestaurantsFragment : Fragment(R.layout.fragment_restaurants), RestaurantAdapter.OnItemClickListener {

    private val viewModel: RestaurantViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentRestaurantsBinding.bind(view)
        val restaurantAdapter = RestaurantAdapter(this)

        binding.apply {
            recyclerViewRestaurants.apply {
                adapter = restaurantAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }

        viewModel.restaurants.observe(viewLifecycleOwner) {
            restaurantAdapter.submitList(it)
        }

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_search, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView = searchItem.actionView as SearchView

        searchView.onQueryTextChanged {
            viewModel.searchQuery.value = it
        }
    }

    override fun onItemClick(restaurant: Restaurant) {
        viewModel.onRestaurantSelected(restaurant)
    }
}