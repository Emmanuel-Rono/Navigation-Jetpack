package com.example.nav

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class Frag2 : Fragment(R.layout.fragment_frag2)

{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val click=view.findViewById<Button>(R.id.Frag2)
        click.setOnClickListener {
            findNavController().navigate(R.id.action_Frag2_to_Frag1)
            Log.d(".Fra2", "Error here")
        }

    }



}