/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CountryNetworkAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.StateNetworkAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha
 */
public class ManageStateNetworkAdminJPanl extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form ManageStateNetworkAdminJPanl
     */
    public ManageStateNetworkAdminJPanl(JPanel userProcessContainer ,UserAccount account, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.system = system;
         this.account=account;
         populateStateComboBox();
         populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        stateNetworkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        countryNameTxtField = new javax.swing.JTextField();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 517, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 318, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 366, 138, -1));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 67, 523, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 367, -1, -1));

        passwordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 317, 136, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("State Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 222, -1, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 508, -1, -1));

        stateNetworkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        stateNetworkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(stateNetworkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 219, 136, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 269, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 268, 136, -1));

        countryNameTxtField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(countryNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 25, 138, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network network = (Network) stateNetworkJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();

        Employee employee = network.getEmployeeDirectory().createEmployee(name);

        UserAccount account = network.getUserAccountDirectory().createUserAccount(username, password, employee, new StateNetworkAdminRole());
        
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void populateStateComboBox(){
        ArrayList<Network> networkList = system.getNetworkList();
        Network network;
        stateNetworkJComboBox.removeAllItems();
        stateNetworkJComboBox.addItem("Please select");
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            if (network.getUserAccountDirectory().getUserAccountList().size() > 0) {
                if (network.getUserAccountDirectory().getUserAccountList().get(0).getUsername().equals(account.getUsername())) {
                    countryNameTxtField.setText(network.getNetworkName());
                    for (Network state : network.getSubNetwork()) {
                        stateNetworkJComboBox.addItem(state);
                    }
                }
            }
        }
        
    }
     private void populateTable() {
       networkJTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            if (network.getUserAccountDirectory().getUserAccountList().get(0).getUsername().equals(account.getUsername())) {
            for (Network state: network.getSubNetwork()){
                for (UserAccount userAccount : state.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = state.getNetworkName();
                    row[1] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
        }
 
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField countryNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JComboBox stateNetworkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
