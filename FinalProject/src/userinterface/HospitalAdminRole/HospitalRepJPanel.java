/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Patient;
import Business.Network.Network;
import Business.Organization.Hospital.HospitalRepOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.StateNetworkAdminRole.ViewStatePatientsStateJPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class HospitalRepJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    private Organization organization;

    /**
     * Creates new form HospitalRepJPanel
     */
    public HospitalRepJPanel(JPanel userProcessContainer,UserAccount userAccount,Network network,EcoSystem system,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system; 
        this.network = network;
        this.userAccount = userAccount;
        this.organization=organization;
       // populatePatientList() ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RaiseRequestBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Work Area");

        RaiseRequestBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RaiseRequestBtn.setText("View and Raise Donor requests>>");
        RaiseRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaiseRequestBtnActionPerformed(evt);
            }
        });

        jButton1.setText("View Patient List >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RaiseRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addComponent(RaiseRequestBtn)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RaiseRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaiseRequestBtnActionPerformed
        RaiseAndViewMyRequests raiseAndViewRequest = new RaiseAndViewMyRequests(userProcessContainer,userAccount, network,system);
        userProcessContainer.add("RaiseAndViewMyRequests",raiseAndViewRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RaiseRequestBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ViewStatePatientsStateJPanel viewStatePatientsStateJPanel = new ViewStatePatientsStateJPanel(userProcessContainer,((HospitalRepOrganization) organization).getPatientDirectory());
        userProcessContainer.add("ViewStatePatientsStateJPanel",viewStatePatientsStateJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_jButton1ActionPerformed

     public void populatePatientList() {
        for (Network country : system.getNetworkList()) {
            for (Network stateNetwork : country.getSubNetwork()) {
                for (Network cityNetwork : stateNetwork.getSubNetwork()) {
                    if (cityNetwork.getNetworkName().equals(network.getNetworkName())) {
                        for (Patient patient : stateNetwork.getNetworkPatientDirectory().getPatientDirectory()) {
                            if (cityNetwork.getNetworkName().trim().equals("Syracuse") && (patient.getPatientLocation().trim().equals("Syracuse"))) {
                                for (Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                                    if (enterprise instanceof HospitalEnterprise) {
                                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization instanceof HospitalRepOrganization) {
                                                ((HospitalRepOrganization) organization).getPatientDirectory().addPatient(patient);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RaiseRequestBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
