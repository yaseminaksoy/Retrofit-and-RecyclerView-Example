package com.example.coins

import android.app.Activity
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coins.objects.Coin
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou

internal class CoinAdapter (val coins: List<Coin>,val activity: Activity) : RecyclerView.Adapter<CoinAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val txtPrice = itemView.findViewById<TextView>(R.id.txtPrice)
        val image = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coin,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coins.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coin:Coin=coins[position]
        holder.txtName.setText(coin.symbol)
        holder.txtPrice.setText(String.format("%10.2f", coin.price))
        GlideToVectorYou.justLoadImage(activity, Uri.parse(coin.iconUrl),holder.image)
    }

}


