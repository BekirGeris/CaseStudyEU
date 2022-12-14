package com.example.casestudyeu.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.casestudyeu.util.Constant
import com.example.casestudyeu.view.FlightListFragment

class CollectionAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        val fragment = FlightListFragment()
        fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
            putInt(Constant.ARG_OBJECT, position + 1)
        }
        return fragment
    }
}