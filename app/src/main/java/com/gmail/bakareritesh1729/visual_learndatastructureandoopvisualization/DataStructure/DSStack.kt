package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R


class DSStack : Fragment() {


    lateinit var stackA: ImageView
    lateinit var stackB: ImageView
    lateinit var stackC: ImageView
    lateinit var stackD: ImageView
    lateinit var stackE: ImageView

    lateinit var topImage: ImageView

    lateinit var push: CardView
    lateinit var pop: CardView

    var top: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_d_s_stack, container, false);

        stackA = view.findViewById(R.id.stack_a)
        stackB = view.findViewById(R.id.stack_b)
        stackC = view.findViewById(R.id.stack_c)
        stackD = view.findViewById(R.id.stack_d)
        stackE = view.findViewById(R.id.stack_e)

        topImage = view.findViewById(R.id.iv_top)

        push = view.findViewById(R.id.btn_push)
        pop = view.findViewById(R.id.btn_pop)


        push.setOnClickListener {
            stackPush()
            top++
        }

        pop.setOnClickListener {
            top--
            stackPop()
        }



        return view
    }

    private fun stackPush() {

        if(top < 1) {
            top=1
        }

        topImage.visibility = View.VISIBLE

        if(top==1) {

            stackA.visibility = View.VISIBLE

            stackA.animate().apply {
                duration=1000
                translationY(-120f)
                topImage.animate().apply {
                    duration=1000
                    translationY(-120f)
                }
            }
        }

        else if (top==2) {
            stackB.visibility = View.VISIBLE
            stackB.animate().apply {
                duration=1000
                translationY(-120f)
                topImage.animate().apply {
                    duration=1000
                    translationY(-360f)
                }
            }
        }
        else if (top==3) {
            stackC.visibility = View.VISIBLE
            stackC.animate().apply {
                duration=1000
                translationY(-120f)
                topImage.animate().apply {
                    duration=1000
                    translationY(-580f)
                }
            }
        }
        else if (top==4) {
            stackD.visibility = View.VISIBLE
            stackD.animate().apply {
                duration=1000
                translationY(-120f)
                topImage.animate().apply {
                    duration=1000
                    translationY(-800f)
                }
            }
        }
        else if (top==5) {
            stackE.visibility = View.VISIBLE
            stackE.animate().apply {
                duration=1000
                translationY(-120f)
                topImage.animate().apply {
                    duration=1000
                    translationY(-1020f)
                }
            }
        }
        else {
            Toast.makeText(context?.applicationContext,"Stack OverFlow", Toast.LENGTH_LONG).show()
        }
    }


    private fun stackPop() {

        if(top > 5) {
            top=5
        }

        if(top==5) {
            stackE.animate().apply {
                duration=1000
                translationY(120f)
            }.withEndAction {
                stackE.visibility = View.GONE
                topImage.animate().apply {
                    duration=1000
                    translationY(-800f)
                }
            }
        }
        else if (top==4) {
            stackD.animate().apply {
                duration=1000
                translationY(120f)
            }.withEndAction {
                stackD.visibility = View.GONE
                topImage.animate().apply {
                    duration=1000
                    translationY(-580f)
                }
            }
        }
        else if (top==3) {
            stackC.animate().apply {
                duration=1000
                translationY(120f)
            }.withEndAction {
                stackC.visibility = View.GONE
                topImage.animate().apply {
                    duration=1000
                    translationY(-360f)
                }
            }
        }
        else if (top==2) {
            stackB.animate().apply {
                duration=1000
                translationY(120f)
            }.withEndAction {
                stackB.visibility = View.GONE
                topImage.animate().apply {
                    duration=1000
                    translationY(-120f)
                }
            }
        }
        else if (top==1) {
            stackA.animate().apply {
                duration=1000
                translationY(120f)
            }.withEndAction {
                stackA.visibility = View.GONE
                topImage.visibility = View.GONE
            }
        }
        else {
            Toast.makeText(context?.applicationContext,"Stack UnderFlow", Toast.LENGTH_LONG).show()
        }


    }

}