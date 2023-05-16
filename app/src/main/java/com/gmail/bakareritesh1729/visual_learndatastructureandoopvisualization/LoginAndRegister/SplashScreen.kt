package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.LoginAndRegister

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentSplashScreenBinding


@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment() {

    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashScreenBinding.inflate(layoutInflater, container, false)


        binding.lottieAnimation.playAnimation()

        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_splashScreen_to_loginScreen)
        }



        return binding.root
    }


}