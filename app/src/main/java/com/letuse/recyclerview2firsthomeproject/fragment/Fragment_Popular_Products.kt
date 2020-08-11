package com.letuse.recyclerview2firsthomeproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.adapter.Latest_Arrivals_Adapter
import com.letuse.recyclerview2firsthomeproject.adapter.Popular_Products_Adapter
import com.letuse.recyclerview2firsthomeproject.model.Lastest_Arrivals_Item
import com.letuse.recyclerview2firsthomeproject.model.Popular_Products_Item
import kotlinx.android.synthetic.main.fragment__latest__arrivals.*

class Fragment_Popular_Products : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__popular__products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var SList = ArrayList<Popular_Products_Item>()

        SList.add(Popular_Products_Item("NEW", "30 % off", "Iphone 8 Plus", "Apple", "980000 KS", R.drawable.popluar_products_one , 4.0))
        SList.add(Popular_Products_Item("NEW", "34 % off", "GhostBed 11 Inch Cooling Gel Memory Foam.......", "GhostBed", "325000 KS", R.drawable.popluar_products_two , 3.1))
        SList.add(Popular_Products_Item(null, null, "Nintendo Switch - Neon Blue and Red Joy-Con", "Nintendo", "359000 KS", R.drawable.popluar_products_three , 0.5))
        SList.add(Popular_Products_Item("NEW", null, "BELAROI Womens Comfy Swing Tunic Short", "Belaroi", "18990 KS", R.drawable.popluar_products_four , 5.0))

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Popular_Products_Adapter(SList)
    }
}