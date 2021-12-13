/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

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
 * @author neeraja
 */
public class ChooseUserJPanel extends javax.swing.JPanel {

    EcoSystem ecosystem;
    DonateBloodJPanel donateBlood;
    ReceiveBloodJPanel receieveBlood;
    ViewDonationHistory viewDonationHistory;
    ViewReceiverHistory receiverHistory;
    String loggedInUser;
       JPanel userProcessContainer;
    UserAccount account;
    Organizations organization;
    Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ChooseUser
     */
    public ChooseUserJPanel(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem ecosystem) {

        this.ecosystem = ecosystem;
        //this.loggedInUser = loggedInUser;
        initComponents();

        this.ecosystem = ecosystem;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        donateBldBtn = new javax.swing.JButton();
        receiveBtn = new javax.swing.JButton();
        donateHistBtn = new javax.swing.JButton();
        receiveHistBtn = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerSize(1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setText("                                                                    User Panel");
        jPanel2.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        donateBldBtn.setBackground(new java.awt.Color(255, 255, 255));
        donateBldBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donateBldBtn.setText("Donate Blood");
        donateBldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBldBtnActionPerformed(evt);
            }
        });

        receiveBtn.setBackground(new java.awt.Color(255, 255, 255));
        receiveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiveBtn.setText("Receive Blood");
        receiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveBtnActionPerformed(evt);
            }
        });

        donateHistBtn.setBackground(new java.awt.Color(255, 255, 255));
        donateHistBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donateHistBtn.setText("View Donation History");
        donateHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateHistBtnActionPerformed(evt);
            }
        });

        receiveHistBtn.setBackground(new java.awt.Color(255, 255, 255));
        receiveHistBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiveHistBtn.setText("View Receiver History");
        receiveHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveHistBtnActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(donateHistBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(receiveHistBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donateBldBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(donateBldBtn)
                .addGap(18, 18, 18)
                .addComponent(receiveBtn)
                .addGap(18, 18, 18)
                .addComponent(donateHistBtn)
                .addGap(18, 18, 18)
                .addComponent(receiveHistBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(32, 32, 32))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void receiveHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveHistBtnActionPerformed
        // TODO add your handling code here:
//        jPanel2.remove(receieveBlood);
//        jPanel2.remove(viewDonationHistory);
//        jPanel2.remove(donateBlood);
        jPanel2.removeAll();
        receiverHistory = new ViewReceiverHistory(userProcessContainer, ecosystem,enterprise, account);

        jPanel2.add(receiverHistory);

        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.next(jPanel2);
    }//GEN-LAST:event_receiveHistBtnActionPerformed

    private void donateHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateHistBtnActionPerformed
        // TODO add your handling code here:
//        jPanel2.remove(receieveBlood);
//        jPanel2.remove(receiverHistory);
//        jPanel2.remove(donateBlood);
        viewDonationHistory = new ViewDonationHistory(userProcessContainer, ecosystem,enterprise, account);
        jPanel2.removeAll();
        jPanel2.add(viewDonationHistory);

        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.next(jPanel2);
    }//GEN-LAST:event_donateHistBtnActionPerformed

    private void donateBldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBldBtnActionPerformed
        // TODO add your handling code here:
//        jPanel2.remove(receieveBlood);
//        jPanel2.remove(viewDonationHistory);
//        jPanel2.remove(receiverHistory);
        jPanel2.removeAll();
        donateBlood = new DonateBloodJPanel(userProcessContainer, ecosystem,enterprise, account);

        jPanel2.add(donateBlood);

        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.next(jPanel2);
    }//GEN-LAST:event_donateBldBtnActionPerformed

    private void receiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveBtnActionPerformed
        // TODO add your handling code here:
//        jPanel2.remove(donateBlood);
//        jPanel2.remove(viewDonationHistory);
//        jPanel2.remove(receiverHistory);
        jPanel2.removeAll();
        
        receieveBlood = new ReceiveBloodJPanel(userProcessContainer, ecosystem,enterprise, account);
        jPanel2.add(receieveBlood);

        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.next(jPanel2);
    }//GEN-LAST:event_receiveBtnActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        JFrame frame = (JFrame) SwingUtilities.getRoot(this);
        frame.remove(this);
        frame.pack();
        frame.setSize(1425, 988);
        frame.add(new LoginForm(ecosystem));
        dB4OUtil.storeSystem(EcoSystem.getInstance());
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton donateBldBtn;
    private javax.swing.JButton donateHistBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton receiveBtn;
    private javax.swing.JButton receiveHistBtn;
    // End of variables declaration//GEN-END:variables
}
