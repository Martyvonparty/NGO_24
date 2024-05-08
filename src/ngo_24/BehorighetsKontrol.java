/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo_24;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author marti
 */
public class BehorighetsKontrol {
 
    InfDB idb;
    
    public void BehorighetsKontroll (InfDB idb) {
    this.idb = idb;
   
}
      
    public boolean kollaAID(InfDB idb, String ePost) {
    try {
        String sqlFragaAID = "SELECT AID FROM anstalld WHERE ePost = '" + ePost + "'";
        String AID = idb.fetchSingle(sqlFragaAID);

        String sqlFragaHL = "SELECT AID FROM handlaggare";
        ArrayList<String> listaHandlaggare = idb.fetchColumn(sqlFragaHL);

        // Kontrollera om AID finns i listan av handläggare
        for (String handlaggareAID : listaHandlaggare) {
            if (handlaggareAID.equals(AID)) {
                return true; // Returnera true om AID tillhör en handläggare
            }
        }
    } catch (InfException ex) {
        System.out.println("Något gick fel med databasen: " + ex.getMessage());
    }
    return false; // Om ingen matchning hittades, returnera false
}

}