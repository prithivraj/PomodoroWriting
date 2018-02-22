package com.zestworks.pomodorowriting.setup


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zestworks.pomodorowriting.R
import com.zestworks.pomodorowriting.editor.EditorFragment
import kotlinx.android.synthetic.main.fragment_setup.*


/**
 * A simple [Fragment] subclass.
 */
class SetupFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_setup, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start.setOnClickListener({
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.parent, EditorFragment(), "EDITOR")
            transaction.commit()
        })
    }

}// Required empty public constructor
