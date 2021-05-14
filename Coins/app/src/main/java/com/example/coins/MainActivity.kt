package com.example.coins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coins.objects.Coins
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val retrofit = Retrofit.Builder()
                            .baseUrl("https://api.coinranking.com/v1/public/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
    private val api = retrofit.create(CoinsApi::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        api.getCoins().enqueue(object: Callback<Coins>{
            override fun onFailure(call: Call<Coins>, t: Throwable) {
                Log.d("NotWorking",t.message!!)
            }

            override fun onResponse(call: Call<Coins>, response: Response<Coins>) {
                val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
                recyclerView.layoutManager= LinearLayoutManager(this@MainActivity)
                val adapter =CoinAdapter(response.body()!!.data.coins,this@MainActivity)
                recyclerView.adapter=adapter
            }
        })
    }
}

