package com.coderscastle.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_register, container, false)

        val btnLogIn = view.findViewById<Button>(R.id.btnLogIn)
        val btnMain = view.findViewById<Button>(R.id.btnMain)

        btnLogIn.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_logInFragment)
        }
        btnMain.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_mainFragment)
        }


        return view
    }

}