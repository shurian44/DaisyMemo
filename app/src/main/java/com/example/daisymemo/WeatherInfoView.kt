package com.example.daisymemo

import android.content.Context
import android.util.AttributeSet
import kotlinx.android.synthetic.main.view_info.view.*

class WeatherInfoView @JvmOverloads constructor(context: Context,
                                                attrs: AttributeSet? = null,
                                                defStyleAttr: Int = 0)
    : InfoView(context, attrs, defStyleAttr) {
    init {
        typeImage.setImageResource(R.drawable.ic_weather)
        infoText.setText("")
    }

    fun setWeather(weatherText: String) {
        if(weatherText.isEmpty()) {
            infoText.setText("날씨정보가 없습니다")
        }
        else {
            infoText.setText(weatherText)
        }
    }
}
