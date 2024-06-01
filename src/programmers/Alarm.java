package programmers;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        scanner.close();

        if(min < 45) { // 45분보다 작은 경우에 hour에서 60분 가져오기
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) { // hour가 0보다 작으면 하루전으로
                hour = 23;
            }
            System.out.println( hour + " " + min );
        } else {
            System.out.println( hour + " " + (min - 45) );
        }
    }
}
