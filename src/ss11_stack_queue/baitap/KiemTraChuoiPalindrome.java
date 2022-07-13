package ss11_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        System.out.print("Nhập chuỗi bạn cần kiểm tra: ");
        String[] st = new Scanner(System.in).nextLine().split("");
        for (int i = 0; i < st.length; i++) {
            stack.push(st[i]);
            queue.add(st[i]);
        }
        boolean res=true;
        while (!stack.isEmpty()){
            if(!stack.pop().equals(queue.remove())) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
