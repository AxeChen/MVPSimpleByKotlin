package com.mg.axe.kotlinmvp.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mg.axe.kotlinmvp.R
import com.mg.axe.kotlinmvp.module.UserBean
import java.util.*


/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description 适配器
 */
class MainListAdapter(context: Context, users: ArrayList<UserBean>?) : Adapter<RecyclerView.ViewHolder>() {

    var array: ArrayList<UserBean>? = null
    var inflater: LayoutInflater? = null

    init {
        array = users
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        bindUserViewHolder(holder, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(inflater?.inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return array?.size ?: 0
    }

    fun bindUserViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is MyViewHolder) {
            var userbean: UserBean? = array?.get(position)
            holder.ivAvatar?.setImageResource(R.mipmap.ic_launcher_round)
            holder.tvDes?.text = userbean?.description
            holder.tvName?.text = userbean?.name
        }
    }

    class MyViewHolder : RecyclerView.ViewHolder {
        var ivAvatar: ImageView? = null
        var tvName: TextView? = null
        var tvDes: TextView? = null

        constructor(itemView: View?) : super(itemView)

        init {
            ivAvatar = itemView.findViewById(R.id.ivAvatar) as ImageView
            tvName = itemView.findViewById(R.id.tvName) as TextView
            tvDes = itemView.findViewById(R.id.tvDescription) as TextView
        }
    }


}