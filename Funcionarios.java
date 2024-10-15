package entities;

public class Funcionarios {

    public String nome; 
    public double GrossSalary;
    public double tax; 
    public double percentage;

    public double Netsalary(){
         return GrossSalary - tax;
        
    }

    public void IncreaseSalary(double percentage){

        GrossSalary += GrossSalary * percentage/100.0;

    

     }

     public String toString(){

        return nome + ", $" + String.format("%.2f", Netsalary());
     }







    
}
