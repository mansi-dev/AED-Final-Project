/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

import Business.BloodBank.BloodBank;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodBankOrganization;
import Business.Organization.Organizations;
import Business.Organization.PersonOrganization;
import Business.Population.DonorTransaction;
import Business.Population.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonateBloodWorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author neeraja
 */
public class DonateBloodJPanel extends javax.swing.JPanel {

    String loggedInUser;
    JPanel userProcessContainer;

    EcoSystem business;

    Enterprise enterprise;
    UserAccount userAccount;

    /**
     * Creates new form DonateBloodJPanel
     */
    public DonateBloodJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount userAccount) {
        this.loggedInUser = loggedInUser;
        initComponents();
        addListeners();
        this.business = business;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        ///populateInitialValues();
        populateBloodBank();
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
        donorLbl = new javax.swing.JLabel();
        phoneNoLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        hbLbl = new javax.swing.JLabel();
        bloodGrpLbl = new javax.swing.JLabel();
        lastDonateLbl = new javax.swing.JLabel();
        unitsLbl = new javax.swing.JLabel();
        donationDateLbl = new javax.swing.JLabel();
        diseasesLbl = new javax.swing.JLabel();
        donorTxt = new javax.swing.JTextField();
        phoneNoTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        heightTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        hbTxt = new javax.swing.JTextField();
        bloodGrpTxt = new javax.swing.JTextField();
        unitsTxt = new javax.swing.JTextField();
        diseasesCheck = new javax.swing.JCheckBox();
        saveBtn = new javax.swing.JButton();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        donationDate = new com.toedter.calendar.JDateChooser();
        lastDonatedDate = new com.toedter.calendar.JDateChooser();
        bloodbankLbl = new javax.swing.JLabel();
        bloodbankCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DONATE BLOOD");

        donorLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donorLbl.setText("Donor Name:");

        phoneNoLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneNoLbl.setText("Donor Phone Number:");

        ageLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageLbl.setText("Age:");

        heightLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        heightLbl.setText("Height:");

        weightLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weightLbl.setText("Weight:");

        hbLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hbLbl.setText("Haemoglobin Level: ");

        bloodGrpLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bloodGrpLbl.setText("Blood Group:");

        lastDonateLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastDonateLbl.setText("Blood Last Donated On:");

        unitsLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unitsLbl.setText("Number of Units:");

        donationDateLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donationDateLbl.setText("Blood Donation Date:");

        diseasesLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diseasesLbl.setText("Other Diseases");

        saveBtn.setText("Request to Donate");

        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        emailLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLbl.setText("Email ID:");

        bloodbankLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bloodbankLbl.setText("Blood Banks:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Donor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodbankLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(donorLbl)
                                    .addComponent(phoneNoLbl)
                                    .addComponent(ageLbl)
                                    .addComponent(heightLbl)
                                    .addComponent(weightLbl)
                                    .addComponent(hbLbl)
                                    .addComponent(bloodGrpLbl)
                                    .addComponent(lastDonateLbl)
                                    .addComponent(unitsLbl)
                                    .addComponent(donationDateLbl)
                                    .addComponent(diseasesLbl)
                                    .addComponent(emailLbl))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloodbankCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(donorTxt)
                                    .addComponent(phoneNoTxt)
                                    .addComponent(ageTxt)
                                    .addComponent(heightTxt)
                                    .addComponent(weightTxt)
                                    .addComponent(hbTxt)
                                    .addComponent(bloodGrpTxt)
                                    .addComponent(unitsTxt)
                                    .addComponent(diseasesCheck)
                                    .addComponent(emailTxt)
                                    .addComponent(donationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastDonatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(saveBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorLbl)
                    .addComponent(donorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoLbl)
                    .addComponent(phoneNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLbl)
                    .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLbl)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hbLbl)
                    .addComponent(hbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodGrpLbl)
                    .addComponent(bloodGrpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastDonateLbl)
                    .addComponent(lastDonatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsLbl)
                    .addComponent(unitsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(donationDateLbl)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diseasesLbl)
                            .addComponent(diseasesCheck)))
                    .addComponent(donationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodbankLbl)
                    .addComponent(bloodbankCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBtn)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateBloodBank() {
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "BloodBank".equals(item.getName())).findFirst().orElse(null);

        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("BloodBank Organization")) {
                BloodBankOrganization bbOrg = (BloodBankOrganization) o;
                for (BloodBank bloodBank : bbOrg.getBloodBankDirectory().getBloodBankList()) {
                    bloodbankCombo.addItem(bloodBank.getName());
                }
            }
        }

    }

    private void populateInitialValues() {
        Person person = EcoSystem.getInstance().getPersonDirectory().getPersonByUsername(loggedInUser);
        String name = person.getName();
        String email = person.getEmail();
        long phoneNum = person.getPhoneNum();
        donorTxt.setText(name);
        emailTxt.setText(email);
        phoneNoTxt.setText(String.valueOf(phoneNum));
    }
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (!ageTxt.getText().isEmpty() && !bloodGrpTxt.getText().isEmpty()
                && !donorTxt.getText().isEmpty() && !emailTxt.getText().isEmpty() && !hbTxt.getText().isEmpty()
                && !heightTxt.getText().isEmpty() && !phoneNoTxt.getText().isEmpty() && !unitsTxt.getText().isEmpty()
                && !weightTxt.getText().isEmpty()  && !donationDate.getDate().toString().isEmpty()) {

            Person person = null;
            ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
            Enterprise enterpriseTemp = enterpriseList.stream().filter(item -> "Population".equals(item.getName())).findFirst().orElse(null);
            for (Organizations organization : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
                if (organization.getName().equals("Person Organization")) {
                    PersonOrganization perOrg = (PersonOrganization) organization;
                    person = perOrg.getPersonDirectory().getPersonByPhoneNum(Long.parseLong(phoneNoTxt.getText()));
                    break;
                }
            }

            DonorTransaction dt = person.addNewDonorTransaction();
            dt.setHblevel(Float.parseFloat(hbTxt.getText()));
            dt.setBloodDonationDate(donationDate.getDate());
            dt.setBloodLastDonatedDate(lastDonatedDate.getDate());
            dt.setNumberOfUnits(Integer.parseInt(unitsTxt.getText()));
            dt.setOtherDiseases(diseasesCheck.isSelected());
            dt.setAge(Integer.parseInt(ageTxt.getText()));
            person.setBloodGroup(bloodGrpTxt.getText());
            dt.setHeight(Float.parseFloat(heightTxt.getText()));
            dt.setWeight(Float.parseFloat(weightTxt.getText()));
            dt.setBloodBankByID(((String) bloodbankCombo.getSelectedItem()));

            Organizations org = null;
            enterpriseTemp = enterpriseList.stream().filter(item -> "BloodBank".equals(item.getName())).findFirst().orElse(null);

            for (Organizations organization : enterpriseTemp.getOrganizationDirectory().getOrganizationList()) {
                if (organization.getName().equals("BloodBank Organization")) {

                    System.out.println(organization);
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                DonateBloodWorkRequest bloodBankWorkRequest = new DonateBloodWorkRequest();
                bloodBankWorkRequest.setDonorTransaction(dt);
                bloodBankWorkRequest.setStatus("Pending");
                bloodBankWorkRequest.setMessage("Donate blood");
                bloodBankWorkRequest.setSender(userAccount);
                System.out.println(org.getWorkQueue().getWorkRequestList());
                org.getWorkQueue().getWorkRequestList().add(bloodBankWorkRequest);
                // System.out.println(org.getWorkQueue().getWorkRequestList());
                userAccount.getWorkQueue().getWorkRequestList().add(bloodBankWorkRequest);
                JOptionPane.showMessageDialog(null, "Requested for donation");

            }

            JOptionPane.showMessageDialog(this, "Added donor details to the system");
        } else {
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
        ageTxt.getDocument().addDocumentListener(new DocumentListener() {
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

        heightTxt.getDocument().addDocumentListener(new DocumentListener() {
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
        weightTxt.getDocument().addDocumentListener(new DocumentListener() {
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
        unitsTxt.getDocument().addDocumentListener(new DocumentListener() {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel bloodGrpLbl;
    private javax.swing.JTextField bloodGrpTxt;
    private javax.swing.JComboBox<String> bloodbankCombo;
    private javax.swing.JLabel bloodbankLbl;
    private javax.swing.JCheckBox diseasesCheck;
    private javax.swing.JLabel diseasesLbl;
    private com.toedter.calendar.JDateChooser donationDate;
    private javax.swing.JLabel donationDateLbl;
    private javax.swing.JLabel donorLbl;
    private javax.swing.JTextField donorTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel hbLbl;
    private javax.swing.JTextField hbTxt;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastDonateLbl;
    private com.toedter.calendar.JDateChooser lastDonatedDate;
    private javax.swing.JLabel phoneNoLbl;
    private javax.swing.JTextField phoneNoTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel unitsLbl;
    private javax.swing.JTextField unitsTxt;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
