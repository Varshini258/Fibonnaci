package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int curr = 1, prev = 0;
        int next = 0;
        int noe = 0;

        System.out.println("Enter number of Finonacci elements needed : Min-2, Max-15 : ");
        Scanner sc = new Scanner(System.in);
        noe = sc.nextInt();

        int n = 2;
        int[] fibarr = new int[noe];
        fibarr[0] = prev;
        fibarr[1] = curr;
        {
            int count = 2;
            while (count < noe) {
                next = prev + curr;
                fibarr[count] = next;
                count++;

                prev = curr;
                curr = next;
            }
        }
        {
            System.out.println("enter the number between");
        }



        System.out.println("First " + noe + " elements of Fibonacci series are:");
        for (int i : fibarr)
            System.out.printf("%d, ", i);

    }
}
