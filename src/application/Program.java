package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int aux = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<aux;i++){
            System.out.printf("\nEmployee #%d:\n", i+1);
            System.out.print("Id: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee emp = new Employee(id, name, salary);
            employees.add(emp);

        }

        System.out.print("Enter the employee id that will have their salary increased: ");
        String id = sc.nextLine();

        Employee emp = employees.stream().filter(x -> x.getId().equals(id)).findAny().orElse(null);

        if(emp!=null){
            System.out.print("Enter the percentage: ");
            emp.increaseSalary(sc.nextDouble());
            sc.nextLine();
        }
        else{
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");

        for(Employee x : employees){
            System.out.println(x);
        }

        sc.close();

    }

}
