package com.frostmourne.bankclient;

import com.frostmourne.bankapplication.InvalidDataException_Exception;
import javax.swing.JOptionPane;

public class CustomerAccount extends javax.swing.JFrame {
    
    boolean isUpdate;
    String accountNumberOld;
    
    public CustomerAccount() {
        isUpdate = false;
        initComponents();
    }
    
    public CustomerAccount(String name, String birthDate, String address, String mobile, String email, String accountType, String accountNumber, String sortCode, String balance, String card) {
        isUpdate = true;
        accountNumberOld = accountNumber;
        initComponents();
        txtName.setText(name);
        txtBirthDate.setText(birthDate);
        txtAddress.setText(address);
        txtMobile.setText(mobile);
        txtEmail.setText(email);
        txtACType.setText(accountType);
        txtACNum.setText(accountNumber);
        txtSortCode.setText(sortCode);
        txtBalance.setText(balance);
        txtCard.setText(card);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        jLabel1 = new javax.swing.JLabel();
        createPnl = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtACType = new javax.swing.JTextField();
        txtACNum = new javax.swing.JTextField();
        txtSortCode = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application - Customer Account");
        setResizable(false);
        
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details Management");
        
        createPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        createPnl.setToolTipText("");
        
        btnDelete.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnDelete.setLabel("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Name");
        
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Birthdate");
        
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Address");
        
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Mobile");
        
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMobile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtACType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtACNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSortCode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBalance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtCard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("A/C Type");
        
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("A/C No.");
        
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Sort Code");
        
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Balance");
        
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Card");
        
        btnCancel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCancel.setLabel("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        
        btnSave.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout createPnlLayout = new javax.swing.GroupLayout(createPnl);
        createPnl.setLayout(createPnlLayout);
        createPnlLayout.setHorizontalGroup(
                createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createPnlLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(txtBirthDate)
                                        .addComponent(txtMobile)
                                        .addComponent(txtAddress)
                                        .addComponent(txtName))
                                .addGap(34, 34, 34)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtACType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtACNum, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                        .addGroup(createPnlLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        createPnlLayout.setVerticalGroup(
                createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createPnlLayout.createSequentialGroup()
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)
                                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(1, 1, 1))))
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(txtACType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtACNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel11)))
                                                .addGap(5, 5, 5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPnlLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel12))
                                                        .addGroup(createPnlLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(createPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnDelete)
                                                        .addComponent(btnCancel)
                                                        .addComponent(btnSave))))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel1)
                                .addContainerGap(167, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pack();
        this.setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        if (isUpdate) {
            try {
                deleteCustomer(accountNumberOld);
                JOptionPane.showMessageDialog(this, "Successfully deleted customer " + accountNumberOld);
            } catch (InvalidDataException_Exception e) {
                JOptionPane.showMessageDialog(this, "Customer " + accountNumberOld + " not found!");
                e.printStackTrace();
            }
        } else {
            txtName.setText("");
            txtBirthDate.setText("");
            txtAddress.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtACType.setText("");
            txtACNum.setText("");
            txtSortCode.setText("");
            txtBalance.setText("");
            txtCard.setText("");
        }
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        CustomerList cl = new CustomerList();
        cl.run();
        this.dispose();
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtName.getText();
        String birthDate = txtBirthDate.getText();
        String address = txtAddress.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        String accountType = txtACType.getText();
        String accountNumber = txtACNum.getText();
        String sortCode = txtSortCode.getText();
        String balance = txtBalance.getText();
        String card = txtCard.getText();
        
        if (!name.equals("") && !birthDate.equals("") && !address.equals("") && !mobile.equals("") && !email.equals("") && !accountType.equals("") && !accountNumber.equals("") && !sortCode.equals("") && !balance.equals("") && !card.equals("")) {
            if (isUpdate) {
                // update
                try {
                    updateCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, accountNumberOld, sortCode, balance, card);
                    JOptionPane.showMessageDialog(this, "Successfully updated customer " + name);
                } catch (InvalidDataException_Exception e) {
                    JOptionPane.showMessageDialog(this, "Customer " + name + " update failed!");
                    e.printStackTrace();
                }
            } else {
                // create
                try {
                    createCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
                    JOptionPane.showMessageDialog(this, "Successfully created customer " + name);
                } catch (InvalidDataException_Exception e) {
                    JOptionPane.showMessageDialog(this, "Customer " + name + " creation failed!");
                    e.printStackTrace();
                }
            }
        } else{
            JOptionPane.showMessageDialog(this, "Please fill out all fields!");
        }
    }
    
    public void run() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel createPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtACNum;
    private javax.swing.JTextField txtACType;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSortCode;
    // End of variables declaration//GEN-END:variables

    private static Boolean createCustomer(java.lang.String name, java.lang.String birthdate, java.lang.String address, java.lang.String mobile, java.lang.String email, java.lang.String type, java.lang.String number, java.lang.String sortcode, java.lang.String balance, java.lang.String card) throws InvalidDataException_Exception {
        com.frostmourne.bankapplication.Customer_Service service = new com.frostmourne.bankapplication.Customer_Service();
        com.frostmourne.bankapplication.Customer port = service.getCustomerPort();
        return port.createCustomer(name, birthdate, address, mobile, email, type, number, sortcode, balance, card);
    }
    
    private static Boolean deleteCustomer(java.lang.String accountNumber) throws InvalidDataException_Exception {
        com.frostmourne.bankapplication.Customer_Service service = new com.frostmourne.bankapplication.Customer_Service();
        com.frostmourne.bankapplication.Customer port = service.getCustomerPort();
        return port.deleteCustomer(accountNumber);
    }
    
    private static Boolean updateCustomer(java.lang.String name, java.lang.String birthdate, java.lang.String address, java.lang.String mobile, java.lang.String email, java.lang.String type, java.lang.String number, java.lang.String numberOld, java.lang.String sortcode, java.lang.String balance, java.lang.String card) throws InvalidDataException_Exception {
        com.frostmourne.bankapplication.Customer_Service service = new com.frostmourne.bankapplication.Customer_Service();
        com.frostmourne.bankapplication.Customer port = service.getCustomerPort();
        return port.updateCustomer(name, birthdate, address, mobile, email, type, number, numberOld, sortcode, balance, card);
    }
    
}
