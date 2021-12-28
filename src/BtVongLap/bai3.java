package BtVongLap;

import java.util.Scanner;

//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ nhập từ console vào. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        String a = sc.nextLine();
        
        int tong = 0;
        for(int i = 0; i< a.length(); i++) {
            tong += Integer.parseInt(a.substring(i,i+1));
        //    tong += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println("Tong ki tu: "+ tong);

    }
}
