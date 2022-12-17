package com.devanshsaxena.cafeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("DEPRECATION")
class DetailedActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var prmenulist : ArrayList<prdata>
    private lateinit var prAdapter: prAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        //............MENU......................//

        recyclerView = findViewById(R.id.prrecyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        prmenulist = ArrayList()

        prmenulist.add(prdata("Samosa","₹17","Mashed Aloo Matar Samosa Deep Fried In Desi Ghee Served With Chutney And Saunth"))
        prmenulist.add(prdata("Bread Pakora","₹25","Mashed Aloo with spicy taste, Properly Baked and served with different Chutney"))
        prmenulist.add(prdata("Paneer Pakora","₹30","Mashed Paneer Aloo mixed Pakora Baked In Desi Ghee Served With Chutney"))
        prmenulist.add(prdata("Sandwich Pakora","₹30","Something Special For You!!"))
        prmenulist.add(prdata("Chana Samosa","₹35","Mashed Chanan Aloo mixed Samosa Deep Fried In Desi Ghee Served With Chutney And Saunth"))
        prmenulist.add(prdata("Samosa Chaat","₹70","Made with Samosa and Papdi,Aloo and Paneer and Properly served with Chutney And Saunth"))
        prmenulist.add(prdata("Chole Kulche","₹70","Desi Style Indian Chole served with baked and fresh Kulce"))
        prmenulist.add(prdata("Bun Samosa","₹40","Samosa Served with baked bun with spicy taste"))
        prmenulist.add(prdata("Pav Bhaji Special","₹70","Propely baked pav with mouth soothing Bhaji served with butter slice"))
        //.........................
        prmenulist.add(prdata("Amritsari Naan","₹80","with Choley, Salad"))
        prmenulist.add(prdata("Butter Naan","₹80","with Choley, Salad"))
        prmenulist.add(prdata("Lacha Naan","₹80","with Choley, Salad"))
        prmenulist.add(prdata("Onian Naan","₹80","with Choley, Salad"))
        prmenulist.add(prdata("Garlic Naan","₹80","with Choley, Salad"))
        prmenulist.add(prdata("Paneer Naan","₹85","with Choley, Salad"))
        prmenulist.add(prdata("Chur Chur Naan","₹85","with Choley, Salad"))
        prmenulist.add(prdata("Mix Naan","₹85","with Choley, Salad"))
        //.......................
        prmenulist.add(prdata("Rajma Rice","₹70","Combo.."))
        prmenulist.add(prdata("Chole Rice","₹70","Combo.."))
        prmenulist.add(prdata("Kadhi Chawal","₹70","Combo.."))
        prmenulist.add(prdata("Daal Chawal","₹70","Combo.."))
        prmenulist.add(prdata("Paneer Gravy Rice","₹85","Combo.."))
        prmenulist.add(prdata("Jeera Paneer Fried Rice","₹80","Combo.."))
        prmenulist.add(prdata("Jeera Masala Fried Rice","₹70","Combo.."))
        prmenulist.add(prdata("Matar Masala Rice","₹70","Combo.."))
        prmenulist.add(prdata("Veg Pulao","₹70","Combo.."))
        //.......................
        prmenulist.add(prdata("STANDARD \n (2 Standard dish + 4 Chapati + Raita + Salad)","₹100","MEAL COMBOS"))
        prmenulist.add(prdata("SOYA CHAP GRAVY \n (4 Roti + Salad)","₹90","MEAL COMBOS"))
        prmenulist.add(prdata("PREMIUM THALI \n (2 Standard dish + 1 Premium + 2 Chapati + Rice + Raita + Salad)","₹180","MEAL COMBOS"))
        prmenulist.add(prdata("EGG CURRY \n ( Butter Naan + Salad)","₹110","MEAL COMBOS"))
        //........................
        prmenulist.add(prdata("Standard Item","₹50","ADD - ON"))
        prmenulist.add(prdata("Premium Item","₹80","ADD - ON"))
        prmenulist.add(prdata("Roti","₹12","ADD - ON"))
        prmenulist.add(prdata("Plain Naan","₹20","ADD - ON"))
        prmenulist.add(prdata("Butter Naan","₹25","ADD - ON"))
        prmenulist.add(prdata("Rice","₹40","ADD - ON"))
        prmenulist.add(prdata("Raita","₹20","ADD - ON"))
        prmenulist.add(prdata("Egg Curry (3 pcs)","₹110","ADD - ON"))
        prmenulist.add(prdata("Cheese Tomato","₹120","ADD - ON"))
        prmenulist.add(prdata("Kadhai Paneer","₹130","ADD - ON"))
        prmenulist.add(prdata("Matar Paneer","₹130","ADD - ON"))
        prmenulist.add(prdata("Paneer Butter Masala","₹130","ADD - ON"))
        prmenulist.add(prdata("Jeera Aloo","₹70","ADD - ON"))
       //........................
        prmenulist.add(prdata("Hot Coffee","₹25","Beverages"))
        prmenulist.add(prdata("Green Coffee","₹30","Beverages"))
        prmenulist.add(prdata("Black Coffee","₹30","Beverages"))
        prmenulist.add(prdata("Lassi","₹60","Beverages"))
        prmenulist.add(prdata("Cold Coffee","₹60","Beverages"))
        prmenulist.add(prdata("Orio Shake","₹80","Beverages"))
        prmenulist.add(prdata("Chocolate Shake","₹70","Beverages"))
        prmenulist.add(prdata("Butterscotch Shake","₹70","Beverages"))
        prmenulist.add(prdata("Flavour Lassi","₹70","Beverages"))
        prmenulist.add(prdata("Cafe Frappe","₹80","Beverages"))
        prmenulist.add(prdata("Caramel Frappe","₹80","Beverages"))
        prmenulist.add(prdata("Banana Shake","₹60","Beverages"))
        prmenulist.add(prdata("Fresh Lime Soda","₹45","Beverages"))
        prmenulist.add(prdata("Flavour Soda","₹15","Beverages"))
        prmenulist.add(prdata("Mango Shake","₹70","Beverages"))
        prmenulist.add(prdata("Strawberry Shake","₹70","Beverages"))
        //.....................

        prAdapter = prAdapter(prmenulist)
        recyclerView.adapter = prAdapter

        //.............MENU END..................//

        val food = intent.getParcelableExtra<Food>("food")
        if (food!=null){
            val textView : TextView = findViewById(R.id.title01)
            val imageView : ImageView = findViewById(R.id.picture01)

            textView.text= food.name
            imageView.setImageResource(food.image)
        }
    }
}