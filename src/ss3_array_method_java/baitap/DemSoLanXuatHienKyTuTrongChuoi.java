package ss3_array_method_java.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String[] s = "Nguyễn Ngọc Trung Bảo".split("");
        System.out.print("Nhập ký tự: ");
        char ch = new Scanner(System.in).next().charAt(0);
        int dem = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].charAt(0) == ch){
                dem++;
            }
        }
        System.out.print("Có "+dem+" ký tự có trong chuỗi ");
    }
}
