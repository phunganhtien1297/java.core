package bths;

public class Main {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("Tien", "nam", 1997, 24);

        System.out.println("Ten HS: " + hs.getTenHocSinh());
        System.out.println("Gioi Tinh HS: " + hs.getGioiTinh());
        System.out.println("Nam Sinh HS: " + hs.getNamSinh());
        System.out.println("tuoi HS: " + hs.getTuoi());
    }
}
