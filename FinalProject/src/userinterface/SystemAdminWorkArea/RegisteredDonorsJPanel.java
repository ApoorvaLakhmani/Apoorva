/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.RegCenter.Donor;
import Business.WorkQueue.InitialScreeningTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.registrationcenter.ViewDonorDetailsPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class RegisteredDonorsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form RegisteredDonorsJPanel
     */
    public RegisteredDonorsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();

    }

    public void populateTable() {
        DonorDetailsTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        DefaultTableModel model = (DefaultTableModel) DonorDetailsTable.getModel();
        model.setRowCount(0);

        for (Donor donor : system.getMasterDonorDirectory()) {
            Object[] row = new Object[4];
            row[0] = donor;
            row[1] = donor.getDonorName();
            row[2] = donor.getDonorAddress();
            Calendar cal = Calendar.getInstance();
            cal.setTime(donor.getDonorRegisterationDate());
            int year = cal.get(Calendar.YEAR);
            row[3] = year;
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
        DonorDetailsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        viewDonorDetailsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonorDetailsTable.setBackground(new java.awt.Color(204, 255, 255));
        DonorDetailsTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DonorDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Donor ID", "Donor Name", "Donor City", "Registered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DonorDetailsTable);
        if (DonorDetailsTable.getColumnModel().getColumnCount() > 0) {
            DonorDetailsTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, 696, 341));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 579, -1, -1));

        viewDonorDetailsBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewDonorDetailsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        viewDonorDetailsBtn.setForeground(new java.awt.Color(255, 153, 153));
        viewDonorDetailsBtn.setText("View Details");
        viewDonorDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonorDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDonorDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 149, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registered Donor List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 48, 282, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewDonorDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonorDetailsBtnActionPerformed
        int selectedRow = DonorDetailsTable.getSelectedRow();
        if (selectedRow >= 0) {
            Donor donor = (Donor) DonorDetailsTable.getValueAt(selectedRow, 0);
            ViewDonorDetailsPanel viewDonorDetails = new ViewDonorDetailsPanel(userProcessContainer, donor);
            userProcessContainer.add("ViewDonorDetailsPanel", viewDonorDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {

            JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewDonorDetailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DonorDetailsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDonorDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
