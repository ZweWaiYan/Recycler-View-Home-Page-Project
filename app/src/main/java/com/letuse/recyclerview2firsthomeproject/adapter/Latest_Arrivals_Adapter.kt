package com.letuse.recyclerview2firsthomeproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.model.Lastest_Arrivals_Item
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.*

class Latest_Arrivals_Adapter (var FitemList : ArrayList<Lastest_Arrivals_Item>) : RecyclerView.Adapter<Latest_Arrivals_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(lastestArrivalsItem: Lastest_Arrivals_Item){
            itemView.Latest_Arrivals_Image.setImageResource(lastestArrivalsItem.Image)
            itemView.Latest_Arrivals_Name.text = lastestArrivalsItem.Name
            itemView.Latest_Arrivals_Type.text = lastestArrivalsItem.type
            itemView.Price.text = lastestArrivalsItem.Price
            itemView.ratingBar.rating = lastestArrivalsItem.Rating.toFloat()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.lastest_arrivals_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return FitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(FitemList[position])
    }
}