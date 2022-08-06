package FinalExam.models;

public class SanPhamXuatKhau extends SanPham  {
    private int giaXuatKhau;
    private String quocGiaNhapSanPham;

    public SanPhamXuatKhau(int i, String maSanPham, String tenSanPham, int giaXuatKhau, String nhaSanXuat, String quocGiaNhapSanPham) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public SanPhamXuatKhau(int iDSanPham, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, int giaXuatKhau, String quocGiaNhapSanPham) {
        super(iDSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSanPham='" + quocGiaNhapSanPham + '\'' +
                '}'+super.toString();
    }
    public String toData(){
        return String.format("%s,%s,%s,1",super.toData(),giaXuatKhau,quocGiaNhapSanPham );
    }
}
