package com.muhammed.databinding.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.databinding.data.Fruit
import com.muhammed.databinding.databinding.ItemFruitBinding

/**
 * Created by Muhammed COBANOGLU on 26.01.2022.
 */
class FruitListAdapter(private val dataSet: List<Fruit>) :
    RecyclerView.Adapter<FruitListAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemFruitBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruit) {
            binding.fruit = fruit
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFruitBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(dataSet[position])

    override fun getItemCount(): Int = dataSet.size
}