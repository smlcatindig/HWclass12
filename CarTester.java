package class12;

public class CarTester {
    public static void main(String[] args) {
        // below code will create an object of car class

        Car actualCar=new Car();
        actualCar.model="Mercedez Benz";
        actualCar.make="Italy";
        actualCar.color="White";
        actualCar.mileage=50;
        actualCar.isAutomatic=true;

        actualCar.startCar();
        actualCar.stopCar();
        actualCar.turn();

        Car obj=new Car();
        obj.model="Tesla";
        obj.make="American";
        obj.color="Black";
        obj.mileage=80;
        obj.isAutomatic=true;

        obj.stopCar();

    }
}
