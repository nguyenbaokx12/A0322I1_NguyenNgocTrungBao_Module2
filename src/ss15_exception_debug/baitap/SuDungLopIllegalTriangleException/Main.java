package ss15_exception_debug.baitap.SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Nhập số a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số b: ");
            int b = scanner.nextInt();
            System.out.print("Nhập số c: ");
            int c = scanner.nextInt();
            Triangle triangle = new Triangle(a, b, c);
        } catch (TamGiacException e) {
            e.printStackTrace();
        }
    }
}
