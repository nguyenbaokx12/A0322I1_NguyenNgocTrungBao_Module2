package ss1_introduction_java.thuchanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        double weigt, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (kg): ");
        weigt = scanner.nextDouble();
        System.out.print("Your height (metter): ");
        height = scanner.nextDouble();
        bmi = weigt/Math.pow(height,2);
        if(bmi<18.5) System.out.println("Underweight");
        else if(bmi<20.5) System.out.println("Normal");
        else if(bmi<30.0) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
