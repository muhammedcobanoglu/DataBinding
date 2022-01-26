package com.muhammed.databinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammed.databinding.R
import com.muhammed.databinding.data.fruitList
import com.muhammed.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        val fruitList = fruitList(this.resources)
        val fruitListAdapter = FruitListAdapter(fruitList)
        binding.fruitList.layoutManager = LinearLayoutManager(this)
        binding.fruitList.addItemDecoration(
            DividerItemDecoration(
                binding.fruitList.context,
                (binding.fruitList.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.fruitList.adapter = fruitListAdapter
    }
}