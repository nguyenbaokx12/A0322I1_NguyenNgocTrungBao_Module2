package ss2_loop_java.thuchanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        if(a==0 || b==0) {
            System.out.println("Không có ước chung lớn nhất");
            System.exit(0);
        }
        while (a!=b){
            if(a>b) a = a - b;
            else b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
