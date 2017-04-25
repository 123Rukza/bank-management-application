package com.frostmourne.bankclient;

import com.frostmourne.bankapplication.UsernamePasswordException_Exception;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logPnl = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        contPnl = new javax.swing.JPanel();
        btnEmpSys = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application - Employee Login");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Bank Application");

        logPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details To Login", 0, 0, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        javax.swing.GroupLayout logPnlLayout = new javax.swing.GroupLayout(logPnl);
        logPnl.setLayout(logPnlLayout);
        logPnlLayout.setHorizontalGroup(
                logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logPnlLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addGroup(logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73))
                        .addGroup(logPnlLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logPnlLayout.setVerticalGroup(
                logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPnlLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(logPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnLogin)
                                .addGap(23, 23, 23))
        );

        contPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other", 0, 0, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnEmpSys.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnEmpSys.setLabel("Employee System");
        btnEmpSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpSysActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnLogout.setLabel("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnContinue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnContinue.setText("Customer List");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPnlLayout = new javax.swing.GroupLayout(contPnl);
        contPnl.setLayout(contPnlLayout);
        contPnlLayout.setHorizontalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEmpSys, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                .addContainerGap())
        );
        contPnlLayout.setVerticalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnlLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnEmpSys)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnContinue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLogout)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(177, 177, 177))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(logPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(logPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
    }// </editor-fold>     

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        try {
            boolean loginCheck = login(username, password);
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } catch (UsernamePasswordException_Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            e.printStackTrace();
        }

    }

    private void btnEmpSysActionPerformed(java.awt.event.ActionEvent evt) {
        Employee employee = new Employee();
        this.dispose();
        employee.run();
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        if (employeeLogout()) {
            JOptionPane.showMessageDialog(this, "Successfully logged out user!");
        } else {
            JOptionPane.showMessageDialog(this, "No user is logged in!");
        }
    }

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {
        CustomerList cl = new CustomerList();
        cl.run();
        this.dispose();
    }

    public void run() {
        main(null);
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpSys;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnContinue;
    private javax.swing.JPanel contPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel logPnl;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private static Boolean login(java.lang.String username, java.lang.String password) throws UsernamePasswordException_Exception {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.login(username, password);
    }

    private static Boolean employeeLogout() {
        com.frostmourne.bankapplication.Employee_Service service = new com.frostmourne.bankapplication.Employee_Service();
        com.frostmourne.bankapplication.Employee port = service.getEmployeePort();
        return port.employeeLogout();
    }

}
