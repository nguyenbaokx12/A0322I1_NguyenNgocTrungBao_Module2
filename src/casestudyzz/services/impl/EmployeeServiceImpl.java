package CaseStudy.services.impl;

import CaseStudy.models.person.Employee;
import CaseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Thêm Mới Nhân Viên");
        boolean check = true;
        int id = -1;
        do{
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (Exception e) {
                check = false;
            }
        }while(!check);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

    }

    @Override
    public void remove() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }
}
