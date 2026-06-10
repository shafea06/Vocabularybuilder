
import javax.swing.table.DefaultTableModel;


public class JframeQuiz extends javax.swing.JFrame {
    private javax.swing.table.DefaultTableModel tableModel;
    private java.util.List<Integer> quizIndices = new java.util.ArrayList<>();
    private int currentQuizPosition = 0;

    private JFrameDashborad dashboardRef;
 
    
    private JframeQuiz(DefaultTableModel tableModel1) {
        initComponents();
        btnForgot.setVisible(false);
        btnKnew.setVisible(false);
        lblMean.setText("");
    }
 
  
    public JframeQuiz(javax.swing.table.DefaultTableModel model, JFrameDashborad dashboard) {
        initComponents();
        this.tableModel   = model;
        this.dashboardRef = dashboard;
 
        btnForgot.setVisible(false);
        btnKnew.setVisible(false);
        lblMean.setText("");
 
        prepareQuiz();
        showNextWord();
    }
 
    
    private void prepareQuiz() {
        quizIndices.clear();
        currentQuizPosition = 0;
 
        if (tableModel != null) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                Object memorizedObj = tableModel.getValueAt(i, 3);
                boolean isMemorized = memorizedObj != null && (Boolean) memorizedObj;
                if (!isMemorized) {
                    quizIndices.add(i);
                }
            }
            java.util.Collections.shuffle(quizIndices);
        }
    }
 
    private void showNextWord() {
       
        if (quizIndices != null && currentQuizPosition < quizIndices.size()) {
            int actualRowIndex = quizIndices.get(currentQuizPosition);
            Object wordObj = tableModel.getValueAt(actualRowIndex, 0);
 
            if (wordObj != null) {
                lblWordDisplay.setText(wordObj.toString());
                lblMean.setText("");
                btnForgot.setVisible(false);
                btnKnew.setVisible(false);
                btnShowMeaning.setVisible(true);
                btnShowMeaning.setEnabled(true);
            }
        } else {
            lblWordDisplay.setText("Finished!");
            lblMean.setText("No more words to review.");
            btnShowMeaning.setEnabled(false);
            btnForgot.setVisible(false);
            btnKnew.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        pnlQuiz = new javax.swing.JPanel();
        lblQuiz = new javax.swing.JLabel();
        pnlQuizMain = new javax.swing.JPanel();
        lblWordDisplay = new javax.swing.JLabel();
        btnShowMeaning = new javax.swing.JButton();
        lblMean = new javax.swing.JLabel();
        btnForgot = new javax.swing.JButton();
        btnKnew = new javax.swing.JButton();
        pnldashborad = new javax.swing.JPanel();
        pnldashborad1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lbl__ = new javax.swing.JLabel();
        pnldashborad2 = new javax.swing.JPanel();
        lblVocabularyBuilder = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocabulary Builder Quiz");

        pnlQuiz.setBackground(new java.awt.Color(243, 126, 9));

        lblQuiz.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        lblQuiz.setForeground(new java.awt.Color(255, 255, 255));
        lblQuiz.setText("Quiz");

        pnlQuizMain.setBackground(new java.awt.Color(237, 233, 233));
        pnlQuizMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblWordDisplay.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblWordDisplay.setText("Innovative");

        btnShowMeaning.setBackground(new java.awt.Color(255, 255, 255));
        btnShowMeaning.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnShowMeaning.setForeground(new java.awt.Color(243, 126, 9));
        btnShowMeaning.setText("Show Meaning");
        btnShowMeaning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnShowMeaning.setFocusPainted(false);
        btnShowMeaning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMeaningActionPerformed(evt);
            }
        });

        lblMean.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMean.setText("ﻣﺒﺘﻜﺮ / إﺑﺪاﻋﻲ");

        btnForgot.setBackground(new java.awt.Color(240, 14, 10));
        btnForgot.setText("I Forgot");
        btnForgot.setBorderPainted(false);
        btnForgot.setFocusPainted(false);
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        btnKnew.setBackground(new java.awt.Color(0, 255, 51));
        btnKnew.setText("I Knew It");
        btnKnew.setBorderPainted(false);
        btnKnew.setFocusPainted(false);
        btnKnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlQuizMainLayout = new javax.swing.GroupLayout(pnlQuizMain);
        pnlQuizMain.setLayout(pnlQuizMainLayout);
        pnlQuizMainLayout.setHorizontalGroup(
            pnlQuizMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizMainLayout.createSequentialGroup()
                .addGroup(pnlQuizMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizMainLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(pnlQuizMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblWordDisplay)
                            .addComponent(lblMean)
                            .addComponent(btnShowMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlQuizMainLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKnew, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pnlQuizMainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnForgot, btnKnew});

        pnlQuizMainLayout.setVerticalGroup(
            pnlQuizMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizMainLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblWordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMean, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnShowMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlQuizMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForgot)
                    .addComponent(btnKnew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pnlQuizMainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnForgot, btnKnew});

        javax.swing.GroupLayout pnlQuizLayout = new javax.swing.GroupLayout(pnlQuiz);
        pnlQuiz.setLayout(pnlQuizLayout);
        pnlQuizLayout.setHorizontalGroup(
            pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(pnlQuizMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        pnlQuizLayout.setVerticalGroup(
            pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(pnlQuizMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pnldashborad.setBackground(new java.awt.Color(255, 255, 255));

        pnldashborad1.setBackground(new java.awt.Color(255, 255, 255));

        btnDashboard.setBackground(new java.awt.Color(255, 255, 255));
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(153, 153, 153));
        btnDashboard.setText("Dashboard ");
        btnDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 126, 9), 2));
        btnDashboard.setBorderPainted(false);
        btnDashboard.setFocusPainted(false);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnQuiz.setBackground(new java.awt.Color(255, 255, 255));
        btnQuiz.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnQuiz.setForeground(new java.awt.Color(153, 153, 153));
        btnQuiz.setText("Quiz");
        btnQuiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 126, 9), 2));
        btnQuiz.setBorderPainted(false);
        btnQuiz.setFocusPainted(false);
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 153, 153));
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 126, 9), 2));
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(153, 153, 153));
        btnLogOut.setText("Log Out");
        btnLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 126, 9), 2));
        btnLogOut.setBorderPainted(false);
        btnLogOut.setFocusPainted(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lbl__.setText("___________________");

        javax.swing.GroupLayout pnldashborad1Layout = new javax.swing.GroupLayout(pnldashborad1);
        pnldashborad1.setLayout(pnldashborad1Layout);
        pnldashborad1Layout.setHorizontalGroup(
            pnldashborad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldashborad1Layout.createSequentialGroup()
                .addGroup(pnldashborad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnldashborad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnldashborad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnldashborad1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl__, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnldashborad1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDashboard, btnExit, btnLogOut, btnQuiz});

        pnldashborad1Layout.setVerticalGroup(
            pnldashborad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldashborad1Layout.createSequentialGroup()
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl__, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnldashborad1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDashboard, btnExit, btnLogOut, btnQuiz});

        pnldashborad2.setBackground(new java.awt.Color(255, 255, 255));

        lblVocabularyBuilder.setBackground(new java.awt.Color(255, 255, 255));
        lblVocabularyBuilder.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 20)); // NOI18N
        lblVocabularyBuilder.setForeground(new java.awt.Color(243, 126, 9));
        lblVocabularyBuilder.setText("Vocabulary Builder");

        javax.swing.GroupLayout pnldashborad2Layout = new javax.swing.GroupLayout(pnldashborad2);
        pnldashborad2.setLayout(pnldashborad2Layout);
        pnldashborad2Layout.setHorizontalGroup(
            pnldashborad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldashborad2Layout.createSequentialGroup()
                .addComponent(lblVocabularyBuilder, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnldashborad2Layout.setVerticalGroup(
            pnldashborad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVocabularyBuilder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnldashboradLayout = new javax.swing.GroupLayout(pnldashborad);
        pnldashborad.setLayout(pnldashboradLayout);
        pnldashboradLayout.setHorizontalGroup(
            pnldashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldashboradLayout.createSequentialGroup()
                .addGroup(pnldashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnldashboradLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnldashborad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnldashborad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnldashboradLayout.setVerticalGroup(
            pnldashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldashboradLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnldashborad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnldashborad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnldashborad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnldashborad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowMeaningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMeaningActionPerformed
       if (quizIndices != null && currentQuizPosition < quizIndices.size()) {
        int actualRowIndex = quizIndices.get(currentQuizPosition);
        Object meaningObj = tableModel.getValueAt(actualRowIndex, 1);

        lblMean.setText(meaningObj != null ? meaningObj.toString() : "No Meaning");
        btnForgot.setVisible(true);
        btnKnew.setVisible(true);

        btnShowMeaning.setVisible(false); 
    }
    }//GEN-LAST:event_btnShowMeaningActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
    currentQuizPosition++;
        showNextWord();
    }//GEN-LAST:event_btnForgotActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        JFrameDashborad main=new JFrameDashborad();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
         JframeQuiz ssc = new JframeQuiz(this.tableModel, this.dashboardRef);
           ssc.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        JFrameLogin main=new JFrameLogin();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnKnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKnewActionPerformed
    if (quizIndices == null || currentQuizPosition >= quizIndices.size()) return;
    int actualRowIndex = quizIndices.get(currentQuizPosition);
    tableModel.setValueAt(true, actualRowIndex, 3);
    if (dashboardRef != null) dashboardRef.saveDataToFile(); 
    currentQuizPosition++;
    showNextWord();
    }//GEN-LAST:event_btnKnewActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            private DefaultTableModel tableModel;
            public void run() {
                new JframeQuiz(this.tableModel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnKnew;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnShowMeaning;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblMean;
    private javax.swing.JLabel lblQuiz;
    private javax.swing.JLabel lblVocabularyBuilder;
    private javax.swing.JLabel lblWordDisplay;
    private javax.swing.JLabel lbl__;
    private javax.swing.JPanel pnlQuiz;
    private javax.swing.JPanel pnlQuizMain;
    private javax.swing.JPanel pnldashborad;
    private javax.swing.JPanel pnldashborad1;
    private javax.swing.JPanel pnldashborad2;
    // End of variables declaration//GEN-END:variables
}
