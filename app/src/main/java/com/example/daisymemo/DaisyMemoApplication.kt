package com.example.daisymemo

import android.app.Application
import com.naver.maps.map.NaverMapSdk
import io.realm.Realm

class DaisyMemoApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        NaverMapSdk.getInstance(this).setClient(
            NaverMapSdk.NaverCloudPlatformClient("8b4h91oi21")
        )
    }
}