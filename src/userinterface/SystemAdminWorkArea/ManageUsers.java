/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organizations;
import Business.Organization.PersonOrganization;
import Business.Population.Person;
import Business.UserAccount.User;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
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
public class ManageUsers extends javax.swing.JPanel {

    private static int counter = 0;

    /**
     * Creates new form ManageUsers
     */
    public ManageUsers() {
        initComponents();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        brandLbl = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        brandLbl1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        brandLbl2 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        brandLbl3 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        brandLbl4 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        brandLbl5 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        brandLbl8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        brandLbl9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        usersTabbedPane.setBackground(new java.awt.Color(102, 102, 102));
        usersTabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usersTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                usersTabbedPaneStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        brandLbl.setBackground(new java.awt.Color(255, 255, 255));
        brandLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl.setText("Name:");

        brandLbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl1.setText("Address:");

        brandLbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl2.setText("City:");

        brandLbl3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl3.setText("State:");

        brandLbl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl4.setText("Zip Code:");

        brandLbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brandLbl5.setText("Phone Number:");

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

        lblEmailId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmailId.setText("Email ID:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brandLbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brandLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtZipCode)
                            .addComponent(txtName)
                            .addComponent(txtCity)
                            .addComponent(txtAddress)
                            .addComponent(txtState)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {brandLbl, brandLbl1, brandLbl2, brandLbl3, brandLbl4, brandLbl5, brandLbl8, brandLbl9, txtAddress, txtCity, txtName, txtPassword, txtPhoneNum, txtState, txtUsername, txtZipCode});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl1)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl2)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl3)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl4)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl5)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl8)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLbl9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {brandLbl, brandLbl1, brandLbl2, brandLbl3, brandLbl4, brandLbl5, brandLbl8, brandLbl9, txtAddress, txtCity, txtName, txtPassword, txtPhoneNum, txtState, txtUsername, txtZipCode});

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("CREATE USERS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSave)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        usersTabbedPane.addTab("Create Users", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Address", "City", "State", "Phone Number", "Zip Code", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("VIEW USERS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(13, 13, 13)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        usersTabbedPane.addTab("View Users", jPanel2);

        add(usersTabbedPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!txtName.getText().isEmpty() && !txtUsername.getText().isEmpty()
                && !txtPassword.getText().isEmpty() && !txtAddress.getText().isEmpty() && !txtCity.getText().isEmpty()
                && !txtState.getText().isEmpty() && !txtZipCode.getText().isEmpty() && !txtPhoneNum.getText().isEmpty()) {
//            UserAccount temp = EcoSystem.getInstance().getUserAccountDirectory().createUserAccount(txtName.getText(), txtUsername.getText(),
//                txtPassword.getText(), User.Role.Person);
            int id = ++counter;
            ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
            Enterprise enterprise = enterpriseList.stream().filter(item -> "Population".equals(item.getName())).findFirst().orElse(null);
            UserAccount temp = enterprise.getUserAccountDirectory().createUserAccount(txtName.getText(), txtUsername.getText(),
                    txtPassword.getText(), enterprise.getSupportedRole().get(0));
            for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o.getName().equalsIgnoreCase("Person Organization")) {
                    PersonOrganization personOrg = (PersonOrganization) o;
                    Person customer = (Person) personOrg.getPersonDirectory().addNewPerson(id);
                    customer.setName(txtName.getText());
                    customer.setAddress(txtAddress.getText());
                    customer.setCity(txtCity.getText());
                    customer.setState(txtState.getText());
                    customer.setZipCode(txtZipCode.getText());
                    customer.setPhoneNum(Long.parseLong(txtPhoneNum.getText()));
                    customer.setEmail(txtEmail.getText());
                    temp.setUser(customer);

                    JOptionPane.showMessageDialog(this, "Added user details");
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void populateResTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        List<Person> userList = EcoSystem.getInstance().getPersonDirectory().getPersonList();
        model.setRowCount(0);
//        for (User data : userList) {
//            Object[] row = new Object[9];
//            //row[0] = ++index;
//
//            row[0] = data;
//            row[1] = data.getId();
//            row[2] = data.getName();
//            row[3] = data.getAddress();
//            row[4] = data.getCity();
//            row[5] = data.getState();
//            row[6] = data.getPhoneNum();
//            row[7] = data.getZipCode();
//            row[8] = data.getEmail();
//
//            model.addRow(row);
//
//        }
        for (Network network : EcoSystem.getInstance().getNetworkList()) {
            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Population")) {
                    for (Organizations o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("Person Organization")) {
                            PersonOrganization personOrg = (PersonOrganization) o;
                            for (User data : personOrg.getPersonDirectory().getPersonList()) {
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowIndex = jTable1.getSelectedRow();

        Vector dataVector = model.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(rowIndex);

        if (!elementAt.get(2).toString().isEmpty() && !elementAt.get(3).toString().isEmpty()
                && !elementAt.get(4).toString().isEmpty() && !elementAt.get(5).toString().isEmpty() && !elementAt.get(6).toString().isEmpty()
                && !elementAt.get(7).toString().isEmpty()) {
            Person res = (Person) elementAt.get(0);
            res.setName(elementAt.get(2).toString());
            res.setAddress(elementAt.get(3).toString());
            res.setCity(elementAt.get(4).toString());
            res.setState(elementAt.get(5).toString());
            res.setPhoneNum(Long.parseLong(elementAt.get(6).toString()));
            res.setZipCode(elementAt.get(7).toString());

            JOptionPane.showMessageDialog(this, "Value updated successfully!");

        } else {
            JOptionPane.showMessageDialog(this, "Please enter all values.");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowIndex = jTable1.getSelectedRow();
        Person valueAt = (Person) model.getValueAt(rowIndex, 0);
        EcoSystem.getInstance().getPersonDirectory().removePerson(valueAt);

        EcoSystem.getInstance().getUserAccountDirectory().deleteAccount(valueAt.getId());
        JOptionPane.showMessageDialog(this, "Values deleted successfully");
        populateResTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void usersTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_usersTabbedPaneStateChanged
        // TODO add your handling code here:
        JTabbedPane tabbedPane = (JTabbedPane) evt.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex == 0) {

        } else if (selectedIndex == 1) {
            populateResTable();

        }
    }//GEN-LAST:event_usersTabbedPaneStateChanged

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandLbl;
    private javax.swing.JLabel brandLbl1;
    private javax.swing.JLabel brandLbl2;
    private javax.swing.JLabel brandLbl3;
    private javax.swing.JLabel brandLbl4;
    private javax.swing.JLabel brandLbl5;
    private javax.swing.JLabel brandLbl8;
    private javax.swing.JLabel brandLbl9;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTabbedPane usersTabbedPane;
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

        txtName.getDocument().addDocumentListener(new DocumentListener() {
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
        txtCity.getDocument().addDocumentListener(new DocumentListener() {
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
        txtState.getDocument().addDocumentListener(new DocumentListener() {
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
        txtZipCode.getDocument().addDocumentListener(new DocumentListener() {
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
