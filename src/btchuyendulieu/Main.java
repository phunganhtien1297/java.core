package btchuyendulieu;

import java.util.ArrayList;
import java.util.Scanner;

//import com.google.gson.Gson;

import org.json.JSONArray;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int count = 0;
        int count = xuLySo();
        ArrayList<ThongTin> arrayListTT = new ArrayList<ThongTin>();

        // System.out.println("Nhap vao do dai chuoi: ");
        // count = Integer.parseInt(sc.nextLine());

        String[] ThongTin = new String[count];

        System.out.println("Nhap cac gia tri: ");

        // for (int i = 0; i < count; i++) {
        // ThongTin[i] = sc.nextLine();
        // }
        Boolean c = true;
        for (int i = 0; i < ThongTin.length; i++) {
            while (c) {
                try {
                    ThongTin[i] = sc.nextLine();
                    String[] sub_tmp = ThongTin[i].split(";");
                    int sdt = Integer.parseInt(sub_tmp[0]);
                    String tenLaoDong = sub_tmp[1];
                    int tuoi = Integer.parseInt(sub_tmp[2]);
                    String gioiTinh = sub_tmp[3];
                    int namSinh = Integer.parseInt(sub_tmp[4]);
                    String noiSinh = sub_tmp[5];
                    String phong = sub_tmp[6];

                    ThongTin tt = new ThongTin(sdt, tenLaoDong, tuoi, gioiTinh, namSinh, noiSinh, phong);
                    arrayListTT.add(tt);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        JSONArray jsonObject = new JSONArray(arrayListTT);
        System.out.println(jsonObject);

        // Gson gson = new Gson();
        // ThongTin[] thongTins = gson.fromJson(String.valueOf(""), ThongTin[].class);
        // for (ThongTin thongTin : thongTins){
        // System.out.println(thongTin.getTenLaoDong());
        // }
    }

    // for (int i = 0; i < arrayListTT.size(); i++) {
    // System.out.println("---------------------------");
    // System.out.println("Thong tin nguoi lao dong " + (i + 1) + ":");
    // System.out.println("SDT: " + arrayListTT.get(i).getSdt());
    // System.out.println("Ten: " + arrayListTT.get(i).getTenLaoDong());
    // System.out.println("Tuoi: " + arrayListTT.get(i).getTuoi());
    // System.out.println("Gioi Tinh: " + arrayListTT.get(i).getGioiTinh());
    // System.out.println("Nam Sinh: " + arrayListTT.get(i).getNamSinh());
    // System.out.println("Noi Sinh: " + arrayListTT.get(i).getNoiSinh());
    // System.out.println("Phong: " + arrayListTT.get(i).getPhong());

    // xu ly so
    private static int xuLySo() {
        Scanner sc = new Scanner(System.in);
        int so;
        while (true) {
            System.out.println("Nhap vao do dai chuoi: ");
            String str = sc.nextLine();
            if (str.trim().equals("")) {
                System.out.println("K duoc bo trong, moi ban nhap lai.");
                continue;
            }
            try {
                so = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai kieu du lieu, moi ban nhap lai.");
                continue;
            }
            if (Integer.parseInt(str) < 1) {
                System.out.println("k duoc nhap so am va 0.");
                continue;
            }
            return so;
        }
    }
}
