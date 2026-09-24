/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todolist;
 
import java.awt.Component;
import java.awt.Container;
import javax.swing.table.DefaultTableModel;

    private Component jButtonConcluirTarefa;

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
    


/**
 *
 * @author Aluno
 */
public class telaToDolist extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(telaToDolist.class.getName());

    
    public telaToDolist() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        DefaultTableModel model = (DefaultTableModel) jTableTarefas.getModel();
    }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDescricaoTarefas = new javax.swing.JTextField();
        jButtonadicionar = new javax.swing.JButton();
        jComboBoxFiltroStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();
        jButtonConcluirTarefa = new javax.swing.JButton();
        jButtonRemoverTarefa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldDescricaoTarefas.addActionListener(this::jTextFieldDescricaoTarefasActionPerformed);

        jButtonadicionar.setText("adicionar");
        jButtonadicionar.addActionListener(this::jButtonadicionarActionPerformed);

        jComboBoxFiltroStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todos", "concluído", "não concluído", " " }));

        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "tarefa", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTarefas);

        jButtonConcluirTarefa.setText("concluir");
        jButtonConcluirTarefa.addActionListener(this::jButtonConcluirTarefaActionPerformed);

        jButtonRemoverTarefa.setText("remover");
        jButtonRemoverTarefa.addActionListener(this::jButtonRemoverTarefaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDescricaoTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonadicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConcluirTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoverTarefa)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricaoTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonadicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFiltroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcluirTarefa)
                    .addComponent(jButtonRemoverTarefa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoTarefasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoTarefasActionPerformed

    private void jButtonConcluirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirTarefaActionPerformed
       int linhaSelecionada = jTableTarefas.getSelectedRow();
       if (linhaSelecionada < 0){
           JOptionPane.showConfirmDialog(null, "nenhuma tarefa foi selecionada");
           return;
       }
       string tarefaSelecionada = recuperarTarefa(linhaSelecionada);
       
       int indiceTarefaSelecionada = tarefa.index0f(tarefaSelecionada);
       
       string[] dados = tarefas.get(indiceTarefaSelecionada).split(";");
       
       tarefas.set(indicetarefaSelecionada, dados[0])
       
       
       
       
       
    }//GEN-LAST:event_jButtonConcluirTarefaActionPerformed

    private void jButtonadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadicionarActionPerformed
        if (jTextFieldDescricaoTarefas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"A descrição da terefa NÃO PODE ficar vazia!!!;-;");
            return;
        }
        if (hasTarefaRepetida(jTextFieldDescricaoTarefas.getText())){
            JOptionPane.showInputDialog(null,"a taefa " + jTextFieldDescricaoTarefas.getText() + "já existe");
            return;
        }
        String NAOCUNCLUIDA = null;
        
        tarefas.add(jTextFieldDescricaoTarefas.getText() + ";" + NAOCUNCLUIDA);
        
        preencherTabela();
        
        jTextFieldDescricaoTarefas.setText("");
    }//GEN-LAST:event_jButtonadicionarActionPerformed

    private void jButtonRemoverTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTarefaActionPerformed
      int linhaSelecionada = jTableTarefas.getSelectedRow();
      
      
      if (linhaSelecionada < 0){
          JOptionPane.showConfirmDialog(null,"nenhma tarefa foi selecionada");
          return;
      }
      int opcao = JOptionPane.showConfirmDialog(null, "desja realmente excluir a tarefa?");
      
      
      string tarefaSelecinada = recuperarTarefa(linhaSelecionada);
      
      int indiceTarefaSelecionada = tarefas.index0f(tarefasSelecionadas);
      if (opcao == JOptionPane.YES_OPTION){
          tarefas.remove(indiceTarefaSelecionada);
          preencherTabela();
          
      }
      filtraTabela();
      
      preencherTabela();
              
    }//GEN-LAST:event_jButtonRemoverTarefaActionPerformed
   private void filtrarTabela(){
       int opcao = jComboBoxFiltroStatus.getSelectedIndex();
       tarefasFiltradas.clear();
    
       string[] dados;
        Iterable<string> tarefas = null;
       
       for(string tarefa : tarefas){
           dados = tarefas.split(";");
            
           switch (opcao){
               case o:
                   tarefasFiltradas.add(tarefas);
                   break,
               case 1:
                   if (dados [1] equals (CONCLUIDA))
           
           
           }
       }
       
       
    private String recuperaraTarefa( int indiceTarefa){
        if (jComboBoxFiltroStatus.getSelectedIndex() > 0){
       }else{
           return tarefas.get.(indiceTarefas)
        }
    }
    
    public static void main(String args[]) {
        public boolean hasTarefaRepetida(String novaTarefa){
        Iterable<String> tarefas = null;
       for (String tarefa : tarefas){
           String dados[] = tarefa.split(";");
           
           if (novaTarefa.toLowerCase().equals(dados[0].toLowerCase())){
               return true;
           }
       }
       
       return false;
   }
   
   private void preencherTabela(){
       ArrayList<String> listaTarefas;
       if (jComboBoxFiltroStatus.getSelectedIndex() > 0){
           ArrayList<String> tarefasFiltradas = null;
           listaTarefas = tarefasFiltradas;
       }else{
           ArrayList<String> tarefas = null;
           listaTarefas = tarefas;
       }
       
       model.setRowCount(0);
       
       for (String tarefa : listaTarefas){
           String[] dados = tarefa.split(";");
           
           model.addRow(new object[]{
               dados[0],
               dados[1]
               
           });
           
       }
       }
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new telaToDolist().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConcluirTarefa;
    private javax.swing.JButton jButtonRemoverTarefa;
    private javax.swing.JButton jButtonadicionar;
    private javax.swing.JComboBox<String> jComboBoxFiltroStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JTextField jTextFieldDescricaoTarefas;
    // End of variables declaration//GEN-END:variables
}
