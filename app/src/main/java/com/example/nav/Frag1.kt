package com.example.nav

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class Frag1 : Fragment(R.layout.fragment_frag1) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val click=view.findViewById<Button>(R.id.frag1Button)
            click.setOnClickListener {
            findNavController().navigate(R.id.action_Frag1_to_Frag2)
                Log.d(".Frag", "Error here")

        }
    }



    }

