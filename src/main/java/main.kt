package main.java

import javafx.scene.input.KeyCode
import main.java.validator.impl.validators.CityValidator
import main.java.validator.impl.validators.DegreeValidator
import main.java.weather.WeatherDescription
import main.java.weather.WeatherDescriptionImpl
import kotlin.coroutines.experimental.ContinuationInterceptor


interface City {
    var name: String
    var weatherDescription: WeatherDescription
    fun printName(){ print(" ${name} ") }
}


fun main(args: Array<String>) {

        val city: City

        print(INPUT_CITY_NAME_STRING)
        val cityName: String? = readLine()

        print(INPUT_WEATHER_DEGREE_STRING)
        val degree: String? = readLine()

        val degreeValidator = DegreeValidator(degree)
        val cityValidator = CityValidator(cityName)

        val isDegreeValid = degreeValidator.check()
        val isCityValid = cityValidator.check()

        if (isDegreeValid && isCityValid) {
            val weatherDesc = WeatherDescriptionImpl(degree!!.toInt())
            city = createCity(cityName!!, weatherDesc)
            print("В городе")
            city.printName()
            city.weatherDescription.printDescription()
        }
}


private fun createCity(
        name: String,
        desc: WeatherDescription
): City {
    return object : City {
        override var name: String = name
        override var weatherDescription: WeatherDescription = desc
    }
}

