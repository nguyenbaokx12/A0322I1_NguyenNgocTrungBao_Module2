package ss2_loop_java.baitap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            if (n >= 2) {
                boolean check = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    System.out.print(n + " ");
                }
            }
            n++;
        }
    }
}
