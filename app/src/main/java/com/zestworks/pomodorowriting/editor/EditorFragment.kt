package com.zestworks.pomodorowriting.editor


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zestworks.pomodorowriting.R


/**
 * A simple [Fragment] subclass.
 */
class EditorFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_editor, container, false)
    }

}// Required empty public constructor
