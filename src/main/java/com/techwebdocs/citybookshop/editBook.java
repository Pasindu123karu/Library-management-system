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

public class editBook extends javax.swing.JFrame {

    public editBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookCategory = new javax.swing.JLabel();
        bookID = new javax.swing.JLabel();
        bookYear1 = new javax.swing.JLabel();
        bookYear2 = new javax.swing.JLabel();
        bookCategory1 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        bookIDField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        bookName2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT BOOKS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        bookCategory.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookCategory.setForeground(new java.awt.Color(255, 255, 0));
        bookCategory.setText("Price :");
        jPanel1.add(bookCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 30));

        bookID.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookID.setForeground(new java.awt.Color(255, 255, 0));
        bookID.setText("Book ID :");
        jPanel1.add(bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 30));

        bookYear1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookYear1.setForeground(new java.awt.Color(255, 255, 0));
        bookYear1.setText("Year :");
        jPanel1.add(bookYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        bookYear2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookYear2.setForeground(new java.awt.Color(255, 255, 0));
        bookYear2.setText("Author :");
        jPanel1.add(bookYear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 30));

        bookCategory1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookCategory1.setForeground(new java.awt.Color(255, 255, 0));
        bookCategory1.setText("Category :");
        jPanel1.add(bookCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 240, 30));

        bookIDField.setToolTipText("l");
        bookIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(bookIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 240, 30));

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        jPanel1.add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 240, 30));

        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 30));

        categoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFieldActionPerformed(evt);
            }
        });
        jPanel1.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 240, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setText("⬅ Back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 382, 80, 30));

        editButton.setBackground(new java.awt.Color(255, 255, 0));
        editButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        editButton.setText("Submit");
        editButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 110, 30));

        bookName2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookName2.setForeground(new java.awt.Color(255, 255, 0));
        bookName2.setText("Book Name :");
        jPanel1.add(bookName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        nameField.setToolTipText("l");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\06a7db4db4ec8491ba1b1443d4f8c15a.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 420, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            manageBook1 manageBook1 = new manageBook1();
            manageBook1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void bookIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIDFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFieldActionPerformed

    private void categoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String bookId = bookIDField.getText();
        String newBookName = nameField.getText();
        String newBookAuthor = authorField.getText();
        String newBookCategory = categoryField.getText();
        String newBookYear = yearField.getText();
        String newBookPrice = priceField.getText();

        if (bookId.isEmpty() || newBookName.isEmpty() || newBookAuthor.isEmpty() || newBookCategory.isEmpty() || newBookYear.isEmpty() || newBookPrice.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("BookData.txt"));
            String line;
            StringBuilder fileContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 0 && parts[0].equals(bookId)) {
                    line = bookId + ", " + newBookName + ", " + newBookAuthor + ", " + newBookCategory + ", " + newBookYear + ", " + newBookPrice;
                }
                fileContent.append(line).append("\n");
            }
            reader.close();
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("BookData.txt"));
            writer.write(fileContent.toString());
            writer.close();

            javax.swing.JOptionPane.showMessageDialog(this, "Book data updated successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating book data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); 
        }
    
    

    


    }//GEN-LAST:event_editButtonActionPerformed

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
            java.util.logging.Logger.getLogger(editBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookCategory;
    private javax.swing.JLabel bookCategory1;
    private javax.swing.JLabel bookID;
    private javax.swing.JTextField bookIDField;
    private javax.swing.JLabel bookName2;
    private javax.swing.JLabel bookYear1;
    private javax.swing.JLabel bookYear2;
    private javax.swing.JTextField categoryField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
