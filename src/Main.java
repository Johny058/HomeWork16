
public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("BMX");
        Car kia = new Car("Kia Rio");
        Car ford = new Car("Ford focus");
        Truck volvo = new Truck("Volvo");
        Truck scania = new Truck("Scania", '8');

        Transport[] transports = {
                bicycle,
                kia,
                ford,
                volvo,
                scania
        };
        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports) {
            serviceStation.check(transport);
        }
    }
}



