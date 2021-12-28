package BtVongLap;

import java.util.Scanner;

//ham fibonacci
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int a = sc.nextInt();
        
        while(a < 2){
            a = sc.nextInt();
        }

        int[] f = new int[a];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i < a; i++){
            f[i] = f[i+1] - f[i+ 2];
        }
        for(int i = 0; i < f.length; i++){
            System.out.println(f[i]+",");
        }

    }
}
