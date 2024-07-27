/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.techwebdocs.citybookshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class deletePage extends javax.swing.JFrame {

    public deletePage() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        bookIDField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Book ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, 30));

        bookIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(bookIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setText("⬅ Back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 70, 30));

        deleteButton.setBackground(new java.awt.Color(255,0,0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 30));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\1000_F_373992858_1H5e0C50J43ydFSIuYMlzORD8yXKS4IJ-removebg-preview.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 530, 330));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        manageBook1 manageBook1 = new manageBook1();
        manageBook1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String bookId = bookIDField.getText();

        if (bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a book ID.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("BookData.txt"));
            String line;
            StringBuilder fileContent = new StringBuilder();

            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 0 && parts[0].equals(bookId)) {
                    found = true;
                    continue;
                }
                fileContent.append(line).append("\n");
            }
            reader.close();

            if (!found) {
                javax.swing.JOptionPane.showMessageDialog(this, "Book with ID " + bookId + " not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("BookData.txt"));
            writer.write(fileContent.toString());
            writer.close();

            javax.swing.JOptionPane.showMessageDialog(this, "Book with ID " + bookId + " deleted successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting book: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void bookIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(deletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookIDField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel3;

    // End of variables declaration//GEN-END:variables
}
