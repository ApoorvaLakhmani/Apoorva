/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha
 */
public class RaiseAndViewMyRequests extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    
    /**
     * Creates new form RaiseAndViewMyRequests
     */
    public RaiseAndViewMyRequests(JPanel userProcessContainer,UserAccount userAccount,Network network,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network = network;
        this.system=system; 
        this.userAccount = userAccount;
        populateTable();
    }
    
    public void populateTable(){
        RequestDetailsTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        DefaultTableModel model = (DefaultTableModel) RequestDetailsTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = request.getRequestID();
            row[1] = request.getRequestDate();
            row[5] = request.getStatus();
            //String result = ((LabTestWorkRequest) request).getTestResult();
            //row[3] = result == null ? "Waiting" : result;
            
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

        RaiseReqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestDetailsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RaiseReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        RaiseReqBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        RaiseReqBtn.setForeground(new java.awt.Color(255, 153, 153));
        RaiseReqBtn.setText("Raise new request>>");
        RaiseReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaiseReqBtnActionPerformed(evt);
            }
        });
        add(RaiseReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 480, -1, -1));

        RequestDetailsTable.setBackground(new java.awt.Color(204, 255, 255));
        RequestDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RequestDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Request Date", "Patient ID", "Patient Name", "Organ", "Status", "Process Completion date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestDetailsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 171, 970, 192));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel1.setText("My Work Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 86, 201, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void RaiseReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaiseReqBtnActionPerformed
       RaiseNewRequestPanel raiseNewRequest = new RaiseNewRequestPanel(userProcessContainer,userAccount,network,system);
       userProcessContainer.add("RaiseAndViewMyRequests",raiseNewRequest);
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_RaiseReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RaiseReqBtn;
    private javax.swing.JTable RequestDetailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
