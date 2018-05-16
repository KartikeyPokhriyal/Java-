

public class Vehicle {

    int speed;
    String brand;
    String colour;

    final int REFERENCE_ANGLE = 90;

    public Vehicle(int speed, String colour, String brand) {
        this.speed = speed;
        this.colour = colour;
        this.brand = brand;
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

