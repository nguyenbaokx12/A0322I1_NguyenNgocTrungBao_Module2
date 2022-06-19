package ss3_array_method_java.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr1=new int [5];
        int []arr2=new int [3];
        int []arr3=new int[8];
        for(int i=0;i<5;i++){
            System.out.println("Nhập phần tử thứ "+i +" mảng arr1: ");
            arr1[i]=scanner.nextInt();
            arr3[i]=arr1[i];
        }
        for(int j=0;j<3;j++){
            System.out.println("moi nhap phần tử thứ "+j+" mảng arr2: ");
            arr2[j]=scanner.nextInt();
            arr3[arr3.length+j-3]=arr2[j];
        }
        for(int number: arr3){
            System.out.print("Sau khi gộp mảng: "+number);
        }
    }
}
