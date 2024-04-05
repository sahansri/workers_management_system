package intf;

import javax.swing.JOptionPane;


public class addDetails extends javax.swing.JFrame {


    
    public addDetails() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        proftxt = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        hrate = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Details");

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Add Details...");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 390, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Hourly Rate :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Profession :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("First Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Last Name  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Mobile No. :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 40));

        proftxt.setBackground(new java.awt.Color(255, 255, 255));
        proftxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proftxt.setForeground(new java.awt.Color(0, 51, 153));
        proftxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proftxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        jPanel2.add(proftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 220, 40));

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 51, 153));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 220, 40));

        mob.setBackground(new java.awt.Color(255, 255, 255));
        mob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mob.setForeground(new java.awt.Color(0, 51, 153));
        mob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        jPanel2.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 220, 40));

        hrate.setBackground(new java.awt.Color(255, 255, 255));
        hrate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hrate.setForeground(new java.awt.Color(0, 51, 153));
        hrate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hrate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        hrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrateActionPerformed(evt);
            }
        });
        jPanel2.add(hrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 220, 40));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 51, 153));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, 40));

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 51, 153));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, 720));

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

        setSize(new java.awt.Dimension(706, 789));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void hrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrateActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       if (proftxt.getText().equals("")||fname.getText().equals("")||lname.getText().equals("")||mob.getText().equals("")||hrate.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Please enter full details..");
       }
        workersTab.AddRowTOTable(new Object[]{
            proftxt.getText(),
            fname.getText(),
            lname.getText(),
            mob.getText(),
            hrate.getText()
        });
        this.dispose();
    }//GEN-LAST:event_addbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField hrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField proftxt;
    // End of variables declaration//GEN-END:variables
}
