import java.util.Scanner;

public class Main {
    static int number = 0;
    static int count =1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (count<=5) {
            System.out.print("Enter number " + count+ ": " );

            number = number+scanner.nextInt(); // asks for a number and adds it on the "number" variable
            count++;


        }
        System.out.println("Total Number: "+number);
    }
}