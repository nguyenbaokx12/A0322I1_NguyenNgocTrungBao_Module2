package ss11_stack_queue.baitap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số lượng phần tử: ");
            n = scanner.nextInt();
        }while(n<=0);

        int arr[] = new int[n];
        for(int i = 0; i < n; i++ ){
            System.out.print("Nhập phần tử thứ "+i+": ");
            arr[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        System.out.println("Sau khi đảo mảng: "+Arrays.toString(arr));
    }
}
