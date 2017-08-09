package com.mg.axe.kotlinmvp.view

import android.app.Dialog
import android.app.ProgressDialog
import android.os.Bundle
import android.support.v4.app.DialogFragment

/**
 * Created by Axe on 2017/8/9.
 */
class LoadingView : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var progress: ProgressDialog = ProgressDialog(activity)
        progress.setMessage("正在加载")
        return progress
    }

}