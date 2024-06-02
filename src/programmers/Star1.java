package programmers;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int star = scanner.nextInt();

        scanner.close();

        for(int i = 1; i <= star; i++) { // 줄 수
            for(int j = 1; j <= i; j++) { // 해당 수 만큼 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

