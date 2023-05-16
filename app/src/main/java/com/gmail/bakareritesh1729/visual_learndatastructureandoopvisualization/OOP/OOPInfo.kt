package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.OOP

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentOOPInfoBinding


class OOPInfo : Fragment() {

    private lateinit var binding: FragmentOOPInfoBinding

    private val args: OOPInfoArgs by navArgs()

    private var topic: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOOPInfoBinding.inflate(layoutInflater, container, false)

        binding.tvInfo.text = topic

        Toast.makeText(context?.applicationContext, "the Topic is $topic !!! ", Toast.LENGTH_SHORT)
            .show()

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        topic = args.oopTopic

    }

}