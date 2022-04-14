package pro.sky.java.course2.lesson2;

public class Homework {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        Transport[] waitLit = new Transport[]{car, car2, truck, truck2, bicycle, bicycle2};
        for (int i = 0; i < waitLit.length; i++) {
            Transport currentElement = waitLit[i];
            if (currentElement.getTransportCategory().equals("L")) {
                station.check((Bicycle) currentElement);
            } else if (currentElement.getTransportCategory().equals("M")) {
                station.check((Car) currentElement);
            } else if (currentElement.getTransportCategory().equals("N")) {
                station.check((Truck) currentElement);
            }
        }
    }
}
