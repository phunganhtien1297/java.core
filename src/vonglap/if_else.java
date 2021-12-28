package vonglap;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        String next = "y";
        while(next.equalsIgnoreCase("y")){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap ten: ");
            String name = input.nextLine();
            if(name.equalsIgnoreCase("tien")){
                System.out.println("Chào "+ name + " PTC");
            }else if(name.equalsIgnoreCase("nam")){
                System.out.println("Chào "+ name + " PKD");
            }else {
                System.out.println("Chào "+ name);
            }
            System.out.println("B co kiem tra ten nua k? ");
            next = input.nextLine();
        }
        System.out.println("Kết thúc");
    }
}
