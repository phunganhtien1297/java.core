package btsonguyen;

import java.util.Scanner;

public class SoNguyen {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        //System.out.print("Các phần tử của mảng: ");
        //show(arr);
        sapxep(arr);
        
    }
    
    public static void show(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(tmp < arr[i]) {
                tmp = arr[i];
            }
        }
        System.out.println("max: " + tmp);
    }

    public static void sapxep(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                  
                }
            }
           
        }
        System.out.print("Mảng sau khi được sắp xếp: ");
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i] + ", ");
        }


    }
}
