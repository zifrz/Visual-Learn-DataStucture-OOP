package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.LoginAndRegister

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.Constants
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.Constants.isEmailValid
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.HomeActivity
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentRegisterScreenBinding
import com.google.firebase.auth.FirebaseAuth


class RegisterScreen : Fragment() {

    private lateinit var binding: FragmentRegisterScreenBinding

    private lateinit var auth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRegisterScreenBinding.inflate(layoutInflater, container, false)

        auth = FirebaseAuth.getInstance()

        // navigating user to Login Screen
        binding.tvSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_registerScreen_to_loginScreen)
        }

        // Register User
        binding.btnRegister.setOnClickListener {

            if (validateCredentials()) {
                val email: String = binding.emailEt.text.toString()
                val password: String = binding.passET.text.toString()
                registerUser(email, password)
            } else {
                Toast.makeText(context?.applicationContext,"",Toast.LENGTH_LONG).show()
            }

        }


        return binding.root
    }

    private fun registerUser(email: String, password: String) {

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    binding.emailEt.setText("")
                    binding.passET.setText("")
                    binding.NameEt.setText("")
                    binding.confirmPassEt.setText("")
                    startActivity(Intent(context?.applicationContext, HomeActivity::class.java))
                } else {
                    Toast.makeText(context?.applicationContext, "", Toast.LENGTH_LONG).show()
                }
            }

    }

    // function to check user Credentials
    private fun validateCredentials(): Boolean {

        if (binding.NameEt.text?.isEmpty() == true) {
            binding.NameEt.error = "Please Enter Your Name "
            return false
        }
        if (binding.emailEt.text?.isEmpty() == true) {
            binding.emailEt.error = "Please Enter Your Email "
            return false
        }
        if (binding.passET.text?.isEmpty() == true) {
            binding.passET.error = "Please Enter Your Password "
            return false
        }
        if (binding.confirmPassEt.text?.isEmpty() == true) {
            binding.confirmPassEt.error = "Please Enter Your Above Password "
            return false
        }
        if (isEmailValid(binding.emailEt.toString())) {
            binding.emailEt.error = "Please Enter an Valid email "
            return false
        }
        if (binding.passET.text.toString() != binding.confirmPassEt.text.toString()) {
            Toast.makeText(
                context?.applicationContext,
                " Enter Correct Password ",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }
        return true
    }

}