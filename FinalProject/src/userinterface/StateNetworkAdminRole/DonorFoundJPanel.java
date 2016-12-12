/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Network.Network;
import Business.Organization.OPTOrganization.OPTELabOrganization;
import Business.RegCenter.Donor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FindDonorRequest;
import Business.WorkQueue.OrganMatchingWorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorFoundJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network stateNetwork;
    private UserAccount account;
    private FindDonorRequest findDonorRequest;
    private ArrayList<Donor> donorList;

    /**
     * Creates new form DonorFoundJPanel
     */
    public DonorFoundJPanel() {
        initComponents();
    }

    DonorFoundJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, FindDonorRequest findDonorRequest,
            Network stateNetwork, ArrayList<Donor> donorList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.findDonorRequest = findDonorRequest;
        this.stateNetwork = stateNetwork;
        //this.organMatchingRequest = organMatchingRequest;
        this.donorList = donorList;
        if (donorList.isEmpty()) {
            noDonorLabel.setVisible(true);
            forwardToCountryAdminBtn.setEnabled(true);
        } else {
            noDonorLabel.setVisible(false);
            forwardToCountryAdminBtn.setEnabled(false);
        }
        populateTable();
    }

    public void populateTable() {
        DonorDetailTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) DonorDetailTable.getModel();
        model.setRowCount(0);

        for (Donor donor : donorList) {
<<<<<<< HEAD
            if(donorList.size() > 0){
                Object[] row = new Object[2];
                row[0] = donor;
                row[1] = donor.getDonorName();
            model.addRow(row);
            }
            
=======
            if(donorList.size()>0){
                 Object[] row = new Object[2];
            row[0] = donor;
            row[1] = donor.getDonorName();

            model.addRow(row);
            }
           
>>>>>>> bab9c92993e162f6ad441c8a1ab15d862097e5cd
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
        DonorDetailTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        noDonorLabel = new javax.swing.JLabel();
        forwardToCountryAdminBtn = new javax.swing.JButton();
        organMatchingBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonorDetailTable.setBackground(new java.awt.Color(204, 255, 255));
        DonorDetailTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DonorDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DonorID", "Donor Name"
            }
        ));
        jScrollPane1.setViewportView(DonorDetailTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 188));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 153, 153));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 130, 40));

        noDonorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noDonorLabel.setForeground(new java.awt.Color(255, 0, 51));
        noDonorLabel.setText("No Donor Found!");
        add(noDonorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        forwardToCountryAdminBtn.setBackground(new java.awt.Color(0, 0, 0));
        forwardToCountryAdminBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        forwardToCountryAdminBtn.setForeground(new java.awt.Color(255, 153, 153));
        forwardToCountryAdminBtn.setText("Request Country Administrator");
        forwardToCountryAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardToCountryAdminBtnActionPerformed(evt);
            }
        });
        add(forwardToCountryAdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 253, 58));

        organMatchingBtn.setBackground(new java.awt.Color(0, 0, 0));
        organMatchingBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        organMatchingBtn.setForeground(new java.awt.Color(255, 153, 153));
        organMatchingBtn.setText("Raise Organ Matching");
        organMatchingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organMatchingBtnActionPerformed(evt);
            }
        });
        add(organMatchingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 89, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void forwardToCountryAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardToCountryAdminBtnActionPerformed
        for (Network network : system.getNetworkList()) {
            for (Network state : network.getSubNetwork()) {
                if (state.getNetworkName().equals(stateNetwork.getNetworkName())) {
                    network.getWorkQueue().getWorkRequestList().add(findDonorRequest);
                    JOptionPane.showMessageDialog(null, "Request forwarded to Country Admin");
                    break;
                }
            }
        }
    }//GEN-LAST:event_forwardToCountryAdminBtnActionPerformed

    private void organMatchingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organMatchingBtnActionPerformed

        for (Donor donor : donorList) {
            OrganMatchingWorkRequest organMatchingRequest = new OrganMatchingWorkRequest();
            organMatchingRequest.setDonor(donor);
            organMatchingRequest.setPatient(findDonorRequest.getPatientDetails());
            organMatchingRequest.setRequestDate(new Date());
            organMatchingRequest.setStatus("Request Raised");
            organMatchingRequest.setSender(account);

            Patient patient = findDonorRequest.getPatientDetails();
            Organization org = null;
            for (Network city : stateNetwork.getSubNetwork()) {
                if (patient.getPatientLocation().equalsIgnoreCase(city.getNetworkName())) {
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.OrganProcAndTransCenter.toString())) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof OPTELabOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(organMatchingRequest);
            }
            account.getWorkQueue().getWorkRequestList().add(organMatchingRequest);
        }
        findDonorRequest.setStatus("Sent for organ matching");
        
        JOptionPane.showMessageDialog(null, "Request sent for organ matching");
    }//GEN-LAST:event_organMatchingBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DonorDetailTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton forwardToCountryAdminBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noDonorLabel;
    private javax.swing.JButton organMatchingBtn;
    // End of variables declaration//GEN-END:variables
}
