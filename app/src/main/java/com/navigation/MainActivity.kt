package com.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.navigation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding : activity xml dosyamızda bulunan elementlere güvenli bir şekilde erişimini sağlar.
        binding.button.setOnClickListener {
        val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}