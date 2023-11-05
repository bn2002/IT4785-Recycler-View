package com.bn2002.gmail_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MailAdapter(private val mails: ArrayList<MailModel>): RecyclerView.Adapter<MailAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View): RecyclerView.ViewHolder(row) {
        val fromTextView = row.findViewById(R.id.text_from) as TextView
        val subtitleTextView = row.findViewById(R.id.text_mail_content) as TextView
    }


    override fun getItemCount(): Int {
        return mails.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.mail_list_item, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mail = mails[position]
        holder.fromTextView.text = mail.title
        holder.subtitleTextView.text = mail.content
    }
}