package bths;

public class HocSinh {
     String tenHocSinh;
     String gioiTinh;
     int namSinh;
     int tuoi;

    public HocSinh(String tenHocSinh, String gioiTinh, int namSinh, int tuoi) {
        this.tenHocSinh = tenHocSinh;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
}
