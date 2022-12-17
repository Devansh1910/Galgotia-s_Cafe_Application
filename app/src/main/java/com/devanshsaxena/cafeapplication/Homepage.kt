package com.devanshsaxena.cafeapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Homepage : AppCompatActivity(),FoodAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        //............................................
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.prstore,"PR STORE"))
        foodList.add(Food(R.drawable.b,"BISTRO"))
        foodList.add(Food(R.drawable.paratha,"CAFE PATSHALA"))
        foodList.add(Food(R.drawable.s,"DALCHINI"))
        foodList.add(Food(R.drawable.burger,"THE QUEENS"))
        foodList.add(Food(R.drawable.adda,"ADDA"))
        foodList.add(Food(R.drawable.cold,"AMUL"))
        foodList.add(Food(R.drawable.eggroll,"KATHI JUNCTION"))
        foodList.add(Food(R.drawable.m,"CHINES CORNER"))
        foodList.add(Food(R.drawable.dessert,"URBAN CAFE"))
        foodList.add(Food(R.drawable.chor,"SWIK JUICE"))
        foodList.add(Food(R.drawable.ma,"SWIK MAGGI POINT"))
        foodList.add(Food(R.drawable.cake,"CAKE(EDIT)"))
        foodList.add(Food(R.drawable.gs,"GENERAL STORE"))

        foodAdapter = FoodAdapter(foodList,this)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this,DetailedActivity::class.java)
            intent.putExtra("food",it)
            startActivity(intent)
        }
    }
    override fun onClick(position: Int) {
        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()
    }

    override fun onLongClick(position: Int) {
        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()
    }
    fun Explore(view: View) {

        val intent = Intent(this,profile::class.java)
        startActivity(intent)
    }
}



