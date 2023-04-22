package com.maixuanlinh.sunflower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil.setContentView

import com.maixuanlinh.sunflower.databinding.ActivityGardenBinding

class GardenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Displaying edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContentView<ActivityGardenBinding>(this, R.layout.activity_garden)

    }
}