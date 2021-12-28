package vonglap;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        switch (a){
            case 5: 
                System.out.println("So 5");
                break;
            case 15: 
                System.out.println("So 15");
                break;
            default:
                System.out.println("K hop le");
        }
    }
}
