/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organizations;
import Business.UserAccount.User.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import userinterface.GovernmentRole.GovernmentWorkArea;
import userinterface.HospitalWorkArea.HospitalJPanel;
import userinterface.MainJFrame;
import userinterface.Population.ChooseUserJPanel;

/**
 * Login form
 * @author mansizope
 */
public class LoginForm extends javax.swing.JPanel {

    /**
     * Creates new form LoginForm
     */
    private EcoSystem system;

    public LoginForm(EcoSystem system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblAppName = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblLogin.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        lblLogin.setText("LOGIN");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUsername))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addGap(173, 173, 173))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblLogin)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 470, 340));

        add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        lblAppName.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        lblAppName.setText("BLOOD BANK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblAppName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(lblAppName)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(txtUsername.getText(), txtPassword.getText());// getUserAccountList() authenticateUser(userNameJTextField,passwordField);
       Enterprise inEnterprise=null;
        Organizations inOrganization=null;
        Network n=new Network();
        //Step1: Check in the system user account directory if you have the user

        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(txtUsername.getText(), txtPassword.getText());
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organizations organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(txtUsername.getText(), txtPassword.getText());
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        n=network;
                        break;
                    }
                    if (inOrganization != null) {
                        n=network;
                        break;
                    }
                }
                if (inEnterprise != null) {
                    n=network;
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
        } else {
             JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            MainJFrame mj = (MainJFrame) topFrame;
            mj.getContentPane().removeAll();
           
            
            JPanel createWorkArea = userAccount.getRole().createWorkArea(jPanel2, userAccount, inOrganization, inEnterprise, system);
            mj.getContentPane().add(createWorkArea);
            mj.revalidate();
            mj.pack();
            mj.setSize(1425, 988);
        }
        
//        if (userAccount == null) {
//            System.out.println("Enter correct credentials");
//            JOptionPane.showMessageDialog(this, "Enter correct credentials");
//        } else if (userAccount.getRole() == Role.Admin) {
//            SystemAdminWorkAreaJPanel systemAdminPanel = new SystemAdminWorkAreaJPanel(jPanel2,auth,inOrganization,inEnterprise, system);
//
//           
//
//        } else if (auth.getRole() == Role.Person) {
//            ChooseUserJPanel chooseUserJPanel = new ChooseUserJPanel(jPanel2, auth, inOrganization,inEnterprise,system);
//
//            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//            MainJFrame mj = (MainJFrame) topFrame;
//            mj.getContentPane().removeAll();
//            mj.getContentPane().add(chooseUserJPanel);
//            mj.revalidate();
//            mj.pack();
//            mj.setSize(1425, 988);
//
//            //this.pack();
//        } else if (auth.getRole() == Role.Manager) {
//
//            HospitalJPanel hospitalJPanel = new HospitalJPanel(jPanel2, auth, inOrganization,inEnterprise,system);
//
//            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//            MainJFrame mj = (MainJFrame) topFrame;
//            mj.getContentPane().removeAll();
//            mj.getContentPane().add(hospitalJPanel);
//            mj.revalidate();
//            mj.pack();
//            mj.setSize(1425, 988);
//
//            //this.pack();
//        } else if (auth.getRole() == Role.GovernmentAdmin) {
//            GovernmentWorkArea governmentJPanel = new GovernmentWorkArea(jPanel2, auth, inOrganization,inEnterprise,system);
//
//            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//            MainJFrame mj = (MainJFrame) topFrame;
//            mj.getContentPane().removeAll();
//            mj.getContentPane().add(governmentJPanel);
//            mj.revalidate();
//            mj.pack();
//            mj.setSize(1425, 988);
//
//            //this.pack();
//        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAppName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
