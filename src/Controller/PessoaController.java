package Controller;

import Model.Pessoa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovane
 */
public class PessoaController {

    int status = 0;
    
    static Principal principal;
    
    public static void preencherTabela(JTable tabela, List<Pessoa> lista) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);
        
        int posLinha = 0;
        for (Pessoa a : lista){
             tabela.setValueAt(a.getNome(), posLinha, 0);
             tabela.setValueAt(a.getTelefone(), posLinha, 1);
             posLinha++;
        }
    }
    
    public static void cadastrarPessoa(String nome, String telefone) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setTelefone(telefone);
        Principal.pessoas.add(p);
        JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!","Sucesso", 1);
    }
    
    public static void editarPessoa(String Nome, String Telefone, int pos) {
        Pessoa p = new Pessoa();
        p.setNome(Nome);
        p.setTelefone(Telefone);
        Principal.pessoas.set(pos, p);
        JOptionPane.showMessageDialog(null, "Pessoa editada com sucesso!","Sucesso", 1);
    }
 
     public static void excluirPessoa(JTable tabela) {
         if (tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecine um registro","Erro", 0);
         }else {
             int reply = JOptionPane.showConfirmDialog(null, "Tem certeza?","Excluir pessoa", JOptionPane.YES_NO_OPTION);
             if (reply  == JOptionPane.YES_NO_OPTION ) {
                 Principal.pessoas.remove(tabela.getSelectedRow());
                 JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso","Sucesso", 1);
             }
         }
     }
}
