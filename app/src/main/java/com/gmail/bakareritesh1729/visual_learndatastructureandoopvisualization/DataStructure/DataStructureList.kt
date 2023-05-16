package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDataStructureListBinding


class DataStructureList : Fragment() {

    private lateinit var binding: FragmentDataStructureListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataStructureListBinding.inflate(inflater, container, false)



        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvArray.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(Array)
                findNavController().navigate(direction)
            }
            tvLinkList.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(LinkList)
                findNavController().navigate(direction)
            }
            tvStack.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(Stack)
                findNavController().navigate(direction)
            }
            tvQueue.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(Queue)
                findNavController().navigate(direction)
            }
            tvTrees.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(Tree)
                findNavController().navigate(direction)
            }
            tvGraph.setOnClickListener {
                val direction =
                    DataStructureListDirections.actionDataStructureListToDataStructureInfo(Graph)
                findNavController().navigate(direction)
            }
        }

    }


    companion object {
        const val Array = "ARRAY"
        const val LinkList = "LINK_LIST"
        const val Stack = "STACK"
        const val Queue = "QUEUE"
        const val Tree = "TREE"
        const val Graph = "GRAPH"
    }
}