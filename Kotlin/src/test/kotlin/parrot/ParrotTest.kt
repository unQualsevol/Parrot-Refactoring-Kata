package parrot

import org.junit.Assert.assertEquals
import org.junit.Test
import parrot.Parrot.Companion.aNailedParrot
import parrot.Parrot.Companion.aNorwegianBlueParrot
import parrot.Parrot.Companion.anAfricanParrot
import parrot.Parrot.Companion.anEuropeanParrot

class ParrotTest {

    @Test
    fun getSpeedOfEuropeanParrot() {
        val parrot = anEuropeanParrot()
        assertEquals(12.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedOfAfricanParrot_With_One_Coconut() {
        val parrot = anAfricanParrot(1)
        assertEquals(3.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedOfAfricanParrot_With_Two_Coconuts() {
        val parrot = anAfricanParrot(2)
        assertEquals(0.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedOfAfricanParrot_With_No_Coconuts() {
        val parrot = anAfricanParrot(0)
        assertEquals(12.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedNailedParrot() {
        val parrot = aNailedParrot()
        assertEquals(0.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedNorwegianBlueParrot_not_nailed() {
        val parrot = NorwegianBlueParrot(1.5)
        assertEquals(18.0, parrot.speed, 0.0)
    }

    @Test
    fun getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        val parrot = aNorwegianBlueParrot(4.0)
        assertEquals(24.0, parrot.speed, 0.0)
    }
}
