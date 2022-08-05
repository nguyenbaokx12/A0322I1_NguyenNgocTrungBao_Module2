package FinalExam.controllers;

import FinalExam.exception.NotFoundProductException;
import FinalExam.models.SanPham;
import FinalExam.models.SanPhamNhapKhau;
import FinalExam.models.SanPhamXuatKhau;
import FinalExam.services.SanPhamService;


import java.util.List;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    private static SanPhamService sanPhamService = new SanPhamService();
    private static SanPham sanPhams;

    public static void main(String[] args) {
        while (true) {
            System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----- \n" +
                    "Chọn chức năng theo số (để tiếp tục): \n" +
                    "1.Thêm mới \n" +
                    "2.Xoá \n" +
                    "3.Xem danh sách các sản phẩm \n" +
                    "4.Tìm kiếm  \n" +
                    "5.Thoát \n");
            int choose = getChoice();
            switch (choose) {
                case 1:
                    addSanPham();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void addSanPham(){
        System.out.println("1. Sản Phẩm Nhập Khẩu\n2. Sản Phẩm Xuất Khẩu");
        int choose = getChoice();
        System.out.println("Nhập mã sản phẩm: ");
        String maSanPham = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        String giaBan = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        String soLuong = sc.nextLine();
        String nhaSanXuat = inputWithEmpty("Nhà sản xuất: ");
        SanPham sanPham;
        if(choose == 1){
            int giaNhapKhau = Integer.parseInt(inputWithEmpty("Giá sản phẩm: "));
            String tinhThanhNhap = inputWithEmpty("Tỉnh thành nhập: ");
            int thueNhapKhau = Integer.parseInt(inputWithEmpty("Thuế nhập khẩu: "));
            sanPham = new SanPhamNhapKhau(0, maSanPham,tenSanPham, Double.parseDouble(giaBan), Integer.parseInt(soLuong), nhaSanXuat,giaNhapKhau, tinhThanhNhap, thueNhapKhau  );

        }else{
            int giaXuatKhau = Integer.parseInt(inputWithEmpty("Giá Xuất Khẩu: "));
            String quocGiaNhapSanPham = inputWithEmpty("Quốc gia nhập sản phẩm: ");
            sanPham = new SanPhamXuatKhau(0, maSanPham,tenSanPham, Double.parseDouble(giaBan), Integer.parseInt(soLuong), nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham);

        }
       sanPhamService.addSanPham(sanPham);
        System.out.println(" Thêm thành công");
    }

    public static void display(){
        List<SanPham> sanPhams = sanPhamService.findAll();
        for (int i = 0;i<sanPhams.size();i++){
            System.out.println(sanPhams.get(i));
        }
    }

    private static String inputWithEmpty(String field){
        String val = "0";
        do{
            System.out.print(val.isEmpty() ? "Sai format. Nhập ": field+ ":");
            val = sc.nextLine();
        }while (val.trim().isEmpty());

        return val;
    }

    public static void delete(){
        display();
        boolean tmp = false;
        do{
            System.out.print(tmp ? "Nhập lại " : "Nhập id");
            int id =Integer.parseInt(sc.nextLine());
            try{
                sanPhamService.delete(id);
                System.out.println("Xoá thành công");
                tmp = false;

            }catch (NotFoundProductException e){
                System.out.println(e.getMessage());
                tmp = true;
            }
        }while (tmp);
    }

    private static int getChoice(){
        System.out.print("Nhập sự lựa chọn: ");
        return  Integer.parseInt(sc.nextLine());
    }
}
