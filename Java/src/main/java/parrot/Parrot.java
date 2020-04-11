package parrot;

abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;
    protected static final double MINIMUM_SPEED = 0.0;

    public static EuropeanParrot anEuropeanParrot() {
        return new EuropeanParrot();
    }

    public static AfricanParrot anAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    public static NailedParrot aNailedParrot() {
        return new NailedParrot();
    }

    public static NorwegianBlueParrot aNorwegianBlueParrot(double voltage) {
        return new NorwegianBlueParrot(voltage);
    }

    abstract double getSpeed();

}
