
package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma Caneta ");
        System.out.println("Modelo "+this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.print("Carga "+this.carga);
        System.out.println("%");
        System.out.println("Está tampada? "+ this.tampada);
        
    }
    void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO não posso rabiscar!! ");
        }else{
            System.out.println("Estou Rabiscando!!");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
