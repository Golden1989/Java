package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class TesteAnulonos {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno student = new Aluno();
        System.out.println("Nome: ");
        student.nome = sc.nextLine();
        System.out.println("Notas:(Nota1 deve ser até 30, nota2 deve ser até 35, nota3 deve ser até 35) ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.FinalGrade());
       
        System.out.println();
        student.pass();

       
        
    }
    




}
