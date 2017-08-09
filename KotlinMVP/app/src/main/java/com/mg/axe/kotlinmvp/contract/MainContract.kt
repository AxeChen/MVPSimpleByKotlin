package com.mg.axe.kotlinmvp.contract

import com.mg.axe.kotlinmvp.common.BasePresenter
import com.mg.axe.kotlinmvp.common.BaseView
import com.mg.axe.kotlinmvp.module.UserBean
import java.util.*

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
class MainContract {

    interface View : BaseView {
        fun showProgress()
        fun dismissProgress()
        fun getDataSuccess(arrayList: ArrayList<UserBean>)
        fun getDataFail()
    }

    interface Presenter : BasePresenter

    interface Module {
        interface GetDataCallBack {
            fun success()
            fun fail()
        }

        fun getData(callBack: GetDataCallBack?)
    }

}