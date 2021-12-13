/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organizations;
import Business.Organization.PersonOrganization;
import Business.Population.Person;
import Business.Population.ReceiverTransaction;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RecieverBloodWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author neeraja
 */
public class ReceiveBloodJPanel extends javax.swing.JPanel {

    String loggedInUser;

    EcoSystem business;

    Enterprise enterprise;
    UserAccount userAccount;

    /**
     * Creates new form ReceiveBloodJPanel
     */
    public ReceiveBloodJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount userAccount) {
        this.loggedInUser = loggedInUser;
        initComponents();
        addListeners();

        this.business = business;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        // populateInitialValues();
        populateHospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        receiverLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        bloodGrpLbl = new javax.swing.JLabel();
        unitsLbl = new javax.swing.JLabel();
        orgNameLbl = new javax.swing.JLabel();
        receiverTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        bloodGrpTxt = new javax.swing.JTextField();
        unitsTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        hbLvl = new javax.swing.JLabel();
        hbTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        orgCombo = new javax.swing.JComboBox<>();
        ageTxt = new javax.swing.JTextField();
        heightTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Request Blood");

        receiverLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiverLbl.setText("Receiver Name:");

        phoneNumberLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneNumberLbl.setText("Receiver Phone Number:");

        bloodGrpLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bloodGrpLbl.setText("Blood Group:");

        unitsLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unitsLbl.setText("Number of Units:");

        orgNameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orgNameLbl.setText("Organization Name:");

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setText("Request");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        hbLvl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hbLvl.setText("Hemoglobin Level:");

        emailLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLbl.setText("Email:");

        ageLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageLbl.setText("Age:");

        heightLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        heightLbl.setText("Height:");

        weightLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weightLbl.setText("Weight:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receiver.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(receiverLbl)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneNumberLbl)
                                .addGap(63, 63, 63)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiverTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(unitsLbl)
                            .addComponent(orgNameLbl)
                            .addComponent(hbLvl)
                            .addComponent(bloodGrpLbl)
                            .addComponent(weightLbl)
                            .addComponent(heightLbl)
                            .addComponent(ageLbl)
                            .addComponent(emailLbl))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bloodGrpTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hbTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitsTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgCombo, 0, 188, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(saveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiverLbl)
                    .addComponent(receiverTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLbl)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLbl))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodGrpLbl)
                    .addComponent(bloodGrpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hbLvl)
                    .addComponent(hbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsLbl)
                    .addComponent(unitsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgNameLbl))
                .addGap(18, 18, 18)
                .addComponent(saveBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateHospital() {
                ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);

        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                HospitalOrganization hosOrg = (HospitalOrganization) o;
                for (Hospital hosp : hosOrg.getHospitalDirectory().getHospitalList()) {
                    orgCombo.addItem(hosp.getName());
                }
            }
        }
    }

    private void populateInitialValues() {
        Person person = EcoSystem.getInstance().getPersonDirectory().getPersonByUsername(loggedInUser);
        String name = person.getName();
        String email = person.getEmail();
        long phoneNum = person.getPhoneNum();
        receiverTxt.setText(name);
        phoneNumberTxt.setText(String.valueOf(phoneNum));
        emailTxt.setText(String.valueOf(phoneNum));
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (!receiverTxt.getText().isEmpty() && !bloodGrpTxt.getText().isEmpty()
                && !phoneNumberTxt.getText().isEmpty() && !hbLvl.getText().isEmpty() && !unitsTxt.getText().isEmpty()
                && orgCombo.getSelectedItem() != null && !emailTxt.getText().isEmpty()) {

            Person person = null;
            ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
            Enterprise enterpriseTemp = enterpriseList.stream().filter(item -> "Population".equals(item.getName())).findFirst().orElse(null);
            for (Organizations organization : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
                if (organization.getName().equals("Person Organization")) {
                    PersonOrganization perOrg = (PersonOrganization) organization;
                    person = perOrg.getPersonDirectory().getPersonByPhoneNum(Long.parseLong(phoneNumberTxt.getText()));
                    break;
                }
            }
            if(person !=null){
            ReceiverTransaction rt = person.addNewReceiverTransaction();
            rt.setHblevel(Float.parseFloat(hbTxt.getText()));
            rt.setNumberOfUnits(Integer.parseInt(unitsTxt.getText()));
            rt.setAge(Integer.parseInt(ageTxt.getText()));
            rt.setHeight(Float.parseFloat(heightTxt.getText()));
            rt.setWeight(Float.parseFloat(weightTxt.getText()));
            person.setBloodGroup(bloodGrpTxt.getText());
            rt.setHospitalByID(((String) orgCombo.getSelectedItem()));
            Organizations oTemp = null;
            enterpriseTemp = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);

            for (Organizations organization : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
                if (organization.getName().equals("Hospital Organization")) {

                    System.out.println(organization);
                    oTemp = organization;
                    break;
                }
            }
            if (oTemp != null) {
                RecieverBloodWorkRequest bloodBankWorkRequest = new RecieverBloodWorkRequest();
                bloodBankWorkRequest.setReceiverTransaction(rt);
                bloodBankWorkRequest.setStatus("Pending");
                bloodBankWorkRequest.setMessage("Recieve blood");
                bloodBankWorkRequest.setSender(userAccount);
                bloodBankWorkRequest.setPerson(person);
                oTemp.getWorkQueue().getWorkRequestList().add(bloodBankWorkRequest);
                // System.out.println(org.getWorkQueue().getWorkRequestList());
                userAccount.getWorkQueue().getWorkRequestList().add(bloodBankWorkRequest);
                JOptionPane.showMessageDialog(null, "Blood request raised");

            }

            JOptionPane.showMessageDialog(this, "Added receiver details to the system");
        }
            else{
                JOptionPane.showMessageDialog(this, "User does not exist! Please check Phone Number");
            }
        }else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");

        }
    }//GEN-LAST:event_saveBtnActionPerformed
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
        bloodGrpTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateTextInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateTextInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateTextInput(e);
            }

        });

        hbTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateNumberInput(e);

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateNumberInput(e);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateNumberInput(e);

            }

        });
        unitsTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateNumberInput(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateNumberInput(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateNumberInput(e);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel bloodGrpLbl;
    private javax.swing.JTextField bloodGrpTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel hbLvl;
    private javax.swing.JTextField hbTxt;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JLabel orgNameLbl;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JLabel receiverLbl;
    private javax.swing.JTextField receiverTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel unitsLbl;
    private javax.swing.JTextField unitsTxt;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
