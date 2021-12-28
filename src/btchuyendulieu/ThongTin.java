package btchuyendulieu;

public class ThongTin {
    int sdt;
    String tenLaoDong;
    int tuoi;
    String gioiTinh;
    int namSinh;
    String noiSinh;
    String phong;
    public ThongTin(int sdt, String tenLaoDong, int tuoi, String gioiTinh, int namSinh, String noiSinh, String phong) {
        this.sdt = sdt;
        this.tenLaoDong = tenLaoDong;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.noiSinh = noiSinh;
        this.phong = phong;
    }
    public int getSdt() {
        return sdt;
    }
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    public String getTenLaoDong() {
        return tenLaoDong;
    }
    public void setTenLaoDong(String tenLaoDong) {
        this.tenLaoDong = tenLaoDong;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
    public String getNoiSinh() {
        return noiSinh;
    }
    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }
    public String getPhong() {
        return phong;
    }
    public void setPhong(String phong) {
        this.phong = phong;
    }

}
