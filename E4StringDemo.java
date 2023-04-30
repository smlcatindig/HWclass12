package class12;

public class E4StringDemo {
    public static void main(String[] args) {
        String firstName="Suzy";
        String lastName="Catindig";

        String fullName=firstName+lastName; // most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
