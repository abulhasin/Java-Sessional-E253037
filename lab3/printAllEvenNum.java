import java.util.Scanner;
public class printAllEvenNum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter starting number: ");
            int start = sc.nextInt();

            System.out.print("Enter ending number: ");
            int end = sc.nextInt();

            int[] evenArray = new int[end - start + 1];
            int count = 0;

            int num = start;
            while (num <= end) {
                if (num % 2 == 0) {
                    evenArray[count] = num;
                    count++;
                }
                num++;
            }

            System.out.println("Even numbers are:");
            for (int i = 0; i < count; i++) {
                System.out.print(evenArray[i] + " ");
            }

            sc.close();
        }
    }
