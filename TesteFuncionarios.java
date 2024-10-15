package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class TesteFuncionarios {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionarios fun = new Funcionarios();

        System.out.println("Name: ");
        fun.nome = sc.nextLine();
        System.out.println("Gross Salary: ");
        fun.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        fun.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+ fun);
        System.out.println();
        System.out.println("Wich percentage to increase salary: ");
        double percentage = sc.nextDouble();
        fun.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+ fun);
        sc.close();





        
        





    }



   

    
}
