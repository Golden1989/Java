package entities;

public class Aluno {
    
    public String nome; 
    public double nota1;
    public double nota2;
    public double nota3;
    public double FinalGrade;
    public double pass;
    public double MissingPoints;

    public double FinalGrade(){

        FinalGrade = nota1+nota2+nota3;
        return FinalGrade;
    
    
     }
     public double MissingPoints(){
        MissingPoints = 100-FinalGrade() ;
        return MissingPoints;
     }


     public double pass(){

        if(FinalGrade() <= 60){
            System.out.println("Não passou");
            System.out.println("Missing Points: "+ MissingPoints());
        }else{
            System.out.println("pass");
        }
        return pass;
     }

   
   
}
