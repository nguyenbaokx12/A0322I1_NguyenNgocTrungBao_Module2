package FinalExam.models;

public abstract class SanPham {
    private int iDSanPham;
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public SanPham() {
    }

    public SanPham(int iDSanPham, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        this.iDSanPham = iDSanPham;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getiDSanPham() {
        return iDSanPham;
    }

    public void setiDSanPham(int iDSanPham) {
        this.iDSanPham = iDSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "iDSanPham=" + iDSanPham +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,%s,%s",iDSanPham,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat);
    }
}
