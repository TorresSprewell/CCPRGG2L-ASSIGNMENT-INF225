import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args)  {
        
    try (Scanner sc = new Scanner(System.in)) {
        String email;
        
            do{
                System.out.print("Enter NU Student email address: "); 
                email = sc.nextLine();
                if(!validateEmail(email)){
                System.out.println("Invalid email address, please try again.");
                }
            } while (!validateEmail(email));
          
        System.out.println("Your email, " + email + " is valid, logging on: ");

   
        String phoneNumber;
            do{
                System.out.print("Enter Philippine mobile phone number to proceed with log-in... "); 
               
                phoneNumber = sc.nextLine();
                if(!validatephoneNumber(phoneNumber)){
                    System.out.println("Invalid phone number, please try again.");
                }
            } while (!validatephoneNumber(phoneNumber));
        
        System.out.print("Your number, " + phoneNumber + " ,is valid logging on. ");
    }

}
public static boolean validateEmail(String email) {
    String emailRegex = ("^.+@students.national-u.edu.ph$");
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validatephoneNumber(String phoneNumber) {
    String phoneNumberRegex = ("09+[0-9]{9,9}");
    Pattern pattern = Pattern.compile(phoneNumberRegex);
    Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    
    }

    
    }
