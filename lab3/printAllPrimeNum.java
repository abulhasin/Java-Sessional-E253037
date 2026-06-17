import java.util.Scanner;

public class printAllPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] primeArray = new int[end - start + 1];
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeArray[count] = i;
                    count++;
                }
            }
        }

        System.out.println("Prime numbers are:");

        for (int i = 0; i < count; i++) {
            System.out.print(primeArray[i] + " ");
        }

        sc.close();
    }
}
