package entities;

public class Projeto {

    private String cliente;
    public int produto;
    public double preco;
    private double pagamento;


    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return cliente;
    }

    public double getPagamento(){
        return pagamento;
    }
    public void setPagamento(double pagamento){
        this.pagamento = pagamento;
    }

    public Projeto(String cliente, int produto, double preco){
        this.cliente = cliente;
        this.produto = produto;
        this.preco = preco;
        this.pagamento = preco;
    }

    public void pagamento(double preco){
        this.pagamento += preco;

    }

    public String toString(){

        return "Nome do cliente: "+ cliente+ " " + "Total a pagar: "+pagamento; 

    }





    
}
