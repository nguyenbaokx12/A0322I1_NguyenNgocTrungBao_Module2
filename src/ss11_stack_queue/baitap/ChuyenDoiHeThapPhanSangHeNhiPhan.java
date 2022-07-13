package ss11_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeThapPhanSangHeNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyển đổi từ hệ thập phân sang hệ nhị phân");
        System.out.print(" Hệ thập phân: ");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while(num > 0){
            stack.push(num%2);
            num = num/2;
        }
        System.out.print("=> ");
        System.out.print("Hệ nhị phân: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
