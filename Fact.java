import java.util.Scanner;

class Fact {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number :");

            int n = sc.nextInt();

            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is : " + fact);
        }
    }

}
