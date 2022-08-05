package CaseStudy.controllers;


import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit Management");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                //--CASE 1--
                case 1: int choice1;
                    do{
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    }while(choice1 != 4);
                    break;

                //--CASE 2--
                case 2: int choice2;
                    do{
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                    choice2 = Integer.parseInt(scanner.nextLine());
                    }while(choice2 != 4);
                    break;

                //--CASE 3--
                case 3: int choice3;
                    do{
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        choice3 = Integer.parseInt(scanner.nextLine());
                    }while(choice3 != 4);
                    break;

                //--CASE 4--
                case 4: int choice4;
                    do{
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        choice4 = Integer.parseInt(scanner.nextLine());
                    }while(choice4 != 6);
                    break;

                //--CASE 5--
                case 5: int choice5;
                    do{
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        choice5 = Integer.parseInt(scanner.nextLine());
                    }while(choice5 != 3);
                    break;
            }
        }while(choice !=6);
    }
}
