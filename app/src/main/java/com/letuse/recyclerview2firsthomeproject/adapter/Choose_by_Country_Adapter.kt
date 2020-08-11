package com.letuse.recyclerview2firsthomeproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.model.Choose_by_Country_Item
import kotlinx.android.synthetic.main.choose_by_country_item.view.*

class Choose_by_Country_Adapter (var TitemList : ArrayList<Choose_by_Country_Item>) : RecyclerView.Adapter<Choose_by_Country_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(chooseByCountryItem: Choose_by_Country_Item){
            itemView.Choose_by_Country_Image.setImageResource(chooseByCountryItem.Image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.choose_by_country_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return TitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(TitemList[position])
    }
}