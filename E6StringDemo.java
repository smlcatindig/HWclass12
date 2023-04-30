package class12;

public class E6StringDemo {
    public static void main(String[] args) {
        String name="Suzy";

        System.out.println(name.equals("Ryan"));
        System.out.println(name.equals("Suzy"));
        System.out.println(name.equalsIgnoreCase("SUZY"));
        System.out.println(!name.equalsIgnoreCase("SUZY"));
    }
}
