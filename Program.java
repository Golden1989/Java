package Listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entiades.Employee;

public class Program {

    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List <Employee> list = new ArrayList<>();
        System.out.println("How mane employess will be registered?");
        int N = sc.nextInt();

        for (int i=0; i<N; i++){

            System.out.println();
            System.out.println("Employee #"+ (i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary:");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);


        }

        System.out.println("Enter the employee id that will have the salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = positionId(list,idsalary);
        if(pos == -1){

                   System.out.println("This id does not exist");

         }
         else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
         }

         System.out.println();
         System.out.println("List of Employees");

         for(Employee emp: list){
            System.out.println(emp);
         }

         





    }


    public static int positionId(List<Employee> list, int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }

        }
        return -1;
    }
    
}
