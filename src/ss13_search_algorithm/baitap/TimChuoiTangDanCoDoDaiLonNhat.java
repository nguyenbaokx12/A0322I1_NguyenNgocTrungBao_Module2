package ss13_search_algorithm.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi tại đây: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < string.length(); i++){
            list.add(string.charAt(i));
            for(int j = i+1; j < string.length(); j++){
                if(string.charAt(i) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(Character ch:max){
            System.out.print(ch);
        }
    }
}
