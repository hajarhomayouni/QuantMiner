/*                                             
 *Copyright 2007, 2011 CCLS Columbia University (USA), LIFO University of Orl��ans (France), BRGM (France)
 *
 *Authors: Cyril Nortet, Xiangrong Kong, Ansaf Salleb-Aouissi, Christel Vrain, Daniel Cassard
 *
 *This file is part of QuantMiner.
 *
 *QuantMiner is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.
 *
 *QuantMiner is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License along with QuantMiner.  If not, see <http://www.gnu.org/licenses/>.
 */
package src.interfaceGraphique;

import java.util.ArrayList;

import javax.swing.*;

import src.solver.*;
import src.utilitaires.*;



public class DialogParametrage extends javax.swing.JDialog { //set parameter of quant miner
    
	private static final long serialVersionUID = 1L;
	int m_iAncienLook = 0;
    ContexteResolution m_contexteResolution = null;
    
    
    /** Creates new form DialogParametrage */
    public DialogParametrage(ContexteResolution contexteResolution, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        m_contexteResolution = contexteResolution;
        
        jTextFieldUtilisateur.setText(ENV.NOM_UTILISATEUR);
        
        if (ENV.LOOK_INTERFACE == ENV.LOOK_INTERFACE_OS)
            jRadioButtonLookOS.setSelected(true);
        else
            jRadioButtonLookJava.setSelected(true);
        m_iAncienLook = ENV.LOOK_INTERFACE;
        
        jCheckBoxAvertir.setSelected(ENV.AVERTIR_FIN_CALCUL);
        
        jTextFieldFichierSon.setText(ENV.CHEMIN_FICHIER_SON_FIN_CALCUL);
        jLabelFichierSon.setEnabled(ENV.AVERTIR_FIN_CALCUL);
        jTextFieldFichierSon.setEnabled(ENV.AVERTIR_FIN_CALCUL);
        jButtonFichierSon.setEnabled(ENV.AVERTIR_FIN_CALCUL);    

        setLocationRelativeTo(null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroupApparence = new javax.swing.ButtonGroup();
        jPanelGeneral = new javax.swing.JPanel();
        jPanelParamsGeneraux = new javax.swing.JPanel();
        jLabelUtilisateur = new javax.swing.JLabel();
        jTextFieldUtilisateur = new javax.swing.JTextField();
        jLabelApparence = new javax.swing.JLabel();
        jRadioButtonLookJava = new javax.swing.JRadioButton();
        jRadioButtonLookOS = new javax.swing.JRadioButton();
        jPanelPrefs = new javax.swing.JPanel();
        jCheckBoxAvertir = new javax.swing.JCheckBox();
        jLabelFichierSon = new javax.swing.JLabel();
        jTextFieldFichierSon = new javax.swing.JTextField();
        jButtonFichierSon = new javax.swing.JButton();
        jButtonEnregistrer = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonAide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parameter of Quantminer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanelGeneral.setLayout(null);

        jPanelGeneral.setPreferredSize(new java.awt.Dimension(520, 350));
        jPanelParamsGeneraux.setLayout(null);

        jPanelParamsGeneraux.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General Parameter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12)));
        jLabelUtilisateur.setText("User Name:");
        jPanelParamsGeneraux.add(jLabelUtilisateur);
        jLabelUtilisateur.setBounds(20, 30, 140, 14);

        jPanelParamsGeneraux.add(jTextFieldUtilisateur);
        jTextFieldUtilisateur.setBounds(180, 30, 300, 19);

        jLabelApparence.setText("Interface:");
        jPanelParamsGeneraux.add(jLabelApparence);
        jLabelApparence.setBounds(20, 60, 150, 14);

        buttonGroupApparence.add(jRadioButtonLookJava);
        jRadioButtonLookJava.setText("JAVA Style (default)");
        jPanelParamsGeneraux.add(jRadioButtonLookJava);
        jRadioButtonLookJava.setBounds(180, 60, 153, 20);

        buttonGroupApparence.add(jRadioButtonLookOS);
        jRadioButtonLookOS.setText("Operating System Style");
        jPanelParamsGeneraux.add(jRadioButtonLookOS);
        jRadioButtonLookOS.setBounds(180, 80, 160, 23);

        jPanelGeneral.add(jPanelParamsGeneraux);
        jPanelParamsGeneraux.setBounds(10, 40, 500, 120);
        jPanelParamsGeneraux.getAccessibleContext().setAccessibleName("General parameters");

        jPanelPrefs.setLayout(null);

        jPanelPrefs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User preference", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12)));
        jCheckBoxAvertir.setText("Notify me at the end of a computation by a message with a sound");
        jCheckBoxAvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAvertirActionPerformed(evt);
            }
        });

        jPanelPrefs.add(jCheckBoxAvertir);
        jCheckBoxAvertir.setBounds(20, 30, 470, 23);

        jLabelFichierSon.setText("Sound file:");
        jPanelPrefs.add(jLabelFichierSon);
        jLabelFichierSon.setBounds(60, 60, 80, 14);

        jPanelPrefs.add(jTextFieldFichierSon);
        jTextFieldFichierSon.setBounds(140, 60, 240, 19);

        jButtonFichierSon.setText("Load");
        jButtonFichierSon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFichierSonActionPerformed(evt);
            }
        });

        jPanelPrefs.add(jButtonFichierSon);
        jButtonFichierSon.setBounds(390, 60, 100, 20);

        jPanelGeneral.add(jPanelPrefs);
        jPanelPrefs.setBounds(10, 180, 500, 110);
        jPanelPrefs.getAccessibleContext().setAccessibleName("User Preferences:");

        jButtonEnregistrer.setText("Save");
        jButtonEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnregistrerActionPerformed(evt);
            }
        });

        jPanelGeneral.add(jButtonEnregistrer);
        jButtonEnregistrer.setBounds(160, 310, 100, 23);

        jButtonAnnuler.setText("Cancel");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jPanelGeneral.add(jButtonAnnuler);
        jButtonAnnuler.setBounds(270, 310, 100, 23);

        jButtonAide.setText("?");
        jButtonAide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAideActionPerformed(evt);
            }
        });

        jPanelGeneral.add(jButtonAide);
        jButtonAide.setBounds(458, 11, 50, 23);

        getContentPane().add(jPanelGeneral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jCheckBoxAvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvertirActionPerformed
        boolean bCaseAvertirCochee = false;
        
        bCaseAvertirCochee = jCheckBoxAvertir.isSelected();
        
        jLabelFichierSon.setEnabled(bCaseAvertirCochee);
        jTextFieldFichierSon.setEnabled(bCaseAvertirCochee);
        jButtonFichierSon.setEnabled(bCaseAvertirCochee);    
    }//GEN-LAST:event_jCheckBoxAvertirActionPerformed

    
    
    
    @SuppressWarnings("deprecation")
	private void jButtonAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAideActionPerformed
        DialogFenetreAide dialogAide = new DialogFenetreAide(ENV.REPERTOIRE_AIDE+"parametrage.htm", null, true);
        dialogAide.show();
    }//GEN-LAST:event_jButtonAideActionPerformed

    
    
    
    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    
    
    
    private void jButtonEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnregistrerActionPerformed
        
        ENV.NOM_UTILISATEUR = jTextFieldUtilisateur.getText();
        if (m_contexteResolution != null)
            m_contexteResolution.m_sNomUtilisateur = ENV.NOM_UTILISATEUR;
        
        if (jRadioButtonLookOS.isSelected())
            ENV.LOOK_INTERFACE = ENV.LOOK_INTERFACE_OS;
        else
            ENV.LOOK_INTERFACE = ENV.LOOK_INTERFACE_JAVA;
        
        ENV.AVERTIR_FIN_CALCUL = jCheckBoxAvertir.isSelected();
        
        if (ENV.AVERTIR_FIN_CALCUL)
            ENV.CHEMIN_FICHIER_SON_FIN_CALCUL = jTextFieldFichierSon.getText();
        
        if (ENV.LOOK_INTERFACE != m_iAncienLook)
            JOptionPane.showMessageDialog(null, "The change in the appearance will happen the next time you start the software.", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        ENV.EnregistrerFichierParametrage();
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonEnregistrerActionPerformed

    
    
    private void jButtonFichierSonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFichierSonActionPerformed
        String sFichierChoisi = null;
        
        ArrayList<String> description = new ArrayList<String>();
        description.add("Sound files");
        ArrayList<String> extention = new ArrayList<String>();
        extention.add("wav");  
        
        sFichierChoisi = UtilitairesInterface.DialogOuvertureFichier(this, ENV.CHEMIN_FICHIER_SON_FIN_CALCUL, description, extention);

        if (sFichierChoisi != null)
            jTextFieldFichierSon.setText(sFichierChoisi);
    }//GEN-LAST:event_jButtonFichierSonActionPerformed
    
    
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
	public static void main(String args[]) {
        new DialogParametrage(null, new javax.swing.JFrame(), true).show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupApparence;
    private javax.swing.JButton jButtonAide;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonEnregistrer;
    private javax.swing.JButton jButtonFichierSon;
    private javax.swing.JCheckBox jCheckBoxAvertir;
    private javax.swing.JLabel jLabelApparence;
    private javax.swing.JLabel jLabelFichierSon;
    private javax.swing.JLabel jLabelUtilisateur;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jPanelParamsGeneraux;
    private javax.swing.JPanel jPanelPrefs;
    private javax.swing.JRadioButton jRadioButtonLookJava;
    private javax.swing.JRadioButton jRadioButtonLookOS;
    private javax.swing.JTextField jTextFieldFichierSon;
    private javax.swing.JTextField jTextFieldUtilisateur;
    // End of variables declaration//GEN-END:variables
    
}