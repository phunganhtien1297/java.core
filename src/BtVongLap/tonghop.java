package BtVongLap;

public class tonghop {
    int count;

	public static void main(String[] args) {

		/**
		 * Tinh tong cac chu so
		 */
//		Scanner sc=new Scanner(System.in);
//		System.out.println("NHập số: ");
//		String tmp=sc.nextLine();
//		int tong=0;
//		for(int i=0;i<tmp.length();i++) {
//			tong +=Integer.parseInt(String.valueOf(tmp.charAt(i)));
//		}
//		System.out.println("tổng các chữ số của số "+tmp+"="+tong);

//		/**
//		 * Tính dãy số Fibonacci
//		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập số n: ");
//
//		int f0 = 1, f1 = 1, n = 0;
//		while (n < 2) {
//			n = Integer.parseInt(sc.nextLine());
//		}
//		// Fn = Fn-1 + Fn-2
//		// f5=f4+f3
//		// f4=f3+f2
//		// f3=f2+f1
//		// f2=f1+f0
//		int[] tmp = new int[n+1];
//		tmp[0] = 0;
//		tmp[1] = 1;
//
//		for (int i = 2; i <= n; i++) {
//			tmp[i] = tmp[i - 1] + tmp[i - 2];
//
//		}
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.print(" "+tmp[i]+"," );
//		}
		
		/**
		 * tìm số nguyên tố đầu tiền của dãy số
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập dãy số n: ");
//		String input = sc.nextLine();
//		String []tmp=input.split(";");
//		
//		for(String temp:tmp) {
//			int i=Integer.parseInt(temp);
//			if(i%2==0 || i<2)
//				{
//				continue;
//				}
//			else {	
//				boolean nt=true;
//				int squareRoot = (int) Math.sqrt(i);
//		        for (int j = 2; j <= squareRoot; j++) {
//		            if (i % j == 0) {
//		            nt= false;
//		             break;  
//		            }
//		        }
//		        if(nt) {
//		        	System.out.print("số nguyên tố đầu tiên của dãy số "+input+" :" +i);
//		        	break;
//		        }
//		        
//		      
//				
//			}
//		}
		
		
		

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int tinhtong(int a, int b) {
		int tong = 0;
		tong = a + b;
		return tong;
	}

	/*
	 * hàm khởi tạo không tham số
	 */
//	public Main() {		
//	}
//	/*
//	 * hàm khởi tạo có tham số
//	 */
//	public Main(int count) {
//		this.count=count;
//		
//	}
//	public void show() {
//		System.out.println("count="+count);
//		
//	}

}
