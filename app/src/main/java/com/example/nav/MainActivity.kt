package com.example.nav

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController

class MainActivity : AppCompatActivity() {
     private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frag1=findViewById<Button>(R.id.frag1)
        val frag2:Button=findViewById(R.id.frag2)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        as NavHostFragment
        frag1.setOnClickListener {
            NavHostFragment.findNavController()
        }
        frag2.setOnClickListener {
            findNavController().navigate(R.id.frag2)
        }



    }

}