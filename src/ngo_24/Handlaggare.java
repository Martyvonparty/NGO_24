
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo_24;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class Handlaggare extends javax.swing.JFrame {
private InfDB idb;
private String ePost;
    
    /**
     * Creates new form Handlaggare
     * @param idb
     */
    public Handlaggare(InfDB idb, String ePost){
        this.idb = idb;
        this.ePost = ePost;
        initComponents();
         lblInloggadAnvandare.setText(ePost);
         btnAndraProjekt.setVisible(false);
         
}
         
    public Handlaggare (InfDB idb, String ePost, boolean isProjektChef){
        this.idb = idb;
        this.ePost = ePost;
      
        initComponents();
        lblInloggadAnvandare.setText(ePost);
        panelProjekt.setVisible(true);
         if (isProjektChef) {
            btnAndraProjekt.setVisible(true);
        } else {
            btnAndraProjekt.setVisible(false);
            
}
    }
    
   //String ePost = lblInloggadAnvandare.getText();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommen = new javax.swing.JLabel();
        lblInloggadAnvandare = new javax.swing.JLabel();
        lblHandlaggare = new javax.swing.JLabel();
        lblLOGGA = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        panelProjekt = new javax.swing.JPanel();
        btnAndraProjekt = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaProjekt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setText("Välkommen!");

        lblInloggadAnvandare.setText("inloggadAnvandare");

        lblHandlaggare.setText("Handläggare");

        lblLOGGA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ngo_24/SDG+Wheel.png"))); // NOI18N

        TabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabbedPaneMouseClicked(evt);
            }
        });
        TabbedPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TabbedPaneComponentShown(evt);
            }
        });

        btnAndraProjekt.setText("Ändra projekt");

        txtAreaProjekt.setEditable(false);
        txtAreaProjekt.setColumns(20);
        txtAreaProjekt.setRows(5);
        jScrollPane1.setViewportView(txtAreaProjekt);

        javax.swing.GroupLayout panelProjektLayout = new javax.swing.GroupLayout(panelProjekt);
        panelProjekt.setLayout(panelProjektLayout);
        panelProjektLayout.setHorizontalGroup(
            panelProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProjektLayout.createSequentialGroup()
                .addContainerGap(759, Short.MAX_VALUE)
                .addComponent(btnAndraProjekt)
                .addGap(47, 47, 47))
            .addGroup(panelProjektLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProjektLayout.setVerticalGroup(
            panelProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProjektLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAndraProjekt)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        TabbedPane.addTab("tab1", panelProjekt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHandlaggare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblValkommen))
                .addGap(623, 623, 623)
                .addComponent(lblLOGGA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblValkommen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInloggadAnvandare)
                            .addComponent(lblHandlaggare)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLOGGA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabbedPaneComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TabbedPaneComponentShown
        panelProjekt.setVisible(true);
        txtAreaProjekt.setText("");
        ArrayList<HashMap<String,String>> allaProjekt;
        
        try{
            String sqlFraga = "SELECT * FROM projekt INNER JOIN anstalld ON projekt.projektchef = anstalld.AID WHERE ePost = '" + ePost + "'";
            
            allaProjekt = idb.fetchRows(sqlFraga);
            
            for(HashMap<String,String> projekt : allaProjekt){
                txtAreaProjekt.append(projekt.get("pid") + "\t");
                txtAreaProjekt.append(projekt.get("projektnamn") + "\t");
                txtAreaProjekt.append(projekt.get("beskrivning") + "\t");
                txtAreaProjekt.append(projekt.get("startdatum") + "\t");
                txtAreaProjekt.append(projekt.get("slutdatum") + "\t");
                txtAreaProjekt.append(projekt.get("kostnad") + "\t");
                txtAreaProjekt.append(projekt.get("status") + "\t");
                txtAreaProjekt.append(projekt.get("prioritet") + "\t");
                txtAreaProjekt.append(projekt.get("projektchef") + "\t");
                txtAreaProjekt.append(projekt.get("land") + "\t");
            }
            
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        
        }
    }//GEN-LAST:event_TabbedPaneComponentShown

    private void TabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabbedPaneMouseClicked
           panelProjekt.setVisible(true);
        txtAreaProjekt.setText("");
        ArrayList<HashMap<String,String>> allaProjekt;
        
        try{
            String sqlFraga = "SELECT * FROM projekt INNER JOIN anstalld ON projekt.projektchef = anstalld.AID WHERE ePost = '" + ePost + "'";
            
            allaProjekt = idb.fetchRows(sqlFraga);
            
            for(HashMap<String,String> projekt : allaProjekt){
                txtAreaProjekt.append(projekt.get("pid") + "\t");
                txtAreaProjekt.append(projekt.get("projektnamn") + "\t");
                txtAreaProjekt.append(projekt.get("beskrivning") + "\t");
                txtAreaProjekt.append(projekt.get("startdatum") + "\t");
                txtAreaProjekt.append(projekt.get("slutdatum") + "\t");
                txtAreaProjekt.append(projekt.get("kostnad") + "\t");
                txtAreaProjekt.append(projekt.get("status") + "\t");
                txtAreaProjekt.append(projekt.get("prioritet") + "\t");
                txtAreaProjekt.append(projekt.get("projektchef") + "\t");
                txtAreaProjekt.append(projekt.get("land") + "\t");
            }
            
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        
        }
    }//GEN-LAST:event_TabbedPaneMouseClicked

   
    
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Handlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Handlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Handlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Handlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                //new Handlaggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JToggleButton btnAndraProjekt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHandlaggare;
    private javax.swing.JLabel lblInloggadAnvandare;
    private javax.swing.JLabel lblLOGGA;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JPanel panelProjekt;
    private javax.swing.JTextArea txtAreaProjekt;
    // End of variables declaration//GEN-END:variables
}
