/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Government.LicenseDirectory;
import Business.Government.License;
import Business.Government.TrainingDirectory;
import Business.Government.Training;
import Business.Hospital.Hospital;
import Business.Organization.HospitalOrganization;
import Business.Organization.LicenseOrganization;
import Business.Organization.Organizations;
import Business.Organization.TrainingOrganization;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayan Mishra
 */
public class GovernmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentPanel
     */
    Training training;
    License license;
    LicenseDirectory licenseDir;
    TrainingDirectory trainingDir;
    Enterprise enterprise;
    EcoSystem ecoSystem;

    public GovernmentPanel(Enterprise enterprise, EcoSystem ecoSystem) {
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        initComponents();
        populateHospitalLicense();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblExpiryDate = new javax.swing.JLabel();
        lblIssueDate = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        lblLicenseName = new javax.swing.JLabel();
        txtLicenseName = new javax.swing.JTextField();
        cmbNGO1 = new javax.swing.JComboBox<>();
        lblNGO1 = new javax.swing.JLabel();
        cmbHospital1 = new javax.swing.JComboBox<>();
        lblHospital1 = new javax.swing.JLabel();
        btnSaveLicense = new javax.swing.JButton();
        dteIssueDate = new com.toedter.calendar.JDateChooser();
        dteExpiryDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblProblems = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblCrossMatching = new javax.swing.JLabel();
        lblCompatibility = new javax.swing.JLabel();
        chkPatientId = new javax.swing.JCheckBox();
        chkCrossMatching = new javax.swing.JCheckBox();
        chkCompatibility = new javax.swing.JCheckBox();
        chkProblems = new javax.swing.JCheckBox();
        lblDisposal = new javax.swing.JLabel();
        lblTroubleShoot = new javax.swing.JLabel();
        lblBloodIssue = new javax.swing.JLabel();
        lblTransfusion = new javax.swing.JLabel();
        chkTroubleShoot = new javax.swing.JCheckBox();
        chkBloodIssue = new javax.swing.JCheckBox();
        chkTransfusion = new javax.swing.JCheckBox();
        chkDisposal = new javax.swing.JCheckBox();
        lblHospital = new javax.swing.JLabel();
        cmbHospital = new javax.swing.JComboBox<>();
        cmbNGO = new javax.swing.JComboBox<>();
        lblNGO = new javax.swing.JLabel();
        btnSaveTraining = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("License");

        setPreferredSize(new java.awt.Dimension(900, 700));

        jTabbedPane1.setBackground(new java.awt.Color(255, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblExpiryDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExpiryDate.setText("Expiry Date:");

        lblIssueDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIssueDate.setText("Issue Date:");

        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });

        lblLicenseNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLicenseNumber.setText("License Number:");

        lblLicenseName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLicenseName.setText("License Name:");

        txtLicenseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNameActionPerformed(evt);
            }
        });

        cmbNGO1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNGO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNGO1ActionPerformed(evt);
            }
        });

        lblNGO1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNGO1.setText("Select NGO:");

        cmbHospital1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospital1ActionPerformed(evt);
            }
        });

        lblHospital1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHospital1.setText("Select Hospital:");

        btnSaveLicense.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveLicense.setText("SAVE");
        btnSaveLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLicenseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("License");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BB6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(btnSaveLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 477, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHospital1)
                                .addGap(36, 36, 36)
                                .addComponent(cmbHospital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lblNGO1)
                                .addGap(40, 40, 40)
                                .addComponent(cmbNGO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblIssueDate)
                                            .addComponent(lblExpiryDate))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dteIssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dteExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLicenseName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLicenseNumber))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLicenseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospital1)
                    .addComponent(cmbHospital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNGO1)
                    .addComponent(cmbNGO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicenseNumber))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicenseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicenseName))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dteIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIssueDate))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExpiryDate)
                    .addComponent(dteExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnSaveLicense)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("License", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblProblems.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProblems.setText("Problems:");

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPatientId.setText("Patient Identity:");

        lblCrossMatching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCrossMatching.setText("Cross Matching:");

        lblCompatibility.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCompatibility.setText("Compatibility:");

        chkPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPatientIdActionPerformed(evt);
            }
        });

        chkCrossMatching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCrossMatchingActionPerformed(evt);
            }
        });

        chkCompatibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCompatibilityActionPerformed(evt);
            }
        });

        chkProblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkProblemsActionPerformed(evt);
            }
        });

        lblDisposal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDisposal.setText("Bag Disposal:");

        lblTroubleShoot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTroubleShoot.setText("Trouble Shooting:");

        lblBloodIssue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBloodIssue.setText("Issue Of Blood:");

        lblTransfusion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTransfusion.setText("Transfusion Reactions:");

        chkTroubleShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTroubleShootActionPerformed(evt);
            }
        });

        chkBloodIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBloodIssueActionPerformed(evt);
            }
        });

        chkTransfusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTransfusionActionPerformed(evt);
            }
        });

        chkDisposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDisposalActionPerformed(evt);
            }
        });

        lblHospital.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHospital.setText("Select Hospital:");

        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbNGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNGO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNGO.setText("Select NGO:");

        btnSaveTraining.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveTraining.setText("SAVE");
        btnSaveTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTrainingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Training");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BB6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTransfusion)
                                    .addComponent(lblTroubleShoot)
                                    .addComponent(lblCompatibility)
                                    .addComponent(lblPatientId))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkTransfusion)
                                            .addComponent(chkTroubleShoot)
                                            .addComponent(chkPatientId)
                                            .addComponent(chkCompatibility))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(lblDisposal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblBloodIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(38, 38, 38)
                                                    .addComponent(lblProblems, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblCrossMatching, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkCrossMatching)
                                            .addComponent(chkProblems)
                                            .addComponent(chkBloodIssue)
                                            .addComponent(chkDisposal)))
                                    .addComponent(btnSaveTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblHospital)
                                .addGap(36, 36, 36)
                                .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(lblNGO)
                                .addGap(35, 35, 35)
                                .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospital)
                    .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNGO)
                    .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkBloodIssue)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCrossMatching)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProblems))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkCrossMatching)
                                    .addComponent(chkPatientId)
                                    .addComponent(lblPatientId))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCompatibility)
                                            .addComponent(chkCompatibility)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkProblems)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTroubleShoot)
                                    .addComponent(chkTroubleShoot)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblBloodIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTransfusion)
                    .addComponent(chkTransfusion)
                    .addComponent(lblDisposal)
                    .addComponent(chkDisposal))
                .addGap(49, 49, 49)
                .addComponent(btnSaveTraining)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Training", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed

    private void txtLicenseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNameActionPerformed

    private void chkPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPatientIdActionPerformed

    private void chkCrossMatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCrossMatchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCrossMatchingActionPerformed

    private void chkCompatibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCompatibilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCompatibilityActionPerformed

    private void chkProblemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkProblemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkProblemsActionPerformed

    private void chkTroubleShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTroubleShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTroubleShootActionPerformed

    private void chkBloodIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBloodIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBloodIssueActionPerformed

    private void chkTransfusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTransfusionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTransfusionActionPerformed

    private void chkDisposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDisposalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDisposalActionPerformed

    private void btnSaveTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTrainingActionPerformed
        // TODO add your handling code here:

        Boolean patientIdentity = chkPatientId.isSelected();
        Boolean crossMatching = chkCrossMatching.isSelected();
        Boolean compatibility = chkCompatibility.isSelected();
        Boolean problems = chkProblems.isSelected();
        Boolean troubleShooting = chkTroubleShoot.isSelected();
        Boolean issueOfBlood = chkBloodIssue.isSelected();
        Boolean transfusionReactions = chkTransfusion.isSelected();
        Boolean bagDisposal = chkDisposal.isSelected();
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterpriseTemp = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
        Hospital hosp = null;
        for (Organizations o : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                HospitalOrganization hosOrg = (HospitalOrganization) o;
                hosp = hosOrg.getHospitalDirectory().getHospitalByName((String) cmbHospital.getSelectedItem());
            }
        }
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Training Organization")) {
                TrainingOrganization trainingOrganization = (TrainingOrganization) o;
                Training t = trainingOrganization.getTrainingDirectory().addNewEntry();
                t.setBagDisposal(bagDisposal);
                t.setCompatibility(compatibility);
                t.setCrossMatching(crossMatching);
                t.setIssueOfBlood(issueOfBlood);
                t.setPatientIdentity(patientIdentity);
                t.setProblems(problems);
                t.setTransfusionReactions(transfusionReactions);
                t.setTroubleShooting(troubleShooting);
                hosp.setTraining(t);
                hosp.setIsTrained(true);
                break;
            }
        }

        JOptionPane.showMessageDialog(this, "Training information added.");

        chkPatientId.setSelected(false);
        chkCrossMatching.setSelected(false);
        chkCompatibility.setSelected(false);
        chkProblems.setSelected(false);
        chkTroubleShoot.setSelected(false);
        chkBloodIssue.setSelected(false);
        chkTransfusion.setSelected(false);
        chkDisposal.setSelected(false);

