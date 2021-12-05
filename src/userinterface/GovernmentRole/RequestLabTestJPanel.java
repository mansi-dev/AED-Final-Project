/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentRole;

import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author mayan
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        
        this.userAccount = account;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLicenseId = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLicenseId1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLicenseId2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLicenseId3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chk = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chk4 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();

        setMinimumSize(new java.awt.Dimension(660, 548));
        setPreferredSize(new java.awt.Dimension(660, 548));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel1.setText("Problems:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        txtLicenseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseIdActionPerformed(evt);
            }
        });
        add(txtLicenseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel2.setText("License Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        txtLicenseId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseId1ActionPerformed(evt);
            }
        });
        add(txtLicenseId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 89, -1));

        jLabel3.setText("License Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        txtLicenseId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseId2ActionPerformed(evt);
            }
        });
        add(txtLicenseId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 89, -1));

        jLabel4.setText("Expiry Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        txtLicenseId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseId3ActionPerformed(evt);
            }
        });
        add(txtLicenseId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 89, -1));

        jLabel5.setText("Issue Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel6.setText("Patient Identity:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel7.setText("Cross Matching:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel8.setText("Compatibility:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });
        add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });
        add(chk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });
        add(chk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });
        add(chk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        jLabel9.setText("Bag Disposal:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jLabel10.setText("Trouble Shooting:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel11.setText("Issue Of Blood:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, 20));

        jLabel12.setText("Transfusion Reactions:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });
        add(chk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        chk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5ActionPerformed(evt);
            }
        });
        add(chk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });
        add(chk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        chk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk7ActionPerformed(evt);
            }
        });
        add(chk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtLicenseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseIdActionPerformed

    private void txtLicenseId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseId1ActionPerformed

    private void txtLicenseId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseId2ActionPerformed

    private void txtLicenseId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseId3ActionPerformed

    private void chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkActionPerformed

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5ActionPerformed

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk6ActionPerformed

    private void chk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox chk;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtLicenseId;
    private javax.swing.JTextField txtLicenseId1;
    private javax.swing.JTextField txtLicenseId2;
    private javax.swing.JTextField txtLicenseId3;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}