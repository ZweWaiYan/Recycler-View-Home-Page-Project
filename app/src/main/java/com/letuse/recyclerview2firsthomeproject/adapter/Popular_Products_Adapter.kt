package com.letuse.recyclerview2firsthomeproject.adapter

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2firsthomeproject.R
import com.letuse.recyclerview2firsthomeproject.model.Popular_Products_Item
import kotlinx.android.synthetic.main.popular_products_item.view.*

class Popular_Products_Adapter(var SItemList: ArrayList<Popular_Products_Item>) :
    RecyclerView.Adapter<Popular_Products_Adapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(popularProductsItem: Popular_Products_Item) {
            itemView.New_Notice.text = popularProductsItem.New

            //တကယ်လို့ null ဖြစ်ခဲ့ရင် အဲနေရာမှာဘာစာမှမပေါ်စေချင်ဘူး( သူ့နေရာမှာအစား၀◌င် )
//            if (popularProductsItem.New.equals(null)) {
//                itemView.New_Notice.visibility = View.GONE
//            }

            //တကယ်လို့ null ဖြစ်ခဲ့ရင် အဲနေရာမှာဘာစာမှမပေါ်စေချင်ဘူး( သူကကပျောက်နေရပြီးနေရာယူထား )
            if (popularProductsItem.New.equals(null)) {
                itemView.New_Notice.visibility = View.INVISIBLE
            }

            itemView.Discount_Notice.text = popularProductsItem.Discount

            if (popularProductsItem.Discount.equals(null)) {
                itemView.New_Notice.visibility = View.INVISIBLE
            }

            // itemView.Popular_Product_Name.text =  response.body().toString()
            itemView.Popular_Product_Name.text = popularProductsItem.Name
            itemView.Popular_Product_Type.text = popularProductsItem.Type
            itemView.Popular_Product_Price.text = popularProductsItem.Price
            itemView.Popular_Product_Image.setImageResource(popularProductsItem.Image)
            itemView.Rating_bar.rating = popularProductsItem.Rating.toFloat()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.popular_products_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return SItemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(SItemList[position])
    }
}