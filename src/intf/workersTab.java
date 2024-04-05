package intf;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class workersTab extends javax.swing.JFrame {




    
    public workersTab() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Workers profiles");
        setMinimumSize(new java.awt.Dimension(1252, 880));
        setPreferredSize(new java.awt.Dimension(1252, 880));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profession", "First Name", "Last Name", "Mobile", "Hourly rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setShowGrid(true);
        table.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        clearbtn.setBackground(new java.awt.Color(204, 0, 0));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(0, 153, 0));
        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intf/icons/icons8-add-48.png"))); // NOI18N
        addbtn.setText(" Add");
        addbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Workers profiles...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        backbtn.setBackground(new java.awt.Color(0, 51, 153));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intf/icons/icons8-back-arrow-50.png"))); // NOI18N
        backbtn.setBorder(null);
        backbtn.setBorderPainted(false);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Copyright @2023. All right reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1416, 852));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) table.getModel();
        
        if (table.getSelectedRowCount()==1){
            tbl.removeRow(table.getSelectedRow());
        }
        else {
            if (table.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "This table is empty");
            }else{
              JOptionPane.showMessageDialog(this, "please select any profile... ");  
            }
        }
    }//GEN-LAST:event_clearbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Dashboard dash1 = new Dashboard();
        dash1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        addDetails person1 = new addDetails();
        person1.setVisible(true);
    }//GEN-LAST:event_addbtnActionPerformed
    
    public static void AddRowTOTable(Object[] dataRow){
        DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.addRow(dataRow);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workersTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
