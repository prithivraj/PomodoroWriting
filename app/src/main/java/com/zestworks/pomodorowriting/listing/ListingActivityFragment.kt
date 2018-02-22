package com.zestworks.pomodorowriting.listing

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zestworks.pomodorowriting.R
import com.zestworks.pomodorowriting.setup.SetupFragment
import kotlinx.android.synthetic.main.fragment_listing.*

/**
 * A placeholder fragment containing a simple view.
 */
class ListingActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_listing, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab.setOnClickListener({
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.parent, SetupFragment(), "SETUP")
            transaction.addToBackStack(null)
            transaction.commit()
        })
    }
}
