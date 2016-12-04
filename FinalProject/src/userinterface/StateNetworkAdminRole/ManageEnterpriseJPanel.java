/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

//import Business.EcoSystem;
//import Business.Enterprise.Enterprise;
//import Business.Network.Network;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CountryNetworkAdminRole.CountryNetworkAdminWorkArea;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account=account;

        populateTable();
        populateComboBox();
        populateCountryName();
        enterpriseTypeJComboBox.setEnabled(false);
        enterpriseNameTextField.setEnabled(false);
    }

    private void populateTable() {
        enterpriseJTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for(Network stateNetwork : network.getSubNetwork()){
                for(Network cityNetwork : stateNetwork.getSubNetwork()){
                    for (Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                        Object[] row = new Object[5];
                        row[0] = enterprise.getName();
                        row[1] = network.getNetworkName();
                        row[2] = stateNetwork.getNetworkName();
                        row[3] = cityNetwork.getNetworkName();
                        row[4] = enterprise.getEnterpriseType().getValue();
                        model.addRow(row);
                    }
                }
            }
            
        }
    }

    private void populateComboBox() {
        CountryNetComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();
        
        CountryNetComboBox.addItem("Please select");
        for (Network network : system.getNetworkList()) {
            CountryNetComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CountryNetComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        enterpriseNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        StateComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        CityComboBox = new javax.swing.JComboBox();
        countryNameTextBox = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Country Network", "State Network", "City Network", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 47, 760, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Country : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 201, -1, -1));

        CountryNetComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CountryNetComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CountryNetComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CountryNetComboBoxItemStateChanged(evt);
            }
        });
        add(CountryNetComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 201, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Name : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 479, -1, -1));

        enterpriseNameTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(enterpriseNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 476, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Enterprise Type : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 416, -1, -1));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 413, 190, -1));

        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("State : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 269, -1, -1));

        StateComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        StateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StateComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StateComboBoxItemStateChanged(evt);
            }
        });
        add(StateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 269, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("City : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 339, -1, -1));

        CityComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CityComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CityComboBoxItemStateChanged(evt);
            }
        });
        add(CityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 339, 190, -1));

        countryNameTextBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(countryNameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network cityNetwork = (Network) CityComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (cityNetwork == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = enterpriseNameTextField.getText();

        Enterprise enterprise = cityNetwork.getEnterpriseDirectory().createAndAddEnterprise(name, type);
        if(type.equals(Enterprise.EnterpriseType.DonorRegCenter)){
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.RegCenterLab);
        }
        
        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StateAdminWorkArea sysAdminwjp = (StateAdminWorkArea) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void CityComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CityComboBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED && !CityComboBox.getSelectedItem().equals("Please select")){
            enterpriseTypeJComboBox.setEnabled(true);
            enterpriseNameTextField.setEnabled(true);
        }
        
    }//GEN-LAST:event_CityComboBoxItemStateChanged

    private void CountryNetComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CountryNetComboBoxItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED && !CountryNetComboBox.getSelectedItem().equals("Please select")){
           StateComboBox.removeAllItems();
           StateComboBox.addItem("Please select");
           for(Network network : system.getNetworkList()){
               if(network.getNetworkName().equals(CountryNetComboBox.getSelectedItem().toString())){
                  for(Network stateNetwork : network.getSubNetwork()){
                      StateComboBox.addItem(stateNetwork);
                  }
               }
           }
       }       
    }//GEN-LAST:event_CountryNetComboBoxItemStateChanged

    private void StateComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StateComboBoxItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED && !StateComboBox.getSelectedItem().equals("Please select")){
           CityComboBox.removeAllItems();
           CityComboBox.addItem("Please select");
           for(Network network : system.getNetworkList()){
               if(network.getNetworkName().equals(CountryNetComboBox.getSelectedItem().toString())){
                  for(Network stateNetwork : network.getSubNetwork()){
                      if(stateNetwork.getNetworkName().equals(StateComboBox.getSelectedItem().toString())){
                          for(Network cityNetwork : stateNetwork.getSubNetwork()){
                              CityComboBox.addItem(cityNetwork);
                          }
                      }
                  }
               }
           }
       }
    }//GEN-LAST:event_StateComboBoxItemStateChanged
private void populateCountryName(){
    ArrayList<Network> networkList = system.getNetworkList();
    Network network;
     for(int i = 0; i<networkList.size(); i++){
            network = networkList.get(i);
            if(network.getUserAccountDirectory().getUserAccountList().size() > 0){
                if(network.getUserAccountDirectory().getUserAccountList().get(0).getUsername().equals(account.getUsername())){
                    countryNameTextBox.setText(network.getNetworkName());
                }
            }
     }
}
    
//     private void populateStateCombo(String[] statelist){
//        StateComboBox.removeAllItems();
//        StateComboBox.addItem("Please Select");
//        for(String statename : statelist){
//            StateComboBox.addItem(statename);
//        }
//    }
    
//     private void populateCityCombo(String[] cityList){
//        CityComboBox.removeAllItems();
//        CityComboBox.addItem("Please select");
//        for(String city : cityList){
//            CityComboBox.addItem(city);
//        }
//    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CityComboBox;
    private javax.swing.JComboBox CountryNetComboBox;
    private javax.swing.JComboBox StateComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField countryNameTextBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
