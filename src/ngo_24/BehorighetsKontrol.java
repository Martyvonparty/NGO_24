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
      
    public boolean kollaHandlaggare(InfDB idb, String ePost) {//Metod som kontrollerar om anställd är handläggare
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
        System.out.println("Något gick fel under behörighetskontrollen.[HL] " + ex.getMessage());
    }
    return false; // Om ingen matchning hittades, returnera false
}

  public boolean kollaProjektChef(InfDB idb, String ePost) {///Metod som kontrollerar om anställd är projektchef
    boolean isProjektChef = false;
    try {
        String sqlFragaAID = "SELECT AID FROM anstalld WHERE ePost = '" + ePost + "'";
        String AID = idb.fetchSingle(sqlFragaAID);

        String sqlFragaProjChef = "SELECT projekt.projektchef FROM projekt INNER JOIN anstalld ON projekt.projektchef = anstalld.AID WHERE ePost = '" + ePost + "'";
        String projektChefAID = idb.fetchSingle(sqlFragaProjChef);

        // Kontrollera om AID överensstämmer med projektchefens AID
        if (projektChefAID != null && projektChefAID.equals(AID)) {
            isProjektChef = true;
        }
    } catch (InfException ex) {
        System.out.println("Något gick fel under behörighetskontrollen.[PC] " + ex.getMessage());
    }
    return isProjektChef;
}
}//"SELECT projekt.projektchef, anstalld.* FROM projekt INNER JOIN anstalld ON projekt.projektchef = anstalld.AID where ePost == '" + ePost + "'";