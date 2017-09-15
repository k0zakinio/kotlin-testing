import java.math.RoundingMode
import java.text.DecimalFormat

class SpaceAge(val seconds: Long) {

    private val EARTH_YEAR_SECONDS: Double = 31557600.00
    private val MERCURY_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 0.2408467
    private val VENUS_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 0.61519726
    private val MARS_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 1.8808158
    private val JUPITER_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 11.862615
    private val SATURN_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 29.447498
    private val URANUS_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 84.016846
    private val NEPTUNE_YEAR_SECONDS: Double = EARTH_YEAR_SECONDS * 164.79132

    private fun formatProperly(d: Double): Double {
        val decimalFormat = DecimalFormat().apply {
            roundingMode = RoundingMode.HALF_UP
            maximumFractionDigits = 2
        }
        return decimalFormat.format(d).toDouble()
    }

    fun onEarth(): Double {
        return formatProperly(seconds / EARTH_YEAR_SECONDS)
    }

    fun onMercury(): Double {
        return formatProperly(seconds / MERCURY_YEAR_SECONDS)
    }

    fun onVenus(): Double {
        return formatProperly(seconds / VENUS_YEAR_SECONDS)
    }

    fun onMars(): Double {
        return formatProperly(seconds / MARS_YEAR_SECONDS)
    }

    fun onJupiter(): Double {
        return formatProperly(seconds / JUPITER_YEAR_SECONDS)
    }

    fun onSaturn(): Double {
        return formatProperly(seconds / SATURN_YEAR_SECONDS)
    }

    fun onUranus(): Double {
        return formatProperly(seconds / URANUS_YEAR_SECONDS)
    }

    fun onNeptune(): Double {
        return formatProperly(seconds / NEPTUNE_YEAR_SECONDS)
    }

}