package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Testebancario {

    public static void main(String[] args ){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco account;

       System.out.print("Enter acount number: ");
       int number = sc.nextInt();
       System.out.print("Enter acount Holder: ");
       sc.nextLine();
       String holder = sc.nextLine();
       System.out.println("Is there an initial deposit(y/n)? ");
       char response = sc.next().charAt(0);
       if(response == 'y'){
          
          System.out.println("Enter initial deposit value:  ");
          double initialDeposit = sc.nextDouble();
          account = new Banco(number, holder, initialDeposit);

       }else{
          account = new Banco(number, holder);
       }

       System.out.println();
       System.out.println("Account data: ");
       System.out.println(account);

       System.out.println();
       System.out.println("Enter a deposit value: ");
       double depositValue = sc.nextDouble();
       account.deposit(depositValue);
       System.out.println("Updated account data: ");
       System.out.println(account);

       System.out.println();
       System.out.println("Enter withdraw: ");
       double withdrawValue = sc.nextDouble();
       account.withdraw(depositValue);
       System.out.println("Updated account data: ");
       System.out.println(account);










        sc.close();
       
       








    }
    
}
