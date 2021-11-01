/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Filipe
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ();
        f1.nome = "Jonathan";
        f1.departamento = "Suporte";
        f1.RG = "7094462691";
        f1.DataEntrada = "15/05/1986";
        f1.salario = 1700.0f;
        f1.aumento = 300.0f;
        f1.aumentaSalario();
        f1.calculaGanhoAnual();
        f1.status();
        
    }
    
}
