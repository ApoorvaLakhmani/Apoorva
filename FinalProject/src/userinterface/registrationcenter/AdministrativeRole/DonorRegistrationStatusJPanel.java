/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.registrationcenter.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.registrationcenter.DonorRegistrationFormJPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorRegistrationStatusJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    private Network stateNetwork;
    
    /**
     * Creates new form DonorRegistrationStatusJPanel
     */
    public DonorRegistrationStatusJPanel(JPanel userProcessContainer,Enterprise enterprise,UserAccount account,EcoSystem system,Network stateNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.system = system;
        this.stateNetwork = stateNetwork;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NewRegBtn = new javax.swing.JButton();
        RegStatusBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 499, 157, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        NewRegBtn.setBackground(new java.awt.Color(0, 0, 0));
        NewRegBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NewRegBtn.setForeground(new java.awt.Color(255, 153, 153));
        NewRegBtn.setText("New Registration");
        NewRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRegBtnActionPerformed(evt);
            }
        });

        RegStatusBtn.setBackground(new java.awt.Color(0, 0, 0));
        RegStatusBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        RegStatusBtn.setForeground(new java.awt.Color(255, 153, 153));
        RegStatusBtn.setText("Pending Registration Status");
        RegStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegStatusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewRegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegStatusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(NewRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(RegStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 162, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void RegStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegStatusBtnActionPerformed
        DonorRequestStatusJPanel donorReqStatus = new DonorRequestStatusJPanel(userProcessContainer,enterprise,account,system,stateNetwork);
        userProcessContainer.add("DonorRequestStatusJPanel", donorReqStatus);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RegStatusBtnActionPerformed

    private void NewRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRegBtnActionPerformed
        DonorRegistrationFormJPanel donorRegRequest = new DonorRegistrationFormJPanel(userProcessContainer,enterprise,account,stateNetwork);
        userProcessContainer.add("DonorRegistrationFormJPanel", donorRegRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_NewRegBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewRegBtn;
    private javax.swing.JButton RegStatusBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
