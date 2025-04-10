/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

/**
 *
 * @author 0031432512026
 */
public class FilaAtendimento{
     Fila f = new Fila(5);
     
     public void AdicionarPaciente(){
        f.enfileirar(f.fim+1);
     }
     public String ChamarProximoPaciente(){
         return f.desenfileirar();
     }
     
     
}
