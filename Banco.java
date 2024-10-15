package entities;

public class Banco {

   
    private int number;
    public String holder;
    private double balance;


    public Banco(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }


    public Banco(int number, String holder){
        this.number = number;
        this.holder = holder;

        

    }

    public int getNumber(){
        return number;
    }

   

    public double getBalance(){
        return balance;
    }
   

    public String getHolder(String holder ){
        return holder;
    }
    public void setholder(String holder){
        this.holder = holder;

    }

    public void deposit(double amount){
         balance += amount;
    }

    public void withdraw(double amount ){
        balance -= amount+5.00;
    }

    
    public String toString(){

        return "Holder: "+holder+" "+"account number: "+number+" "+"balance: $ "+ String.format(" %.2f"+balance);


    }

   

    

    
    
}
