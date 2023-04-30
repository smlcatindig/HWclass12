package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {
        // create the object of that class
        // ClassName objectName=new Classname();
        // String string=new String("Suzy");
        String string1="Suzy"; // most widely used approach
        System.out.println(string1.length()); // there are 4 letters/characters in the name Suzy

        String name="Ryan Sebastian";

        if(name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }
    }
}
