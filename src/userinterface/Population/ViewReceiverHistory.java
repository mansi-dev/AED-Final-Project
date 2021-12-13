/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

import Business.EcoSystem;
import Business.Population.DonorTransaction;
import Business.Population.Person;
import Business.Population.PersonDirectory;
import Business.Population.ReceiverTransaction;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neeraja
 */
public class ViewReceiverHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewReceiverHistory
     */
    PersonDirectory personDirectory;
    public ViewReceiverHistory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
        initComponents();
        viewReceiverHist();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        receiverLbl1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiverTbl = new javax.swing.JTable();
        btnUpdateReceiver = new javax.swing.JButton();
        btnDeleteReceiver = new javax.swing.JButton();
        trnLbl1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receiverTrnTbl = new javax.swing.JTable();
        btnUpdateTrn = new javax.swing.JButton();
        btnDeleteTrn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("View Receiver History");

        receiverLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        receiverLbl1.setText("Receiver Details:");

        receiverTbl.setBackground(new java.awt.Color(255, 204, 204));
        receiverTbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        receiverTbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        receiverTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Email", "Phone Number", "Blood Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        receiverTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiverTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(receiverTbl);
        if (receiverTbl.getColumnModel().getColumnCount() > 0) {
            receiverTbl.getColumnModel().getColumn(0).setMinWidth(1);
            receiverTbl.getColumnModel().getColumn(0).setPreferredWidth(1);
            receiverTbl.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdateReceiver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateReceiver.setText("Update");
        btnUpdateReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateReceiverActionPerformed(evt);
            }
        });

        btnDeleteReceiver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteReceiver.setText("Delete");
        btnDeleteReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReceiverActionPerformed(evt);
            }
        });

        trnLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trnLbl1.setText("Transaction Details:");

        receiverTrnTbl.setBackground(new java.awt.Color(255, 204, 204));
        receiverTrnTbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        receiverTrnTbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        receiverTrnTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Age", "Height", "Weight", "Hemoglobin Level", "Number of Units", "Organization Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(receiverTrnTbl);
        if (receiverTrnTbl.getColumnModel().getColumnCount() > 0) {
            receiverTrnTbl.getColumnModel().getColumn(0).setMinWidth(1);
            receiverTrnTbl.getColumnModel().getColumn(0).setPreferredWidth(1);
            receiverTrnTbl.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdateTrn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateTrn.setText("Update");
        btnUpdateTrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTrnActionPerformed(evt);
            }
        });

        btnDeleteTrn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteTrn.setText("Delete");
        btnDeleteTrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTrnActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receiver.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdateReceiver)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteReceiver)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(807, 807, 807)
                .addComponent(btnUpdateTrn)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteTrn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiverLbl1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trnLbl1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGap(16, 16, 16)
                .addComponent(receiverLbl1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateReceiver)
                    .addComponent(btnDeleteReceiver))
                .addGap(75, 75, 75)
                .addComponent(trnLbl1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateTrn)
                    .addComponent(btnDeleteTrn))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void receiverTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiverTblMouseClicked
        // TODO add your handling code here:
        System.out.println("Table row clicked");
        DefaultTableModel model = (DefaultTableModel) receiverTrnTbl.getModel();

        JTable target = (JTable) evt.getSource();
        int row = target.getSelectedRow(); // select a row
        Person person = (Person) receiverTbl.getValueAt(row, 0);
        List<ReceiverTransaction> transaction = person.getReceiverTransaction();
        model.setRowCount(0);
        String bloodGroup = person.getBloodGroup();
        for (ReceiverTransaction data : transaction) {
            Object[] rowTrn = new Object[8];
            //row[0] = ++index;

            rowTrn[0] = data;
            rowTrn[1] = data.getAge();
            rowTrn[2] = data.getWeight();
            rowTrn[3] = data.getHeight();
            rowTrn[4] = data.getHblevel();
            rowTrn[5] = data.getNumberOfUnits();
            rowTrn[6] = "NA";
            rowTrn[7] = data.getPrice();

            model.addRow(rowTrn);
        }
    }//GEN-LAST:event_receiverTblMouseClicked

    private void btnUpdateReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateReceiverActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) receiverTbl.getModel();
        int rowIndex = receiverTbl.getSelectedRow();
        int colIndex = 0;
        int colIndex1 = receiverTbl.getSelectedColumn();

        Vector dataVector = model.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(rowIndex);
        Person personDetails = null;
        if (colIndex1 == 0) {
            personDetails = personDirectory.getPersonList().stream().filter(item -> elementAt.get(0).equals(item.getId())).findFirst().orElse(null);
        }
        Person person = (Person) model.getValueAt(rowIndex, colIndex);
        if (!elementAt.get(1).toString().isEmpty() && !elementAt.get(2).toString().isEmpty() && !elementAt.get(3).toString().isEmpty() 
                && !elementAt.get(4).toString().isEmpty() && !elementAt.get(5).toString().isEmpty()) {

            try {
                if (personDetails == null) {
                    person.setId(Integer.parseInt(elementAt.get(1).toString()));
                    person.setName(elementAt.get(2).toString());
                    person.setEmail(elementAt.get(3).toString());
                    person.setPhoneNum(Long.parseLong(elementAt.get(4).toString()));
                    person.setBloodGroup(elementAt.get(4).toString());
                    

                    JOptionPane.showMessageDialog(this, "Value updated successfully!");

                } else {
                    JOptionPane.showMessageDialog(this, "Receiver with given id already exists!");
                }
            } catch (NumberFormatException | NullPointerException exception) {

                JOptionPane.showMessageDialog(this, "Please enter all values.");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all values.");
        }
    }//GEN-LAST:event_btnUpdateReceiverActionPerformed

    private void btnDeleteReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReceiverActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = receiverTbl.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) receiverTbl.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);
        personDirectory.removePerson(person);
        DefaultTableModel modelTrn = (DefaultTableModel) receiverTbl.getModel();
        modelTrn.setRowCount(0);
        viewReceiverHist();
        JOptionPane.showMessageDialog(this, "Donor Details deleted");
    }//GEN-LAST:event_btnDeleteReceiverActionPerformed

    private void btnUpdateTrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTrnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) receiverTbl.getModel();
        DefaultTableModel modelTrn = (DefaultTableModel) receiverTrnTbl.getModel();
        int rowIndex = receiverTbl.getSelectedRow();
        int colIndex = 0;
        int rowIndexTrn = receiverTrnTbl.getSelectedRow();
        int colIndexTrn = receiverTrnTbl.getSelectedColumn();

        Vector dataVector = modelTrn.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(rowIndexTrn);

        Vector dataVectorDonor = model.getDataVector();
        Vector elementAtDonor = (Vector) dataVectorDonor.elementAt(rowIndex);

        Person personDetails = personDirectory.getPersonList().stream().filter(item -> Integer.parseInt(elementAtDonor.get(1).toString()) == item.getId()).findFirst().orElse(null);

       // Encounter encounter = (Encounter) model.getValueAt(rowIndexVitals, colIndex);
        if (personDetails != null ) {
            
            ReceiverTransaction receiverT = personDetails.getReceiverTransaction().get(rowIndexTrn);
            
            
            receiverT.setAge(Integer.parseInt(elementAt.get(1).toString()));
            receiverT.setWeight(Float.parseFloat(elementAt.get(2).toString()));
            receiverT.setHeight(Float.parseFloat(elementAt.get(3).toString()));
            receiverT.setHblevel(Float.parseFloat(elementAt.get(4).toString()));
            receiverT.setNumberOfUnits(Integer.parseInt(elementAt.get(5).toString()));
            //receiverT.setOtherDiseases(Boolean.parseBoolean(elementAt.get(8).toString()));
            receiverT.setPrice(Float.parseFloat(elementAt.get(7).toString()));
            
            JOptionPane.showMessageDialog(this, "Value updated successfully!");

        }
    }//GEN-LAST:event_btnUpdateTrnActionPerformed

    private void btnDeleteTrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTrnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = receiverTrnTbl.getSelectedRow();

        // Selected patient
        int selectedRowIndexDonor = receiverTbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) receiverTbl.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndexDonor, 0);

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel modelTrn = (DefaultTableModel) receiverTrnTbl.getModel();
        ReceiverTransaction receiverTransaction = (ReceiverTransaction) modelTrn.getValueAt(selectedRowIndex, 0);
        person.removePerson(receiverTransaction);
        modelTrn.removeRow(selectedRowIndex);
        JOptionPane.showMessageDialog(this, "Receiver Transaction deleted");
    }//GEN-LAST:event_btnDeleteTrnActionPerformed
/***
***/
    private void viewReceiverHist(){
        DefaultTableModel model = (DefaultTableModel) receiverTbl.getModel();
        List<Person> person = EcoSystem.getInstance().getPersonDirectory().getPersonList();
        model.setRowCount(0);
        for (Person data : person) {
            Object[] row = new Object[6];
            //row[0] = ++index;

            row[0] = data;
            row[1] = data.getId();
            row[2] = data.getName();
            row[3] = data.getEmail();
            row[4] = data.getPhoneNum();
            row[5] = data.getBloodGroup();
           
            model.addRow(row);

        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteReceiver;
    private javax.swing.JButton btnDeleteTrn;
    private javax.swing.JButton btnUpdateReceiver;
    private javax.swing.JButton btnUpdateTrn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel receiverLbl1;
    private javax.swing.JTable receiverTbl;
    private javax.swing.JTable receiverTrnTbl;
    private javax.swing.JLabel trnLbl1;
    // End of variables declaration//GEN-END:variables
}
