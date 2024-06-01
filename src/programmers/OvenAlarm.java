package programmers;

import java.util.Scanner;

public class OvenAlarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int strhour = scanner.nextInt(); // 요리 시작 시간(시)
        int strmin = scanner.nextInt(); // 요리 시작 시간(분)
        int time = scanner.nextInt(); // 걸리는 시간

        scanner.close();

        strmin = strhour * 60 + strmin; // 완전 분으로 바꾸기
        strmin = strmin + time;

        strhour = (strmin / 60) % 24;
        int min = strmin % 60;

        System.out.println(strhour + " " + min);






    }
}
