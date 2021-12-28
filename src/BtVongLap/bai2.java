package BtVongLap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
// VD: 1 -> Một, 2 -> Hai, …
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so");

        int a = sc.nextInt();

        switch (a) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            default:
                System.out.println("Err");
        }

    }
}
