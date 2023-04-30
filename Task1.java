package class12;

public class Task1 {
    public static void main(String[] args) {

        String userName="smlcatindig";
        String password="hello123";
        String confirmPassword="hello123";

        if(userName.isBlank() && password.isBlank()){
            System.out.println("Username or Password cannot be empty");
        }else if(password.length() < 8 ){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain Username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your Username and Password has been created");
        }

    }
}
