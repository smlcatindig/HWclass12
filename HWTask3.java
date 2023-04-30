package class12;

import java.util.Scanner;

public class HWTask3 {
    public static void main(String[] args) {
        /* Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName=scan.nextLine();
        System.out.println("Dad's first name?");
        String dadName=scan.nextLine();
        System.out.println("Boy or Girl?");
        String babyName=scan.nextLine();

        if(babyName.equalsIgnoreCase("boy")) {
            String boyName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
            System.out.println(boyName);
        }else if(babyName.equalsIgnoreCase("girl")){
            String girlName= momName.substring(0,3)+ dadName.substring(dadName.length()-2);
            System.out.println(girlName);
        }

        }
}
