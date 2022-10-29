package com.example.chapter7topic1testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter7topic1testing.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var  binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}