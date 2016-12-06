/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.registrationcenter;

import Business.Enterprise.DonorRegistrationCenter;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorRegCenter.RegCenterDoctorOrganization;
import Business.Organization.Organization;
import Business.RegCenter.Donor;
import Business.RegCenter.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InitialScreeningTestWorkRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        HeartChkBox = new javax.swing.JCheckBox();
        EyesChkBox = new javax.swing.JCheckBox();
        Label3 = new javax.swing.JLabel();
        SignatureLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        DobTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddTextArea = new javax.swing.JTextArea();
        TelephoneTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        InitialScreeningBtn = new javax.swing.JButton();
        DonorAgeLabel = new javax.swing.JLabel();
        DonorAgeTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Organ Donar Registration Form");
        add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 41, 426, 49));

        PersonalDataLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PersonalDataLabel.setText("1. Your Personal Data");
        add(PersonalDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 108, 323, 33));

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NameLabel.setText("Name : ");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        DobLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DobLabel.setText("Date of Birth : ");
        add(DobLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 207, -1, -1));

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        GenderLabel.setText("Sex : ");
        add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 251, -1, -1));

        TelephoneLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TelephoneLabel.setText("Tel No : ");
        add(TelephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 433, -1, -1));

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddressLabel.setText("Address : ");
        add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 292, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        EmailLabel.setText("Email Id : ");
        add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 490, -1, -1));

        GenderBtnGrp.add(MaleRadioBtn);
        MaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MaleRadioBtn.setText("Male");
        add(MaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 247, -1, -1));

        GenderBtnGrp.add(FemaleRadioBtn);
        FemaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FemaleRadioBtn.setText("Female");
        add(FemaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 247, -1, -1));

        OrganWishLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        OrganWishLabel.setText("2. Your Wish ");
        add(OrganWishLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 543, -1, -1));

        Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Label.setText("I wish that after my death :-  ");
        add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 584, -1, -1));

        AllOrganLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AllOrganLabel.setText("a) All my organs and tissues :  ");
        add(AllOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 627, -1, -1));
        add(AllOrganCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 627, -1, -1));

        ORLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ORLabel.setText("b) OR ");
        add(ORLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 683, -1, -1));

        LungChkBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LungChkBox.setText("Lungs");
        add(LungChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 720, -1, -1));

        KidneyChkBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        KidneyChkBox.setText("Kidney");
        add(KidneyChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 679, -1, -1));

        LiverChkbox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LiverChkbox.setText("Liver");
        add(LiverChkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 761, -1, -1));

        HeartChkBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        HeartChkBox.setText("Heart");
        add(HeartChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 802, -1, -1));

        EyesChkBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        EyesChkBox.setText("Eyes");
        add(EyesChkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 674, -1, -1));

        Label3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Label3.setText("be removed for the purpose of transaplantation.");
        add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 847, -1, -1));

        SignatureLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SignatureLabel.setText("Signature");
        add(SignatureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 921, -1, -1));

        DateLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DateLabel.setText("Date");
        add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 920, -1, -1));

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 157, 248, -1));

        DobTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(DobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 204, 249, -1));

        AddTextArea.setColumns(20);
        AddTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddTextArea.setRows(5);
        jScrollPane1.setViewportView(AddTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 292, -1, 110));

        TelephoneTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(TelephoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 430, 246, -1));

        EmailTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 487, 246, -1));

        InitialScreeningBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        InitialScreeningBtn.setText("Proceed for Initial Screening >> ");
        InitialScreeningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitialScreeningBtnActionPerformed(evt);
            }
        });
        add(InitialScreeningBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 980, -1, 40));

        DonorAgeLabel.setText("Age : ");
        add(DonorAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, 40));
        add(DonorAgeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void InitialScreeningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitialScreeningBtnActionPerformed
          Donor donor = null;
          ArrayList<Organ> organList = new ArrayList<Organ>();
          if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.DonorRegCenter)){
             donor = ((DonorRegistrationCenter)enterprise).getDonorDirectory().addDonor();
          }
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
                  donor.setDonorAddress(AddTextArea.getText());
                  if(AllOrganCheckbox.isSelected()){
                      Organ kidney = new Organ();
                      kidney.setOrganName("Kidney");
                      kidney.setOrganLife(5);
                      
                      Organ liver = new Organ();
                      liver.setOrganName("Liver");
                      liver.setOrganLife(6);
                      
                      Organ heart = new Organ();
                      heart.setOrganName("Heart");
                      heart.setOrganLife(5);
                      
                      Organ Eyes = new Organ();
                      Eyes.setOrganName("Eyes");
                      Eyes.setOrganLife(5);
                      
                      Organ Lungs = new Organ();
                      Lungs.setOrganName("Lungs");
                      Lungs.setOrganLife(5);
                      
                      organList.add(Eyes);
                      organList.add(kidney);
                      organList.add(Lungs);
                      organList.add(liver);
                      organList.add(heart);
                  }else if(KidneyChkBox.isSelected()){
                      Organ kidney = new Organ();
                      kidney.setOrganName("Kidney");
                      kidney.setOrganLife(5);
                      organList.add(kidney);
                      
                  }else if(LungChkBox.isSelected()){
                      Organ lungs = new Organ();
                      lungs.setOrganName("Kidney");
                      lungs.setOrganLife(5);
                      organList.add(lungs);
                  }else if(LiverChkbox.isSelected()){
                      Organ liver = new Organ();
                      liver.setOrganName("Kidney");
                      liver.setOrganLife(5);
                      organList.add(liver);
                  }else if(HeartChkBox.isSelected()){
                      Organ heart = new Organ();
                      heart.setOrganName("Kidney");
                      heart.setOrganLife(5);
                      organList.add(heart);
                  }else if(EyesChkBox.isSelected()){
                      Organ eyes = new Organ();
                      eyes.setOrganName("Kidney");
                      eyes.setOrganLife(5);
                      organList.add(eyes);
                  } 
                                  
              } catch (ParseException ex) {
               Logger.getLogger(DonorRegistrationFormJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }
          InitialScreeningTestWorkRequest request = new InitialScreeningTestWorkRequest();
          request.setDonor(donor);
          request.setRequestDate(new Date());
          request.setSender(account);
          request.setStatus("Initial Screening for donor");
          
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
          }

    }//GEN-LAST:event_InitialScreeningBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddTextArea;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JCheckBox AllOrganCheckbox;
    private javax.swing.JLabel AllOrganLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DobLabel;
    private javax.swing.JTextField DobTextField;
    private javax.swing.JLabel DonorAgeLabel;
    private javax.swing.JTextField DonorAgeTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JCheckBox EyesChkBox;
    private javax.swing.JRadioButton FemaleRadioBtn;
    private javax.swing.ButtonGroup GenderBtnGrp;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JCheckBox HeartChkBox;
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
    private javax.swing.JLabel SignatureLabel;
    private javax.swing.JLabel TelephoneLabel;
    private javax.swing.JTextField TelephoneTextField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}