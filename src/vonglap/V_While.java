package vonglap;
import java.util.Scanner;

public class V_While {
    public static void main(String[] args) {
        String next = "y";
        while(next.equalsIgnoreCase("y")){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap ten: ");
            String name = input.nextLine();
            System.out.println("Tên bạn là: "+ name);
            System.out.println("B co nhap ten nua k? ");
            next = input.nextLine();
        }
        System.out.println("Kết thúc");
    }
}
