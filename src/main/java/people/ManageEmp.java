/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import people.Login;

/**
 *
 * @author rbs
 */
public final class ManageEmp extends javax.swing.JDialog {

    /**
     * Creates new form Display_emp
     */
    public ManageEmp() {
        initComponents();
        showEmployees();
        deptcombo();
        titlecombo();
    }

    public static ArrayList<Employee> getEmployeeList() {

        ArrayList<Employee> empList = new ArrayList<>();
        Connection connection = MyConnection.getConnection();

        String query = "SELECT empid, firstname, lastname, gender, deptid, titleid, phone, email, empdate FROM emp";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Employee emp;

            while (rs.next()) {

                emp = new Employee(rs.getString("empid"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("gender"), rs.getString("deptid"), rs.getString("titleid"), rs.getString("phone"), rs.getString("email"), rs.getString("empdate"));
                empList.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empList;
    }

// Displaying data in JTable
    public static void showEmployees() {
        ArrayList<Employee> list = getEmployeeList();
        DefaultTableModel model = (DefaultTableModel) jTable_EMPLOYEE.getModel();
        model.getDataVector().clear();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getEmpID();
            row[1] = list.get(i).FirstName();
            row[2] = list.get(i).LastName();
            row[3] = list.get(i).Gender();
            row[4] = list.get(i).Department();
            row[5] = list.get(i).Title();
            row[6] = list.get(i).Phone();
            row[7] = list.get(i).Email();
            row[8] = list.get(i).EmpDate();

            model.addRow(row);
        }

        model.fireTableDataChanged();
    }

    public void executeSQLQuery(String query, String message) {
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) {
                Success suc = new Success();
                suc.setLocationRelativeTo(null);
                Success.jLabel_success2.setText("SUCCESS!!");
                Success.jLabel_success1.setText("Data has been " + message);
                Success.jLabel_success.setText("Successfully");
                suc.setModalityType(ModalityType.APPLICATION_MODAL);
                suc.setVisible(true);
            } else {
                Error error = new Error();
                error.setLocationRelativeTo(null);
                Error.jLabel_error1.setText("ERROR!!");
                Error.jLabel_error.setText("No data has been " + message);
                error.setModalityType(ModalityType.APPLICATION_MODAL);
                error.setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Empid = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Jdepartment = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jTextField_empid = new javax.swing.JTextField();
        jTextField_firstname = new javax.swing.JTextField();
        jTextField_lastname = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_EMPLOYEE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        Contact = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel_welcome = new javax.swing.JLabel();
        jComboBox_deptid = new javax.swing.JComboBox<>();
        jComboBox_titleid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Empid.setText("Employee ID");

        Fname.setText("First Name");

        Lname.setText("Last Name");

        Gender.setText("Gender");

        Jdepartment.setText("Department");

        Title.setText("Job Title");

        gender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        jTextField_empid.setEditable(false);
        jTextField_empid.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_firstname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_lastname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton_add.setText("ADD EMLPOYEE");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jTable_EMPLOYEE.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTable_EMPLOYEE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE ID", "FIRST NAME", "LAST NAME", "GENDER", "DEPARTMENT", "JOB TITLE", "PHONE", "EMAIL", "DATE EMPLOYED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_EMPLOYEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_EMPLOYEEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_EMPLOYEE);

        jButton1.setText("DELETE EMPLOYEE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_update.setText("EDIT ROW DATA");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/company.png"))); // NOI18N

        jLabel_total.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel_total.setForeground(new java.awt.Color(0, 0, 153));
        jLabel_total.setText("TOTAL NUMBER OF EMPLOYEES =");

        jTextField_phone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Contact.setText("Phone");

        Email.setText("Email");

        jLabel_welcome.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_welcome.setText("Signed in as");

        jComboBox_deptid.setModel(new javax.swing.DefaultComboBoxModel<>(new DepartmentModel[] { }));

        jComboBox_titleid.setModel(new javax.swing.DefaultComboBoxModel<>(new TitleModel[] { }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_empid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Empid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_deptid, 0, 226, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_titleid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Empid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_empid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_deptid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox_titleid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//The code below shows data on row selected by mouse click on the jTextFields respectivley
    private void jTable_EMPLOYEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_EMPLOYEEMouseClicked
        int i = jTable_EMPLOYEE.getSelectedRow();
        TableModel model = jTable_EMPLOYEE.getModel();
        jTextField_empid.setText(model.getValueAt(i, 0).toString());
        jTextField_firstname.setText(model.getValueAt(i, 1).toString());
        jTextField_lastname.setText(model.getValueAt(i, 2).toString());
        gender.setSelectedItem(model.getValueAt(i, 3).toString());
//  display deptid as depName in ComboBox
        final String depId = model.getValueAt(i, 4).toString();
        
        DepartmentModel depModel = null;
        for (int j = 0; j < jComboBox_deptid.getItemCount(); j++) {
            DepartmentModel itemAt = jComboBox_deptid.getItemAt(j);
            
            if(depId.equalsIgnoreCase(itemAt.getDepartmentId())) {
                depModel = itemAt;
                break;
            }
        }
        
        if(null == depModel) {
            JOptionPane.showMessageDialog(this, "A system error occurred");
            return;
        }
        
        jComboBox_deptid.setSelectedItem(depModel);
//  End
        

//  display titleid as titleName in ComboBox  
        
        final String titleId = model.getValueAt(i, 5).toString();
        
        TitleModel titleModel = null;
        for(int y = 0; y<jComboBox_titleid.getItemCount(); y++){
            TitleModel itemAt = jComboBox_titleid.getItemAt(y);
            
            if(titleId.equalsIgnoreCase(itemAt.getTitleId())){
                titleModel = itemAt;
                break;
            }
        
        }
        if(null == titleModel) {
            JOptionPane.showMessageDialog(this, "A system error occurred");
            return;
        }
        jComboBox_titleid.setSelectedItem(titleModel);
//  End
        jTextField_phone.setText(model.getValueAt(i, 6).toString());
        jTextField_email.setText(model.getValueAt(i, 7).toString());

    }//GEN-LAST:event_jTable_EMPLOYEEMouseClicked
    private void deptcombo() {
        Connection con = MyConnection.getConnection();
        try {
            String sql = "SELECT * FROM dept";
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                DepartmentModel model = new DepartmentModel();
                String deptid = rs.getString("deptid");
                String deptName = rs.getString("department");
                model.setDepartmentId(deptid);
                model.setDepartmentName(deptName);
                jComboBox_deptid.addItem(model);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void titlecombo() {
        Connection con = MyConnection.getConnection();
        try {
            String sql = "SELECT * FROM title";
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                TitleModel model = new TitleModel();
                String titleid = rs.getString("titleid");
                String titleName = rs.getString("title");
                model.setTitleId(titleid);
                model.setTitleName(titleName);
                jComboBox_titleid.addItem(model);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
//Adding data in the Database
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        AddEmployee ad = new AddEmployee();
        ad.setLocationRelativeTo(null);
        ad.setModalityType(ModalityType.APPLICATION_MODAL);
        ad.setVisible(true);
    }//GEN-LAST:event_jButton_addActionPerformed

//Editing data in the Database
    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        String query = "UPDATE emp SET `deptid`= '" + ((DepartmentModel) jComboBox_deptid.getSelectedItem()).getDepartmentId() + "', `titleid`= '" + ((TitleModel) jComboBox_titleid.getSelectedItem()).getTitleId() + "',`firstname`= '" + jTextField_firstname.getText() + "', `lastname`= '" + jTextField_lastname.getText() + "',`gender`= '" + gender.getSelectedItem() + "', phone = '" + jTextField_phone.getText() + "', email = '" + jTextField_email.getText() + "' WHERE `empid`= '" + jTextField_empid.getText() + "'";
        executeSQLQuery(query, "updated");
        showEmployees();
//        this.dispose();
        DisplayEmp.showEmployees();
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String query = "DELETE FROM `emp` WHERE `empid`= '" + jTextField_empid.getText() + "'";
        executeSQLQuery(query, "deleted");
        showEmployees();
        DisplayEmp.showEmployees();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageEmp().setVisible(true);
        });
    }

    public static class DepartmentModel {

        private String departmentId;
        private String departmentName;

        public String getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        @Override
        public String toString() {
            return departmentName;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + Objects.hashCode(this.departmentId);
            hash = 79 * hash + Objects.hashCode(this.departmentName);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final DepartmentModel other = (DepartmentModel) obj;
            if (!Objects.equals(this.departmentId, other.departmentId)) {
                return false;
            }
            if (!Objects.equals(this.departmentName, other.departmentName)) {
                return false;
            }
            return true;
        }
        
        
    }

    public static class TitleModel {

        private String titleId;
        private String titleName;

        public String getTitleId() {
            return titleId;
        }

        public void setTitleId(String titleId) {
            this.titleId = titleId;
        }

        public String getTitleName() {
            return titleName;
        }

        public void setTitleName(String titleName) {
            this.titleName = titleName;
        }

        @Override
        public String toString(){
            return titleName;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 23 * hash + Objects.hashCode(this.titleId);
            hash = 23 * hash + Objects.hashCode(this.titleName);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final TitleModel other = (TitleModel) obj;
            if (!Objects.equals(this.titleId, other.titleId)) {
                return false;
            }
            if (!Objects.equals(this.titleName, other.titleName)) {
                return false;
            }
            return true;
        }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Empid;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Jdepartment;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<DepartmentModel> jComboBox_deptid;
    private javax.swing.JComboBox<TitleModel> jComboBox_titleid;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel_total;
    public static javax.swing.JLabel jLabel_welcome;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable_EMPLOYEE;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_empid;
    private javax.swing.JTextField jTextField_firstname;
    private javax.swing.JTextField jTextField_lastname;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}
