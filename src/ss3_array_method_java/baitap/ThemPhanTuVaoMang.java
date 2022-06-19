package ss3_array_method_java.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int i, n, k, viTri;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số lượng phần tử: ");
            n = scanner.nextInt();
        }while(n<=0);

        int arr[] = new int[n];
        for(i = 0; i < n; i++ ){
            System.out.print("Nhập phần tử thứ "+i+": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần chèn: ");
        k = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        viTri = scanner.nextInt();
        while (viTri > n || viTri < 0) {
            System.out.print("Nhập lại vị trí phù hợp: ");
            viTri  = scanner.nextInt();
        }

        int[] newA = new int[arr.length + 1];
        for (i = 0; i < arr.length; i++) {
            newA[i] = arr[i];
        }
        for (i = newA.length - 1; i > viTri; i--) {
            newA[i] = newA[i - 1];
        }
        newA[viTri] = k;
        System.out.print("Mảng sau khi chèn giá trị "+k+" thành: ");
        for (i = 0; i < newA.length; i++) {
            System.out.print(" "+newA[i]);
        }

    }
}
