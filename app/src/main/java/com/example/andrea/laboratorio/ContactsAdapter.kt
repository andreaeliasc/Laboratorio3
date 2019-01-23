package com.example.andrea.laboratorio
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.contacts_list_item.view

abstract class ContactsAdapter(val items: ArrayList<String>,  val context: Context): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO(reason = "not implemented") /* To change body of created functions use File | Settings | File Templates. */

    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return

        ViewHolder(LayoutInflater.from(context).inflate(R.layout.contacts_list_item, parent, false))

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    holder?.tvContactType?.text = items.get(position)
    }







}

class ViewHolder (view:View):

        RecyclerView.ViewHolder(view){
    val tvContactType = view.tv_contacts_type
}

