package com.example.kuoti.atk.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.Window
import com.example.kuoti.atk.R

// 從AppCompatActivity改為Activity
class AboutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 取消元件的應用程式標題
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_about)
    }

    // 結束按鈕
    fun clickOk(view: View) {
        // 呼叫這個函式結束Activity元件
        finish()
    }
}
