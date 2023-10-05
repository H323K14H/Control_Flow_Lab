import java.util.Scanner;

public class SecretNum {
    public static void main(String[] args) {
        System.out.println("What is the secret number?");

        Scanner sc = new Scanner(System.in);

        int sNum = 8;
        int num = sc.nextInt();

        /*
        I used a while-loop to ensure that the program didn't terminate
        after 2 inputs.
         */

        while (num < sNum) {
            System.out.println("Too low... Have another go:");
            num = sc.nextInt();
        }

        /*
        I am re-using Scanner sc by reassigning it to num.
        It is not good practise to create more than 1 Scanner
        as they are both trying to read from the same input source,
        which can lead to bugs.
        */

        while (num > sNum) {
            System.out.println("Too high... Let's go again:");
            num = sc.nextInt();
        }

        if (num == sNum) {
            System.out.println("You've guessed well...");
        }
    }
}