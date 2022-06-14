package ss3_array_method_java.thuchanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size>20) System.out.println("Size does not exceed 20");
        }while (size>20);

        array = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Element in array: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }

        for(int i=0; i<size/2; i++){
            int x = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = x;
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
    }
}

