/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

import Business.EcoSystem;
<<<<<<< HEAD
import Business.RegCenter.Donor;
=======
import Business.Organization.Organization;
>>>>>>> db0246cf3c64af34401c3e2aec62ac1b0c71f51b
import Business.UserAccount.UserAccount;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorFoundJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private ArrayList<Donor> donorList;
    /**
     * Creates new form DonorFoundJPanel
     */
    public DonorFoundJPanel() {
        initComponents();
    }

    DonorFoundJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system,ArrayList<Donor> donorList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.donorList = donorList;
        populateTable();
    }
    
    public void populateTable(){
        DonorDetailTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) DonorDetailTable.getModel();
        model.setRowCount(0);
        
        for(Donor donor : donorList){
           Object[] row = new Object[2];
           row[0] = donor;
           row[1] = donor.getDonorName();
           
           model.addRow(row);
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
        LegalDeptBtn = new javax.swing.JButton();

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

        LegalDeptBtn.setText("Forward to legal Department");
        LegalDeptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegalDeptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(LegalDeptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(LegalDeptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LegalDeptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegalDeptBtnActionPerformed
<<<<<<< HEAD
        
=======
//        String message = messageJTextField.getText();
//        
//        LabTestWorkRequest request = new LabTestWorkRequest();
//        request.setMessage(message);
//        request.setSender(userAccount);
//        request.setStatus("Sent");
//        
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof LabOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkQueue().getWorkRequestList().add(request);
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
//        }
>>>>>>> db0246cf3c64af34401c3e2aec62ac1b0c71f51b
    }//GEN-LAST:event_LegalDeptBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DonorDetailTable;
    private javax.swing.JButton LegalDeptBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
