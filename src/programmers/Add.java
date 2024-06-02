package programmers;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        scanner.close();

        for(int i = 0; i <= n; i++) {
         sum += i;
        }
        System.out.println(sum);
    }
}
