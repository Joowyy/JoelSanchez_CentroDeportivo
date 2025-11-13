package com.example.joelsanchez_centrodeportivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.joelsanchez_centrodeportivo.databinding.MainActivityBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}