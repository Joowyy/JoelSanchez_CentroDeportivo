package com.example.joelsanchez_centrodeportivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.joelsanchez_centrodeportivo.databinding.LoginActivityBinding

class LoginActivity : ComponentActivity() {

    private lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}