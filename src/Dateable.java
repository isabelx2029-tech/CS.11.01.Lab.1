import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int yourAge = scanner.nextInt();
        int theirAge = yourAge / 2 + 7;
        System.out.print(yourAge + " year olds should date somebody who is at least " + theirAge +  " years old.");
    }
}
