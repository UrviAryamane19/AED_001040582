package ui;


import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class AdminDashboard extends javax.swing.JPanel {
    
   
        
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        lblSupplierChooser = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        btnGo = new javax.swing.JButton();
        jBtnViewFaculty = new javax.swing.JButton();
        jBtnViewPerformance = new javax.swing.JButton();
        jBtnViewStudents = new javax.swing.JButton();
        lblDepChooser = new javax.swing.JLabel();
        cmbDep = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnAddEmployer = new javax.swing.JButton();
        jBtnViewEmployer = new javax.swing.JButton();
        jBtnRemoveFaculty = new javax.swing.JButton();
        jBtnRemoveEmployer = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(240, 100, 120));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Administrator Dashboard");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTitle.setIconTextGap(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 206, 0, 0);
        add(lblTitle, gridBagConstraints);

        lblSupplierChooser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSupplierChooser.setText("Choose your College:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 170, 0, 0);
        add(lblSupplierChooser, gridBagConstraints);

        cmbSupplier.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "College Of Engineering", "D'Amore McKim" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 34, 0, 0);
        add(cmbSupplier, gridBagConstraints);

        btnGo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 21, 0, 0);
        add(btnGo, gridBagConstraints);

        jBtnViewFaculty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnViewFaculty.setText("View Faculty");
        jBtnViewFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewFacultyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 91, 0, 0);
        add(jBtnViewFaculty, gridBagConstraints);

        jBtnViewPerformance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnViewPerformance.setText("View Performance");
        jBtnViewPerformance.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jBtnViewPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewPerformanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 23, 0, 0);
        add(jBtnViewPerformance, gridBagConstraints);

        jBtnViewStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnViewStudents.setText("View Students");
        jBtnViewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewStudentsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 179, 0, 0);
        add(jBtnViewStudents, gridBagConstraints);

        lblDepChooser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDepChooser.setText("Choose your Department:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 130, 0, 0);
        add(lblDepChooser, gridBagConstraints);

        cmbDep.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbDep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Information Systems", "Industrial Engineering", "Sales and Marketing", "Project Management" }));
        cmbDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 27;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 34, 0, 0);
        add(cmbDep, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jSeparator1, gridBagConstraints);

        jBtnAddEmployer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnAddEmployer.setText("Add Employer");
        jBtnAddEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddEmployerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 47, 0, 0);
        add(jBtnAddEmployer, gridBagConstraints);

        jBtnViewEmployer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnViewEmployer.setText("View Employer");
        jBtnViewEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewEmployerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 91, 0, 0);
        add(jBtnViewEmployer, gridBagConstraints);

        jBtnRemoveFaculty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnRemoveFaculty.setText("Remove Faculty");
        jBtnRemoveFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveFacultyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 28;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 43, 0, 0);
        add(jBtnRemoveFaculty, gridBagConstraints);

        jBtnRemoveEmployer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnRemoveEmployer.setText("Remove Employer");
        jBtnRemoveEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveEmployerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 55;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 43, 0, 0);
        add(jBtnRemoveEmployer, gridBagConstraints);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("Add Faculty");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 47, 0, 0);
        add(jButton9, gridBagConstraints);

        jBtnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 39;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 56;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 3, 32, 0);
        add(jBtnBack, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 96;
        gridBagConstraints.ipadx = 667;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        add(jSeparator2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

       
    }//GEN-LAST:event_btnGoActionPerformed

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed

    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void jBtnViewFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnViewFacultyActionPerformed

    private void jBtnViewPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnViewPerformanceActionPerformed

    private void jBtnViewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnViewStudentsActionPerformed

    private void cmbDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepActionPerformed

    }//GEN-LAST:event_cmbDepActionPerformed

    private void jBtnAddEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAddEmployerActionPerformed

    private void jBtnViewEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnViewEmployerActionPerformed

    private void jBtnRemoveFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRemoveFacultyActionPerformed

    private void jBtnRemoveEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRemoveEmployerActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBackActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox cmbDep;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JButton jBtnAddEmployer;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnRemoveEmployer;
    private javax.swing.JButton jBtnRemoveFaculty;
    private javax.swing.JButton jBtnViewEmployer;
    private javax.swing.JButton jBtnViewFaculty;
    private javax.swing.JButton jBtnViewPerformance;
    private javax.swing.JButton jBtnViewStudents;
    private javax.swing.JButton jButton9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDepChooser;
    private javax.swing.JLabel lblSupplierChooser;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
    
}
