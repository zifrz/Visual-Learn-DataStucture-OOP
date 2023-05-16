package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.OOP

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentOOPListBinding


class OOPList : Fragment() {

    private lateinit var binding: FragmentOOPListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOOPListBinding.inflate(layoutInflater,container,false)




        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvClassesAndObject.setOnClickListener {
                val direction = OOPListDirections.actionOOPListToOOPInfo(classAndObject)
                findNavController().navigate(direction)
            }
            tvAbstraction.setOnClickListener {
                val direction = OOPListDirections.actionOOPListToOOPInfo(abstraction)
                findNavController().navigate(direction)
            }
            tvInheritance.setOnClickListener {
                val direction = OOPListDirections.actionOOPListToOOPInfo(inheritance)
                findNavController().navigate(direction)
            }
            tvEncapsulation.setOnClickListener {
                val direction = OOPListDirections.actionOOPListToOOPInfo(encapsulation)
                findNavController().navigate(direction)
            }
            tvPolymorphism.setOnClickListener {
                val direction = OOPListDirections.actionOOPListToOOPInfo(polymorphism)
                findNavController().navigate(direction)
            }
        }

    }

    companion object {
        const val classAndObject = "CLASS_AND_OBJECT"
        const val abstraction = "ABSTRACTION"
        const val inheritance = "INHERITANCE"
        const val polymorphism = "POLYMORPHISM"
        const val encapsulation = "ENCAPSULATION"
    }

}