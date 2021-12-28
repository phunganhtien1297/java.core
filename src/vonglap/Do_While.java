package vonglap;
import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        // String next;
        // do {
        //     Scanner input = new Scanner(System.in);
        //     System.out.println("Nhập tên: ");
        //     String name = input.nextLine();
        //     System.out.println("tên: " + name);
        //     System.out.println("B nhap ten nua k? ");
        //     next = input.nextLine();
        // }
        // while (next.equalsIgnoreCase("y"));
        // System.out.println("Ket thuc");
        int a=1;
        int tong = 0;
        do {
            tong = tong + a; // tong += a;
            a++;
        }while(a<=10);
        System.out.println("tong: " + tong);
    }
}
