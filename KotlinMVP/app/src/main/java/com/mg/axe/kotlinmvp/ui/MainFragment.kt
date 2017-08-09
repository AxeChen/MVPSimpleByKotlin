package com.mg.axe.kotlinmvp.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mg.axe.kotlinmvp.R
import com.mg.axe.kotlinmvp.common.BasePresenter
import com.mg.axe.kotlinmvp.contract.MainContract
import com.mg.axe.kotlinmvp.module.UserBean
import com.mg.axe.kotlinmvp.view.LoadingView
import java.util.*

/**
 * @Author Zaifeng
 * @Create 2017/8/9 0009
 * @Description Content
 */
class MainFragment : Fragment(), MainContract.View {

    var mList: RecyclerView? = null
    var mView: View? = null
    var users: ArrayList<UserBean>? = ArrayList()
    var presenter: MainContract.Presenter? = null
    var progress: LoadingView? = null

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater?.inflate(R.layout.fragment_main, container, false)
        initView()
        return mView
    }

    fun initView() {
        mList = mView?.findViewById(R.id.recyclerView) as RecyclerView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        progress = LoadingView()
        presenter?.start()

    }


    override fun setPresenter(presenter: BasePresenter) {
        if (presenter is MainContract.Presenter) {
            this.presenter = presenter
        }
    }


    override fun showProgress() {
        progress?.show(fragmentManager, "tag")
    }

    override fun dismissProgress() {
        progress?.dismiss()
    }

    override fun getDataSuccess(arrayList: ArrayList<UserBean>) {
        users = arrayList
        initAdapter()
    }

    override fun getDataFail() {
        progress?.dismiss()
        Toast.makeText(activity, "获取数据失败", Toast.LENGTH_SHORT).show()
    }


    fun initAdapter() {
        mList?.layoutManager = LinearLayoutManager(activity)
        mList?.adapter = MainListAdapter(activity, users)

    }


}