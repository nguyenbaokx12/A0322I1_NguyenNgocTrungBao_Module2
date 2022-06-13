package ss1_introduction_java.baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000, usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        System.out.println("Giá trị VND: " + usd * vnd);
    }
}
