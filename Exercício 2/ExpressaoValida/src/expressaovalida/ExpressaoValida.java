/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressaovalida;

/**
 *
 * @author 0031432512026
 */
import javax.swing.JOptionPane;
public class ExpressaoValida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String espre=JOptionPane.showInputDialog(null,"Informe a expressão");
        String Resultado;
        int chavesA=0,chavesF=0,colchetesA=0,colchetesF=0,parentessesA=0,parentessesF=0;
        char letra;
        Pilha p = new Pilha(espre.length());
        for (int i = 0; i <espre.length(); i++) {
            letra=espre.charAt(i);
            p.empilhar(letra);
        }
        for (int i = 0; i < p.getTamanho(); i++) {
            String Ele = p.desempilhar().toString();
            chavesA+= Ele.equals("{")? 1:0; chavesF+= Ele.equals("}")? 1:0;
            colchetesA+= Ele.equals("[")? 1:0; colchetesF+= Ele.equals("]")? 1:0;
            parentessesA+= Ele.equals("(")? 1:0; parentessesF+= Ele.equals(")")? 1:0;
        }
        Resultado=chavesA==chavesF && colchetesA==colchetesF && parentessesA==parentessesF
                ? "Balanceada":"Desbalanceada";
        
        JOptionPane.showMessageDialog(null,Resultado);
    }
    
}
