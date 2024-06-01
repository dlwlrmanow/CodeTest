package programmers;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        // 스캐너는 한번만 사용한다고 선언해줘도 된다.
        Scanner scanner = new Scanner(System.in);

        // x, y좌표 받아오기
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // scanner는 사용 후 종료
        scanner.close();

        // 제 n사분면 구별하기
        if( x > 0) {
            if( y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else if ( x < 0 ) {
            if ( y > 0 ) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
