package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Pepper";
        actualDog.age=2;
        actualDog.breed="Malshi";
        actualDog.color="Black";
        actualDog.weight=12;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Charlie";
        obj.age=9;
        obj.breed="Shihtzu";
        obj.color="White";
        obj.weight=14;

        obj.sleep();

    }
}
