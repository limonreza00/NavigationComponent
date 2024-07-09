package com.coderscastle.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController


class LogInFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_log_in, container, false)

        val btnMain = view.findViewById<Button>(R.id.btnLogIntoMain)

        btnMain.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_mainFragment)
        }

        return view
    }


}