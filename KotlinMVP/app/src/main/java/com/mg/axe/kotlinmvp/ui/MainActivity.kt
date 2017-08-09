package com.mg.axe.kotlinmvp.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mg.axe.kotlinmvp.R
import com.mg.axe.kotlinmvp.presenter.MainPresenterImpl

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragment: MainFragment = MainFragment.newInstance()
        fragment.setPresenter(MainPresenterImpl(fragment))
        supportFragmentManager.beginTransaction().replace(R.id.flcontent, fragment).commit()
    }
}
