/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngo_24;

import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author marti
 */
public class NGO_24 {
    
private static InfDB idb;

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         
         try{
             idb = new InfDB("ngo_2024","3306","root","bajsmacka123");
             new Inloggning(idb).setVisible(true);
             
         } catch(InfException ex){
             System.out.println(ex.getMessage());
             
         }

     }
}
