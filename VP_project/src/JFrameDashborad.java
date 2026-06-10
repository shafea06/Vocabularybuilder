
public class JFrameDashborad extends javax.swing.JFrame {
     private static final String VOCAB_FILE = "vocabulary_data.txt";
     private void loadDataFromFile() {
        java.io.File file = new java.io.File(VOCAB_FILE);
        TableMeaning.setModel(new javax.swing.table.DefaultTableModel(
    new Object[][] {},          // ← empty, no sample data
    new String[]{"Word", " Meaning ", "Example", "Memorized"})   {
        
    Class[] types = { Object.class, Object.class, Object.class, Boolean.class };
    public Class getColumnClass(int i) { return types[i]; }
      });

        try {
            if (!file.exists()) {
                file.createNewFile();
                return;
            }
            try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
                javax.swing.table.DefaultTableModel model =
                    (javax.swing.table.DefaultTableModel) TableMeaning.getModel();
                model.setRowCount(0); // clear existing rows before loading
 
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split("\\|");
                    if (data.length == 4) {
                        model.addRow(new Object[]{
                            data[0], data[1], data[2], Boolean.parseBoolean(data[3])
                        });
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading data from file!");
        }
    }

    void saveDataToFile() {
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(
                new java.io.FileWriter(VOCAB_FILE, false))) {
 
            javax.swing.table.DefaultTableModel model =
                (javax.swing.table.DefaultTableModel) TableMeaning.getModel();
 
            for (int i = 0; i < model.getRowCount(); i++) {
                String word      = model.getValueAt(i, 0) != null ? model.getValueAt(i, 0).toString() : "";
                String meaning   = model.getValueAt(i, 1) != null ? model.getValueAt(i, 1).toString() : "";
                String example   = model.getValueAt(i, 2) != null ? model.getValueAt(i, 2).toString() : "";
                String memorized = model.getValueAt(i, 3) != null ? model.getValueAt(i, 3).toString() : "false";
 
                bw.write(word + "|" + meaning + "|" + example + "|" + memorized);
                bw.newLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving data to file!");
        }
    }
 
    // -------------------------------------------------------------------------
    // CONSTRUCTOR
    // -------------------------------------------------------------------------
 
    public JFrameDashborad() {
        initComponents();
       loadDataFromFile();
       
        TableMeaning.setRowSorter(
            new javax.swing.table.TableRowSorter<>(
                (javax.swing.table.DefaultTableModel) TableMeaning.getModel()));
        
    }
 

   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlheader = new javax.swing.JPanel();
        lblwelcome = new javax.swing.JLabel();
        pnlMAin = new javax.swing.JPanel();
        lblMyVocabulary = new javax.swing.JLabel();
        boxsortby = new javax.swing.JComboBox<>();
        lblSortby = new javax.swing.JLabel();
        btnAddWord = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Scrollpan = new javax.swing.JScrollPane();
        TableMeaning = new javax.swing.JTable();
        pnldashborad = new javax.swing.JPanel();
        pnldashborad1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lbl__ = new javax.swing.JLabel();
        pnldashborad2 = new javax.swing.JPanel();
        lblVocabularyBuilder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocabulary Builder Dashborad");
        setBackground(new java.awt.Color(255, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlheader.setBackground(new java.awt.Color(243, 126, 9));

        lblwelcome.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblwelcome.setText("Welcome");

        pnlMAin.setBackground(new java.awt.Color(243, 126, 9));
        pnlMAin.setForeground(new java.awt.Color(255, 255, 255));

        lblMyVocabulary.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMyVocabulary.setForeground(new java.awt.Color(255, 255, 255));
        lblMyVocabulary.setText("My Vocabulary");

        boxsortby.setBackground(new java.awt.Color(243, 126, 7));
        boxsortby.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        boxsortby.setForeground(new java.awt.Color(243, 126, 7));
        boxsortby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recently Added", "A - Z", "Z - A" }));
        boxsortby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxsortbyActionPerformed(evt);
            }
        });

        lblSortby.setForeground(new java.awt.Color(255, 255, 255));
        lblSortby.setText("Sort by");

