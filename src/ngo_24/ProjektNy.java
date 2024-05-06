/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo_24;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProjektNy extends javax.swing.JFrame {

    private InfDB idb;
    private DefaultTableModel projTab;
    private final String inloggadAnvandare;

    public ProjektNy(InfDB idb, String inloggadAnvandare, DefaultTableModel projTab) {
        this.idb = idb;
        this.inloggadAnvandare = inloggadAnvandare;
        this.projTab = projTab;
        initComponents();
        lblInloggadAnvandare.setText(inloggadAnvandare);
        fyllProjektTabell();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProjekt = new javax.swing.JLabel();
        lblInloggadAnvandare = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjekt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProjekt.setText("Dina projekt");

        tblProjekt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProjekt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInloggadAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInloggadAnvandare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
        // Skapa SQL-frågan för att hämta projektinformation från databasen
      

        private void fyllProjektTabell() {
String ePost = lblInloggadAnvandare.getText();
String sqlFraga = "SELECT projekt.* FROM projekt INNER JOIN ans_proj ON projekt.PID = ans_proj.PID INNER JOIN anstalld ON ans_proj.AID = anstalld.AID WHERE anstalld.AID = '" + ePost + "'";
    try {
        // Hämta flera rader med projektinformation från databasen
        ArrayList<HashMap<String, String>> projektData = idb.fetchRows(sqlFraga);

        // Skapa en ny DefaultTableModel för att hålla projektdata
        projTab = new DefaultTableModel();
        projTab.addColumn("Projekt ID");
        projTab.addColumn("Projektnamn");
        projTab.addColumn("Beskrivning");
        projTab.addColumn("Startdatum");
        projTab.addColumn("Slutdatum");
        projTab.addColumn("Prioritering");
        projTab.addColumn("Status");
        projTab.addColumn("Kostnad");
        projTab.addColumn("Projektchef");
        projTab.addColumn("Land");

        // Lägg till varje rad i tabellen
        for (HashMap<String, String> rad : projektData) {
            Object[] row = new Object[10]; // Skapa en ny array för varje rad med 10 kolumner
            row[0] = rad.get("PID");
            row[1] = rad.get("Projektnamn");
            row[2] = rad.get("Beskrivning");
            row[3] = rad.get("Startdatum");
            row[4] = rad.get("Slutdatum");
            row[5] = rad.get("Prioritering");
            row[6] = rad.get("Status");
            row[7] = rad.get("Kostnad"); 
            row[8] = rad.get("Projektchef");
            row[9] = rad.get("Land");

            projTab.addRow(row); // Lägg till raden i tabellen
        }

        // Koppla tabellmodellen till JTable
        //jTable.setModel(projtab);

    } catch (InfException ex) {
        System.out.println(ex.getMessage());
    }
}

    
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
            java.util.logging.Logger.getLogger(ProjektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektNy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektNy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInloggadAnvandare;
    private javax.swing.JLabel lblProjekt;
    private javax.swing.JTable tblProjekt;
    // End of variables declaration//GEN-END:variables

    private static class ResultSet {

        public ResultSet() {
        }
    }
}
