/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

import Business.EcoSystem;
import Business.Population.DonorTransaction;
import Business.Population.Person;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author neeraja
 */
public class DonateBloodJPanel extends javax.swing.JPanel {
    String loggedInUser;
    /**
     * Creates new form DonateBloodJPanel
     */
    public DonateBloodJPanel(String loggedInUser) {
        this.loggedInUser = loggedInUser;
        initComponents();
        addListeners();
        ///populateInitialValues();
        
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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("                                                                                                   Add Donor");

        donorLbl.setText("Donor Name:");

        phoneNoLbl.setText("Donor Phone Number:");

        ageLbl.setText("Age:");

        heightLbl.setText("Height:");

        weightLbl.setText("Weight:");

        hbLbl.setText("Haemoglobin Level: ");

        bloodGrpLbl.setText("Blood Group:");

        lastDonateLbl.setText("Blood Last Donated On:");

        unitsLbl.setText("Number of Units:");

        donationDateLbl.setText("Blood Donation Date:");

        diseasesLbl.setText("Other Diseases");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        emailLbl.setText("Email ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(saveBtn)
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
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
                    .addComponent(donorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
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
                    .addComponent(lastDonatedDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                            .addComponent(diseasesCheck))
                        .addGap(58, 58, 58)
                        .addComponent(saveBtn))
                    .addComponent(donationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateInitialValues(){
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
            && !weightTxt.getText().isEmpty() && !lastDonatedDate.getDate().toString().isEmpty() && !donationDate.getDate().toString().isEmpty() ) {
         
            Person person = EcoSystem.getInstance().getPersonDirectory().getPersonByPhoneNum(Long.parseLong(phoneNoTxt.getText()));
            
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
           
//            person.setName(donorTxt.getText());
//            person.setEmail(emailTxt.getText());
//            
            
          
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
