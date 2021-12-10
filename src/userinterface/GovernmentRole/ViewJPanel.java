/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentRole;

import Business.EcoSystem;
import Business.Government.LicenseDirectory;
import Business.Government.LicenseOrganization;
import Business.Government.TrainingDirectory;
import Business.Government.TrainingOraganization;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayan Mishra
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    ViewJPanel viewPanel;
    TrainingOraganization training;
    LicenseOrganization license;
    LicenseDirectory licenseDir;
    TrainingDirectory trainingDir;
    
    public ViewJPanel(TrainingOraganization training, LicenseOrganization license, LicenseDirectory licenseDir, TrainingDirectory trainingDir) {
        initComponents();
        this.training = training;
        this.license = license; 
        this.licenseDir = licenseDir;
        this.trainingDir = trainingDir;
        
        populateTableLicense();
        populateTableTraining();
        
    }

    public ViewJPanel() {
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLicense = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTraining = new javax.swing.JTable();
        btnDeleteTraining = new javax.swing.JButton();
        btnDeleteLicense = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(853, 647));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblLicense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "License Id", "License Number", "License Name", "Issue Date", "Expiry Date"
            }
        ));
        jScrollPane1.setViewportView(tblLicense);

        tblTraining.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Identity", "Cross Matching", "Compatibility", "Problems", "Trouble Shooting", "Issue of Blood", "Reactions", "Bag Disposal"
            }
        ));
        jScrollPane2.setViewportView(tblTraining);

        btnDeleteTraining.setText("Delete");
        btnDeleteTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTrainingActionPerformed(evt);
            }
        });

        btnDeleteLicense.setText("Delete");
        btnDeleteLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLicenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(btnDeleteTraining))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(btnDeleteLicense)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDeleteLicense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDeleteTraining)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTrainingActionPerformed
        // TODO add your handling code here:
        
        int RowIndex = tblTraining.getSelectedRow();
        
        if(RowIndex < 0){
            
            JOptionPane.showMessageDialog(this,"Please select a row to delete!");
            return ;            
        }
        
        DefaultTableModel model = (DefaultTableModel)tblTraining.getModel();
        TrainingOraganization selectedRow = (TrainingOraganization) model.getValueAt(RowIndex , 0); 
        
        trainingDir.deleteRows(selectedRow);
        
        JOptionPane.showMessageDialog(this,"Selected record is deleted!");    
        
        populateTableTraining();
        
    }//GEN-LAST:event_btnDeleteTrainingActionPerformed

    private void btnDeleteLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLicenseActionPerformed
        // TODO add your handling code here:
        
        int RowIndex = tblLicense.getSelectedRow();
        
        if(RowIndex < 0){
            
            JOptionPane.showMessageDialog(this,"Please select a row to delete!");
            return ;            
        }
        
        DefaultTableModel model = (DefaultTableModel)tblLicense.getModel();
        TrainingOraganization selectedRow = (TrainingOraganization) model.getValueAt(RowIndex , 0); 
        
        licenseDir.deleteRows(selectedRow);
        
        JOptionPane.showMessageDialog(this,"Selected record is deleted!");    
        
        populateTableLicense();        
        
    }//GEN-LAST:event_btnDeleteLicenseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteLicense;
    private javax.swing.JButton btnDeleteTraining;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLicense;
    private javax.swing.JTable tblTraining;
    // End of variables declaration//GEN-END:variables

    private void populateTableLicense() {
        DefaultTableModel model = (DefaultTableModel)tblLicense.getModel();
         List<LicenseOrganization> license = EcoSystem.getInstance().getLicenseDirectory().getLicense();
        model.setRowCount(0);
        
        for(LicenseOrganization l : license){
            
            Object[] col = new Object[5];
            col[0] = l;
            col[1] = l.getIssueNumber();
            col[2] = l.getLicenseName();
            col[3] = l.getIssueDate();
            col[4] = l.getExpiryDate();
            
            model.addRow(col);
            
            
        }
    }
    
    private void populateTableTraining() {
        DefaultTableModel model = (DefaultTableModel)tblTraining.getModel();
        model.setRowCount(0);
        List<TrainingOraganization> training = EcoSystem.getInstance().getTrainingDirectory().getTraining();
        for(TrainingOraganization t : training){
            
            Object[] col = new Object[8];
            col[0] = t;
            col[1] = t.getCrossMatching();
            col[2] = t.getCompatibility();
            col[3] = t.getProblems();
            col[4] = t.getTroubleShooting();
            col[5] = t.getIssueOfBlood();
            col[6] = t.getTransfusionReactions();
            col[7] = t.getBagDisposal();
            
            model.addRow(col);
            
          
            
        }
    }    
    
}
