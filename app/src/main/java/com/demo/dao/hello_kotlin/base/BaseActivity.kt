package com.demo.dao.hello_kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gyf.barlibrary.ImmersionBar

/**
 * Created by dao on 2018/1/27.
 */
abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var immersionBar: ImmersionBar

    protected abstract fun setLayoutId():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initImmersionBar()
    }

    open protected fun initImmersionBar(){
        immersionBar = ImmersionBar.with(this)
        immersionBar.init()
    }
}