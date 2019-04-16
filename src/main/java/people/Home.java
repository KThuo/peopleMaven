/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.awt.Dialog;

/**
 *
 * @author rbs
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jLabel_welcome = new javax.swing.JLabel();
        Employees = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        Titles = new javax.swing.JLabel();
        Departments = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_home = new javax.swing.JMenu();
        jMenu_Employees = new javax.swing.JMenu();
        jMenuItem_Employees = new javax.swing.JMenuItem();
        jMenuItem_ManageEmp = new javax.swing.JMenuItem();
        jMenuItem_AddEmp = new javax.swing.JMenuItem();
        jMenu_Salaries = new javax.swing.JMenu();
        jMenuItem_Salaries = new javax.swing.JMenuItem();
        jMenuItem_ManageSal = new javax.swing.JMenuItem();
        jMenu_Dept = new javax.swing.JMenu();
        jMenuItem_Departments = new javax.swing.JMenuItem();
        jMenuItem_AddDept = new javax.swing.JMenuItem();
        jMenu_Title = new javax.swing.JMenu();
        jMenuItem_Titles = new javax.swing.JMenuItem();
        jMenuItem_AddTitle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/company.png"))); // NOI18N

        jLabel_welcome.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_welcome.setText("Welcome");

        Employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emp.png"))); // NOI18N
        Employees.setText("EMPLOYEES");
        Employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeesMouseClicked(evt);
            }
        });

        Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salary.png"))); // NOI18N
        Salary.setText("SALARY");
        Salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalaryMouseClicked(evt);
            }
        });

        Titles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/title.png"))); // NOI18N
        Titles.setText("JOB TITLES");
        Titles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitlesMouseClicked(evt);
            }
        });

        Departments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/departments.png"))); // NOI18N
        Departments.setText("DEPARTMENTS");
        Departments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepartmentsMouseClicked(evt);
            }
        });

        jMenu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logosm.png"))); // NOI18N
        jMenu_home.setText("HEROES");

        jMenu_Employees.setText("EMPOYEES");

        jMenuItem_Employees.setText("Employees");
        jMenuItem_Employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EmployeesActionPerformed(evt);
            }
        });
        jMenu_Employees.add(jMenuItem_Employees);

        jMenuItem_ManageEmp.setText("Manage");
        jMenuItem_ManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ManageEmpActionPerformed(evt);
            }
        });
        jMenu_Employees.add(jMenuItem_ManageEmp);

        jMenuItem_AddEmp.setText("Add");
        jMenuItem_AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddEmpActionPerformed(evt);
            }
        });
        jMenu_Employees.add(jMenuItem_AddEmp);

        jMenu_home.add(jMenu_Employees);

        jMenu_Salaries.setText("SALARIES");

        jMenuItem_Salaries.setText("Salaries");
        jMenuItem_Salaries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SalariesActionPerformed(evt);
            }
        });
        jMenu_Salaries.add(jMenuItem_Salaries);

        jMenuItem_ManageSal.setText("Manage");
        jMenuItem_ManageSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ManageSalActionPerformed(evt);
            }
        });
        jMenu_Salaries.add(jMenuItem_ManageSal);

        jMenu_home.add(jMenu_Salaries);

        jMenu_Dept.setText("DEPARTMENTS");

        jMenuItem_Departments.setText("Departments");
        jMenuItem_Departments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DepartmentsActionPerformed(evt);
            }
        });
        jMenu_Dept.add(jMenuItem_Departments);

        jMenuItem_AddDept.setText("Add");
        jMenuItem_AddDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddDeptActionPerformed(evt);
            }
        });
        jMenu_Dept.add(jMenuItem_AddDept);

        jMenu_home.add(jMenu_Dept);

        jMenu_Title.setText("JOB TITLES");

        jMenuItem_Titles.setText("Job Titles");
        jMenuItem_Titles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TitlesActionPerformed(evt);
            }
        });
        jMenu_Title.add(jMenuItem_Titles);

        jMenuItem_AddTitle.setText("Add");
        jMenuItem_AddTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddTitleActionPerformed(evt);
            }
        });
        jMenu_Title.add(jMenuItem_AddTitle);

        jMenu_home.add(jMenu_Title);

        jMenuBar1.add(jMenu_home);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(logo)
                .addGap(40, 40, 40)
                .addComponent(jLabel_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Departments, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titles, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(434, 434, 434)
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departments, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titles, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(logo1)
                    .addContainerGap(590, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeesMouseClicked
        DisplayEmp de = new DisplayEmp();
        de.setLocationRelativeTo(null);
        DisplayEmp.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayEmp.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        de.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        de.setVisible(true);
    }//GEN-LAST:event_EmployeesMouseClicked

    private void SalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryMouseClicked
        DisplayEmpSalary sal = new DisplayEmpSalary();
        sal.setLocationRelativeTo(null);
        DisplayEmpSalary.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayEmpSalary.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        sal.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        sal.setVisible(true);
    }//GEN-LAST:event_SalaryMouseClicked

    private void DepartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepartmentsMouseClicked
        DisplayDep dep = new DisplayDep();
        dep.setLocationRelativeTo(null);
        DisplayDep.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayDep.jLabel_total.setText("TOTAL NUMBER OF DEPARTMENTS IS ("+Integer.toString(MyFunction.countData("dept"))+")");
        dep.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        dep.setVisible(true);
    }//GEN-LAST:event_DepartmentsMouseClicked

    private void TitlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlesMouseClicked
        DisplayTitle title = new DisplayTitle();
        title.setLocationRelativeTo(null);
        DisplayTitle.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayTitle.jLabel_total.setText("TOTAL NUMBER OF JOB TITLES IS ("+Integer.toString(MyFunction.countData("title"))+")");
        title.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        title.setVisible(true);
    }//GEN-LAST:event_TitlesMouseClicked

    private void jMenuItem_SalariesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SalariesActionPerformed
        DisplayEmpSalary sal = new DisplayEmpSalary();
        sal.setLocationRelativeTo(null);
        DisplayEmpSalary.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayEmpSalary.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        sal.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        sal.setVisible(true);
    }//GEN-LAST:event_jMenuItem_SalariesActionPerformed

    private void jMenuItem_EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EmployeesActionPerformed
        DisplayEmp de = new DisplayEmp();
        de.setLocationRelativeTo(null);
        DisplayEmp.jLabel_welcome.setText("Welcome back "+ Login.jTextField_User.getText());
        DisplayEmp.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        de.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        de.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EmployeesActionPerformed

    private void jMenuItem_DepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DepartmentsActionPerformed
        DisplayDep dep = new DisplayDep();
        dep.setLocationRelativeTo(null);
        DisplayDep.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayDep.jLabel_total.setText("TOTAL NUMBER OF DEPARTMENTS IS ("+Integer.toString(MyFunction.countData("dept"))+")");
        dep.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        dep.setVisible(true);
    }//GEN-LAST:event_jMenuItem_DepartmentsActionPerformed

    private void jMenuItem_TitlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TitlesActionPerformed
        DisplayTitle title = new DisplayTitle();
        title.setLocationRelativeTo(null);
        DisplayTitle.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        DisplayTitle.jLabel_total.setText("TOTAL NUMBER OF JOB TITLES IS ("+Integer.toString(MyFunction.countData("title"))+")");
        title.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        title.setVisible(true);
    }//GEN-LAST:event_jMenuItem_TitlesActionPerformed

    private void jMenuItem_ManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ManageEmpActionPerformed
        ManageEmp man = new ManageEmp();
        man.setLocationRelativeTo(null);
        ManageEmp.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        ManageEmp.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        man.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        man.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ManageEmpActionPerformed

    private void jMenuItem_AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddEmpActionPerformed
        AddEmployee ad = new AddEmployee();
        ad.setLocationRelativeTo(null);
        ad.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AddEmpActionPerformed

    private void jMenuItem_ManageSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ManageSalActionPerformed
ManageEmpSal man = new ManageEmpSal();
        man.setLocationRelativeTo(null);
        ManageEmpSal.jLabel_welcome.setText("Signed in as "+ Login.jTextField_User.getText());
        ManageEmpSal.jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES IS ("+Integer.toString(MyFunction.countData("emp"))+")");
        man.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        man.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ManageSalActionPerformed

    private void jMenuItem_AddDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddDeptActionPerformed
        AddDept ad = new AddDept();
        ad.setLocationRelativeTo(null);
        ad.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AddDeptActionPerformed

    private void jMenuItem_AddTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddTitleActionPerformed
        AddTitle ad = new AddTitle();
        ad.setLocationRelativeTo(null);
        ad.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AddTitleActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Departments;
    private javax.swing.JLabel Employees;
    private javax.swing.JLabel Salary;
    private javax.swing.JLabel Titles;
    public static javax.swing.JLabel jLabel_welcome;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AddDept;
    private javax.swing.JMenuItem jMenuItem_AddEmp;
    private javax.swing.JMenuItem jMenuItem_AddTitle;
    private javax.swing.JMenuItem jMenuItem_Departments;
    private javax.swing.JMenuItem jMenuItem_Employees;
    private javax.swing.JMenuItem jMenuItem_ManageEmp;
    private javax.swing.JMenuItem jMenuItem_ManageSal;
    private javax.swing.JMenuItem jMenuItem_Salaries;
    private javax.swing.JMenuItem jMenuItem_Titles;
    private javax.swing.JMenu jMenu_Dept;
    private javax.swing.JMenu jMenu_Employees;
    private javax.swing.JMenu jMenu_Salaries;
    private javax.swing.JMenu jMenu_Title;
    private javax.swing.JMenu jMenu_home;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
