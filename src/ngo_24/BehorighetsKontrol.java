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
      
    public boolean kollaAID (InfDB idb,String ePost){
        boolean arHandlaggare = false;
        try{
        String sqlFragaAID = "SELECT AID from anstallda WHERE epost = '" + ePost + "'";
        
        String AID = idb.fetchSingle(sqlFragaAID);
        
        String sqlFragaHL = "SELECT AID from anstallda JOIN handlaggare on handlaggare.aid = anstallda.aid";
       
        ArrayList <String> listaHandlaggare = new ArrayList();
     
        listaHandlaggare = idb.fetchColumn(sqlFragaHL);
        
        for(String i : listaHandlaggare){
            if(i.equals(AID)){
                
            arHandlaggare = true;
            
            }
        }
       }catch(InfException ex){
        System.out.println("Inget fungerar gör om");
    } 
        
    return arHandlaggare;
    
    
    }

}