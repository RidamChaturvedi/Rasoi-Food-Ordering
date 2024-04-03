package com.example.rasoifoodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rasoifoodorderingapp.databinding.ActivitySignupBinding
import com.example.rasoifoodorderingapp.databinding.ActivityStartBinding

class signup : AppCompatActivity() {
    private val binding : ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.AlreadyButton.setOnClickListener{
    val intent = Intent (this, login_Activity::class.java)
            startActivity(intent)
        }
    }
}