package com.techwebdocs.citybookshop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author NadirangaMac
 */
public class addBooks extends javax.swing.JFrame {

    /**
     * Creates new form searchPage
     */
    public addBooks() {
        initComponents();
    }




public class BookData {
    private static int lastAssignedId = 0;
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private String bookYear;
    private String bookPrice;

    // Constructor
    public BookData(String bookName, String bookAuthor, String bookCategory, String bookYear, String bookPrice) {
        this.bookId = ++lastAssignedId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookYear() {
        return bookYear;
    }

    public String getBookPrice() {
        return bookPrice;
    }

  
    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String line = bookId + ", " + bookName + ", " + bookAuthor + ", " + bookCategory + ", " + bookYear + ", " + bookPrice;
            writer.write(line + "\n");
        }
    }

        void setBookName(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setBookAuthor(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setBookCategory(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setBookYear(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setBookPrice(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        String getBookId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }



    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookPrice = new javax.swing.JLabel();
        bookName = new javax.swing.JLabel();
        bookYear = new javax.swing.JLabel();
        bookAuthor = new javax.swing.JLabel();
        bookCategory = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Books");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 70));

        bookPrice.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookPrice.setForeground(new java.awt.Color(255, 255, 0));
        bookPrice.setText("Price :");
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        bookName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookName.setForeground(new java.awt.Color(255, 255, 0));
        bookName.setText("Book Name :");
        jPanel1.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 30));

        bookYear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookYear.setForeground(new java.awt.Color(255, 255, 0));
        bookYear.setText("Year :");
        jPanel1.add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        bookAuthor.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookAuthor.setForeground(new java.awt.Color(255, 255, 0));
        bookAuthor.setText("Author :");
        jPanel1.add(bookAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        bookCategory.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bookCategory.setForeground(new java.awt.Color(255, 255, 0));
        bookCategory.setText("Category :");
        jPanel1.add(bookCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 30));

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 240, 30));

        nameField.setToolTipText("l");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 240, 30));

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        jPanel1.add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 240, 30));

        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 240, 30));

        categoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFieldActionPerformed(evt);
            }
        });
        jPanel1.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setText("⬅ Back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 30));

        addButton.setBackground(new java.awt.Color(255, 255, 0));
        addButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\hand-drawn-flat-design-stack-books-illustration_23-2149341898__1_-removebg-preview.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 430, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            manageBook1 manageBook1 = new manageBook1();
            manageBook1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
                                   
    String bookName = nameField.getText();
    String bookAuthor = authorField.getText();
    String bookCategory = categoryField.getText();
    String bookYear = yearField.getText();
    String bookPrice = priceField.getText();
    
    
    if (bookName.isEmpty() || bookAuthor.isEmpty() || bookCategory.isEmpty() || bookYear.isEmpty() || bookPrice.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    try {
        
        BookData bookData = new BookData(bookName, bookAuthor, bookCategory, bookYear, bookPrice);
        
        
        bookData.saveToFile("BookData.txt");
        
        
        javax.swing.JOptionPane.showMessageDialog(this, "Book data saved successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
      
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving book data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); 
    }


    
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookAuthor;
    private javax.swing.JLabel bookCategory;
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel bookPrice;
    private javax.swing.JLabel bookYear;
    private javax.swing.JTextField categoryField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
