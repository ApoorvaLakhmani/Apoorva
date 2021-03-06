/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.RegCenter.Donor;
import Business.RegCenter.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FindDonorRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class ViewDonorRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private Network stateNetwork;
    private FindDonorRequest request;

    /**
     * Creates new form ViewDonorRequestJPanel
     */
    public ViewDonorRequestJPanel(JPanel userProcessContainer, UserAccount account, Network stateNetwork, EcoSystem system, FindDonorRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.stateNetwork = stateNetwork;
        this.request = request;

        populateData();

        if (reqStatusTextField.getText().equalsIgnoreCase("Completed") || reqStatusTextField.getText().equalsIgnoreCase("Closed")) {
            FindDonorBtn.setEnabled(false);
        }
    }

    public void populateData() {
        requestIDTExtField.setText(String.valueOf(request.getRequestID()));
        PatientIDTextField.setText(String.valueOf(request.getPatientDetails().getPatientID()));
        PatientNameField.setText(request.getPatientDetails().getPatientName());
        PatientAgeTextField.setText(String.valueOf(request.getPatientDetails().getPatientAge()));
        PatientLocTextField.setText(request.getPatientDetails().getPatientLocation());
        ContactNoTextField.setText(String.valueOf(request.getPatientDetails().getPatientContactNumber()));
        PatientBloodTypeTextField.setText(request.getPatientDetails().getBloodType());
        PatientWeightTextField.setText(String.valueOf(request.getPatientDetails().getWeight()));
        OrganNeededTextField.setText(request.getPatientDetails().getOrganNeeded().getOrganName());
        OrganSizeTextField.setText(String.valueOf(request.getPatientDetails().getOrganNeeded().getOrganSize()));
        OtherMedicalConditionTextArea.setText(request.getPatientDetails().getOtherMedicalCondition());
        reqStatusTextField.setText(request.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FindDonorBtn = new javax.swing.JButton();
        OrganSizeTextField = new javax.swing.JTextField();
        PatientLocLabel = new javax.swing.JLabel();
        PatientLocTextField = new javax.swing.JTextField();
        MedicalCondLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OtherMedicalConditionTextArea = new javax.swing.JTextArea();
        patientContactNoLabel = new javax.swing.JLabel();
        patientidlabel = new javax.swing.JLabel();
        ContactNoTextField = new javax.swing.JTextField();
        patientnamelabel = new javax.swing.JLabel();
        OrganNeededLabel = new javax.swing.JLabel();
        patientagelabel = new javax.swing.JLabel();
        PatientBloodTypeLabel = new javax.swing.JLabel();
        PatientWeightLabel = new javax.swing.JLabel();
        OrganSizeLabel = new javax.swing.JLabel();
        PatientIDTextField = new javax.swing.JTextField();
        PatientNameField = new javax.swing.JTextField();
        PatientAgeTextField = new javax.swing.JTextField();
        PatientBloodTypeTextField = new javax.swing.JTextField();
        PatientWeightTextField = new javax.swing.JTextField();
        OrganNeededTextField = new javax.swing.JTextField();
        patientidlabel1 = new javax.swing.JLabel();
        requestIDTExtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reqStatusTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        FindDonorBtn.setBackground(new java.awt.Color(0, 0, 0));
        FindDonorBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        FindDonorBtn.setForeground(new java.awt.Color(255, 153, 153));
        FindDonorBtn.setText("Find Donor");
        FindDonorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindDonorBtnActionPerformed(evt);
            }
        });

        OrganSizeTextField.setEditable(false);
        OrganSizeTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        PatientLocLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PatientLocLabel.setText("Location:");

        PatientLocTextField.setEditable(false);
        PatientLocTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        MedicalCondLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        MedicalCondLabel.setText("Other Medical Conditions:");

        OtherMedicalConditionTextArea.setEditable(false);
        OtherMedicalConditionTextArea.setColumns(20);
        OtherMedicalConditionTextArea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        OtherMedicalConditionTextArea.setRows(5);
        jScrollPane1.setViewportView(OtherMedicalConditionTextArea);

        patientContactNoLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        patientContactNoLabel.setText("Contact Number :");

        patientidlabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        patientidlabel.setText("Patient ID:");

        ContactNoTextField.setEditable(false);
        ContactNoTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        patientnamelabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        patientnamelabel.setText("Patient Name:");

        OrganNeededLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganNeededLabel.setText("Organ affected:");

        patientagelabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        patientagelabel.setText("Age:");

        PatientBloodTypeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PatientBloodTypeLabel.setText("Blood type:");

        PatientWeightLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PatientWeightLabel.setText("Body Weight:");

        OrganSizeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganSizeLabel.setText("Organ size:");

        PatientIDTextField.setEditable(false);
        PatientIDTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        PatientNameField.setEditable(false);
        PatientNameField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        PatientAgeTextField.setEditable(false);
        PatientAgeTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        PatientBloodTypeTextField.setEditable(false);
        PatientBloodTypeTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        PatientWeightTextField.setEditable(false);
        PatientWeightTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        OrganNeededTextField.setEditable(false);
        OrganNeededTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        patientidlabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        patientidlabel1.setText("Request ID:");

        requestIDTExtField.setEditable(false);
        requestIDTExtField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 153, 153));
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Request Status : ");

        reqStatusTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientidlabel1)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestIDTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientidlabel)
                            .addComponent(patientnamelabel)
                            .addComponent(patientagelabel)
                            .addComponent(PatientLocLabel)
                            .addComponent(patientContactNoLabel)
                            .addComponent(PatientBloodTypeLabel)
                            .addComponent(PatientWeightLabel)
                            .addComponent(OrganNeededLabel)
                            .addComponent(OrganSizeLabel)
                            .addComponent(MedicalCondLabel))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PatientLocTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(PatientAgeTextField)
                                        .addComponent(PatientNameField)
                                        .addComponent(PatientIDTextField)
                                        .addComponent(ContactNoTextField)
                                        .addComponent(PatientBloodTypeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PatientWeightTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(OrganNeededTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(OrganSizeTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(reqStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(213, 213, 213)
                        .addComponent(FindDonorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(requestIDTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patientidlabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reqStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientidlabel)
                    .addComponent(PatientIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientnamelabel)
                    .addComponent(PatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientagelabel)
                    .addComponent(PatientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientLocLabel)
                    .addComponent(PatientLocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientContactNoLabel)
                    .addComponent(ContactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientBloodTypeLabel)
                    .addComponent(PatientBloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientWeightLabel)
                    .addComponent(PatientWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrganNeededLabel)
                    .addComponent(OrganNeededTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrganSizeLabel)
                    .addComponent(OrganSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(MedicalCondLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(FindDonorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FindDonorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindDonorBtnActionPerformed
        ArrayList<Donor> foundDonorList = new ArrayList<>();
        //OrganMatchingWorkRequest organMatchingRequest = new OrganMatchingWorkRequest();

        if (request.getDonor().getDonorName() == null) {
            //Find a Donor 
            Donor foundDonor = null;
            for (Donor donor : stateNetwork.getDonorDirectory().getDonorList()) {
                Boolean organTest = false;
                Boolean bloodTyping = false;
                Boolean bmiTest = false;

                if (donor.isAvailable()) {
                    for (Organ organ : donor.getOrganDonateList()) {
                        if (request.getPatientDetails().getOrganNeeded().getOrganName().equals(organ.getOrganName())) {
                            organTest = true;
                            break;

                        }
                    }
                    String donorBloodGroup = donor.getHealthDetails().getBloodGroup();
                    String patientBloodGroup = request.getPatientDetails().getBloodType();
                    bloodTyping = bloodTest(donorBloodGroup, patientBloodGroup);

                    if (Math.abs(donor.getHealthDetails().getBmi() - request.getPatientDetails().getBmi()) < 5) {
                        bmiTest = true;
                    }

                    if (bloodTyping == true && organTest == true && bmiTest == true) {
                        foundDonor = donor;
                        foundDonorList.add(foundDonor);
                    }

                }

            }
            DonorFoundJPanel donorFound = new DonorFoundJPanel(userProcessContainer, account, system, request, stateNetwork, foundDonorList);
            userProcessContainer.add("DonorFoundJPanel", donorFound);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_FindDonorBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StateNetworkManageRequestJPanel sysAdminwjp = (StateNetworkManageRequestJPanel) component;
        sysAdminwjp.populatetable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private Boolean bloodTest(String donorBloodGroup, String patientBloodGroup) {

        if (donorBloodGroup.equals("O") && (patientBloodGroup.equals("O") || patientBloodGroup.equals("A") || patientBloodGroup.equals("B") || patientBloodGroup.equals("AB"))) {
            return true;
        } else if (donorBloodGroup.equals("A") && (patientBloodGroup.equals("A") || patientBloodGroup.equals("AB"))) {
            return true;
        } else if (donorBloodGroup.equals("B") && (patientBloodGroup.equals("B") || patientBloodGroup.equals("AB"))) {
            return true;
        } else if (donorBloodGroup.equals("AB") && patientBloodGroup.equals("A")) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactNoTextField;
    private javax.swing.JButton FindDonorBtn;
    private javax.swing.JLabel MedicalCondLabel;
    private javax.swing.JLabel OrganNeededLabel;
    private javax.swing.JTextField OrganNeededTextField;
    private javax.swing.JLabel OrganSizeLabel;
    private javax.swing.JTextField OrganSizeTextField;
    private javax.swing.JTextArea OtherMedicalConditionTextArea;
    private javax.swing.JTextField PatientAgeTextField;
    private javax.swing.JLabel PatientBloodTypeLabel;
    private javax.swing.JTextField PatientBloodTypeTextField;
    private javax.swing.JTextField PatientIDTextField;
    private javax.swing.JLabel PatientLocLabel;
    private javax.swing.JTextField PatientLocTextField;
    private javax.swing.JTextField PatientNameField;
    private javax.swing.JLabel PatientWeightLabel;
    private javax.swing.JTextField PatientWeightTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientContactNoLabel;
    private javax.swing.JLabel patientagelabel;
    private javax.swing.JLabel patientidlabel;
    private javax.swing.JLabel patientidlabel1;
    private javax.swing.JLabel patientnamelabel;
    private javax.swing.JTextField reqStatusTextField;
    private javax.swing.JTextField requestIDTExtField;
    // End of variables declaration//GEN-END:variables
}
