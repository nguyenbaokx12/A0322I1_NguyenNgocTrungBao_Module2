package ss3_array_method_java.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int i, n;
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

        int min = arr[0];
        for(i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Số nhỏ nhất trong mảng là: "+ min);
    }
}
