package com.example.kuoti.atk.activity

import android.app.Activity
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import com.example.kuoti.atk.R
import com.example.kuoti.atk.util.fileToImageView

class PictureActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_picture)

        // 取得照片元件
        val picture_view : ImageView = findViewById(R.id.picture_view)

        // 讀取照片檔案名稱
        val pictureName = intent.getStringExtra("pictureName")

        if (!pictureName.isNullOrBlank()) {
            // 設定照片元件
            fileToImageView(pictureName, picture_view)
        }
    }


    fun clickPicture(view: View) {
        // 如果裝置的版本是LOLLIPOP
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAfterTransition()
        } else {
            finish()
        }
    }
}
