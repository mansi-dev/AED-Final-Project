/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Doctor;
import Business.Hospital.Hospital;
import Business.Manager.Manager;
import Business.Network.Network;
import Business.Organization.HospitalManagerOrganization;
import Business.Organization.Organizations;
import Business.Organization.PersonOrganization;
import Business.Population.Person;
import Business.UserAccount.User;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author mansizope
 */
public class ManageHospitalManager extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospital
     */
    public ManageHospitalManager() {
        initComponents();
        addListeners();
    }
    private static int counter = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        brandLbl6 = new javax.swing.JLabel();
        txtMgrName = new javax.swing.JTextField();
        brandLbl7 = new javax.swing.JLabel();
        txtMgrAddr = new javax.swing.JTextField();
        brandLbl13 = new javax.swing.JLabel();
        txtMgrCIty = new javax.swing.JTextField();
        brandLbl14 = new javax.swing.JLabel();
        txtMgrState = new javax.swing.JTextField();
        brandLbl15 = new javax.swing.JLabel();
        txtMgrZipCode = new javax.swing.JTextField();
        brandLbl16 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        brandLbl17 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        brandLbl19 = new javax.swing.JLabel();
        txtHospitalId = new javax.swing.JTextField();
        brandLbl8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        brandLbl9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnHospitalSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospView = new javax.swing.JTable();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel2.setOpaque(false);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        brandLbl6.setBackground(new java.awt.Color(255, 255, 255));
        brandLbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl6.setText("Name:");

        brandLbl7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl7.setText("Address:");

        brandLbl13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl13.setText("City:");

        brandLbl14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl14.setText("State:");

        brandLbl15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl15.setText("Zip Code:");

        brandLbl16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl16.setText("Phone Number:");

        brandLbl17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl17.setText("Email ID:");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        brandLbl19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl19.setText("Hospital ID:");

        txtHospitalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIdActionPerformed(evt);
            }
        });

        brandLbl8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl8.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        brandLbl9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl9.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brandLbl8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(brandLbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brandLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMgrZipCode)
                            .addComponent(txtMgrName)
                            .addComponent(txtMgrCIty)
                            .addComponent(txtMgrAddr)
                            .addComponent(txtMgrState)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(brandLbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {brandLbl19, brandLbl8, brandLbl9, txtHospitalId, txtPassword, txtUsername});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl6)
                    .addComponent(txtMgrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl7)
                    .addComponent(txtMgrAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl13)
                    .addComponent(txtMgrCIty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl14)
                    .addComponent(txtMgrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl15)
                    .addComponent(txtMgrZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl16)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl17)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLbl19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLbl8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLbl9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {brandLbl19, brandLbl8, brandLbl9, txtHospitalId, txtPassword, txtUsername});

        btnHospitalSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHospitalSave.setText("Save");
        btnHospitalSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("CREATE MANAGER");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnHospitalSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHospitalSave)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Manager", jPanel2);

        jPanel3.setOpaque(false);

        tblHospView.setBackground(new java.awt.Color(255, 204, 204));
        tblHospView.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblHospView.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblHospView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Address", "City", "State", "Phone Number", "Zip Code", "Email ID", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHospView);
        if (tblHospView.getColumnModel().getColumnCount() > 0) {
            tblHospView.getColumnModel().getColumn(0).setMinWidth(1);
            tblHospView.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblHospView.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("VIEW MANAGER");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete1)
                        .addGap(18, 18, 18)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete1)
                    .addComponent(btnUpdate1))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Manager", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtHospitalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIdActionPerformed

    private void btnHospitalSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalSaveActionPerformed
        // TODO add your handling code here:
        if (!txtMgrName.getText().isEmpty() && !txtHospitalId.getText().isEmpty()
                && !txtMgrAddr.getText().isEmpty() && !txtMgrCIty.getText().isEmpty()
                && !txtMgrState.getText().isEmpty() && !txtMgrZipCode.getText().isEmpty() && !txtPhoneNum.getText().isEmpty()
                && !txtEmailID.getText().isEmpty()) {
            int id = ++counter;

//           UserAccount temp = EcoSystem.getInstance().getUserAccountDirectory().
//                 createUserAccount(txtMgrName.getText(),txtUsername.getText(),
//                         txtPassword.getText(), User.Role.Manager);
            ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
            Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
            UserAccount temp = enterprise.getUserAccountDirectory().createUserAccount(txtMgrName.getText(), txtUsername.getText(),
                    txtPassword.getText(), enterprise.getSupportedRole().get(0));
            for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o.getName().equalsIgnoreCase("Hospital Manager Organization")) {
                    HospitalManagerOrganization hosManagerOrg = (HospitalManagerOrganization) o;
                    Manager manager = (Manager) hosManagerOrg.getManagerDirectory().createManager(id);
                    manager.setName(txtMgrName.getText());
                    manager.setEmail(txtEmailID.getText());
                    manager.setAddress(txtMgrAddr.getText());
                    manager.setCity(txtMgrCIty.getText());
                    manager.setState(txtMgrState.getText());
                    manager.setZipCode(txtMgrZipCode.getText());
                    manager.setPhoneNum(Long.parseLong(txtPhoneNum.getText()));
                    manager.setHospitalByID(Integer.parseInt(txtHospitalId.getText()));
                    temp.setUser(manager);
                    JOptionPane.showMessageDialog(this, "Added manager details");

                    JOptionPane.showMessageDialog(this, "Added user details");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");

        }
    }//GEN-LAST:event_btnHospitalSaveActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblHospView.getModel();
        int rowIndex = tblHospView.getSelectedRow();

        Vector dataVector = model.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(rowIndex);

        if (!elementAt.get(2).toString().isEmpty() && !elementAt.get(3).toString().isEmpty()
                && !elementAt.get(4).toString().isEmpty() && !elementAt.get(5).toString().isEmpty() && !elementAt.get(6).toString().isEmpty()
                && !elementAt.get(7).toString().isEmpty() && !elementAt.get(8).toString().isEmpty() && !elementAt.get(9).toString().isEmpty()) {
            Hospital hospital = (Hospital) elementAt.get(0);
            hospital.setName(elementAt.get(2).toString());
            hospital.setAddress(elementAt.get(3).toString());
            hospital.setCity(elementAt.get(4).toString());
            hospital.setState(elementAt.get(5).toString());
            hospital.setPhoneNum(Long.parseLong(elementAt.get(6).toString()));
            hospital.setZipCode(elementAt.get(7).toString());

            JOptionPane.showMessageDialog(this, "Value updated successfully!");

        } else {
            JOptionPane.showMessageDialog(this, "Please enter all values.");

        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblHospView.getModel();
        int rowIndex = tblHospView.getSelectedRow();
        Manager valueAt = (Manager) model.getValueAt(rowIndex, 0);
        
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
            Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
        //EcoSystem.getInstance().getHospitalDirectory().deleteHospital(valueAt);
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o.getName().equalsIgnoreCase("Hospital Manager Organization")) {
                    HospitalManagerOrganization hosManagerOrg = (HospitalManagerOrganization) o;
                    hosManagerOrg.getManagerDirectory().removeManager(valueAt);
                    enterprise.getUserAccountDirectory().deleteAccount(valueAt.getId());
                    break;
                }
        }
        JOptionPane.showMessageDialog(this, "Values deleted successfully");
        populateManagerView();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        JTabbedPane tabbedPane = (JTabbedPane) evt.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex == 1) {
            populateManagerView();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandLbl13;
    private javax.swing.JLabel brandLbl14;
    private javax.swing.JLabel brandLbl15;
    private javax.swing.JLabel brandLbl16;
    private javax.swing.JLabel brandLbl17;
    private javax.swing.JLabel brandLbl19;
    private javax.swing.JLabel brandLbl6;
    private javax.swing.JLabel brandLbl7;
    private javax.swing.JLabel brandLbl8;
    private javax.swing.JLabel brandLbl9;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnHospitalSave;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblHospView;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtHospitalId;
    private javax.swing.JTextField txtMgrAddr;
    private javax.swing.JTextField txtMgrCIty;
    private javax.swing.JTextField txtMgrName;
    private javax.swing.JTextField txtMgrState;
    private javax.swing.JTextField txtMgrZipCode;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * Function to validate number input. To check if text fields contain any
     * alphabets.
     */
    void validateNumberInput(DocumentEvent e) {
        String charRegex = ".*[a-zA-z].*";
        int length = e.getDocument().getLength();
        try {
            String text = e.getDocument().getText(0, length);
            if (text.matches(charRegex)) {
                JOptionPane.showMessageDialog(this, "Characters are not allowed in Number field!");

            }
        } catch (BadLocationException ex) {
        }
    }

    /**
     * Function to validate input length.
     */
    void validateInputLength(DocumentEvent e, int len) {
        String charRegex = ".{" + len + "}";
        int length = e.getDocument().getLength();
        try {
            String text = e.getDocument().getText(0, length);
            if (text.matches(charRegex)) {
                JOptionPane.showMessageDialog(this, "Maximum characters allowed: " + (len - 1));

            }
        } catch (BadLocationException ex) {
        }
    }

    /**
     * Function to validate email input. To check if text fields contain any
     * special characters.
     */
    void validateEmailInput(String email) {
        String charRegex = ".*@[a-z]+\\.[a-z]+";

        System.out.println(email);
        if (!email.matches(charRegex)) {
            JOptionPane.showMessageDialog(this, "Email is not proper format!");

        }

    }

    /**
     * Function to validate text input. To check if text fields contain any
     * special characters.
     */
    void validateSpecialInput(DocumentEvent e) {
        String charRegex = ".*[./\\$)(?*%@].*";
        int length = e.getDocument().getLength();
        try {
            String text = e.getDocument().getText(0, length);
            if (text.matches(charRegex)) {
                JOptionPane.showMessageDialog(this, "Special characters are not allowed!");

            }
        } catch (BadLocationException ex) {
        }
    }

    /**
     * Function to validate text input. To check if text fields contain any
     * digits.
     */
    void validateTextInput(DocumentEvent e) {
        String digitRegex = ".*\\d.*";
        int length = e.getDocument().getLength();
        try {
            String text = e.getDocument().getText(0, length);
            if (text.matches(digitRegex)) {
                JOptionPane.showMessageDialog(this, "Digits are not allowed in text field!");

            }
        } catch (BadLocationException ex) {
        }
    }

    private void populateManagerView() {
        DefaultTableModel model = (DefaultTableModel) tblHospView.getModel();
        List<Manager> managerList = EcoSystem.getInstance().getManagerDirectory().getManagerList();
        model.setRowCount(0);
        for (Network network : EcoSystem.getInstance().getNetworkList()) {
            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Hospital")) {
                    for (Organizations o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("Hospital Manager Organization")) {
                            HospitalManagerOrganization managerOrg = (HospitalManagerOrganization) o;
                            for (User data : managerOrg.getManagerDirectory().getManagerList()) {
                                Object[] row = new Object[9];
                                row[0] = data;
                                row[1] = data.getId();
                                row[2] = data.getName();
                                row[3] = data.getAddress();
                                row[4] = data.getCity();
                                row[5] = data.getState();
                                row[6] = data.getPhoneNum();
                                row[7] = data.getZipCode();
                                row[8] = data.getEmail();
                                model.addRow(row);

                            }
                        }
                    }
                }
            }
        }
    }

    private void addListeners() {
        txtPhoneNum.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateInputLength(e, 11);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateInputLength(e, 11);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateInputLength(e, 11);
                validateSpecialInput(e);
            }

        });
        txtHospitalId.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

        });

        txtMgrName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

        });

        txtMgrCIty.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

        });
        txtMgrState.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateTextInput(e);
                validateSpecialInput(e);
            }

        });
        txtMgrZipCode.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateNumberInput(e);
                validateSpecialInput(e);
            }

        });
    }
}
