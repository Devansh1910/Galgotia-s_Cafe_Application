package com.devanshsaxena.cafeapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class prAdapter(private val prmenulist:ArrayList<prdata>)
    : RecyclerView.Adapter<prAdapter.PrViewHolder>(){

    class PrViewHolder(pritemView: View) : RecyclerView.ViewHolder(pritemView){
        val title : TextView = pritemView.findViewById(R.id.menu01)
        val cost : TextView = pritemView.findViewById(R.id.cost)
        val tagline : TextView = pritemView.findViewById(R.id.tagline)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_pr_menu,parent,false)
        return PrViewHolder(view)
    }

    override fun onBindViewHolder(holder: PrViewHolder, position: Int) {
        val pr = prmenulist[position]
        holder.title.text = pr.name
        holder.cost.text = pr.cost
        holder.tagline.text = pr.Tagline
    }

    override fun getItemCount(): Int {
        return prmenulist.size
    }
}