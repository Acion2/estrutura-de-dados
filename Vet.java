package vetorCaneta;


import vetorCaneta.Caneta;
public class Vet {

	public static void main(String[] args) {
		Caneta vet[] = new Caneta[5];
		vet[0] = new Caneta();
        vet[0].modelo = "bic";
        vet[0].cor="Azul";
        vet[0].ponta= 0.5f;
        vet[0].carga= 70;
        vet[0].tampada= false;
        
        vet[1] = new Caneta();
        vet[1].modelo= "bic1";
        vet[1].cor="Azul1";
        vet[1].ponta= 0.5f;
        vet[1].carga= 70;
        vet[1].tampada= false;
        
        vet[2] = new Caneta();
        vet[2].modelo= "bic1";
        vet[2].cor="Azul1";
        vet[2].ponta= 0.5f;
        vet[2].carga= 70;
        vet[2].tampada= true;
        
        vet[3] = new Caneta();
        vet[3].modelo= "bic1";
        vet[3].cor="Azul1";
        vet[3].ponta= 0.5f;
        vet[3].carga= 70;
        vet[3].tampada= true;
        
        vet[4] = new Caneta();
        vet[4].modelo= "bic1";
        vet[4].cor="Azul1";
        vet[4].ponta= 0.5f;
        vet[4].carga= 70;
        vet[4].tampada= false;
       
        for(int i = 0; i < vet.length; i++) {
            vet[i].status();
            if (vet[i].tampada == true) {
    			System.out.println("ERRO não posso rabiscar!! ");
    		} else {
    			System.out.println("Estou Rabiscando!!");
    		}
          }
       
	}

}
