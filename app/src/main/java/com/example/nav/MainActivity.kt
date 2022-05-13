package com.example.nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frag1=findViewById<Button>(R.id.frag1)
        val frag2:Button=findViewById(R.id.frag2)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        as NavHostFragment
        navController=navHostFragment.navController//The controller has access to navHostFragment
        frag1.setOnClickListener {
            findNavController().navigate(R.id.frag13)
        }
        frag2.setOnClickListener {
            findNavController().navigate(R.id.frag22)
        }



    }
}