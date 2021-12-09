/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

/**
 *
 * @author neeraja
 */
public class ViewReceiverHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewReceiverHistory
     */
    public ViewReceiverHistory() {
        initComponents();
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
        receiverTable1 = new javax.swing.JTable();
        btnUpdateReceiver1 = new javax.swing.JButton();
        btnDeleteReceiver1 = new javax.swing.JButton();
        trnLbl1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receiverTrnTable1 = new javax.swing.JTable();
        btnUpdateTrn1 = new javax.swing.JButton();
        btnDeleteTrn1 = new javax.swing.JButton();

        jLabel3.setText("View Receiver History");

        receiverLbl1.setText("Receiver Details:");

        receiverTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        receiverTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(receiverTable1);
        if (receiverTable1.getColumnModel().getColumnCount() > 0) {
            receiverTable1.getColumnModel().getColumn(0).setMinWidth(1);
            receiverTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            receiverTable1.getColumnModel().getColumn(0).setMaxWidth(1);
            receiverTable1.getColumnModel().getColumn(5).setHeaderValue("Blood Group");
        }

        btnUpdateReceiver1.setText("Update");

        btnDeleteReceiver1.setText("Delete");

        trnLbl1.setText("Transaction Details:");

        receiverTrnTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        receiverTrnTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(receiverTrnTable1);
        if (receiverTrnTable1.getColumnModel().getColumnCount() > 0) {
            receiverTrnTable1.getColumnModel().getColumn(0).setMinWidth(1);
            receiverTrnTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            receiverTrnTable1.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdateTrn1.setText("Update");

        btnDeleteTrn1.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateReceiver1)
                        .addGap(35, 35, 35)
                        .addComponent(btnDeleteReceiver1)
                        .addGap(290, 290, 290))))
            .addGroup(layout.createSequentialGroup()
                .addGap(822, 822, 822)
                .addComponent(btnUpdateTrn1)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteTrn1)
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(receiverLbl1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(trnLbl1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(receiverLbl1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateReceiver1)
                    .addComponent(btnDeleteReceiver1))
                .addGap(51, 51, 51)
                .addComponent(trnLbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateTrn1)
                            .addComponent(btnDeleteTrn1))
                        .addGap(15, 15, 15))))
        );
    }// </editor-fold>//GEN-END:initComponents
/***
***/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteReceiver1;
    private javax.swing.JButton btnDeleteTrn1;
    private javax.swing.JButton btnUpdateReceiver1;
    private javax.swing.JButton btnUpdateTrn1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel receiverLbl1;
    private javax.swing.JTable receiverTable1;
    private javax.swing.JTable receiverTrnTable1;
    private javax.swing.JLabel trnLbl1;
    // End of variables declaration//GEN-END:variables
}
