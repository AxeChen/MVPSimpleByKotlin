package com.mg.axe.kotlinmvp.presenter

import com.mg.axe.kotlinmvp.contract.MainContract
import com.mg.axe.kotlinmvp.module.MainModuleImpl
import com.mg.axe.kotlinmvp.module.UserBean
import java.util.*

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
class MainPresenterImpl(val view: MainContract.View) : MainContract.Presenter {

    override fun start() {
        view.showProgress()
        //kotlin匿名内部类写法
        MainModuleImpl().getData(object : MainContract.Module.GetDataCallBack {
            override fun fail() {
                view.dismissProgress()
                view.getDataFail()
            }

            override fun success() {
                view.dismissProgress()
                view.getDataSuccess(buildData())
            }
        })
    }

    fun buildData(): ArrayList<UserBean> {
        val users: ArrayList<UserBean> = ArrayList()
        users.add(UserBean("陈再峰", "他是一个逗比"))
        users.add(UserBean("陈再峰", "他是一个学会游泳的大胖子"))
        users.add(UserBean("陈再峰", "王者钻石，所向披靡"))
        users.add(UserBean("陈再峰", "夜店常客，王者坑货"))
        users.add(UserBean("陈再峰", "剑网三，突然打人"))
        users.add(UserBean("陈再峰", "他是一个逗比"))
        users.add(UserBean("陈再峰", "他是一个学会游泳的大胖子"))
        users.add(UserBean("陈再峰", "王者钻石，所向披靡"))
        users.add(UserBean("陈再峰", "夜店常客，王者坑货"))
        users.add(UserBean("陈再峰", "剑网三，突然打人"))
        users.add(UserBean("陈再峰", "他是一个逗比"))
        users.add(UserBean("陈再峰", "他是一个学会游泳的大胖子"))
        users.add(UserBean("陈再峰", "王者钻石，所向披靡"))
        users.add(UserBean("陈再峰", "夜店常客，王者坑货"))
        users.add(UserBean("陈再峰", "剑网三，突然打人"))
        users.add(UserBean("陈再峰", "他是一个逗比"))
        users.add(UserBean("陈再峰", "他是一个学会游泳的大胖子"))
        users.add(UserBean("陈再峰", "王者钻石，所向披靡"))
        users.add(UserBean("陈再峰", "夜店常客，王者坑货"))
        users.add(UserBean("陈再峰", "剑网三，突然打人"))
        users.add(UserBean("陈再峰", "他是一个逗比"))
        users.add(UserBean("陈再峰", "他是一个学会游泳的大胖子"))
        users.add(UserBean("陈再峰", "王者钻石，所向披靡"))
        users.add(UserBean("陈再峰", "夜店常客，王者坑货"))
        users.add(UserBean("陈再峰", "剑网三，突然打人"))

        return users
    }

}
