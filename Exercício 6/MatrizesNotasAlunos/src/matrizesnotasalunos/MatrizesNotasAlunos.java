package matrizesnotasalunos;

import javax.swing.JOptionPane;

public class MatrizesNotasAlunos {

    public static void main(String[] args) {
       
        double[][] Notas = new double[5][3];
        for (int i = 0; i < 5; i++) {
           Notas[i][0]=i+1;
            for (int j = 0; j < 3; j++) {
                Notas[i][j]= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a "+(j+1)+"° nota do "+(i+1)+"° aluno, uma por vez"));
            }  
        }
        double [] media = new double[5];
        for (int i = 0; i < media.length; i++) {
            double soma=0;
            for (int j = 0; j < 3; j++) {
                soma+=Notas[i][j];
            }
            media[i]=Math.round((soma/3)* 100.0) / 100.0;
            System.out.println(media[i]);
        }
        double maior=media[0],menor=media[0]; String [] aprovados= new String[5];
        for (int i = 0; i < media.length; i++) {
            maior= maior<media[i]? media[i]: maior;
            menor= menor>media[i]? media[i]: menor; 
        }
        String resposta="Os alunos que foram aprovados foram \n";
        for (int i = 0; i < media.length; i++) {
           resposta+=media[i]>=7 && i<media.length? (i+1)+"° com média:"+media[i]+"\n":"";
        }
        JOptionPane.showMessageDialog(null,resposta+"\n A maior média foi:"+maior+"\n"+"A menor média foi:"+menor);
        
        
        
        
        
    }
    
}
