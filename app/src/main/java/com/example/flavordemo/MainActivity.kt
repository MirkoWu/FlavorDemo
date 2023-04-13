package com.example.flavordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lib2.FlavorManager
import com.example.lib2.Lib2Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val tvContent= findViewById<TextView>(R.id.tvContent)
       val tvContent2= findViewById<TextView>(R.id.tvContent2)
//        tvContent.setText(AbsLib2Test.getAppName(this,"first"))
        //方式1 通过统一入口
        tvContent.setText(FlavorManager.getAppName(this))
        //方式2 直接使用变体中的类
        tvContent2.setText(Lib2Test.getAppName(this))
    }
}