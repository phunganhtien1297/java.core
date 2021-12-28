package phuongthuc;

public class App {
    int sobanh;
    String nhaSanXuat;
    float gia;
    String tenXe;
    String mau;

    public App(int sobanh, String nhaSanXuat, float gia, String tenXe, String mau) {
        this.sobanh = sobanh;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
        this.tenXe = tenXe;
        this.mau = mau;
    }

    public int getSobanh() {
        return sobanh;
    }

    public void setSobanh(int sobanh) {
        this.sobanh = sobanh;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public App() {
    }

    
}
