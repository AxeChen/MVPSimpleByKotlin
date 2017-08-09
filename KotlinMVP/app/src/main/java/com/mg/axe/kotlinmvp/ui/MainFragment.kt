package com.mg.axe.kotlinmvp.ui

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mg.axe.kotlinmvp.R
import com.mg.axe.kotlinmvp.module.UserBean
import java.util.*

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
class MainFragment : Fragment() {

    var mList:RecyclerView? = null
    var mView:View? = null
    var users:ArrayList<UserBean>? = ArrayList()

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater?.inflate(R.layout.fragment_main,container,false)
        initView()
        return mView
    }

    fun initView(){
        mList = mView?.findViewById(R.id.recyclerView) as RecyclerView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initAdapter()
    }

    fun initData(){
        users?.add(UserBean("陈再峰","他是一个逗比"))
        users?.add(UserBean("林小鹏","他是一个学会游泳的大胖子"))
        users?.add(UserBean("孙小伟","王者钻石，所向披靡"))
        users?.add(UserBean("刘小兵","夜店常客，王者坑货"))
        users?.add(UserBean("周小凯","剑网三，突然打人"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
        users?.add(UserBean("哈塞给","投哩呀凯痛，痛，痛"))
    }

    fun initAdapter(){
        mList?.layoutManager = LinearLayoutManager(activity)
        mList?.adapter = MainListAdapter(activity,users)

    }



}