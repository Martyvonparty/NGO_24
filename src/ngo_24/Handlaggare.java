
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
         tblProjekt.setVisible(true);
         btnAndraProjekt.setVisible(false);
          
         
}
         
    public Handlaggare (InfDB idb, String ePost, boolean isProjektChef){
        this.idb = idb;
        this.ePost = ePost;
      
        initComponents();
        lblInloggadAnvandare.setText(ePost);
        tblProjekt.setVisible(true);
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
        tabbedPanel = new javax.swing.JTabbedPane();
        panelProjekt = new javax.swing.JPanel();
        btnAndraProjekt = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjekt = new javax.swing.JTable();
        panelAvdelning = new javax.swing.JPanel();
        panelMinInfo = new javax.swing.JPanel();
        btnAndraMinInfo = new javax.swing.JToggleButton();
        lblLOGGA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setText("Välkommen!");

        lblInloggadAnvandare.setText("inloggadAnvandare");

        lblHandlaggare.setText("Handläggare");

        tabbedPanel.setToolTipText("");

        panelProjekt.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelProjektComponentShown(evt);
            }
        });

        btnAndraProjekt.setText("Ändra projekt");
        btnAndraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraProjektActionPerformed(evt);
            }
        });

        tblProjekt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Projektnamn", "Beskrivning", "Startdatum", "Slutdatum", "Kostnad", "Status", "Prioritet", "Projektchef", "Land"
            }
        ));
        tblProjekt.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblProjektComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblProjekt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelProjektLayout = new javax.swing.GroupLayout(panelProjekt);
        panelProjekt.setLayout(panelProjektLayout);
        panelProjektLayout.setHorizontalGroup(
            panelProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProjektLayout.createSequentialGroup()
                .addContainerGap(861, Short.MAX_VALUE)
                .addComponent(btnAndraProjekt)
                .addGap(44, 44, 44))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelProjektLayout.setVerticalGroup(
            panelProjektLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjektLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAndraProjekt)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Projekt", panelProjekt);

        javax.swing.GroupLayout panelAvdelningLayout = new javax.swing.GroupLayout(panelAvdelning);
        panelAvdelning.setLayout(panelAvdelningLayout);
        panelAvdelningLayout.setHorizontalGroup(
            panelAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        panelAvdelningLayout.setVerticalGroup(
            panelAvdelningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Avdelning", panelAvdelning);

        btnAndraMinInfo.setText("Ändra min info");

        javax.swing.GroupLayout panelMinInfoLayout = new javax.swing.GroupLayout(panelMinInfo);
        panelMinInfo.setLayout(panelMinInfoLayout);
        panelMinInfoLayout.setHorizontalGroup(
            panelMinInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinInfoLayout.createSequentialGroup()
                .addContainerGap(826, Short.MAX_VALUE)
                .addComponent(btnAndraMinInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelMinInfoLayout.setVerticalGroup(
            panelMinInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAndraMinInfo)
                .addContainerGap(562, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Min info", panelMinInfo);

        lblLOGGA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ngo_24/SDG+Wheel.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHandlaggare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValkommen))
                        .addGap(623, 623, 623)
                        .addComponent(lblLOGGA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
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
                .addGap(10, 10, 10)
                .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAndraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraProjektActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAndraProjektActionPerformed

    private void tblProjektComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblProjektComponentShown
        try {
        // Hämta AID för den inloggade användaren
        String sqlFragaAID = "SELECT AID FROM anstalld WHERE ePost = '" + ePost + "'";
        String AID = idb.fetchSingle(sqlFragaAID);

        // Hämta projekt kopplade till den inloggade användaren
        String sqlFragaProjekt = "SELECT * FROM projekt INNER JOIN anstalld ON projekt.projektchef = anstalld.AID WHERE ePost = '" + ePost + "'";
        HashMap<String, String> projektLista = idb.fetchRow(sqlFragaProjekt);
        
        System.out.println(projektLista);
        
        DefaultTableModel model = (DefaultTableModel) tblProjekt.getModel();

        for (String row : projektLista.keySet()) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(row);
            model.addRow(rowData); // Lägg till raden till tabellmodellen
        }
    } catch (InfException ex) {
        // Hantera eventuellt undantag
        ex.printStackTrace();
    }


    }//GEN-LAST:event_tblProjektComponentShown

    private void panelProjektComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelProjektComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_panelProjektComponentShown

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
    private javax.swing.JToggleButton btnAndraMinInfo;
    private javax.swing.JToggleButton btnAndraProjekt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHandlaggare;
    private javax.swing.JLabel lblInloggadAnvandare;
    private javax.swing.JLabel lblLOGGA;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JPanel panelAvdelning;
    private javax.swing.JPanel panelMinInfo;
    private javax.swing.JPanel panelProjekt;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTable tblProjekt;
    // End of variables declaration//GEN-END:variables
}
