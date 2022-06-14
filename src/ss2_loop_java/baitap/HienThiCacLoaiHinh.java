package ss2_loop_java.baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon = -1;
        while (chon != 4) {
            System.out.println("1. In Hình Chữ Nhật ");
            System.out.println("2. In hình tam giác vuông ");
            System.out.println("3. In tam giác cân ");
            System.out.println("4. Thoát ");
            System.out.print("Bạn muốn vẽ hình nào: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                    System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    System.out.print("Bạn muốn chọn tam giác nào: ");
                    int chonTamGiac = scanner.nextInt();
                    switch (chonTamGiac){
                        case 1:
                            for(int i = 1; i <= 5; i++){
                                for(int j = 1; j <= i; j++){
                                    System.out.print("*");

                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for(int i = 5; i >= 1; i--){
                                for(int j = 1; j <= i; j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    for(int i = 1; i <= 5 ; i++){
                        for(int j = 5; j >= i; j--){
                            System.out.print(" ");
                        }
                        for(int k = 1; k <= i*2-1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn!");
            }
        }
    }
}
