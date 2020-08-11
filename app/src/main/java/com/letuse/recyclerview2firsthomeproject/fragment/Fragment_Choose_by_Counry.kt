package com.letuse.recyclerview2firsthomeproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.adapter.Choose_by_Country_Adapter
import com.letuse.recyclerview2firsthomeproject.adapter.Popular_Products_Adapter
import com.letuse.recyclerview2firsthomeproject.model.Choose_by_Country_Item
import com.letuse.recyclerview2firsthomeproject.model.Popular_Products_Item
import kotlinx.android.synthetic.main.fragment__latest__arrivals.*

class Fragment_Choose_by_Counry : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__choose_by__counry, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var SList = ArrayList<Choose_by_Country_Item>()

        SList.add(Choose_by_Country_Item(R.drawable.choose_by_country_one))
        SList.add(Choose_by_Country_Item(R.drawable.choose_by_country_two))
        SList.add(Choose_by_Country_Item(R.drawable.choose_by_country_three))
        SList.add(Choose_by_Country_Item(R.drawable.choose_by_country_four))


        recyclerView.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = Choose_by_Country_Adapter(SList)
        }
    }
}