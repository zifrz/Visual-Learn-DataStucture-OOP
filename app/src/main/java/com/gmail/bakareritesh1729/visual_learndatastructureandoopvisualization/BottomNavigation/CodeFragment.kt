package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BottomNavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentCodeBinding


class CodeFragment : Fragment() {

    private lateinit var binding: FragmentCodeBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCodeBinding.inflate(layoutInflater, container, false)

        binding.webView.settings.javaScriptEnabled = true

        binding.webView.loadUrl("https://www.tutorialspoint.com/compile_cpp_online.php")

        return binding.root
    }


}