package exception;

public class baitap {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(10/i);
        // }

        try {
            Xuly();
        }catch(Exception e){
             System.out.println("xu ly 1:" + e.getMessage());
        }
        // System.out.println("ket thuc");
    }
    
    private static void Xuly() throws Exception {
        //  try{
             xuly2();
            
        //  }catch(Exception e){
        //     System.out.println("xu ly 2: " + e.getMessage());
        // }
    }
    
    private static void xuly2(){
        try{
            int n = 10/0;
        }catch(Exception e){
            throw new ArithmeticException("Loi chia cho 0");
        }
    }
}
