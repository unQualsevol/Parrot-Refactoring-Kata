package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final double MAXIMUM_SPEED = 24.0;
    private final double voltage;

    public NorwegianBlueParrot(double voltage) {
        super();
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MAXIMUM_SPEED, voltage * BASE_SPEED);
    }
}
