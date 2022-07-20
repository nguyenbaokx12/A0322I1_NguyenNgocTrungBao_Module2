package ss14_sort_algorithm;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập số lượng phần tử: ");
            n = scanner.nextInt();
        }while(n<0);

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+":");
            arr[i] = scanner.nextInt();
        }
        sort(arr);
    }

    public static void sort(int[] arr) {
        int x, chen;
        for(int i = 0; i < arr.length; i++){
            x = arr[i];
            chen = i;
            while(chen > 0 && x < arr[chen-1]){
                arr[chen] = arr[chen-1];
                chen--;
            }
            arr[chen] = x;
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
