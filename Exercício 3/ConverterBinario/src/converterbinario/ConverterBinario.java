/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterbinario;

/**
 *
 * @author 0031432512026
 */
import javax.swing.JOptionPane;
public class ConverterBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero para virar binario"));
      Pilha p = new Pilha((int)(Math.floor(Math.log(numero) / Math.log(2))) + 1);
        do{
             p.empilhar(numero%2);
             numero=numero/2;
        }while(numero!=0);
         
            String resposta="";
            for (int j = 0; j <p.GetTamanho(); j++) {
                resposta+=p.desempilhar();
            }
            JOptionPane.showMessageDialog(null,resposta);
  
           
    
        
          
      
    }
    
}
