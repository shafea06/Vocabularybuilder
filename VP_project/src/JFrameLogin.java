
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;




public class JFrameLogin extends javax.swing.JFrame {

    private static final String USERS_FILE = "users_data.txt";
    public JFrameLogin() {
        initComponents();
    }
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
           
            throw new RuntimeException("SHA-256 algorithm not found.", e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblVocabularyBuilder = new javax.swing.JLabel();
        lblEmailorUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblpassowrd = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnGuest = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocabulary Builder Login");
        setBackground(new java.awt.Color(255, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLogin.setBackground(new java.awt.Color(243, 126, 9));

        lblVocabularyBuilder.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        lblVocabularyBuilder.setForeground(new java.awt.Color(255, 255, 255));
        lblVocabularyBuilder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVocabularyBuilder.setText("Vocabulary Builder");

        lblEmailorUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailorUsername.setText("Email or Username");

        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblpassowrd.setForeground(new java.awt.Color(255, 255, 255));
        lblpassowrd.setText("Password");

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 153, 51));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setDefaultCapable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnGuest.setBackground(new java.awt.Color(255, 255, 255));
        btnGuest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGuest.setForeground(new java.awt.Color(255, 153, 51));
        btnGuest.setText("Guest");
        btnGuest.setBorder(null);
        btnGuest.setBorderPainted(false);
        btnGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUp.setForeground(new java.awt.Color(255, 153, 51));
        btnSignUp.setText("SignUp");
        btnSignUp.setBorder(null);
        btnSignUp.setBorderPainted(false);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVocabularyBuilder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, pnlLoginLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpassowrd)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblEmailorUsername)
                        .addGap(117, 117, 117)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtUsername, txtpassword});

        pnlLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGuest, btnLogin});

        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblVocabularyBuilder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmailorUsername)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpassowrd)
                .addGap(11, 11, 11)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pnlLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGuest, btnLogin});

        pnlLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtUsername, txtpassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestActionPerformed
    JFrameDashborad main=new JFrameDashborad();
            main.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnGuestActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    String username = txtUsername.getText().trim();
       
        char[] passwordChars = txtpassword.getPassword();
        String password = new String(passwordChars);
        java.util.Arrays.fill(passwordChars, '\0');
 
        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Please enter both username and password.", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        java.io.File file = new java.io.File(USERS_FILE);
        if (!file.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "No users found. Please sign up first.");
            return;
        }
 
        boolean isValidUser = false;
        
        String hashedInput = hashPassword(password);
 
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
        
                if (data.length == 2 && data[0].equals(username) && data[1].equals(hashedInput)) {
                    isValidUser = true;
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error reading user data!");
            return;
        }
 
        if (isValidUser) {
            JFrameDashborad dash = new JFrameDashborad();
            dash.setVisible(true);
           
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Invalid username or password.", "Login Failed",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
    String username = txtUsername.getText().trim();
        char[] passwordChars = txtpassword.getPassword();
        String password = new String(passwordChars);
        java.util.Arrays.fill(passwordChars, '\0'); 
 
        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Please enter both username and password.", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
 

        if (password.length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Password must be at least 6 characters long.", "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        java.io.File file = new java.io.File(USERS_FILE);
 
        if (file.exists()) {
            try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split("\\|");
                    if (data.length >= 1 && data[0].equals(username)) {
                        javax.swing.JOptionPane.showMessageDialog(this,
                            "Username already exists. Please choose another one.", "Error",
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Error reading user data!");
                return;
            }
        }
 
        
        String hashedPassword = hashPassword(password);
 
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(
                new java.io.FileWriter(USERS_FILE, true))) {
            bw.write(username + "|" + hashedPassword);
            bw.newLine();
            javax.swing.JOptionPane.showMessageDialog(this,
                "Registration successful! You can now log in.");
            txtUsername.setText("");
            txtpassword.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving user data!");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuest;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblEmailorUsername;
    private javax.swing.JLabel lblVocabularyBuilder;
    private javax.swing.JLabel lblpassowrd;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
