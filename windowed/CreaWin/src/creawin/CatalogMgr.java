/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CatalogMgr.java
 *
 * Created on 27 févr. 2012, 17:41:55
 */

package creawin;

import java.io.Writer;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modele.Oeuvre;
import modele.Peinture;
import modele.Sculpture;
import service.Service;

/**
 *
 * @author Administrateur
 */
public class CatalogMgr extends javax.swing.JFrame {

    /** Creates new form CatalogMgr */
    public CatalogMgr() {
	
        initComponents();
	
	DefaultListModel listModel = new DefaultListModel();
	
	List<Oeuvre> catalog = Service.rechercherToutesLesOeuvres();
	for (Oeuvre o:catalog)
	{	    
	    listModel.addElement(o);
	}
	oeuvresList.setModel(listModel);
	
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsPane = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        ReservBtn = new javax.swing.JButton();
        oeuvresSP = new javax.swing.JScrollPane();
        oeuvresList = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setTitle("Créat'If - Visualisation du catalogue");

        ReservBtn.setText("Voir les réservations");
        ReservBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout detailsPaneLayout = new javax.swing.GroupLayout(detailsPane);
        detailsPane.setLayout(detailsPaneLayout);
        detailsPaneLayout.setHorizontalGroup(
            detailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPaneLayout.createSequentialGroup()
                .addGroup(detailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ReservBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPaneLayout.setVerticalGroup(
            detailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPaneLayout.createSequentialGroup()
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReservBtn)
                .addGap(55, 55, 55))
        );

        oeuvresList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                oeuvresListValueChanged(evt);
            }
        });
        oeuvresSP.setViewportView(oeuvresList);

        jMenu1.setText("Aide");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('Q');
        jMenu2.setText("Quitter");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyTyped(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(oeuvresSP, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(oeuvresSP, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oeuvresListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_oeuvresListValueChanged
        String text = "Oeuvre : " + ((Oeuvre) this.oeuvresList.getSelectedValue()).getNom() + "\nArtiste : " + ((Oeuvre) this.oeuvresList.getSelectedValue()).getArtiste(); 
	text += "\nDescription : " + ((Oeuvre) this.oeuvresList.getSelectedValue()).getDescription() + "\n";
	
	if (this.oeuvresList.getSelectedValue().getClass() == Peinture.class)
	{
	    text += "Type : Peinture\nHauteur :" + ((Peinture) this.oeuvresList.getSelectedValue()).getHauteur(); 
	    text += "\nLargeur : " +((Peinture) this.oeuvresList.getSelectedValue()).getLargeur();
	}
	else
	{
	    text += "Type : Sculpture\nHauteur :" + ((Sculpture) this.oeuvresList.getSelectedValue()).getHauteur(); 
	    text += "\nLargeur : " +((Sculpture) this.oeuvresList.getSelectedValue()).getLargeur();
	    text += "\nEpaisseur : " +((Sculpture) this.oeuvresList.getSelectedValue()).getEpaisseur();
	}
	text += "\nTarif Journalier : " + ((Oeuvre) this.oeuvresList.getSelectedValue()).getTarifJournalier()+ " €";
	
	this.textArea1.setText(text);
    }//GEN-LAST:event_oeuvresListValueChanged

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
	// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed
	// TODO add your handling code here:
	hide();
    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
	// TODO add your handling code here:
	hide();
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenu2MenuKeyTyped(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyTyped
	// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuKeyTyped

    private void ReservBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservBtnMouseClicked
	// TODO add your handling code here
	String s = Service.calendrierLocation((Oeuvre)this.oeuvresList.getSelectedValue());
	Reservation r = new Reservation(s);
	r.show();
    }//GEN-LAST:event_ReservBtnMouseClicked

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
	JOptionPane.showMessageDialog(this, "Le bouton \"Voir les réservations\" vous permettra de voir le calendier de location de l'oeuvre");
    }//GEN-LAST:event_jMenu1MousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogMgr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReservBtn;
    private javax.swing.JPanel detailsPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JList oeuvresList;
    private javax.swing.JScrollPane oeuvresSP;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
