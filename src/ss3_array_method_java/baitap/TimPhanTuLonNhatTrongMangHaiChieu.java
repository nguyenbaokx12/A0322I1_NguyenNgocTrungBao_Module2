package ss3_array_method_java.baitap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int size1;
        int size2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        size1 = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        size2 = scanner.nextInt();
        int[][] arr = new int[size1][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập " + i + "." + j+": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Vậy phần tử có giá trị lớn nhất là: " + max);
    }
}
