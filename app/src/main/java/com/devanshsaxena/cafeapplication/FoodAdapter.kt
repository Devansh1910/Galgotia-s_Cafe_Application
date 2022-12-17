package com.devanshsaxena.cafeapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val food: ArrayList<Food>,private val onItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    var onItemClick : ((Food) -> Unit)? = null
    @Suppress("DEPRECATION")
    class FoodViewHolder(itemView: View, onItemClickListener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
            init {
                itemView.setOnClickListener {
                    onItemClickListener.onClick(adapterPosition)
                }
                itemView.setOnLongClickListener {
                    onItemClickListener.onLongClick(adapterPosition)
                    return@setOnLongClickListener true
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FoodViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = food[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(food)
        }
    }

    override fun getItemCount(): Int {
        return food.size
    }

    interface OnItemClickListener {
        fun onClick(position: Int)
        fun onLongClick(position: Int)
    }
}
