package ss3_array_method_java.baitap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotNhatDinh {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[][]{
                {1,2},{3,4},{5,6}
        };
        System.out.println("Nhập cột bạn muốn tính tổng: ");
        int num = scanner.nextInt();
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i][num];
        }
        System.out.println(sum);
    }
}
