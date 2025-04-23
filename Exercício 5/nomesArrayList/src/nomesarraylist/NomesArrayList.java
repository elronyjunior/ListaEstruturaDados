package nomesarraylist;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class NomesArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "[1] Adicionar nome\n" +
                    "[2] Remover nome\n" +
                    "[3] Listar nomes ordenadamente\n" +
                    "[4] Buscar nome\n" +
                    "[5] Finalizar"));

            switch (opcao) {
                case 1: 
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    if (nome != null && !nome.trim().isEmpty()) {
                        nomes.add(nome.trim());
                        JOptionPane.showMessageDialog(null, "Nome adicionado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome inválido.");
                    }
                    break;

                case 2: 
                    String nomeRemover = JOptionPane.showInputDialog("Digite o nome a ser removido:");
                    nomeRemover = nomeRemover.trim().toLowerCase();
                    boolean removido = false;

                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).trim().equalsIgnoreCase(nomeRemover)) {
                            nomes.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Nome removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                    }
                    break;

                case 3: // Listar nomes ordenados
                    if (nomes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A lista está vazia.");
                    } else {
                        ArrayList<String> nomesOrdenados = new ArrayList<>(nomes);
                        Collections.sort(nomesOrdenados, String.CASE_INSENSITIVE_ORDER);
                        StringBuilder lista = new StringBuilder("Nomes inseridos:\n");
                        for (String n : nomesOrdenados) {
                            lista.append(n).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 4: // Buscar nome
                    String nomeBuscar = JOptionPane.showInputDialog("Digite o nome que deseja buscar:");
                    nomeBuscar = nomeBuscar.trim().toLowerCase();
                    boolean encontrado = false;

                    for (String n : nomes) {
                        if (n.trim().equalsIgnoreCase(nomeBuscar)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Nome encontrado na lista!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                    }
                    break;

                case 5: // Finalizar
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }

        } while (opcao != 5);
    }
}
