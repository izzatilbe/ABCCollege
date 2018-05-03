
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IJTilbe
 */
public class AbcGui extends javax.swing.JFrame {

    /**
     * Creates new form AbcGui
     */
    
    int STUDENT = 1;
    int TEACHER = 2;
    int choice = 0;
    
    public AbcGui() {
        initComponents();
        menuBar.setVisible(false);
        mainPanel.setVisible(false);
        setAllInvisible();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        logoHome = new javax.swing.JLabel();
        newPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phoneTF1 = new javax.swing.JTextField();
        fnameTF1 = new javax.swing.JTextField();
        lnameTF1 = new javax.swing.JTextField();
        addressTF1 = new javax.swing.JTextField();
        newBtn = new javax.swing.JButton();
        genderCB1 = new javax.swing.JComboBox<>();
        updatePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        fnameTF = new javax.swing.JTextField();
        lnameTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        genderCB = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        delTable = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        abcLogoLogin = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        pwTF = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        studentMenu = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        updateStudent = new javax.swing.JMenuItem();
        enlistStudent = new javax.swing.JMenuItem();
        deleteStudent = new javax.swing.JMenuItem();
        showBalance = new javax.swing.JMenuItem();
        viewBal = new javax.swing.JMenu();
        withbal = new javax.swing.JMenuItem();
        nobal = new javax.swing.JMenuItem();
        teacherMenu = new javax.swing.JMenu();
        newTeacher = new javax.swing.JMenuItem();
        updateTeacher = new javax.swing.JMenuItem();
        deleteTeacher = new javax.swing.JMenuItem();
        salaryTeacher = new javax.swing.JMenuItem();
        viewTeacher = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABC College");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 250, 250));
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("abcFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        logoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        logoHome.setFocusable(false);
        logoHome.setRequestFocusEnabled(false);
        logoHome.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(logoHome)
                .addGap(292, 292, 292))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(logoHome)
                .addGap(167, 167, 167))
        );

        mainPanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        newPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Gender");

        jLabel9.setText("Phone Number");

        jLabel10.setText("Address");

        fnameTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTF1ActionPerformed(evt);
            }
        });

        newBtn.setText("Submit");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        genderCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        genderCB1.setOpaque(false);
        genderCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newPanelLayout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(newPanelLayout);
        newPanelLayout.setHorizontalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnameTF1)
                    .addComponent(lnameTF1)
                    .addComponent(addressTF1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(newPanelLayout.createSequentialGroup()
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newBtn)
                .addGap(116, 116, 116))
        );
        newPanelLayout.setVerticalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fnameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(newPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        updatePanel.setBackground(new java.awt.Color(255, 255, 255));
        updatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        updatePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, 40));

        jLabel1.setText("First Name");
        updatePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel2.setText("Last Name");
        updatePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel3.setText("Gender");
        updatePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel4.setText("Phone Number");
        updatePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel5.setText("Address");
        updatePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        phoneTF.setEnabled(false);
        updatePanel.add(phoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 171, 34));

        fnameTF.setEnabled(false);
        fnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTFActionPerformed(evt);
            }
        });
        updatePanel.add(fnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 279, 34));

        lnameTF.setEnabled(false);
        updatePanel.add(lnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 279, 34));

        addressTF.setEnabled(false);
        updatePanel.add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 279, 66));

        jButton1.setText("Update");
        jButton1.setEnabled(false);
        updatePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 30));

        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        genderCB.setEnabled(false);
        genderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCBActionPerformed(evt);
            }
        });
        updatePanel.add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 34));
        updatePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 240, 40));

        jLabel11.setText("ID");
        updatePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 20));

        mainPanel.add(updatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        deletePanel.setBackground(new java.awt.Color(255, 255, 255));
        deletePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jLabel14.setFocusable(false);
        jLabel14.setRequestFocusEnabled(false);
        jLabel14.setVerifyInputWhenFocusTarget(false);
        deletePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 40, 40));

        jLabel13.setText("ID");
        deletePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 20, 20));

        delTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        delTable.setFocusable(false);
        deletePanel.add(delTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 520, -1));
        deletePanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 250, 40));

        delBtn.setText("Delete");
        deletePanel.add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        mainPanel.add(deletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginPanel.setFocusable(false);
        loginPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        loginPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        loginPanel.setOpaque(false);
        loginPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        loginPanel.setRequestFocusEnabled(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setText("Username");
        loginPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 10));

        abcLogoLogin.setBackground(new java.awt.Color(255, 255, 255));
        abcLogoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abcLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abclogo.jpg"))); // NOI18N
        abcLogoLogin.setMaximumSize(new java.awt.Dimension(570, 200));
        abcLogoLogin.setMinimumSize(new java.awt.Dimension(570, 200));
        abcLogoLogin.setOpaque(true);
        abcLogoLogin.setPreferredSize(new java.awt.Dimension(570, 200));
        abcLogoLogin.setRequestFocusEnabled(false);
        abcLogoLogin.setVerifyInputWhenFocusTarget(false);
        loginPanel.add(abcLogoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 240));

        pwLabel.setText("Password");
        loginPanel.add(pwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, 10));

        userTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTFActionPerformed(evt);
            }
        });
        loginPanel.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 200, 30));
        loginPanel.add(pwTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 200, 30));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 90, 30));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setForeground(new java.awt.Color(0, 0, 51));

        homeMenu.setText("Home");
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
        });
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuActionPerformed(evt);
            }
        });
        menuBar.add(homeMenu);

        studentMenu.setText("Student");

        newStudent.setText("New");
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });
        studentMenu.add(newStudent);

        updateStudent.setText("Update");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        studentMenu.add(updateStudent);

        enlistStudent.setText("Enlist");
        studentMenu.add(enlistStudent);

        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        studentMenu.add(deleteStudent);

        showBalance.setText("Show balance");
        showBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBalanceActionPerformed(evt);
            }
        });
        studentMenu.add(showBalance);

        viewBal.setText("View");

        withbal.setText("With balance");
        viewBal.add(withbal);

        nobal.setText("Without balance");
        viewBal.add(nobal);

        studentMenu.add(viewBal);

        menuBar.add(studentMenu);

        teacherMenu.setText("Faculty");

        newTeacher.setText("New");
        newTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeacherActionPerformed(evt);
            }
        });
        teacherMenu.add(newTeacher);

        updateTeacher.setText("Update");
        updateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeacherActionPerformed(evt);
            }
        });
        teacherMenu.add(updateTeacher);

        deleteTeacher.setText("Delete");
        deleteTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeacherActionPerformed(evt);
            }
        });
        teacherMenu.add(deleteTeacher);

        salaryTeacher.setText("Calculate salary");
        teacherMenu.add(salaryTeacher);

        viewTeacher.setText("View all");
        teacherMenu.add(viewTeacher);

        menuBar.add(teacherMenu);

        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTFActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        loginPanel.setVisible(false); 
        mainPanel.setVisible(true);
        homePanel.setVisible(true);
        menuBar.setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        setAllInvisible();
        newPanel.setVisible(true);
        choice = STUDENT;
    }//GEN-LAST:event_newStudentActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        setAllInvisible();
        updatePanel.setVisible(true);
        choice = STUDENT;
    }//GEN-LAST:event_updateStudentActionPerformed

    private void showBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showBalanceActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        setAllInvisible();
        deletePanel.setVisible(true);
        delTable.setVisible(false);
        delBtn.setVisible(false);
        choice = STUDENT;
    }//GEN-LAST:event_deleteStudentActionPerformed

    private void fnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTFActionPerformed

    private void genderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCBActionPerformed

    private void fnameTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTF1ActionPerformed

    private void genderCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCB1ActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
        
    }//GEN-LAST:event_homeMenuActionPerformed

    private void newTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeacherActionPerformed
        setAllInvisible();
        newPanel.setVisible(true);
    }//GEN-LAST:event_newTeacherActionPerformed

    private void updateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeacherActionPerformed
        setAllInvisible();
        updatePanel.setVisible(true);
    }//GEN-LAST:event_updateTeacherActionPerformed

    private void deleteTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeacherActionPerformed
        setAllInvisible();
        deletePanel.setVisible(true);
        delTable.setVisible(false);
        delBtn.setVisible(false);
    }//GEN-LAST:event_deleteTeacherActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        if (choice == STUDENT) {
            Student student = new Student(fnameTF1.getText(),lnameTF1.getText(),genderCB1.getSelectedItem().toString().charAt(0),phoneTF1.getText(),addressTF1.getText());
        String message = "";
        JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_newBtnActionPerformed

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        setAllInvisible();
        homePanel.setVisible(true);
    }//GEN-LAST:event_homeMenuMouseClicked
    
    private void setAllInvisible() {
        homePanel.setVisible(false);
        updatePanel.setVisible(false);
        newPanel.setVisible(false);
        deletePanel.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(AbcGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbcGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbcGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbcGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbcGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abcLogoLogin;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField addressTF1;
    private javax.swing.JButton delBtn;
    private javax.swing.JTable delTable;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JMenuItem deleteStudent;
    private javax.swing.JMenuItem deleteTeacher;
    private javax.swing.JMenuItem enlistStudent;
    private javax.swing.JTextField fnameTF;
    private javax.swing.JTextField fnameTF1;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.JComboBox<String> genderCB1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lnameTF;
    private javax.swing.JTextField lnameTF1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoHome;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton newBtn;
    private javax.swing.JPanel newPanel;
    private javax.swing.JMenuItem newStudent;
    private javax.swing.JMenuItem newTeacher;
    private javax.swing.JMenuItem nobal;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField phoneTF1;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JPasswordField pwTF;
    private javax.swing.JMenuItem salaryTeacher;
    private javax.swing.JMenuItem showBalance;
    private javax.swing.JMenu studentMenu;
    private javax.swing.JMenu teacherMenu;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JMenuItem updateStudent;
    private javax.swing.JMenuItem updateTeacher;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTF;
    private javax.swing.JMenu viewBal;
    private javax.swing.JMenuItem viewTeacher;
    private javax.swing.JMenuItem withbal;
    // End of variables declaration//GEN-END:variables
}
