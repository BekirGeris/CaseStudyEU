package com.example.casestudyeu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.casestudyeu.R
import com.example.casestudyeu.adapter.CollectionAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var demoCollectionAdapter: CollectionAdapter
    private lateinit var viewPager: ViewPager2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        demoCollectionAdapter = CollectionAdapter(this)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = demoCollectionAdapter
    }
}