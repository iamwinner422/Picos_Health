/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Liste_Medecin.java
 *
 * Created on 31 juil. 2020, 14:12:15
 */

package health_frames;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import picos_health.Fonctions;
import picos_health.ResultSetTableModel;
import picos_health.bdd;

/**
 *
 * @author iamwinner
 */
public class Liste_Medecin extends javax.swing.JFrame {
    ResultSet rs;
    bdd db;

    /** Creates new form Liste_Medecin */
    public Liste_Medecin() {
        db = new bdd(new Fonctions().BASE, new Fonctions().DB_USERNAME, new Fonctions().PASSWORD, new Fonctions().IPHOST, new Fonctions().PORT);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         table();
    }
    public void table(){
        rs = db.requeteSelectAll("medecin");
        this.tble_mede.setModel(new ResultSetTableModel(rs));
    }
    //VIDAGE DES CHAMPS
    public void actualiser(){
        boxNom.setText("");
        boxPrenoms.setText("");
        boxNumTel.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tble_mede = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        boxNom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        boxPrenoms = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        boxNumTel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boxRech = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Liste des médecins");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(14, 22, 33));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans Light", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 136, 193));
        jLabel1.setText("GESTION DES MEDECINS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tble_mede.setBackground(new java.awt.Color(14, 22, 33));
        tble_mede.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        tble_mede.setForeground(new java.awt.Color(82, 136, 193));
        tble_mede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numéro", "Nom ", "Prénoms", "Numéro de téléphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tble_mede.setOpaque(false);
        tble_mede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tble_medeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble_mede);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 103, 468, 123));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        jLabel2.setForeground(new java.awt.Color(143, 143, 143));
        jLabel2.setText("Nom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 232, -1, -1));

        boxNom.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14));
        boxNom.setForeground(new java.awt.Color(255, 255, 255));
        boxNom.setBorder(null);
        boxNom.setOpaque(false);
        jPanel1.add(boxNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 255, 331, 40));

        jSeparator1.setBackground(new java.awt.Color(14, 22, 33));
        jSeparator1.setForeground(new java.awt.Color(82, 136, 193));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 301, 337, 10));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        jLabel3.setForeground(new java.awt.Color(143, 143, 143));
        jLabel3.setText("Prénoms");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 317, -1, -1));

        boxPrenoms.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14));
        boxPrenoms.setForeground(new java.awt.Color(255, 255, 255));
        boxPrenoms.setBorder(null);
        boxPrenoms.setOpaque(false);
        jPanel1.add(boxPrenoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 335, 337, 40));

        jSeparator2.setBackground(new java.awt.Color(14, 22, 33));
        jSeparator2.setForeground(new java.awt.Color(82, 136, 193));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 381, 337, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12));
        jLabel4.setForeground(new java.awt.Color(143, 143, 143));
        jLabel4.setText("Numéro de téléphone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 402, -1, -1));

        boxNumTel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14));
        boxNumTel.setForeground(new java.awt.Color(255, 255, 255));
        boxNumTel.setBorder(null);
        boxNumTel.setOpaque(false);
        boxNumTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNumTelKeyTyped(evt);
            }
        });
        jPanel1.add(boxNumTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 425, 337, 40));

        jSeparator3.setBackground(new java.awt.Color(14, 22, 33));
        jSeparator3.setForeground(new java.awt.Color(82, 136, 193));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 471, 337, 10));

        jButton1.setBackground(new java.awt.Color(82, 136, 193));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modifier");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 301, 110, 39));

        jButton2.setBackground(new java.awt.Color(14, 22, 33));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13));
        jButton2.setForeground(new java.awt.Color(82, 136, 193));
        jButton2.setText("Supprimer");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 136, 193)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 352, 110, 39));

        boxRech.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14));
        boxRech.setForeground(new java.awt.Color(255, 255, 255));
        boxRech.setBorder(null);
        boxRech.setOpaque(false);
        boxRech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxRechMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boxRechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boxRechMouseExited(evt);
            }
        });
        boxRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRechActionPerformed(evt);
            }
        });
        boxRech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxRechKeyTyped(evt);
            }
        });
        jPanel1.add(boxRech, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 59, 266, 32));

        jSeparator4.setBackground(new java.awt.Color(14, 22, 33));
        jSeparator4.setForeground(new java.awt.Color(82, 136, 193));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 92, 266, 10));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 11));
        jLabel5.setForeground(new java.awt.Color(143, 143, 143));
        jLabel5.setText("Recherche");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxNumTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNumTelKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))//VERIFICATION DU NUMERO DE TELEPHONE
            evt.consume();
}//GEN-LAST:event_boxNumTelKeyTyped

    private void tble_medeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tble_medeMouseClicked
        // TODO add your handling code here:
        boxNom.setText(String.valueOf(tble_mede.getValueAt(tble_mede.getSelectedRow(), 1)));
        boxPrenoms.setText(String.valueOf(tble_mede.getValueAt(tble_mede.getSelectedRow(), 2)));
        boxNumTel.setText(String.valueOf(tble_mede.getValueAt(tble_mede.getSelectedRow(), 3)));
    }//GEN-LAST:event_tble_medeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(boxNom.getText().equals("") || boxPrenoms.getText().equals("") || boxNumTel.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs!");
        }else if(boxNumTel.getText().length() != 8){
            JOptionPane.showMessageDialog(this, "Numéro de téléphone incorrect!");
        }else{
            String[] colonnes = {"nomMedecin", "prenomMedecin", "numTelMedecin"};
            String[] infos = {boxNom.getText(), boxPrenoms.getText(), boxNumTel.getText()};
            String num_M = String.valueOf(tble_mede.getValueAt(tble_mede.getSelectedRow(), 0));
            String predicat = "numMedecin='" + num_M + "'";
            //MIS A JOUR
            System.out.println(db.requeteUpdte("medecin", colonnes, infos, predicat));
            JOptionPane.showMessageDialog(this, "Modification effectuée!");
            actualiser();
            table();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String num_M = String.valueOf(tble_mede.getValueAt(tble_mede.getSelectedRow(), 0));
        if(JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer l'enregistrement", "Avertissement", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            db.requeteDelete("medecin", "numMedecin="+num_M);
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boxRechKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxRechKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRechKeyTyped

    private void boxRechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxRechMouseEntered
        jLabel5.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRechMouseEntered

    private void boxRechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxRechMouseExited
        // TODO add your handling code here:
        jLabel5.setVisible(true);
    }//GEN-LAST:event_boxRechMouseExited

    private void boxRechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxRechMouseClicked
        // TODO add your handling code here:
        jLabel5.setVisible(false);
    }//GEN-LAST:event_boxRechMouseClicked

    private void boxRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRechActionPerformed
        // TODO add your handling code here:
        rs = db.requeteSelectAllP("medecin", "nomMedecin LIKE '%"+ boxRech.getText()+"%' OR prenomMedecin LIKE '%" + boxRech.getText()+"%' OR numTelMedecin LIKE '%"+ boxRech+"%'");
        tble_mede.setModel(new ResultSetTableModel(rs));
    }//GEN-LAST:event_boxRechActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liste_Medecin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxNom;
    private javax.swing.JTextField boxNumTel;
    private javax.swing.JTextField boxPrenoms;
    private javax.swing.JTextField boxRech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tble_mede;
    // End of variables declaration//GEN-END:variables



}