        btnAddWord.setBackground(new java.awt.Color(15, 157, 86));
        btnAddWord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddWord.setText("Add Word");
        btnAddWord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        btnAddWord.setBorderPainted(false);
        btnAddWord.setFocusPainted(false);
        btnAddWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWordActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        TableMeaning.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        TableMeaning.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TableMeaning.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Innovative", "ﻣﺒﺘﻜﺮ / إﺑﺪاﻋ ﻲ", " He is an innovative student",  new Boolean(true)},
                {"Crucial", "ﺣﺎﺳﻢ / ﻣﻬﻢ ﺟﺪا ً", "Time is crucial right now",  new Boolean(false)},
                {"Implement", "تنفيذ /تطبيق", "We will implement the code",  new Boolean(false)},
                {null, null, null, null}
            },
            new String [] {
                "Word", " Meaning ", "Example", "Memorized"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableMeaning.setAlignmentX(1.0F);
        TableMeaning.setAlignmentY(1.0F);
        TableMeaning.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableMeaning.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableMeaning.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TableMeaning.setGridColor(new java.awt.Color(204, 204, 204));
        TableMeaning.setRowHeight(40);
        TableMeaning.setRowMargin(5);
        TableMeaning.setShowVerticalLines(false);
        Scrollpan.setViewportView(TableMeaning);

        javax.swing.GroupLayout pnlMAinLayout = new javax.swing.GroupLayout(pnlMAin);
        pnlMAin.setLayout(pnlMAinLayout);
        pnlMAinLayout.setHorizontalGroup(
            pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMAinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMAinLayout.createSequentialGroup()
                        .addComponent(lblMyVocabulary)
                        .addContainerGap(870, Short.MAX_VALUE))
                    .addGroup(pnlMAinLayout.createSequentialGroup()
                        .addComponent(lblSortby)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxsortby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddWord, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMAinLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Scrollpan, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
        pnlMAinLayout.setVerticalGroup(
            pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMAinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMyVocabulary)
                .addGap(18, 18, 18)
                .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddWord)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxsortby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSortby)))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(pnlMAinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMAinLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(Scrollpan, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pnlMAinLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddWord, btnDelete});

        javax.swing.GroupLayout pnlheaderLayout = new javax.swing.GroupLayout(pnlheader);
        pnlheader.setLayout(pnlheaderLayout);
        pnlheaderLayout.setHorizontalGroup(
            pnlheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlheaderLayout.createSequentialGroup()
                        .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlMAin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlheaderLayout.setVerticalGroup(
            pnlheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheaderLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMAin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
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
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(lblVocabularyBuilder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnldashborad, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnldashborad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlheader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) TableMeaning.getModel();
       
       
        JframeQuiz quiz = new JframeQuiz(model, this);
        quiz.setVisible(true);
       
        this.dispose();
    
    
    
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    System.exit(0);        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

            JFrameLogin login = new JFrameLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void boxsortbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxsortbyActionPerformed
    String selectedOption = (String) boxsortby.getSelectedItem();
    javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter = 
        (javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel>) TableMeaning.getRowSorter();

    if (sorter != null) {
        if ("A - Z".equals(selectedOption)) {
           
            sorter.setSortKeys(java.util.Arrays.asList(new javax.swing.RowSorter.SortKey(0, javax.swing.SortOrder.ASCENDING)));
        } else if ("Z - A".equals(selectedOption)) {
           
            sorter.setSortKeys(java.util.Arrays.asList(new javax.swing.RowSorter.SortKey(0, javax.swing.SortOrder.DESCENDING)));
        } else {
  
            sorter.setSortKeys(null); 
        }
    }
    }//GEN-LAST:event_boxsortbyActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
    this.toFront();
    this.requestFocus();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int selectedRow = TableMeaning.getSelectedRow();
 
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Please select a word from the table to delete.",
                "No Word Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
 
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this word?",
            "Confirm Delete", javax.swing.JOptionPane.YES_NO_OPTION);
 
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.table.DefaultTableModel model =
                (javax.swing.table.DefaultTableModel) TableMeaning.getModel();
            int modelRow = TableMeaning.convertRowIndexToModel(selectedRow);
            model.removeRow(modelRow);
            saveDataToFile();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWordActionPerformed
    String word = javax.swing.JOptionPane.showInputDialog(this, "Enter the Word:");
 
       
        if (word == null || word.trim().isEmpty()) return;
 
        String meaning = javax.swing.JOptionPane.showInputDialog(this, "Enter the Meaning:");
        
       
        if (meaning == null) return;
 
        String example = javax.swing.JOptionPane.showInputDialog(this, "Enter an Example (optional):");
       
        if (example == null) example = "";
 
        javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) TableMeaning.getModel();
        model.insertRow(0, new Object[]{word.trim(), meaning.trim(), example.trim(), false});
        saveDataToFile();
        javax.swing.JOptionPane.showMessageDialog(this, "Word added successfully!");
    
    }//GEN-LAST:event_btnAddWordActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(JFrameDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDashborad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameDashborad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollpan;
    private javax.swing.JTable TableMeaning;
    private javax.swing.JComboBox<String> boxsortby;
    private javax.swing.JButton btnAddWord;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JLabel lblMyVocabulary;
    private javax.swing.JLabel lblSortby;
    private javax.swing.JLabel lblVocabularyBuilder;
    private javax.swing.JLabel lbl__;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JPanel pnlMAin;
    private javax.swing.JPanel pnldashborad;
    private javax.swing.JPanel pnldashborad1;
    private javax.swing.JPanel pnldashborad2;
    private javax.swing.JPanel pnlheader;
    // End of variables declaration//GEN-END:variables
}
