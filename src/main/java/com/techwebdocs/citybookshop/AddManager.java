/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.techwebdocs.citybookshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author NadirangaMac
 */
public class AddManager extends javax.swing.JFrame {

    public AddManager() {
        initComponents();
    }


    // UserData class encapsulation
    public class UserData {
        private String name;
        private String password;
        private String dob;
        private String address;
        private String number;

        // Constructor
        public UserData(String name, String password, String dob, String address, String number) {
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
        userName = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        numberField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        nameField1 = new javax.swing.JTextField();
        userName1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Manager Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 70));

        userName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Password :");
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 30));

        dob.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        dob.setText("Date Of Birth :");
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 30));

        phoneNumber.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setText("Telephone Num :");
        jPanel1.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 30));

        address.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Address :");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, 30));

        passwordField.setToolTipText("l");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 240, 30));

        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 240, 30));

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(numberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 240, 30));

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 240, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setText("⬅ Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, -1));

        addButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addButton.setText("Create");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 120, 40));

        nameField1.setToolTipText("l");
        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, 30));

        userName1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        userName1.setForeground(new java.awt.Color(255, 255, 255));
        userName1.setText("Name :");
        jPanel1.add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\Books_in_Print_-_global_edition_0-removebg-preview.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 340, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            managerPage managerPage = new managerPage();
            managerPage.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }   
    
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    
    String name = nameField1.getText();
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
        AddManager.UserData userData = new AddManager.UserData(name, password, dob, address, number);
        
        // Save the data to a text file
        userData.saveToFile("ManagerData.txt");
        
        // Show success message
        javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        // Show error message
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for more details
    }
    }//GEN-LAST:event_addButtonActionPerformed

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    // End of variables declaration//GEN-END:variables
}
