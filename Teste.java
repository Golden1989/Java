package Teste;

import java.util.Scanner;

import Entities.Entities;

public class Teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       Entities teste = new Entities();
       int x1 = sc.nextInt();
       int x2 = sc.nextInt();
       int y1 = sc.nextInt();
       int y2 = sc.nextInt();


       System.out.println("\nResultado do DDA:");
       teste.DDA(x1, x2, y1, y2);
       System.out.println("\nResultado da Midpoint Line:");
       teste.MidpointLine(x1, y1, x2, y2);

       sc.close();
    }
    
}
