import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if(number < 2){
            count = 1;
        }else {
            for (int i = 2; i*i <= number; i = i + 1) {  // Performance improvement is achieved even when it is not a prime number entered.
                if (number % i == 0) {
                    count = count + 1;
                    break;  // Performance is improved by escaping from the for loop when the first divisor is found.
                }
                System.out.print(i + " ");
            }
        }
        if(count == 0)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }
}
