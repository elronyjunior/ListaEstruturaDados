package exerciciopalindromos;
import javax.swing.JOptionPane;

public class ExercicioPalindromos {
    public static void main(String[] args) {
        
       String palavra = JOptionPane.showInputDialog("Informe a palavra para saber se ela é um palíndromo: ");
       Pilha p = new Pilha(palavra.length());
        for (int i =0; i < palavra.length(); i++) {
            p.empilhar(palavra.charAt(i));
        }
        String pInvertida="";
        for (int i = 0; i < palavra.length(); i++) {
            pInvertida+=p.desempilhar();
            
        }
        //operador ternario?
        String Resultado=palavra.equals(pInvertida)? " é um palíndromo":" não é um palindromo";
        JOptionPane.showMessageDialog(null,"A palavra "+palavra+" "+Resultado);
       
        
       
       
    }
}
    
    