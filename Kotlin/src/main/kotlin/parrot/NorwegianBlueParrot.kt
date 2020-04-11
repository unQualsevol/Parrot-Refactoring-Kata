package parrot

import kotlin.math.min

class NorwegianBlueParrot(voltage: Double) : Parrot() {
    val speed: Double = getBaseSpeed(voltage)

    private fun getBaseSpeed(voltage: Double): Double = min(MAXIMUM_SPEED, voltage * BASE_SPEED)

    companion object {
        const val MAXIMUM_SPEED = 24.0
    }
}