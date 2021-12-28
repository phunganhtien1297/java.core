package BtVongLap;
// Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”

// Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số");
        a= sc.nextInt();
        if(a >= 0) {
            System.out.println("Đây là số nguyên dương");
        }else {
            System.out.println("Đây là số nguyên âm");
        }
    }
}
