/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

import javax.swing.JOptionPane;
public class FilaAtendimento {
    Fila FilaAltaPrioridade = new Fila(5);
    String[] FilaAltaNome = new String[5];

    Fila FilaBaixaPrioridade = new Fila(5);
    String[] FilaBaixaNome = new String[5];

    int ContadorAltaChamados = 0;

    public void AdicionarPaciente(String nome, int prioridade) {
        while (prioridade != 0 && prioridade != 1) {
            prioridade = Integer.parseInt(
                JOptionPane.showInputDialog(null, "A prioridade deve ser 0 ou 1!")
            );
        }

        if (prioridade == 1) {
            if (!FilaAltaPrioridade.cheia()) {
                int pos = FilaAltaPrioridade.fim;
                FilaAltaNome[pos] = nome;
                FilaAltaPrioridade.enfileirar(pos);
            } else {
                JOptionPane.showMessageDialog(null, "Fila de alta prioridade cheia!");
            }
        } else {
            if (!FilaBaixaPrioridade.cheia()) {
                int pos = FilaBaixaPrioridade.fim;
                FilaBaixaNome[pos] = nome;
                FilaBaixaPrioridade.enfileirar(pos);
            } else {
                JOptionPane.showMessageDialog(null, "Fila de baixa prioridade cheia!");
            }
        }
    }

    public String ChamarProximoPaciente() {
        if (!FilaAltaPrioridade.vazia()) {
            if (ContadorAltaChamados < 2 || FilaBaixaPrioridade.vazia()) {
                ContadorAltaChamados++;
                int indice = Integer.parseInt(FilaAltaPrioridade.desenfileirar());
                return FilaAltaNome[indice];
            }
        }

        if (!FilaBaixaPrioridade.vazia()) {
            ContadorAltaChamados = 0;
            int indice = Integer.parseInt(FilaBaixaPrioridade.desenfileirar());
            return FilaBaixaNome[indice];
        }

        return "As filas estão vazias";
    }
}
