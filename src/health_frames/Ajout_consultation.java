/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ajout_consultation.java
 *
 * Created on 28 juil. 2020, 21:39:22
 */

package health_frames;
import java.awt.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;*/
import picos_health.Fonctions;
import picos_health.bdd;
/**
 *
 * @author iamwinner
 */
public class Ajout_consultation extends javax.swing.JFrame {
    bdd db;
    ResultSet rs;
    String nomMedecin;
    String prenomsMedecin;
    String numMedecin;
    String nomPatient;
    String numPatient;
    String prenomPatient;
    /** Creates new form Ajout_consultation */
    public Ajout_consultation() {

        db = new bdd(new Fonctions().BASE, new Fonctions().DB_USERNAME, new Fonctions().PASSWORD, new Fonctions().IPHOST, new Fonctions().PORT);
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comMedecin = new javax.swing.JComboBox();
        comPatient = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnAjout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxMotif = new javax.swing.JTextArea();

        setTitle("Nouvelle consultation");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(14, 22, 33));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(82, 136, 193));
        jLabel1.setFont(new java.awt.Font("Open Sans Light", 0, 30));
        jLabel1.setForeground(new java.awt.Color(82, 136, 193));
        jLabel1.setText("NOUVELLE CONSULTATION");

        comMedecin.setBackground(new java.awt.Color(14, 22, 33));
        comMedecin.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        comMedecin.setForeground(new java.awt.Color(255, 255, 255));
        comMedecin.setBorder(null);
        comMedecin.setPreferredSize(new java.awt.Dimension(0, 19));

        comPatient.setBackground(new java.awt.Color(14, 22, 33));
        comPatient.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        comPatient.setForeground(new java.awt.Color(255, 255, 255));
        comPatient.setBorder(null);
        comPatient.setPreferredSize(new java.awt.Dimension(0, 19));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jLabel2.setForeground(new java.awt.Color(143, 143, 143));
        jLabel2.setText("Médecin traitant");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jLabel3.setForeground(new java.awt.Color(143, 143, 143));
        jLabel3.setText("Date");

        jDateChooser1.setBackground(new java.awt.Color(14, 22, 33));
        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        jDateChooser1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jLabel4.setForeground(new java.awt.Color(143, 143, 143));
        jLabel4.setText("Patient");

        btnAjout.setBackground(new java.awt.Color(82, 136, 193));
        btnAjout.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        btnAjout.setForeground(new java.awt.Color(255, 255, 255));
        btnAjout.setText("AJOUTER");
        btnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jLabel5.setForeground(new java.awt.Color(143, 143, 143));
        jLabel5.setText("Motif");

        jSeparator1.setForeground(new java.awt.Color(82, 136, 193));

        boxMotif.setBackground(new java.awt.Color(14, 22, 33));
        boxMotif.setColumns(20);
        boxMotif.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        boxMotif.setRows(5);
        boxMotif.setBorder(null);
        boxMotif.setOpaque(false);
        jScrollPane1.setViewportView(boxMotif);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comMedecin, 0, 376, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comPatient, 0, 376, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(btnAjout, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(276, 276, 276)))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jSeparator1.setForeground(new Color(82,136,193));
        boxMotif.setBackground(new Color(14,22,33));
        jDateChooser1.setBackground(new Color(14,22,33));
        DateFormat leformat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date ldate = new java.util.Date();
        jDateChooser1.setDate(ldate);
        jDateChooser1.setEnabled(false);
        String[] colonne = {"numMedecin", "nomMedecin", "prenomMedecin"};//REQUETE SELECTION DES MEDECINS
        rs = db.requeteSelect(colonne, "medecin");//RESULTSET
        try {
            while (rs.next()){ //LECTURE DES RESULTAT
                nomMedecin = rs.getString("nomMedecin").toString();
                prenomsMedecin = rs.getString("prenomMedecin").toString();
                numMedecin = rs.getString("numMedecin").toString();
                comMedecin.addItem(nomMedecin.toUpperCase() + " " +prenomsMedecin);//AJOUT DES ELEMENT DE LA REQUETE
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajout_consultation.class.getName()).log(Level.SEVERE, null, ex);
        }


        String[] colonnes = {"numPatient", "nomPatient", "prenomPatient"};//REQUETE SELECTION DES PATIENTS
        rs = db.requeteSelect(colonnes, "patient");//RESULTSET
        try {
            while (rs.next()){ //LECTURE DES RESULTAT
                nomPatient = rs.getString("nomPatient").toString();
                prenomPatient = rs.getString("prenomPatient").toString();
                numPatient = rs.getString("numPatient");
                comPatient.addItem(nomPatient.toUpperCase() + " " + prenomPatient);//AJOUT DES ELEMENT DE LA REQUETE
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajout_consultation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed
        if(boxMotif.getText().equals("") || jDateChooser1.getDate().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs");
        }else{
            // TODO add your handling code here:
        String num_patient="";
        String num_medecin="";
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String date = formatDate.format(jDateChooser1.getDate());
        String combox1 = comMedecin.getSelectedItem().toString();//RECUPERATION DU COMBOBOX MEDECIN
        String[] tableau = combox1.split(" ");//DECOUPAGE EN TABLEAU AVEC SUPPRESION DES ESPACES
        String nom = tableau[0];//RECUPERATION DU NOM QUI SE TROUVE FORCEMENT A L'INDEX 0

        String predicat = "nomMedecin='"+ nom+"' AND prenomMedecin='";//CONCATENATION
        for(int i=1; i <= tableau.length - 1;i++){
               predicat += tableau[i];//AJOUT DES PRENOMS CONTENUS DANS LE TABLEAU ET SUPPRESSION DE L'ESPACE A LA FIN
               if(i < tableau.length - 1){
                   predicat += " ";
               }
       }
       predicat += "'";//FIN DU PREDICAT
       String[] colonne = {"numMedecin"};
       rs = db.requeteSelectP(colonne, "medecin", predicat);
        try {
            while (rs.next()) {
                num_medecin = rs.getString("numMedecin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajout_consultation.class.getName()).log(Level.SEVERE, null, ex);
        }

       String combox2 = comPatient.getSelectedItem().toString();//RECUPERATION DU COMBOBOX PATIENT
       String[] tableau1 = combox2.split(" ");//DECOUPAGE EN TABLEAU AVEC SUPPRESION DES ESPACES
       String nomP = tableau1[0];//RECUPERATION DU NOM QUI SE TROUVE FORCEMENT A L'INDEX 0

       String predicat1 = "nomPatient='"+ nomP+"' AND prenomPatient='";//CONCATENATION

       for(int i=1; i<=tableau1.length - 1;i++){
               predicat1 += tableau1[i];//AJOUT DES PRENOMS CONTENUS DANS LE TABLEAU ET SUPPRESSION DE L'ESPACE A LA FIN
               if(i < tableau1.length - 1){
                   predicat1 += " ";
               }

       }
       predicat1 += "'";//FIN DU PREDICAT

       String[] colonne1 = {"numPatient"};
       rs = db.requeteSelectP(colonne1, "patient", predicat1);

        try {
            while(rs.next()){
            num_patient = rs.getString("numPatient");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajout_consultation.class.getName()).log(Level.SEVERE, null, ex);
        }
        //INSERTION DANS LA BASE
        String boxTextArea = boxMotif.getText();

        String[] colonnes = {date, num_medecin, num_patient, boxTextArea};
        System.out.println(db.requeteInsertion("consultation", colonnes));
        JOptionPane.showMessageDialog(this, "Consultation ajouté");
        //OUVERTURE DU FORMULAIRE PRESCRIPTION
        boxMotif.setText("");
        comMedecin.setSelectedIndex(0);
        comPatient.setSelectedIndex(0);

        }
}//GEN-LAST:event_btnAjoutActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajout_consultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea boxMotif;
    private javax.swing.JButton btnAjout;
    private javax.swing.JComboBox comMedecin;
    private javax.swing.JComboBox comPatient;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}
