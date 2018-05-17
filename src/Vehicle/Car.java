


package Vehicle;


class Car {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(30, "Red", "Swift");
        car.accelerate();
        car.decelerate();
        car.steer(30);

        System.out.printf(car.getBrand());
        System.out.printf(car.getColour());
        System.out.println(car.getSpeed());

    }
}
