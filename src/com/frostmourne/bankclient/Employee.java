package com.frostmourne.bankclient;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Employee extends javax.swing.JFrame {

    public Employee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createPnl = new javax.swing.JPanel();
        btnCreateEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        existingPnl = new javax.swing.JPanel();
        btnEditEmp = new javax.swing.JButton();
        btnDeleteEmp = new javax.swing.JButton();
        contPnl = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application - Employee Page");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bank Employee Management");

        createPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        createPnl.setToolTipText("");

        btnCreateEmp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCreateEmp.setText("Create");
        btnCreateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Position");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout createPnlLayout = new javax.swing.GroupLayout(createPnl);
        createPnl.setLayout(createPnlLayout);
        createPnlLayout.setHorizontalGroup(
                createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createPnlLayout.createSequentialGroup()
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(btnCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                .addGap(37, 37, 37)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtPosition)
                                                        .addComponent(txtUsername)
                                                        .addComponent(txtName)
                                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        createPnlLayout.setVerticalGroup(
                createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPnlLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnCreateEmp)
                                .addContainerGap())
        );

        existingPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnEditEmp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnEditEmp.setText("Edit Existing Employee");
        btnEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmpActionPerformed(evt);
            }
        });

        btnDeleteEmp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnDeleteEmp.setText("Delete Employee");
        btnDeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout existingPnlLayout = new javax.swing.GroupLayout(existingPnl);
        existingPnl.setLayout(existingPnlLayout);
        existingPnlLayout.setHorizontalGroup(
                existingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(existingPnlLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(existingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEditEmp))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        existingPnlLayout.setVerticalGroup(
                existingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(existingPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEditEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteEmp)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        contPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Continue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnBack.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBack.setText("Back To Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPnlLayout = new javax.swing.GroupLayout(contPnl);
        contPnl.setLayout(contPnlLayout);
        contPnlLayout.setHorizontalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        contPnlLayout.setVerticalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnlLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnBack)
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(existingPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(existingPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(createPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmpActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String position = txtPosition.getText();
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (!name.equals("") && !position.equals("") && !username.equals("") && !password.equals("")) {
            boolean isCreated = createEmployee(name, position, username, password);
            if (isCreated) {
                JOptionPane.showMessageDialog(this, "User " + name + " successfully created!");
            } else {
                JOptionPane.showMessageDialog(this, "User " + name + " already exists!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill out all fields!");
        }
    }

    private void btnEditEmpActionPerformed(java.awt.event.ActionEvent evt) {

        String usernameOld = JOptionPane.showInputDialog(this, "Enter username to modify");
        if (usernameOld != null && !usernameOld.equals("")) {
            if (checkEmployeeExists(usernameOld)) {
                JPanel panel = new JPanel(new GridLayout(4, 2));
                JTextField txtNewName = new JTextField();
                JTextField txtNewPosition = new JTextField();
                JTextField txtNewUsername = new JTextField();
                JPasswordField txtNewPassword = new JPasswordField();

                panel.add(new JLabel("Name : "));
                panel.add(txtNewName);
                panel.add(new JLabel("Postion : "));
                panel.add(txtNewPosition);
                panel.add(new JLabel("Username : "));
                panel.add(txtNewUsername);
                panel.add(new JLabel("Password : "));
                panel.add(txtNewPassword);

                int run = JOptionPane.showConfirmDialog(this, panel, "Modify the desired data", JOptionPane.OK_CANCEL_OPTION);

                if (run == JOptionPane.OK_OPTION) {
                    String name = txtNewName.getText();
                    String position = txtNewPosition.getText();
                    String usernameNew = txtNewUsername.getText();
                    String password = new String(txtPassword.getPassword());

                    if (!name.equals("") && !position.equals("") && !usernameNew.equals("") && !password.equals("")) {
                        boolean isUpdated = updateEmployee(name, position, usernameNew, usernameOld, password);
                        if (isUpdated) {
                            JOptionPane.showMessageDialog(this, "User " + name + " successfully updated!");
                        } else {
                            JOptionPane.showMessageDialog(this, "User " + name + " update failed!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please fill out all fields!");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "User " + usernameOld + " does not exist!");
            }
        }
    }

    private void btnDeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {
        String username = JOptionPane.showInputDialog(this, "Enter username to delete");
        if (username != null && !username.equalsIgnoreCase("")) {
            boolean run = deleteEmployee(username);
            if (run) {
                JOptionPane.showMessageDialog(this, "User " + username + " successfully deleted!");
            } else {
                JOptionPane.showMessageDialog(this, "Deletion failed!");
            }
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        new Login().run();
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public void run() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmp;
    private javax.swing.JButton btnDeleteEmp;
    private javax.swing.JButton btnEditEmp;
    private javax.swing.JPanel contPnl;
    private javax.swing.JPanel createPnl;
    private javax.swing.JPanel existingPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private static Boolean createEmployee(java.lang.String name, java.lang.String position, java.lang.String username, java.lang.String password) {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.createEmployee(name, position, username, password);
    }

    private static Boolean deleteEmployee(java.lang.String username) {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.deleteEmployee(username);
    }

    private static Boolean updateEmployee(java.lang.String name, java.lang.String position, java.lang.String usernameNew, java.lang.String usernameOld, java.lang.String password) {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.updateEmployee(name, position, usernameNew, usernameOld, password);
    }

    private static Boolean checkEmployeeExists(java.lang.String username) {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.checkEmployeeExists(username);
    }

}
