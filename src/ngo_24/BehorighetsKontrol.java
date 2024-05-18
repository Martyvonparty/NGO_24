/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo_24;

import java.util.ArrayList;
import java.util.HashMap;
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
      
    public boolean kollaOmHandlaggare(InfDB idb, String ePost) {//Metod som kontrollerar om anställd är handläggare
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

  public boolean kollaOmProjektChef(InfDB idb, String ePost) {///Metod som kontrollerar om anställd är projektchef
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
  
  public String informationOmAnstalld(InfDB idb, String ePost){
            HashMap<String, String> infoAnstalld;

    try {
        // SQL-frågan som den är
        String sqlFraga = "SELECT fornamn, efternamn, adress, epost, telefon FROM anstalld WHERE epost = '" + ePost + "'";
        infoAnstalld = idb.fetchRow(sqlFraga);

        if (infoAnstalld != null) {
            String fornamn = infoAnstalld.get("fornamn");
            String efternamn = infoAnstalld.get("efternamn");
            String adress = infoAnstalld.get("adress");
            String epost = infoAnstalld.get("epost");
            String telefon = infoAnstalld.get("telefon");

            System.out.println("Fornamn: " + fornamn);
            System.out.println("Efternamn: " + efternamn);
            System.out.println("Adress: " + adress);
            System.out.println("Epost: " + epost);
            System.out.println("Telefon: " + telefon);
        } else {
            System.out.println("Ingen anställd hittades med den angivna e-postadressen.");
        }
    } catch (InfException ex) {
        System.out.println("Ett fel uppstod vid hämtning av anställdinformation: " + ex.getMessage());
    }
        return null;
}
}
