package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="SUZZY";
       // System.out.println(name.charAt(1));
        // count how many times the letter Z has appeared
        int counter=0;
        for (int i=0; i<name.length(); i++) {
            if (name.charAt(i) == 'Z') {
                counter++;
            }
        }

            System.out.println(counter);

        }
    }
