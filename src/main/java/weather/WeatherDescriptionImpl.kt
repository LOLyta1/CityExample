package main.java.weather

import main.java.*

class WeatherDescriptionImpl(var degree: Int = 0) : WeatherDescription {

    val typeName = when (degree) {
        in coldWeather.interval -> COLD_WEATHER_STRING
        in normalWeather.interval -> NORMAL_WEATHER_STRING
        in hotWeather.interval -> HOT_WEATHER_STRING
        else -> CATASTROPHIC_WEATHER_STRING
    }

    override fun printDescription() {
        print("${WEATHER_DESCRIPTION_STRING} $typeName")
    }
}