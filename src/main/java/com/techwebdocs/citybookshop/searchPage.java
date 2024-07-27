package com.techwebdocs.citybookshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class searchPage extends javax.swing.JFrame {

    public searchPage() {
        initComponents();
    }


private void performSearch() {
    DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
    model.setRowCount(0);

    String searchTerm = searchTextField.getText().trim();
    if (searchTerm.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a search term.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String searchField = (String) searchFieldComboBox.getSelectedItem(); 

    List<String[]> searchResults = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("BookData.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            // Check which field to search and add to results if match found
            if ((searchField.equals("Book Name") && parts.length >= 2 && parts[1].toLowerCase().contains(searchTerm.toLowerCase())) ||
                (searchField.equals("Author") && parts.length >= 3 && parts[2].toLowerCase().contains(searchTerm.toLowerCase())) ||
                (searchField.equals("Category") && parts.length >= 4 && parts[3].toLowerCase().contains(searchTerm.toLowerCase())) ||
                (searchField.equals("Year") && parts.length >= 5 && parts[4].toLowerCase().contains(searchTerm.toLowerCase())) ||
                (searchField.equals("Price") && parts.length >= 6 && parts[5].toLowerCase().contains(searchTerm.toLowerCase()))) {
                searchResults.add(parts);
            }
        }
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error reading book data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return;
    }

    for (String[] result : searchResults) {
        model.addRow(result);
    }
}





 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        backButton1 = new javax.swing.JButton();
        searchFieldComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH BOOK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 710, 70));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 40));

        searchButton.setBackground(new java.awt.Color(255, 255, 0));
        searchButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, 30));

        clearButton.setBackground(new java.awt.Color(255, 0, 0));
        clearButton.setText("✖ Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 80, 30));

        bookTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Name", "Author", "Category", "Year", "Price"
            }
        ));
        jScrollPane1.setViewportView(bookTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 670, 160));

        backButton1.setBackground(new java.awt.Color(255, 255, 0));
        backButton1.setText("⬅ Back");
        backButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 80, 30));

        searchFieldComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchFieldComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Name", "Author", "Category ", "Year", "Price" }));
        searchFieldComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(searchFieldComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\1d7e95015b550039ba6107f10176e23c.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -170, 940, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        performSearch();                                                               
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        performSearch();
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
            manageBook1 manageBook1 = new manageBook1();
            manageBook1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void searchFieldComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(searchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFieldComboBox;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
