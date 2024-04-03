package com.example.rasoifoodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rasoifoodorderingapp.databinding.ActivityLoginBinding
import com.example.rasoifoodorderingapp.databinding.ActivityStartBinding

class login_Activity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.AccountButton.setOnClickListener {
            val intent = Intent (this, signup::class.java)
            startActivity(intent)
        }

        binding.Login.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}