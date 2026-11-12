import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int yourAge = scanner.nextInt();
        int pages = 100 - yourAge;
        System.out.print(yourAge + " year olds should read at least " + pages + " pages before giving up on a book.");
    }
}
