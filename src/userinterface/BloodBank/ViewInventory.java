/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBank;

import Business.BloodBank.BloodBankManager;
import Business.BloodBank.BloodStock;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodBankOrganization;
import Business.Organization.Organizations;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author neeraja
 */
public class ViewInventory extends javax.swing.JPanel {

    EcoSystem ecosystem;
    
    JPanel userProcessContainer;
    UserAccount account;
    Organizations organization;
    Enterprise enterprise;
    
    /**
     * Creates new form ViewReceiverHistory
     */
    public ViewInventory(UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        trnLbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBloodBank = new javax.swing.JTextField();
        trnLbl2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Blood Inventory");

        trnLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trnLbl1.setText("Blood Group: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receiver.png"))); // NOI18N

        txtBloodBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodBankActionPerformed(evt);
            }
        });

        trnLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trnLbl2.setText("Quantity:");

        txtQuantity.setEditable(false);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trnLbl2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trnLbl1)
                                .addGap(55, 55, 55)
                                .addComponent(txtBloodBank, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(btnCheck)))
                .addGap(0, 204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trnLbl1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBloodBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheck)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trnLbl2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(332, 332, 332))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBloodBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodBankActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        String bloodGroup = txtBloodBank.getText();
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
     
                if (o.getName().equalsIgnoreCase("BloodBank Organization")) {
                    BloodBankOrganization bbOrg =  (BloodBankOrganization) o;
                    BloodBankManager bm = (BloodBankManager) account.getUser();
                    int id = (int) bm.getBloodBank().getId();
                    if(bbOrg!=null){
                        
                    BloodStock bbstock = bbOrg.getBloodBankDirectory().getBloodBankByID(id).getBloodStock().stream().filter(item -> bloodGroup.equals(item.getBloodGroup())).findFirst().orElse(null);
                    if(bbstock!=null){
                                            txtQuantity.setText(String.valueOf(bbstock.getQuantity()));

                    }
                    }
                }
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel trnLbl1;
    private javax.swing.JLabel trnLbl2;
    private javax.swing.JTextField txtBloodBank;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
