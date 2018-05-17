


package Vehicle;

import java.util.Objects;

public class Vehicle {

    private int speed;
    private String brand;
    private String colour;

    final int REFERENCE_ANGLE = 90;

    public Vehicle(int speed, String brand, String colour) {
        this.speed = speed;
        this.brand = brand;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(colour, vehicle.colour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(speed, brand, colour);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", REFERENCE_ANGLE=" + REFERENCE_ANGLE +
                '}';
    }

    void accelerate() {
        System.out.println("Increasing the speed to " + ++speed);
    }

    void decelerate() {
        System.out.println("Decreasing the speed to " + --speed);
    }

    void steer(int angle) {
        if (angle < REFERENCE_ANGLE) {
            System.out.println("Move right");
        }
        else if (angle > REFERENCE_ANGLE) {
            System.out.println("Move left");
        }
        else {
            System.out.println("Move straight");
        }
    }
}

