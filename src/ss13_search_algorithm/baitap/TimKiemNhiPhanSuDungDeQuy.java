package ss13_search_algorithm.baitap;

import java.util.Scanner;

public class TimKiemNhiPhanSuDungDeQuy {
    public static int binarySearch(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int mid;
        int left = 0;
        int right = arr.length - 1;
        System.out.println(" mời nhập vào giá trị cần tìm vị trí");
        value = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" mời nhập phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        while (left <= right) {
            mid = (left + right) / 2;

            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println( binarySearch(arr));
    }
}
