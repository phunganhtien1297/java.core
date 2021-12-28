package vonglap;

import java.util.Scanner;

public class V_For {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập số a: ");
    
        // int a = sc.nextInt();
        // for (int i = 0; i < a; i++) {
        //     System.out.println("so "+ i);
        // }
        
        // aa:for(int i = 0; i <= 3; i++) {
        //     bb:for (int j = 0; j < 3; j++) {
        //         if(i==2 && j==2)
        //             break aa;
        //             System.out.println(i + " " + j);
        //     }
        // }

        float a, b, c, denta, x1,x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = sc.nextFloat();
        System.out.println("Nhap so b: ");
        b = sc.nextFloat();
        System.out.println("Nhap so c: ");
        c = sc.nextFloat();

        denta = (b*b)-(4*a*c);

        if(denta < 0){
            System.out.println("phuong trinh vo nghiem");
        }else if(denta == 0){
            x1 = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1 = x2 = "+ x1);
        }else if(denta >0){
            x1 = (float) ((-b + Math.sqrt(denta)) / (2*a));
            x2 = (float) ((b + Math.sqrt(denta)) / (2*a));

            System.out.println("nghiem x1= "+ x1);
            System.out.println("nghiem x1= "+ x2);
        }
    }

}
