package com.sqrtf.megumin.homefragment

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.sqrtf.megumin.R

class MediumCardHolder(view: View) : ViewHolder(view) {
    val image = view.findViewById<ImageView>(R.id.imageView)
    val title = view.findViewById<TextView>(R.id.title)
    val subtitle = view.findViewById<TextView?>(R.id.subtitle)
    val new = view.findViewById<TextView?>(R.id.new_count)
    val eps = view.findViewById<TextView?>(R.id.eps)
}
