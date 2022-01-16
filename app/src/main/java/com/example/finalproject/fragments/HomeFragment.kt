package com.example.finalproject.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.finalproject.LoginActivity
import com.example.finalproject.PasswordChangeActivity
import com.example.finalproject.R
import com.google.firebase.auth.FirebaseAuth

class HomeFragment: Fragment(R.layout.fragment_one) {
    private lateinit var buttonLogout: Button
    private lateinit var buttonPasswordChange:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        buttonLogout = view.findViewById(R.id.buttonLogout)
        buttonPasswordChange = view.findViewById(R.id.buttonPasswordChange)


        buttonLogout.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        buttonPasswordChange.setOnClickListener{
            val intent = Intent(activity,PasswordChangeActivity::class.java)
            startActivity(intent)
        }
    }


}