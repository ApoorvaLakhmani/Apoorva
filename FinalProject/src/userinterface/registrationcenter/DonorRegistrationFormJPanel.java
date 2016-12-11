/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.registrationcenter;

import Business.Enterprise.Enterprise;
import Business.Organization.DonorRegCenter.RegCenterDoctorOrganization;
import Business.Organization.Organization;
import Business.RegCenter.Donor;
import Business.RegCenter.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InitialScreeningTestWorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorRegistrationFormJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    
    /**
     * Creates new form DonarRegistrationJPanel
     */
    public DonorRegistrationFormJPanel(JPanel userProcessContainer,Enterprise enterprise,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        dateLabel.setText(String.valueOf(new Date()));
        KidneyChkBox.setEnabled(false);
         pancreasChkBox.setEnabled(false);
         LungChkBox.setEnabled(false);
         LiverChkbox.setEnabled(false);
         intestineChkBox.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderBtnGrp = new javax.swing.ButtonGroup();
        HeaderLabel = new javax.swing.JLabel();
        PersonalDataLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        DobLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        TelephoneLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        MaleRadioBtn = new javax.swing.JRadioButton();
        FemaleRadioBtn = new javax.swing.JRadioButton();
        OrganWishLabel = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        AllOrganLabel = new javax.swing.JLabel();
        AllOrganCheckbox = new javax.swing.JCheckBox();
        ORLabel = new javax.swing.JLabel();
        LungChkBox = new javax.swing.JCheckBox();
        KidneyChkBox = new javax.swing.JCheckBox();
        LiverChkbox = new javax.swing.JCheckBox();
        pancreasChkBox = new javax.swing.JCheckBox();
        intestineChkBox = new javax.swing.JCheckBox();
        Label3 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        DobTextField = new javax.swing.JTextField();
        TelephoneTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        InitialScreeningBtn = new javax.swing.JButton();
        DonorAgeLabel = new javax.swing.JLabel();
        DonorAgeTextField = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        dateLabel = new javax.swing.JLabel();
        donorCityTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Organ Donar Registration Form");
        add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 41, 426, 49));

        PersonalDataLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PersonalDataLabel.setText("1. Your Personal Data");
        add(PersonalDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 108, 323, 33));

        NameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NameLabel.setText("Name : ");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        DobLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DobLabel.setText("Date of Birth : ");
        add(DobLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 207, -1, -1));

        GenderLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        GenderLabel.setText("Gender : ");
        add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 251, -1, -1));

        TelephoneLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TelephoneLabel.setText("Tel No : ");
        add(TelephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        AddressLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        AddressLabel.setText("Address : ");
        add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 292, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        EmailLabel.setText("Email Id : ");
        add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        MaleRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        GenderBtnGrp.add(MaleRadioBtn);
        MaleRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        MaleRadioBtn.setText("Male");
        add(MaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 247, -1, -1));

        FemaleRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        GenderBtnGrp.add(FemaleRadioBtn);
        FemaleRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        FemaleRadioBtn.setText("Female");
        add(FemaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 247, -1, -1));

        OrganWishLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganWishLabel.setText("2. Your Wish ");
        add(OrganWishLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Label.setText("I wish that after my death :-  ");
        add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        AllOrganLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        AllOrganLabel.setText("a) All my organs and tissues :  ");
        add(AllOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        AllOrganCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllOrganCheckboxActionPerformed(evt);
            }
        });
        add(AllOrganCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        ORLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ORLabel.setText("b) OR 1 or more from the following: ");
        add(ORLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        LungChkBox.setBackground(new java.awt.Color(204, 255, 255));
        LungChkBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LungChkBox.setText("Lungs");
        add(LungChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, -1));

        KidneyChkBox.setBackground(new java.awt.Color(204, 255, 255));
        KidneyChkBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        KidneyChkBox.setText("Kidney");
        add(KidneyChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        LiverChkbox.setBackground(new java.awt.Color(204, 255, 255));
        LiverChkbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LiverChkbox.setText("Liver");
        add(LiverChkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, -1));

        pancreasChkBox.setBackground(new java.awt.Color(204, 255, 255));
        pancreasChkBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pancreasChkBox.setText("Pancreas");
        add(pancreasChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, -1));

        intestineChkBox.setBackground(new java.awt.Color(204, 255, 255));
        intestineChkBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        intestineChkBox.setText("Intestine");
        add(intestineChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        Label3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Label3.setText("be removed for the purpose of transaplantation.");
        add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        NameTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 157, 248, -1));

        DobTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(DobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 204, 249, -1));

        TelephoneTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(TelephoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 246, -1));

        EmailTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 246, -1));

        InitialScreeningBtn.setBackground(new java.awt.Color(0, 0, 0));
        InitialScreeningBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        InitialScreeningBtn.setForeground(new java.awt.Color(255, 153, 153));
        InitialScreeningBtn.setText("Proceed for Initial Screening >> ");
        InitialScreeningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitialScreeningBtnActionPerformed(evt);
            }
        });
        add(InitialScreeningBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 850, -1, 40));

        DonorAgeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DonorAgeLabel.setText("Age : ");
        add(DonorAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, 40));

        DonorAgeTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(DonorAgeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 220, 40));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 153));
        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 940, 150, 40));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, -1, -1));
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 920, 140, 30));
        add(donorCityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 250, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void InitialScreeningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitialScreeningBtnActionPerformed
          Donor donor = new Donor();
          ArrayList<Organ> organList = new ArrayList<Organ>();
//          if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.DonorRegCenter.toString())){
//             donor = ((DonorRegistrationCenter)enterprise).getDonorDirectory().addDonor();
//          }
          if(donor!=null){
              try {
                  SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
                  Date dateOfBirth = sdf.parse(DobTextField.getText());
                  donor.setDonorName(NameTextField.getText());
                  donor.setDonorAge(Integer.parseInt(DonorAgeTextField.getText()));
                  donor.setDateOfBirth(dateOfBirth);
                  if(MaleRadioBtn.isSelected()){
                      donor.setDonorGender("Male");
                  }
                  if(FemaleRadioBtn.isSelected()){
                      donor.setDonorGender("Female");
                  }
                  donor.setDonorPhoneNumber(Integer.parseInt(TelephoneTextField.getText()));
                  donor.setDonorEmailId(EmailTextField.getText());
                  donor.setDonorAddress(donorCityTextField.getText());
                  if(AllOrganCheckbox.isSelected()){
                      Organ kidney = new Organ();
                      kidney.setOrganName("Kidney");
                      kidney.setOrganLife(5);
                      
                      Organ liver = new Organ();
                      liver.setOrganName("Liver");
                      liver.setOrganLife(6);
                      
                      Organ pancreas = new Organ();
                      pancreas.setOrganName("Pancreas");
                      pancreas.setOrganLife(5);
                      
                      Organ intestine = new Organ();
                      intestine.setOrganName("Intestine");
                      intestine.setOrganLife(5);
                      
                      Organ lungs = new Organ();
                      lungs.setOrganName("Lungs");
                      lungs.setOrganLife(5);
                      
                      organList.add(pancreas);
                      organList.add(kidney);
                      organList.add(lungs);
                      organList.add(liver);
                      organList.add(pancreas);
                  }else if(KidneyChkBox.isSelected()){
                      Organ kidney = new Organ();
                      kidney.setOrganName("Kidney");
                      kidney.setOrganLife(5);
                      organList.add(kidney);
                      
                  }else if(LungChkBox.isSelected()){
                      Organ lungs = new Organ();
                      lungs.setOrganName("Lungs");
                      lungs.setOrganLife(5);
                      organList.add(lungs);
                  }else if(LiverChkbox.isSelected()){
                      Organ liver = new Organ();
                      liver.setOrganName("Liver");
                      liver.setOrganLife(5);
                      organList.add(liver);
                  }else if(pancreasChkBox.isSelected()){
                      Organ pancreas = new Organ();
                      pancreas.setOrganName("Pancreas");
                      pancreas.setOrganLife(5);
                      organList.add(pancreas);
                  }else if(intestineChkBox.isSelected()){
                      Organ intestines = new Organ();
                      intestines.setOrganName("Intestines");
                      intestines.setOrganLife(5);
                      organList.add(intestines);
                  } 
                  donor.setOrganDonateList(organList);
                                  
              } catch (ParseException ex) {
              JOptionPane.showMessageDialog(null, "Please enter valid information in the form");
              }
              
          }
          InitialScreeningTestWorkRequest request = new InitialScreeningTestWorkRequest();
          request.setDonor(donor);
          request.setRequestDate(new Date());
          request.setSender(account);
          request.setStatus("Initial Screening pending");
          
          Organization doctorOrganization = null;
          for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
              if(organization instanceof RegCenterDoctorOrganization){
                  doctorOrganization = organization;
                  break;
              }
          }
          if(doctorOrganization!=null){
              doctorOrganization.getWorkQueue().getWorkRequestList().add(request);
              account.getWorkQueue().getWorkRequestList().add(request);
              
              JOptionPane.showMessageDialog(null, "Request for initial screening raised");
              clearFields();
          }

    }//GEN-LAST:event_InitialScreeningBtnActionPerformed
    private void clearFields() {
        NameTextField.setText("");
        DonorAgeTextField.setText("");
        DobTextField.setText("");
        MaleRadioBtn.setSelected(false);
        FemaleRadioBtn.setSelected(false);
        TelephoneTextField.setText("");
        donorCityTextField.setText("");
        EmailTextField.setText("");
        KidneyChkBox.setSelected(false);
        pancreasChkBox.setSelected(false);
        LungChkBox.setSelected(false);
        LiverChkbox.setSelected(false);
        intestineChkBox.setSelected(false);
        AllOrganCheckbox.setSelected(false);

    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        KidneyChkBox.setEnabled(true);
         pancreasChkBox.setEnabled(true);
         LungChkBox.setEnabled(true);
         LiverChkbox.setEnabled(true);
         intestineChkBox.setEnabled(true);
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void AllOrganCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllOrganCheckboxActionPerformed
        KidneyChkBox.setEnabled(false);
         pancreasChkBox.setEnabled(false);
         LungChkBox.setEnabled(false);
         LiverChkbox.setEnabled(false);
         intestineChkBox.setEnabled(false);
    }//GEN-LAST:event_AllOrganCheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JCheckBox AllOrganCheckbox;
    private javax.swing.JLabel AllOrganLabel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel DobLabel;
    private javax.swing.JTextField DobTextField;
    private javax.swing.JLabel DonorAgeLabel;
    private javax.swing.JTextField DonorAgeTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleRadioBtn;
    private javax.swing.ButtonGroup GenderBtnGrp;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JButton InitialScreeningBtn;
    private javax.swing.JCheckBox KidneyChkBox;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label3;
    private javax.swing.JCheckBox LiverChkbox;
    private javax.swing.JCheckBox LungChkBox;
    private javax.swing.JRadioButton MaleRadioBtn;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel ORLabel;
    private javax.swing.JLabel OrganWishLabel;
    private javax.swing.JLabel PersonalDataLabel;
    private javax.swing.JLabel TelephoneLabel;
    private javax.swing.JTextField TelephoneTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField donorCityTextField;
    private javax.swing.JCheckBox intestineChkBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox pancreasChkBox;
    // End of variables declaration//GEN-END:variables
}
