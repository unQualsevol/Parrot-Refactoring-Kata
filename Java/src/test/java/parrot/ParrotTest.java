package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static parrot.Parrot.*;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = anEuropeanParrot();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = anAfricanParrot(1);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = anAfricanParrot(2);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = anAfricanParrot(0);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNailed() {
        Parrot parrot = aNailedParrot();
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot() {
        Parrot parrot = aNorwegianBlueParrot(1.5);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_high_voltage() {
        Parrot parrot = aNorwegianBlueParrot(4);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}
