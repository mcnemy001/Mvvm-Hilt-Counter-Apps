package com.example.counterapps.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.counterapps.R
import com.example.counterapps.databinding.ActivityMainBinding
import com.example.counterapps.viewmodel.CounterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // NIM : 10122384
    // Nama : Aziyusman Maulana
    // Kelas : ANDRO-4
    // Tanggal : 30/05/2025

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.counter.observe(this) { count ->
            binding.txtViewCounter.text = count.toString()
        }

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }

        binding.btnDecrement.setOnClickListener {
            viewModel.decrement()
        }


    }
}