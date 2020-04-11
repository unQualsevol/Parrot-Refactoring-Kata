package parrot

import kotlin.math.max

class AfricanParrot(private val numberOfCoconuts: Int) : Parrot() {

    val speed: Double = max(MINIMUM_SPEED, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts)

    companion object {
        const val LOAD_FACTOR: Double = 9.0
    }
}
