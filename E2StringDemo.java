package class12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E2StringDemo {
    public static void main(String[] args) {

        /* write code to check the username and password if the username
        and password are less than 8 characters this message should be printed
        "Signup successful" otherwise you have to print "username and password
        can't be more than 8 characters" */

        String userName="admin";
        String password="pass123";

        if(userName.length()>8 && password.length()>8){
            System.out.println("Username and password can't be more than 8 characters");
        }else{
            System.out.println("Signup successful");
        }

    }
}
