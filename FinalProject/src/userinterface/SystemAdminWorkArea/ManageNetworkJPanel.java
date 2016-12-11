/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        countryErrLabel.setVisible(false);
        stateErrLabel.setVisible(false);
        cityErrLabel.setVisible(false);
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        networkJTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Network stateNetwork : network.getSubNetwork()) {
                for (Network cityNetwork : stateNetwork.getSubNetwork()) {
                    Object[] row = new Object[3];
                    row[0] = network.getNetworkName();
                    row[1] = stateNetwork.getNetworkName();
                    row[2] = cityNetwork.getNetworkName();
                    model.addRow(row);
                }
            }
        }
    }

    public boolean validateData() {
        if (CountryCombo.getSelectedItem().toString().equalsIgnoreCase("Please select")) {
            countryErrLabel.setVisible(true);
            return false;
        } else {
            countryErrLabel.setVisible(false);
        }
        if (StateCombo.getSelectedItem().toString().equalsIgnoreCase("Please select")) {
            stateErrLabel.setVisible(true);
            return false;
        } else {
            stateErrLabel.setVisible(false);
        }
        if (CityCombo.getSelectedItem().toString().equalsIgnoreCase("Please select")) {
            cityErrLabel.setVisible(true);
            return false;
        } else {
            cityErrLabel.setVisible(false);
        }
        return true;
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
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CountryCombo = new javax.swing.JComboBox<>();
        StateCombo = new javax.swing.JComboBox<>();
        CityCombo = new javax.swing.JComboBox<>();
        cityErrLabel = new javax.swing.JLabel();
        countryErrLabel = new javax.swing.JLabel();
        stateErrLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setBackground(new java.awt.Color(204, 255, 255));
        networkJTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Country", "State", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 63, 630, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("City : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 415, -1, -1));

        submitJButton.setBackground(new java.awt.Color(0, 0, 0));
        submitJButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 153, 153));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 153, 153));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Country : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 266, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("State : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 335, -1, -1));

        CountryCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CountryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "USA", "India" }));
        CountryCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CountryComboItemStateChanged(evt);
            }
        });
        add(CountryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 263, -1, -1));

        StateCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        StateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StateCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StateComboItemStateChanged(evt);
            }
        });
        add(StateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 332, 150, -1));

        CityCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(CityCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 409, 150, -1));

        cityErrLabel.setText("Please select a city");
        add(cityErrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 250, -1));

        countryErrLabel.setText("Please select a country");
        add(countryErrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 250, -1));

        stateErrLabel.setText("Please select a state");
        add(stateErrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if (validateData()) {

            Network network;
            boolean found = false;
            boolean countryFound = false;
            if (system.getNetworkList().size() > 0) {
                Iterator itr = system.getNetworkList().iterator();
                while (itr.hasNext()) {
                    Network net = (Network) itr.next();
                    if (net.getNetworkName().equals(CountryCombo.getSelectedItem().toString())) {
                        countryFound = true;
                        Iterator stateNetItr = net.getSubNetwork().iterator();
                        while (stateNetItr.hasNext()) {
                            Network stateNet = (Network) stateNetItr.next();
                            if (stateNet.getNetworkName().equals(StateCombo.getSelectedItem().toString())) {
                                found = true;
                                for (Network city : stateNet.getSubNetwork()) {
                                    if (city.getNetworkName().equals(CityCombo.getSelectedItem().toString())) {
                                        JOptionPane.showMessageDialog(null, "This city network already exists");
                                        break;
                                    } else {
                                        Network cityNetwork = stateNet.addSubNetwork();
                                        cityNetwork.setNetworkName(CityCombo.getSelectedItem().toString());
                                    }
                                }

                            }
                        }
                        if (!found) {
                            Network stateNetwork = net.addSubNetwork();
                            stateNetwork.setNetworkName(StateCombo.getSelectedItem().toString());

                            Network cityNetwork = stateNetwork.addSubNetwork();
                            cityNetwork.setNetworkName(CityCombo.getSelectedItem().toString());
                        }
                    }
                }
                if (!countryFound) {
                    Network countryNetwork = system.createAndNetwork();
                    countryNetwork.setNetworkName(CountryCombo.getSelectedItem().toString());

                    Network stateNetwork = countryNetwork.addSubNetwork();
                    stateNetwork.setNetworkName(StateCombo.getSelectedItem().toString());

                    Network cityNetwork = stateNetwork.addSubNetwork();
                    cityNetwork.setNetworkName(CityCombo.getSelectedItem().toString());
                }
            } else {

                network = system.createAndNetwork();
                network.setNetworkName(CountryCombo.getSelectedItem().toString());

                Network stateNetwork = network.addSubNetwork();
                stateNetwork.setNetworkName(StateCombo.getSelectedItem().toString());

                Network cityNetwork = stateNetwork.addSubNetwork();
                cityNetwork.setNetworkName(CityCombo.getSelectedItem().toString());
            }
        }
        populateNetworkTable();
        StateCombo.setSelectedIndex(0);
        CityCombo.setSelectedIndex(0);
        CountryCombo.setSelectedIndex(0);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void CountryComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CountryComboItemStateChanged
        if (CountryCombo.getSelectedItem().toString().equals("USA")) {
            String[] stateList = new String[]{"New York", "Texas", "Masachusetts"};
            populateStateCombo(stateList);
        } else if (CountryCombo.getSelectedItem().toString().equals("India")) {
            String[] stateList = new String[]{"Maharastra", "Rajasthan"};
            populateStateCombo(stateList);
        }
    }//GEN-LAST:event_CountryComboItemStateChanged

    private void StateComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StateComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (CountryCombo.getSelectedItem().equals("USA") && StateCombo.getSelectedItem().equals("Texas")) {
                String[] cityList = new String[]{"Austin", "Dallas"};
                populateCityCombo(cityList);
            }
            if (CountryCombo.getSelectedItem().equals("USA") && StateCombo.getSelectedItem().equals("New York")) {
                String[] cityList = new String[]{"Buffalo", "Syracuse"};
                populateCityCombo(cityList);
            }
            if (CountryCombo.getSelectedItem().equals("USA") && StateCombo.getSelectedItem().equals("Masachusetts")) {
                String[] cityList = new String[]{"Newton", "Framingham"};
                populateCityCombo(cityList);
            }
            if (CountryCombo.getSelectedItem().equals("India") && StateCombo.getSelectedItem().equals("Maharastra")) {
                String[] cityList = new String[]{"Mumbai", "Pune"};
                populateCityCombo(cityList);
            }
            if (CountryCombo.getSelectedItem().equals("India") && StateCombo.getSelectedItem().equals("Rajasthan")) {
                String[] cityList = new String[]{"Jaipur", "Udaipur"};
                populateCityCombo(cityList);
            }
        }
    }//GEN-LAST:event_StateComboItemStateChanged

    private void populateStateCombo(String[] statelist) {
        StateCombo.removeAllItems();
        StateCombo.addItem("Please Select");
        for (String statename : statelist) {
            StateCombo.addItem(statename);
        }
    }

    private void populateCityCombo(String[] cityList) {
        CityCombo.removeAllItems();
        CityCombo.addItem("Please select");
        for (String city : cityList) {
            CityCombo.addItem(city);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CityCombo;
    private javax.swing.JComboBox<String> CountryCombo;
    private javax.swing.JComboBox<String> StateCombo;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityErrLabel;
    private javax.swing.JLabel countryErrLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JLabel stateErrLabel;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
