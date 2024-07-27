
package com.techwebdocs.citybookshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class addCashier extends javax.swing.JFrame {

    public addCashier() {
        initComponents();
    }


    
    public class CashierData {
        private String name;
        private String password;
        private String dob;
        private String address;
        private String number;

        // Constructor
        public CashierData(String name, String password, String dob, String address, String number) {
            this.name = name;
            this.password = password;
            this.dob = dob;
            this.address = address;
            this.number = number;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public String getDob() {
            return dob;
        }

        public String getAddress() {
            return address;
        }

        public String getNumber() {
            return number;
        }

        // Method to save data to a text file
        public void saveToFile(String filename) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write("Name: " + name + "\n");
                writer.write("Password: " + password + "\n");
                writer.write("DOB: " + dob + "\n");
                writer.write("Address: " + address + "\n");
                writer.write("Number: " + number + "\n");
                writer.write("-------------------------------------\n");
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookName1 = new javax.swing.JLabel();
        bookYear1 = new javax.swing.JLabel();
        bookYear2 = new javax.swing.JLabel();
        bookCategory1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        bookCategory2 = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Cashier Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        bookName1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookName1.setForeground(new java.awt.Color(255, 255, 255));
        bookName1.setText("User Name :");
        jPanel1.add(bookName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 30));

        bookYear1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookYear1.setForeground(new java.awt.Color(255, 255, 255));
        bookYear1.setText("Password");
        jPanel1.add(bookYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        bookYear2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookYear2.setForeground(new java.awt.Color(255, 255, 255));
        bookYear2.setText("Date Of Birth :");
        jPanel1.add(bookYear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        bookCategory1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookCategory1.setForeground(new java.awt.Color(255, 255, 255));
        bookCategory1.setText("Address :");
        jPanel1.add(bookCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        nameField.setToolTipText("l");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 240, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 240, 30));

        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 240, 30));

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 240, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setText("⬅ Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, -1));

        addButton.setBackground(new java.awt.Color(255, 255, 0));
        addButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addButton.setText("Create");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, 30));

        bookCategory2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookCategory2.setForeground(new java.awt.Color(255, 255, 255));
        bookCategory2.setText("Telephone Num :");
        jPanel1.add(bookCategory2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 30));

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(numberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\1000_F_373992858_1H5e0C50J43ydFSIuYMlzORD8yXKS4IJ-removebg-preview.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 530, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            managerPage managerPage = new managerPage();
            managerPage.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
                                                                                                                
    String name = nameField.getText();
    String password = passwordField.getText();
    String dob = dobField.getText();
    String address = addressField.getText();
    String number = numberField.getText();
    
    // Check if any field is empty
    if (name.isEmpty() || password.isEmpty() || dob.isEmpty() || address.isEmpty() || number.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is empty
    }
    
    try {
        // Create an instance of UserData
        CashierData cashierData = new CashierData(name, password, dob, address, number);
        
        // Save the data to a text file
        cashierData.saveToFile("CashierData.txt");
        
        // Show success message
        javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        // Show error message
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for more details
    }




 

    }//GEN-LAST:event_addButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

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
            java.util.logging.Logger.getLogger(addCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookCategory1;
    private javax.swing.JLabel bookCategory2;
    private javax.swing.JLabel bookName1;
    private javax.swing.JLabel bookYear1;
    private javax.swing.JLabel bookYear2;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField passwordField;
    // End of variables declaration//GEN-END:variables
}
