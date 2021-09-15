package com.abhishek.foody.ui.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.abhishek.foody.databinding.ItemCategoriesBinding
import com.abhishek.foody.model.restaurantmenu.Category

class CategoryAdapter(private val listener: OnItemClickListener) :
    ListAdapter<Category, CategoryAdapter.CategoryViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding =
            ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    inner class CategoryViewHolder(private val binding: ItemCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                root.setOnClickListener {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        val category = getItem(position)a
                        listener.onItemClick(category)
                    }
                }
            }
        }

        fun bind(category: Category) {
            binding.apply {
                txtVwCategory.text = category.name
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(category: Category)
    }

    class DiffCallback : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Category, newItem: Category) =
            oldItem == newItem
    }
}