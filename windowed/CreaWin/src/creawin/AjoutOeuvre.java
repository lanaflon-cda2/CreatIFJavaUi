/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creawin;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modele.Oeuvre;
import modele.Peinture;
import modele.Sculpture;
import service.Service;
import java.lang.Object;

/**
 *
 * @author fhyren
 */
public class AjoutOeuvre extends javax.swing.JFrame {

    /**
     * Creates new form AjoutOeuvre
     */
    public AjoutOeuvre() {
	initComponents();
	this.EpaisseurTF.setEnabled(false);
	//this.HauteurTF.setText((String)this.TypeCB.getSelectedItem());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog4 = new javax.swing.JDialog();
        OeuvreTF = new javax.swing.JTextField();
        ArtisteTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TarifTF = new javax.swing.JTextField();
        HauteurTF = new javax.swing.JTextField();
        LargeurTF = new javax.swing.JTextField();
        TypeCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EpaisseurTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ValiderBtn = new javax.swing.JButton();
        AnnulerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionTA = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jDialog4.setAlwaysOnTop(true);

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("Créat'If - Ajout d'une oeuvre");

        ArtisteTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtisteTFActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom de l'oeuvre");

        jLabel2.setText("Artiste");

        TarifTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TarifTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TarifTFKeyTyped(evt);
            }
        });

        HauteurTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HauteurTFKeyReleased(evt);
            }
        });

        LargeurTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LargeurTFKeyReleased(evt);
            }
        });

        TypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Peinture", "Sculpture" }));
        TypeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TypeCBItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tarif Journalier");

        jLabel4.setText("Type d'oeuvre");

        jLabel5.setText("Hauteur");

        jLabel6.setText("Largeur");

        EpaisseurTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EpaisseurTFKeyReleased(evt);
            }
        });

        jLabel7.setText("Epaisseur");

        ValiderBtn.setText("Valider");
        ValiderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderBtnMouseClicked(evt);
            }
        });

        AnnulerBtn.setText("Annuler");
        AnnulerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerBtnMouseClicked(evt);
            }
        });

        DescriptionTA.setColumns(20);
        DescriptionTA.setRows(5);
        jScrollPane1.setViewportView(DescriptionTA);

        jLabel8.setText("Description");

        jMenu1.setText("Aide");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quitter");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(HauteurTF)
                            .addComponent(TarifTF)
                            .addComponent(OeuvreTF))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(ArtisteTF)
                            .addComponent(LargeurTF)
                            .addComponent(TypeCB, 0, 113, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ValiderBtn)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EpaisseurTF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnnulerBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ArtisteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OeuvreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TarifTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HauteurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LargeurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EpaisseurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValiderBtn)
                    .addComponent(AnnulerBtn))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtisteTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtisteTFActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_ArtisteTFActionPerformed

    private void TypeCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TypeCBItemStateChanged
	if ((String)this.TypeCB.getSelectedItem() == "Sculpture")
	    this.EpaisseurTF.setEnabled(true);
	else 
	    this.EpaisseurTF.setEnabled(false);
    }//GEN-LAST:event_TypeCBItemStateChanged

    private void AnnulerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerBtnMouseClicked
	this.OeuvreTF.setText(null);
	this.ArtisteTF.setText(null);
	this.TarifTF.setText(null);
	this.HauteurTF.setText(null);
	this.LargeurTF.setText(null);
	this.EpaisseurTF.setText(null);
	this.DescriptionTA.setText(null);
    }//GEN-LAST:event_AnnulerBtnMouseClicked

    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu2MenuKeyPressed

    }//GEN-LAST:event_jMenu2MenuKeyPressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
	hide();
    }//GEN-LAST:event_jMenu2MousePressed

    private void ValiderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderBtnMouseClicked

	if (this.OeuvreTF.getText().contentEquals("") || this.ArtisteTF.getText().contentEquals("") 
	    || this.TarifTF.getText().contentEquals("") || this.HauteurTF.getText().contentEquals("")
	    || this.LargeurTF.getText().contentEquals(""))
	{
	    JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les cases d'informations de l'oeuvre");
	}
	else if (this.TypeCB.getSelectedItem() == "Sculpture" && this.EpaisseurTF.getText().contentEquals(""))
	{
	    JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les cases d'informations de l'oeuvre");
	}
	else 
	{
	    if (this.TypeCB.getSelectedItem() == "Peinture")
	    {
		Oeuvre o = new Peinture(this.OeuvreTF.getText(), Integer.parseInt(this.TarifTF.getText()), this.DescriptionTA.getText(), Integer.parseInt(this.HauteurTF.getText()), Integer.parseInt(this.LargeurTF.getText()));
		Service.ajouterOeuvre(o, Service.rechercherArtisteParNumId(Integer.parseInt(this.ArtisteTF.getText())));
	    }
	    else 
	    {
		Oeuvre o = new Sculpture(this.OeuvreTF.getText(), Integer.parseInt(this.TarifTF.getText()), this.DescriptionTA.getText(), Integer.parseInt(this.HauteurTF.getText()), Integer.parseInt(this.LargeurTF.getText()), Integer.parseInt(this.EpaisseurTF.getText()));
		Service.ajouterOeuvre(o, Service.rechercherArtisteParNumId(Integer.parseInt(this.ArtisteTF.getText())));
	    }
	}
	
    }//GEN-LAST:event_ValiderBtnMouseClicked

    private void TarifTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TarifTFKeyTyped
	
    }//GEN-LAST:event_TarifTFKeyTyped

    private void TarifTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TarifTFKeyReleased
	if(evt.getKeyChar() != '0' && evt.getKeyChar() != '1' && evt.getKeyChar() != '2' && evt.getKeyChar() != '3' && evt.getKeyChar() != '4' && evt.getKeyChar() != '5' &&
		evt.getKeyChar() != '6' && evt.getKeyChar() != '7' && evt.getKeyChar() != '8' && evt.getKeyChar() != '9')
	{
		this.TarifTF.setText(this.TarifTF.getText().replace(String.valueOf(evt.getKeyChar()), ""));
	}
    }//GEN-LAST:event_TarifTFKeyReleased

    private void HauteurTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HauteurTFKeyReleased
	if(evt.getKeyChar() != '0' && evt.getKeyChar() != '1' && evt.getKeyChar() != '2' && evt.getKeyChar() != '3' && evt.getKeyChar() != '4' && evt.getKeyChar() != '5' &&
		evt.getKeyChar() != '6' && evt.getKeyChar() != '7' && evt.getKeyChar() != '8' && evt.getKeyChar() != '9')
	{
		this.HauteurTF.setText(this.HauteurTF.getText().replace(String.valueOf(evt.getKeyChar()), ""));
	}
    }//GEN-LAST:event_HauteurTFKeyReleased

        private void LargeurTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LargeurTFKeyReleased
	if(evt.getKeyChar() != '0' && evt.getKeyChar() != '1' && evt.getKeyChar() != '2' && evt.getKeyChar() != '3' && evt.getKeyChar() != '4' && evt.getKeyChar() != '5' &&
		evt.getKeyChar() != '6' && evt.getKeyChar() != '7' && evt.getKeyChar() != '8' && evt.getKeyChar() != '9')
	{
		this.LargeurTF.setText(this.LargeurTF.getText().replace(String.valueOf(evt.getKeyChar()), ""));
	}
    }//GEN-LAST:event_LargeurTFKeyReleased

    private void EpaisseurTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EpaisseurTFKeyReleased
	if(evt.getKeyChar() != '0' && evt.getKeyChar() != '1' && evt.getKeyChar() != '2' && evt.getKeyChar() != '3' && evt.getKeyChar() != '4' && evt.getKeyChar() != '5' &&
		evt.getKeyChar() != '6' && evt.getKeyChar() != '7' && evt.getKeyChar() != '8' && evt.getKeyChar() != '9')
	{
		this.EpaisseurTF.setText(this.EpaisseurTF.getText().replace(String.valueOf(evt.getKeyChar()), ""));
	}
    }//GEN-LAST:event_EpaisseurTFKeyReleased

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
	JOptionPane.showMessageDialog(this, "Cette fenêtre vous permet d'ajouter une oeuvre au catalogue.\nIl est nécessaire que tous les champs soient remplis pour que la création fonctionne. (sauf la description de l'oeuvre)");
    }//GEN-LAST:event_jMenu1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/*
	 * Set the Nimbus look and feel
	 */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the
	 * default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(AjoutOeuvre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/*
	 * Create and display the form
	 */
	java.awt.EventQueue.invokeLater(new Runnable() {

	    public void run() {
		new AjoutOeuvre().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnnulerBtn;
    private javax.swing.JTextField ArtisteTF;
    private javax.swing.JTextArea DescriptionTA;
    private javax.swing.JTextField EpaisseurTF;
    private javax.swing.JTextField HauteurTF;
    private javax.swing.JTextField LargeurTF;
    private javax.swing.JTextField OeuvreTF;
    private javax.swing.JTextField TarifTF;
    private javax.swing.JComboBox TypeCB;
    private javax.swing.JButton ValiderBtn;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
