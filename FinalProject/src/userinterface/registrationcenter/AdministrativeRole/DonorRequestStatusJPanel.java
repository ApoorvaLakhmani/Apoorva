/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.registrationcenter.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.DonorRegistrationCenter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InitialScreeningTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorRequestStatusJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    private Network stateNetwork;
    /**
     * Creates new form DonorRequestStatusJPanel
     */
    public DonorRequestStatusJPanel(JPanel userProcessContainers,Enterprise enterprise,UserAccount account,EcoSystem system,Network stateNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainers;
        this.enterprise = enterprise;
        this.account = account;
        this.system = system;
        this.stateNetwork = stateNetwork;
        
        populateTable();
    }
    
    public void populateTable(){
        DononrRegReqTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) DononrRegReqTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[2];
            row[0] = request;
            row[1] = request.getStatus();
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
        DononrRegReqTable = new javax.swing.JTable();
        RegisterDonorBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        DononrRegReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DononrRegReqTable);

        RegisterDonorBtn.setText("Register Donor");
        RegisterDonorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterDonorBtnActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(RegisterDonorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(RegisterDonorBtn)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterDonorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterDonorBtnActionPerformed
        
       int selectedRow= DononrRegReqTable.getSelectedRow();
       if (selectedRow>=0)
       {
         InitialScreeningTestWorkRequest request= (InitialScreeningTestWorkRequest)DononrRegReqTable.getValueAt(selectedRow, 0);
         if(request.getStatus().equals("Initial Screening Done")){
             system.getMasterDonorDirectory().add(request.getDonor());
             stateNetwork.getDonorDirectory().addDonor(request.getDonor());
             ((DonorRegistrationCenter)enterprise).getDonorDirectory().addDonor(request.getDonor());
         }else{
             if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.DonorRegCenter)){
                 ((DonorRegistrationCenter)enterprise).getDonorDirectory().deleteDonor(request.getDonor());
             }
         }
       }
       else{
           
           JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_RegisterDonorBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DononrRegReqTable;
    private javax.swing.JButton RegisterDonorBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
