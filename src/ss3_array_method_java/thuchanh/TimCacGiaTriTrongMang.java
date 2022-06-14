package ss3_array_method_java.thuchanh;

import java.util.Scanner;

public class TimCacGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExits = false;
        for(int i=0; i<students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of " + input_name + " is: " + (i+1));
                isExits = true;
                break;
            }
        }
        if(!isExits) System.out.println("Not found " + input_name + " in the list");
    }
}
