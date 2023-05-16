package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization

import android.util.Patterns

object Constants {

    // function to check the Email is valid or not
    fun isEmailValid(email: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }

}