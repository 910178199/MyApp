package com.example.superman.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /**
     * val v1 =num?.toInt() //不做处理返回 null

    val v2 =num?.toInt() ?:0 //判断为空时返回0

    val v3 =num!!.toInt() //抛出空指针异常（用“!!”表示不能为空）
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
