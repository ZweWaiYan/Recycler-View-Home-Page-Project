package com.letuse.recyclerview2firsthomeproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.adapter.Latest_Arrivals_Adapter
import com.letuse.recyclerview2firsthomeproject.model.Lastest_Arrivals_Item
import kotlinx.android.synthetic.main.fragment__latest__arrivals.*

class Fragment_Latest_Arrivals : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__latest__arrivals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var FList = ArrayList<Lastest_Arrivals_Item>()

        FList.add(Lastest_Arrivals_Item(R.drawable.latest_arrivals_one , "Hyde Park N41015" , "LOUIS VUITTION" , "2,11000 KS" , 4.0))
        FList.add(Lastest_Arrivals_Item(R.drawable.latest_arrivals_two , "HORNS PINK LONG SLEEVE T SHIRT" , "Lady Gaga" , "72000 KS" , 5.0))
        FList.add(Lastest_Arrivals_Item(R.drawable.latest_arrivals_one , "Hyde Park N41015" , "LOUIS VUITTION" , "2,11000 KS" , 3.5))

        recyclerView.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = Latest_Arrivals_Adapter(FList)
    }
}