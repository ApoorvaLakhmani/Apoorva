/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.registrationcenter.DoctorRole;

import Business.WorkQueue.InitialScreeningTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class InitialScreeningJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private InitialScreeningTestWorkRequest request;

    /**
     * Creates new form InitialScreeningJPanel
     */
    public InitialScreeningJPanel(JPanel userProcessContainer,InitialScreeningTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request=request;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BloodPressureBtnGrp = new javax.swing.ButtonGroup();
        DiabetesBtnGrp = new javax.swing.ButtonGroup();
        InfectionBtnGrp = new javax.swing.ButtonGroup();
        OrganDiseaseBtnGrp = new javax.swing.ButtonGroup();
        psychiatricBtnGrp = new javax.swing.ButtonGroup();
        CancerBtnGrp = new javax.swing.ButtonGroup();
        HIVBtnGrp = new javax.swing.ButtonGroup();
        HeaderLabel = new javax.swing.JLabel();
        SubHeaderLabel = new javax.swing.JLabel();
        BloodGrpLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        bmiLabel = new javax.swing.JLabel();
        HighBPLabel = new javax.swing.JLabel();
        DiabetesLabel = new javax.swing.JLabel();
        InfectionLabel = new javax.swing.JLabel();
        OrganDiseaseLabel = new javax.swing.JLabel();
        psychiatriclabel = new javax.swing.JLabel();
        HeightTextField = new javax.swing.JTextField();
        WeightTextField = new javax.swing.JTextField();
        BMITextField = new javax.swing.JTextField();
        BPYesRadioBtn = new javax.swing.JRadioButton();
        BPNoRadioBtn = new javax.swing.JRadioButton();
        DiabetesYesRadioBtn = new javax.swing.JRadioButton();
        DiabetesNoRadioBtn = new javax.swing.JRadioButton();
        InfectionNoRadioBtn = new javax.swing.JRadioButton();
        infectionYesRadioBtn = new javax.swing.JRadioButton();
        OrganDiseaseNoRadioBtn = new javax.swing.JRadioButton();
        OrganDiseaseYesBtn = new javax.swing.JRadioButton();
        psychiatricNoRadioBtn = new javax.swing.JRadioButton();
        psychiatricYesRadioBtn = new javax.swing.JRadioButton();
        SubmitBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CancerYesRadioBtn = new javax.swing.JRadioButton();
        CancerNoRadioBtn = new javax.swing.JRadioButton();
        HIVYesRadioBtn = new javax.swing.JRadioButton();
        HIVNoRadioBtn = new javax.swing.JRadioButton();
        donorBloodTypeComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Initial Screening ");
        add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 41, 426, 49));

        SubHeaderLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        SubHeaderLabel.setText("Health Details : ");
        add(SubHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 92, 262, 36));

        BloodGrpLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BloodGrpLabel.setText("Blood Group : ");
        add(BloodGrpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 149, -1, -1));

        HeightLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HeightLabel.setText("Height(cm) : ");
        add(HeightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 195, -1, -1));

        WeightLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        WeightLabel.setText("Weight(Kgs) : ");
        add(WeightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 241, -1, -1));

        bmiLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bmiLabel.setText("BMI : ");
        add(bmiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 288, -1, -1));

        HighBPLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HighBPLabel.setText("High Blood Pressure : ");
        add(HighBPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 338, -1, -1));

        DiabetesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DiabetesLabel.setText("Diabetes : ");
        add(DiabetesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 393, -1, -1));

        InfectionLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        InfectionLabel.setText("Any Infectious Disease : ");
        add(InfectionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 434, -1, -1));

        OrganDiseaseLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganDiseaseLabel.setText("Family History of Kidney or Liver disease : ");
        add(OrganDiseaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 485, -1, -1));

        psychiatriclabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        psychiatriclabel.setText("Any active psychiatric disorders : ");
        add(psychiatriclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 532, -1, -1));

        HeightTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(HeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 189, 140, -1));

        WeightTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        WeightTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WeightTextFieldFocusLost(evt);
            }
        });
        add(WeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 238, 140, -1));

        BMITextField.setEditable(false);
        BMITextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(BMITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 285, 140, -1));

        BPYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        BloodPressureBtnGrp.add(BPYesRadioBtn);
        BPYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BPYesRadioBtn.setText("Yes");
        add(BPYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        BPNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        BloodPressureBtnGrp.add(BPNoRadioBtn);
        BPNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BPNoRadioBtn.setText("No");
        add(BPNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        DiabetesYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        DiabetesBtnGrp.add(DiabetesYesRadioBtn);
        DiabetesYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DiabetesYesRadioBtn.setText("Yes");
        add(DiabetesYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        DiabetesNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        DiabetesBtnGrp.add(DiabetesNoRadioBtn);
        DiabetesNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DiabetesNoRadioBtn.setText("No");
        add(DiabetesNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        InfectionNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        InfectionBtnGrp.add(InfectionNoRadioBtn);
        InfectionNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        InfectionNoRadioBtn.setText("No");
        add(InfectionNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 430, -1, -1));

        infectionYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        InfectionBtnGrp.add(infectionYesRadioBtn);
        infectionYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        infectionYesRadioBtn.setText("Yes");
        add(infectionYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 430, -1, -1));

        OrganDiseaseNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        OrganDiseaseBtnGrp.add(OrganDiseaseNoRadioBtn);
        OrganDiseaseNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganDiseaseNoRadioBtn.setText("No");
        add(OrganDiseaseNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 481, -1, -1));

        OrganDiseaseYesBtn.setBackground(new java.awt.Color(204, 255, 255));
        OrganDiseaseBtnGrp.add(OrganDiseaseYesBtn);
        OrganDiseaseYesBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        OrganDiseaseYesBtn.setText("Yes");
        add(OrganDiseaseYesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 481, -1, -1));

        psychiatricNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        psychiatricBtnGrp.add(psychiatricNoRadioBtn);
        psychiatricNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        psychiatricNoRadioBtn.setText("No");
        add(psychiatricNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        psychiatricYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        psychiatricBtnGrp.add(psychiatricYesRadioBtn);
        psychiatricYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        psychiatricYesRadioBtn.setText("Yes");
        add(psychiatricYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        SubmitBtn.setBackground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 153, 153));
        SubmitBtn.setText("Submit ");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 693, 110, 40));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 153));
        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 709, 110, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Cancer test : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("HIV test : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        CancerYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        CancerBtnGrp.add(CancerYesRadioBtn);
        CancerYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CancerYesRadioBtn.setText("Positive");
        add(CancerYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        CancerNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        CancerBtnGrp.add(CancerNoRadioBtn);
        CancerNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CancerNoRadioBtn.setText("Negative");
        add(CancerNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        HIVYesRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        HIVBtnGrp.add(HIVYesRadioBtn);
        HIVYesRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HIVYesRadioBtn.setText("Positive");
        add(HIVYesRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        HIVNoRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        HIVBtnGrp.add(HIVNoRadioBtn);
        HIVNoRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        HIVNoRadioBtn.setText("Negative");
        add(HIVNoRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

        donorBloodTypeComboBox.setBackground(new java.awt.Color(204, 255, 255));
        donorBloodTypeComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        donorBloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select", "O", "A", "B", "AB" }));
        add(donorBloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        request.getDonor().getHealthDetails().setBloodGroup(donorBloodTypeComboBox.getSelectedItem().toString());
        request.getDonor().getHealthDetails().setHeight(Integer.parseInt(HeightTextField.getText()));
        request.getDonor().getHealthDetails().setWeight(Integer.parseInt(WeightTextField.getText()));
        if(BPYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasHighBloodPressure(true);
        }else{
            request.getDonor().getHealthDetails().setHasHighBloodPressure(false);
        }
        if(DiabetesYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasDiabetes(true);
        }else{
            request.getDonor().getHealthDetails().setHasDiabetes(false);
        }
        if(infectionYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasInfectiousDisease(true);
        }else{
            request.getDonor().getHealthDetails().setHasInfectiousDisease(false);
        }
        if(infectionYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasInfectiousDisease(true);
        }else{
            request.getDonor().getHealthDetails().setHasInfectiousDisease(false);
        }
        if(psychiatricYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setPsychiatricDisease(true);
        }else{
            request.getDonor().getHealthDetails().setPsychiatricDisease(false);
        }
        if(CancerYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasCancer(true);
        }else{
            request.getDonor().getHealthDetails().setHasCancer(false);
        }
        if(HIVYesRadioBtn.isSelected()){
            request.getDonor().getHealthDetails().setHasHIV(true);
        }else{
            request.getDonor().getHealthDetails().setHasHIV(false);
        }
        
//        for(Organ organ : request.getDonor().getOrganDonateList()){
//            if (organ.getOrganName().equals("Kidney")){
//                organ.setOrganSize(Double.parseDouble(kidneySizeTextField.getText()));
//            }
//            else if (organ.getOrganName().equals("Pancreas")){
//                   organ.setOrganSize(Double.parseDouble(pancreasSizeTextField.getText()));
//            }
//             else if (organ.getOrganName().equals("Intestines")){
//                organ.setOrganSize(Double.parseDouble(intestineSizeTextField.getText()));
//            }
//            else if (organ.getOrganName().equals("Lungs")){
//                organ.setOrganSize(Double.parseDouble(lungSizeTextField.getText()));
//            }
//            else if (organ.getOrganName().equals("Liver")){
//               organ.setOrganSize(Double.parseDouble(liverSizeTextField.getText()));
//            }
//               
//        }
         
        request.setStatus("Initial Screening Done");
        request.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Screening complete!");
        
        donorBloodTypeComboBox.setSelectedIndex(0);
        HeightTextField.setText("");
        WeightTextField.setText("");
        BMITextField.setText("");
        
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel sysAdminwjp = (DoctorWorkAreaJPanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void WeightTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WeightTextFieldFocusLost
       Integer height = Integer.parseInt(HeightTextField.getText())*Integer.parseInt(HeightTextField.getText());
       Float weight = Float.parseFloat(WeightTextField.getText());
       float bmi = (weight/(height))*10000;
       
       BMITextField.setText(String.valueOf(bmi));
    }//GEN-LAST:event_WeightTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BMITextField;
    private javax.swing.JRadioButton BPNoRadioBtn;
    private javax.swing.JRadioButton BPYesRadioBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BloodGrpLabel;
    private javax.swing.ButtonGroup BloodPressureBtnGrp;
    private javax.swing.ButtonGroup CancerBtnGrp;
    private javax.swing.JRadioButton CancerNoRadioBtn;
    private javax.swing.JRadioButton CancerYesRadioBtn;
    private javax.swing.ButtonGroup DiabetesBtnGrp;
    private javax.swing.JLabel DiabetesLabel;
    private javax.swing.JRadioButton DiabetesNoRadioBtn;
    private javax.swing.JRadioButton DiabetesYesRadioBtn;
    private javax.swing.ButtonGroup HIVBtnGrp;
    private javax.swing.JRadioButton HIVNoRadioBtn;
    private javax.swing.JRadioButton HIVYesRadioBtn;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JTextField HeightTextField;
    private javax.swing.JLabel HighBPLabel;
    private javax.swing.ButtonGroup InfectionBtnGrp;
    private javax.swing.JLabel InfectionLabel;
    private javax.swing.JRadioButton InfectionNoRadioBtn;
    private javax.swing.ButtonGroup OrganDiseaseBtnGrp;
    private javax.swing.JLabel OrganDiseaseLabel;
    private javax.swing.JRadioButton OrganDiseaseNoRadioBtn;
    private javax.swing.JRadioButton OrganDiseaseYesBtn;
    private javax.swing.JLabel SubHeaderLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JLabel bmiLabel;
    private javax.swing.JComboBox<String> donorBloodTypeComboBox;
    private javax.swing.JRadioButton infectionYesRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup psychiatricBtnGrp;
    private javax.swing.JRadioButton psychiatricNoRadioBtn;
    private javax.swing.JRadioButton psychiatricYesRadioBtn;
    private javax.swing.JLabel psychiatriclabel;
    // End of variables declaration//GEN-END:variables
}