//   catch(Exception e){
//       JOptionPane.showMessageDialog(this,"Exception");
//   }
    }//GEN-LAST:event_btnSaveTrainingActionPerformed

    private void btnSaveLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLicenseActionPerformed
        // TODO add your handling code here:

        if ((dteIssueDate.getDate()).compareTo(dteExpiryDate.getDate()) >= 0) {
            JOptionPane.showMessageDialog(this, "License Issue Date cannot be greater than its Expiry Date.",
                    "Swing Tester", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!txtLicenseName.getText().isEmpty() && !txtLicenseNumber.getText().isEmpty()) {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate now = LocalDate.now();
                ZoneId defaultZoneId = ZoneId.systemDefault();
                Date date = Date.from(now.atStartOfDay(defaultZoneId).toInstant());

                Long licenseNumber = Long.parseLong(txtLicenseNumber.getText());
                String licenseName = txtLicenseName.getText();
                Date issueDate = dteIssueDate.getDate();
                Date expiryDate = dteExpiryDate.getDate();

                ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
                Enterprise enterpriseTemp = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
                Hospital hosp = null;
                for (Organizations o : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                        HospitalOrganization hosOrg = (HospitalOrganization) o;
                        hosp = hosOrg.getHospitalDirectory().getHospitalByName((String) cmbHospital1.getSelectedItem());
                        break;
                    }
                }
                if (hosp != null) {
                    for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("License Organization")) {
                            LicenseOrganization licOrg = (LicenseOrganization) o;
                            License lic = licOrg.getLicenseDirectory().addNewEntry(expiryDate, issueDate, licenseNumber, licenseName);
                            hosp.setLicense(lic);
                            hosp.setIsLicensed(true);
                            break;
                        }

                    }
                    JOptionPane.showMessageDialog(this, "License information added.");
                    txtLicenseName.setText("");
                    txtLicenseNumber.setText("");
                    dteIssueDate.setDate(date);
                    dteExpiryDate.setDate(date);
                } else {
                    JOptionPane.showMessageDialog(this, "Select hospital");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Fields cannot be left empty.");
            }
        }
    }//GEN-LAST:event_btnSaveLicenseActionPerformed

    private void cmbNGO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNGO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNGO1ActionPerformed

    private void cmbHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospital1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospital1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveLicense;
    private javax.swing.JButton btnSaveTraining;
    private javax.swing.JCheckBox chkBloodIssue;
    private javax.swing.JCheckBox chkCompatibility;
    private javax.swing.JCheckBox chkCrossMatching;
    private javax.swing.JCheckBox chkDisposal;
    private javax.swing.JCheckBox chkPatientId;
    private javax.swing.JCheckBox chkProblems;
    private javax.swing.JCheckBox chkTransfusion;
    private javax.swing.JCheckBox chkTroubleShoot;
    private javax.swing.JComboBox<String> cmbHospital;
    private javax.swing.JComboBox<String> cmbHospital1;
    private javax.swing.JComboBox<String> cmbNGO;
    private javax.swing.JComboBox<String> cmbNGO1;
    private com.toedter.calendar.JDateChooser dteExpiryDate;
    private com.toedter.calendar.JDateChooser dteIssueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBloodIssue;
    private javax.swing.JLabel lblCompatibility;
    private javax.swing.JLabel lblCrossMatching;
    private javax.swing.JLabel lblDisposal;
    private javax.swing.JLabel lblExpiryDate;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblHospital1;
    private javax.swing.JLabel lblIssueDate;
    private javax.swing.JLabel lblLicenseName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblNGO;
    private javax.swing.JLabel lblNGO1;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblProblems;
    private javax.swing.JLabel lblTransfusion;
    private javax.swing.JLabel lblTroubleShoot;
    private javax.swing.JTextField txtLicenseName;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalLicense() {
        cmbHospital1.removeAllItems();
        cmbHospital.removeAllItems();
        cmbNGO1.removeAllItems();
        cmbNGO.removeAllItems();
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);

        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                HospitalOrganization hosOrg = (HospitalOrganization) o;
                List<Hospital> hospitalList = hosOrg.getHospitalDirectory().getHospitalList();
                for (Hospital bloodBank : hospitalList) {
                    cmbHospital1.addItem(bloodBank.getName());
                    cmbHospital.addItem(bloodBank.getName());
                    cmbNGO1.addItem(bloodBank.getName());
                    cmbNGO.addItem(bloodBank.getName());
                }
                break;
            }
        }
    }

}
