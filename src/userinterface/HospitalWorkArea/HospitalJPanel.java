/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.Organizations;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import userinterface.SystemAdminWorkArea.LoginForm;

/**
 *
 * @author mansizope
 */
public class HospitalJPanel extends javax.swing.JPanel {

    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem ecosystem;
    UserAccount auth;

        
    JPanel userProcessContainer;
    UserAccount account;
    Organizations organization;
    Enterprise enterprise;
    /**
     * Creates new form HospitalJPanel
     */
    public HospitalJPanel(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrderBloodSample = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSellBloodSample = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane2.setDividerSize(1);
        jSplitPane2.setPreferredSize(new java.awt.Dimension(141, 243));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 243));

        jLabel1.setText("Hospital Admin");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        btnOrderBloodSample.setText("Order Blood Sample");
        btnOrderBloodSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderBloodSampleActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSellBloodSample.setText("Sell Blood Sample");
        btnSellBloodSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellBloodSampleActionPerformed(evt);
            }
        });

        btnView.setText("View Inventory");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrderBloodSample, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSellBloodSample, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addComponent(btnOrderBloodSample)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSellBloodSample)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(jPanel1);

        add(jSplitPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderBloodSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderBloodSampleActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        OrderPanel aPanel = new OrderPanel();
        jPanel1.add(aPanel);
        CardLayout cardLayout = (CardLayout) jPanel1.getLayout();
        cardLayout.next(jPanel1);
    }//GEN-LAST:event_btnOrderBloodSampleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        JFrame frame = (JFrame) SwingUtilities.getRoot(this);
        frame.remove(this);
        frame.pack();
        frame.setSize(1425, 988);
        frame.add(new LoginForm(ecosystem));
        dB4OUtil.storeSystem(EcoSystem.getInstance());
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSellBloodSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellBloodSampleActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        SellPanel sPanel = new SellPanel();
        jPanel1.add(sPanel);
        CardLayout cardLayout = (CardLayout) jPanel1.getLayout();
        cardLayout.next(jPanel1);
    }//GEN-LAST:event_btnSellBloodSampleActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        jPanel1.removeAll();
        ViewInventory viewInventory = new ViewInventory(auth);
        jPanel1.add(viewInventory);
        CardLayout cardLayout = (CardLayout) jPanel1.getLayout();
        cardLayout.next(jPanel1);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrderBloodSample;
    private javax.swing.JButton btnSellBloodSample;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
