package com.techwebdocs.citybookshop;

import com.techwebdocs.citybookshop.cashiersPage;
import com.techwebdocs.citybookshop.managerPage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MainPage extends javax.swing.JFrame {
    private static final String CASHIER_DATA_FILE = "CashierData.txt";
    private static final String MANAGER_DATA_FILE = "ManagerData.txt";

    public MainPage() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeCombobox = new javax.swing.JComboBox<>();
        Password = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        PasswordTaxtfield = new javax.swing.JTextField();
        UsernameTaxtfield = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typeCombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Type", "Cashier", "Manager" }));
        typeCombobox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(typeCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, 30));

        Password.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Password.setText("Password  :");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 140, 30));

        userName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        userName.setText("User Name :");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 30));

        PasswordTaxtfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PasswordTaxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTaxtfieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTaxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 150, 30));

        UsernameTaxtfield.setToolTipText("");
        UsernameTaxtfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        UsernameTaxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTaxtfieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameTaxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 213, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\logo.png"));

        title.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("City Bookshop");

        LoginButton.setBackground(new java.awt.Color(255, 255, 0));
        LoginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LoginButton.setText(" LOGIN ");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 390, 430));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu\\Documents\\NetBeansProjects\\CityBookshop\\src\\WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -30, 860, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboboxActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        String selectedRole = (String) typeCombobox.getSelectedItem();
        if (selectedRole == null || selectedRole.equals("Select Your Role")) {
       
            JOptionPane.showMessageDialog(this, "Please select a role.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        String name = UsernameTaxtfield.getText();
        String password = new String(PasswordTaxtfield.getText()); 
 
        if (selectedRole.equals("Cashier")) {
            if (validateCredentials(name, password, CASHIER_DATA_FILE)) {
            cashiersPage managerPage = new cashiersPage();
            managerPage.setVisible(true);
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (selectedRole.equals("Manager")) {
            if (validateCredentials(name, password, MANAGER_DATA_FILE)) {
                
           managerPage managerPage = new managerPage();
            managerPage.setVisible(true);
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean validateCredentials(String name, String password, String dataFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(dataFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    if (key.equalsIgnoreCase("Name") && value.equals(name)) {
                        while ((line = br.readLine()) != null) {
                            parts = line.split(":");
                            if (parts.length == 2) {
                                key = parts[0].trim();
                                value = parts[1].trim();
                                if (key.equalsIgnoreCase("Password") && value.equals(password)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTaxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTaxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTaxtfieldActionPerformed

    private void UsernameTaxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTaxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTaxtfieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordTaxtfield;
    private javax.swing.JTextField UsernameTaxtfield;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> typeCombobox;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
