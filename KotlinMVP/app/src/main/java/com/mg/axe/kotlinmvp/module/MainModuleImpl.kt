package com.mg.axe.kotlinmvp.module

import android.os.Handler
import android.os.Looper
import com.mg.axe.kotlinmvp.contract.MainContract

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description 模拟请求数据的接口
 */
class MainModuleImpl : MainContract.Module {

    override fun getData(callBack: MainContract.Module.GetDataCallBack?) {
        Thread(Runnable {
            try {
                Thread.sleep(2000)
            } catch (e: Exception) {

            }
            Handler(Looper.getMainLooper()).post {
                callBack?.success()
            }
//            var a: Int = Random().nextInt(1)
//            if (a == 0) {
//                callBack?.success()
//            } else {
//                callBack?.fail()
//            }
        }).start()
    }

}
