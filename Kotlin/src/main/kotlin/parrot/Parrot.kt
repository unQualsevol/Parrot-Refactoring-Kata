package parrot

open class Parrot {

    companion object {
        const val BASE_SPEED: Double = 12.0
        const val MINIMUM_SPEED: Double = 0.0

        fun anEuropeanParrot() = EuropeanParrot()
        fun anAfricanParrot(numberOfCoconuts: Int) = AfricanParrot(numberOfCoconuts)
        fun aNailedParrot() = NailedParrot()
        fun aNorwegianBlueParrot(voltage: Double) = NorwegianBlueParrot(voltage)
    }

}
