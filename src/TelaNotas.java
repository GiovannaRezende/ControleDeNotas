
import javax.swing.JOptionPane;

public class TelaNotas extends javax.swing.JFrame {

    public TelaNotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAluno = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        lblDisciplina = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        lblNroAulas = new javax.swing.JLabel();
        txtNroAulas = new javax.swing.JTextField();
        lblNroFaltas = new javax.swing.JLabel();
        txtNroFaltas = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de notas");
        getContentPane().setLayout(null);

        lblAluno.setText("Aluno");
        getContentPane().add(lblAluno);
        lblAluno.setBounds(100, 50, 32, 16);
        getContentPane().add(txtAluno);
        txtAluno.setBounds(150, 40, 190, 30);

        lblDisciplina.setText("Disciplina");
        getContentPane().add(lblDisciplina);
        lblDisciplina.setBounds(80, 90, 60, 16);
        getContentPane().add(txtDisciplina);
        txtDisciplina.setBounds(150, 80, 190, 30);
        getContentPane().add(txtNota);
        txtNota.setBounds(150, 120, 190, 30);

        lblNota.setText("Nota");
        getContentPane().add(lblNota);
        lblNota.setBounds(100, 130, 32, 16);

        lblNroAulas.setText("Nro aulas");
        getContentPane().add(lblNroAulas);
        lblNroAulas.setBounds(80, 170, 60, 16);
        getContentPane().add(txtNroAulas);
        txtNroAulas.setBounds(150, 160, 190, 30);

        lblNroFaltas.setText("Nro faltas");
        getContentPane().add(lblNroFaltas);
        lblNroFaltas.setBounds(80, 210, 70, 16);
        getContentPane().add(txtNroFaltas);
        txtNroFaltas.setBounds(150, 200, 190, 30);

        btnResultado.setText("Ver resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado);
        btnResultado.setBounds(230, 250, 110, 30);

        setSize(new java.awt.Dimension(473, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        
        double nota;
        int nFaltas, nAulas;
        String status;
        try {
            //Pega os valores da nota, número de faltas e número de aulas
            nota = Double.parseDouble(txtNota.getText());
            nFaltas = Integer.parseInt(txtNroFaltas.getText());
            nAulas = Integer.parseInt(txtNroAulas.getText());
            //Chama o método verificarAprovacao passando os valores obtidos
            status = NotasService.verificarAprovacao(nota, nFaltas, nAulas);
            //Exibe o rtorno do método verificarAprovacaos
            JOptionPane.showMessageDialog(null, txtAluno.getText() + ", você foi " + status + " na disciplina de " + txtDisciplina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos nos campos nota, faltas e aulas");
        }

    }//GEN-LAST:event_btnResultadoActionPerformed

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNroAulas;
    private javax.swing.JLabel lblNroFaltas;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtNroAulas;
    private javax.swing.JTextField txtNroFaltas;
    // End of variables declaration//GEN-END:variables
}
