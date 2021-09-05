package com.abhishek.foody.ui.restaurants

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.abhishek.foody.databinding.ItemRestaturantBinding
import com.abhishek.foody.model.restaurant.Restaurant

class RestaurantAdapter(private val listener: OnItemClickListener) : ListAdapter<Restaurant, RestaurantAdapter.RestaurantViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val binding = ItemRestaturantBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    inner class RestaurantViewHolder(private val binding: ItemRestaturantBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                root.setOnClickListener {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        val restaurant = getItem(position)
                        listener.onItemClick(restaurant)
                    }
                }
            }
        }

        fun bind(restaurant: Restaurant) {
            binding.apply {
                txtVwRestName.text = restaurant.name
                txtVwCuisine.text = restaurant.cuisineType
                txtVwNeighborhood.text = restaurant.neighborhood
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(restaurant: Restaurant)
    }

    class DiffCallback : DiffUtil.ItemCallback<Restaurant>() {
        override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant) =
            oldItem == newItem
    }
}