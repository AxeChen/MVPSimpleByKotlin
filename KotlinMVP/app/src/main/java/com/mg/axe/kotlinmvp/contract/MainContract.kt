package com.mg.axe.kotlinmvp.contract

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
class MainContract{

    interface View{
        fun start()
        fun getDataSuccess()
    }

    interface Presenter {
        fun loadData()
    }

    interface Module{
        interface GetDataCallBack{
            fun success()
            fun fail()
        }

        fun getData( callBack: GetDataCallBack)
    }

}