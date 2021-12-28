package phuongthuc;

public class Main {
    public static void main(String[] args) {
        App xe = new App();
        xe.setGia(10000);
        xe.setMau("do");
        xe.setNhaSanXuat("abc");


        System.out.println(xe.getGia()+xe.getNhaSanXuat()+xe.getMau());

    }
}
