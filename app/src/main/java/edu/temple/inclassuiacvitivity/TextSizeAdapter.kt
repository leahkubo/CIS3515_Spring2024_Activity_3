package edu.temple.inclassuiacvitivity

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _sizes: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val sizes = _sizes

    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null){
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.textSize = 20f
            textView.setPadding(5,10,0,10)
        }
        textView.text = sizes[position].toString()
        textView.textSize = sizes[position].toFloat()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent).apply {
            
        }
    }

}