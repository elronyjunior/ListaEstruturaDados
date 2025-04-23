package converterbinario;

import javax.swing.JOptionPane;
public class ConverterBinario {

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
