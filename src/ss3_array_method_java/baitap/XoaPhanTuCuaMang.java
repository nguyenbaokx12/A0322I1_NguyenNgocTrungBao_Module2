package ss3_array_method_java.baitap;


import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        }while(n<=0);

        int arr[]= new int[n];

        for(i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ "+i+": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int k = scanner.nextInt();
        int viTri = 0;
        for(i = 0; i <= arr.length; i++){
            if(k == arr[i]){
                viTri = i;
                break;
            }
        }
        for (i = viTri; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Mảng sau khi xoá: ");
        for (i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
