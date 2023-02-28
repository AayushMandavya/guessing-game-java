import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber=(int)(Math.random()*100)+1;
        Scanner scanner=new Scanner(System.in);
        int attempts=0;
        int userGuess=0;
        do{
            System.out.println("Enter a guess(1-100):");
            userGuess=scanner.nextInt();
            attempts++;
            if(userGuess<secretNumber) {
                System.out.println("Your guess is less than the secret number");
            } else if (userGuess>secretNumber) {
                System.out.println("Your guess is greater than the secret number");


            }else{
                System.out.println("You got it! The secret number is"+secretNumber);
                System.out.println("You toook"+attempts+"attempts");
        }
        }while  (userGuess!=secretNumber);
        scanner.close();
    }
}