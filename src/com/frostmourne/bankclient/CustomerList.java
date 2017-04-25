package com.frostmourne.bankclient;

import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CustomerList extends javax.swing.JFrame {

    /**
     * Creates new form CustomerList
     */
    public CustomerList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cusPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        contPnl = new javax.swing.JPanel();
        btnCreateCus = new javax.swing.JButton();
        contPnl1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application - Current Customers");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bank Customer Management");

        cusPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        resultTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
                setCustomers(),
                new String[]{
                    "Name", "Account Number"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        resultTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listItemActionPerformed(resultTable.getValueAt(resultTable.getSelectedRow(), 1).toString());
            }
        });
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout cusPnlLayout = new javax.swing.GroupLayout(cusPnl);
        cusPnl.setLayout(cusPnlLayout);
        cusPnlLayout.setHorizontalGroup(
                cusPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cusPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );
        cusPnlLayout.setVerticalGroup(
                cusPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cusPnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        contPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnCreateCus.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCreateCus.setLabel("Create New Customer");
        btnCreateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPnlLayout = new javax.swing.GroupLayout(contPnl);
        contPnl.setLayout(contPnlLayout);
        contPnlLayout.setHorizontalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contPnlLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreateCus)
                                .addContainerGap())
        );
        contPnlLayout.setVerticalGroup(
                contPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnlLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnCreateCus)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contPnl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Continue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnBack.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBack.setText("Back To Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPnl1Layout = new javax.swing.GroupLayout(contPnl1);
        contPnl1.setLayout(contPnl1Layout);
        contPnl1Layout.setHorizontalGroup(
                contPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contPnl1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        contPnl1Layout.setVerticalGroup(
                contPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contPnl1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnBack)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(197, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(181, 181, 181))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cusPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(contPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cusPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(contPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCusActionPerformed(java.awt.event.ActionEvent evt) {
        CustomerAccount ca = new CustomerAccount();
        ca.run();
        this.dispose();
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        Login login = new Login();
        login.run();
        this.dispose();
    }

    private void listItemActionPerformed(String accountNumber) {
        List<String> results = getCustomerDetails(accountNumber);

        String name = results.get(0);
        String birthDate = results.get(1);
        String address = results.get(2);
        String mobile = results.get(3);
        String email = results.get(4);
        String accountType = results.get(5);
        String accountNum = results.get(6);
        String sortCode = results.get(7);
        String balance = results.get(8);
        String card = results.get(9);
        CustomerAccount ca = new CustomerAccount(name, birthDate, address, mobile, email, accountType, accountNum, sortCode, balance, card);

        this.dispose();
    }

    public Object[][] setCustomers() {
        List<String> result = getAllCustomer();
        int size = result.size() / 10;
        Object[][] rows = null;
        if (size > 0) {
            rows = new Object[size][2];
            int j = 0;
            for (int i = 0; i < result.size(); i += 10) {
                rows[j][0] = result.get(i);
                rows[j][1] = result.get(i + 6);
                j++;
            }
        }
        return rows;
    }

    public void run() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCreateCus;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel contPnl;
    private javax.swing.JPanel contPnl1;
    private javax.swing.JPanel cusPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> getAllCustomer() {
        com.frostmourne.bankapplication.Customer_Service service = new com.frostmourne.bankapplication.Customer_Service();
        com.frostmourne.bankapplication.Customer port = service.getCustomerPort();
        return port.getAllCustomer();
    }

    private static java.util.List<java.lang.String> getCustomerDetails(java.lang.String acciuntNumber) {
        com.frostmourne.bankapplication.Customer_Service service = new com.frostmourne.bankapplication.Customer_Service();
        com.frostmourne.bankapplication.Customer port = service.getCustomerPort();
        return port.getCustomerDetails(acciuntNumber);
    }

}
