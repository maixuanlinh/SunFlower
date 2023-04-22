package com.maixuanlinh.sunflower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView

import com.maixuanlinh.sunflower.databinding.ActivityGardenBinding

class GardenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView<ActivityGardenBinding>(this, R.layout.activity_garden)

    }
}