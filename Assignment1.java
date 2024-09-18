//*************************************************************************************************
// Assignment 1                            Author: Anthony Williams
//
//*************************************************************************************************
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("     A       WWW       WWW");
        System.out.println("    AAA      WWW       WWW");
        System.out.println("   AAAAA     WWW       WWW");
        System.out.println("  AAA AAA    WWW       WWW");
        System.out.println(" AAA   AAA   WWW       WWW");
        System.out.println(" AAA   AAA   WWW       WWW");
        System.out.println(" AAAAAAAAA   WWW       WWW");
        System.out.println(" AAA   AAA   WWW   W   WWW");
        System.out.println(" AAA   AAA    WWW WWW WWW");
        System.out.println(" AAA   AAA     WWW   WWW\n\n\n");
        
        final int BASE = 32;
        final double CONVERTION_FACTOR = 9.0/5.0;
        double celciusTemp;
        int enteredFehrenheit;
        String message,trimmed,reveredTrimmedMessage;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number in Fahrenheight: ");
        enteredFehrenheit = scan.nextInt();
        celciusTemp = (enteredFehrenheit-BASE)/CONVERTION_FACTOR;
        
        scan.nextLine();
        
        System.out.print("Enter a 5-Character string: ");
        message = scan.nextLine();
        trimmed = message.substring(1,4);
        reveredTrimmedMessage = new StringBuilder(trimmed).reverse().toString();
        
        Random generator = new Random();
        System.out.println("Random number Generated Continuing...");
        int randomGeneratedNumber = generator.nextInt(32,16385);

        System.out.println("Your new string is "+ celciusTemp + reveredTrimmedMessage + randomGeneratedNumber);
    }
}