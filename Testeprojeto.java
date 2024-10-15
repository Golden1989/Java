package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Projeto;

public class Testeprojeto {


    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a loja(tanto faz)");
        System.out.print("Digite seu nome: ");
        String cliente = sc.nextLine();

        // if para checar com o banco de dados se já é cliente e possui produtos no carrinho e essas coisas 
        //acho que pode chamar o mesmo contstrutor mas com o nome diferente 
        System.out.println("No que posso ajudar hoje? ");
        System.out.print("Digite o código do seu produto: ");
        int produto = sc.nextInt();
        System.out.print("Digite o preço do produto: ");
        sc.nextLine();
        double preco = sc.nextDouble();
        Projeto project = new Projeto(cliente, produto, preco);

        System.out.println("Deseja continuar adicionando ao carrinho? Aperte 1, se deseja parpar aperte 2");


        int decisao = sc.nextInt();
        

       
       

        while(decisao == 1){

        
            System.out.print("Digite o código do seu produto: ");
            produto = sc.nextInt();
            
            System.out.print("Digite o preço do produto: ");
            sc.nextLine();
            preco = sc.nextDouble();

            System.out.println("Deseja continuar acrescentando ao carrinho digite 1 novamente ou 2 para finalizar");
            decisao = sc.nextInt();

           
        }
         

         project.pagamento(preco);
        
         project.getPagamento();

         System.out.println(project);

      
        
        

        

       
      

    
       





    }
    
}
