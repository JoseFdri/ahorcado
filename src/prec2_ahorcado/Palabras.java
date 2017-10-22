/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prec2_ahorcado;

import java.util.ArrayList;



public class Palabras {
    
    
    public String elegir;
    
    ArrayList<String> plbr = new ArrayList<String>();
  public Palabras()
    {
  
        plbr.add("GOKU");
        plbr.add("PICCOLO");
        plbr.add( "KAMISAMA");
        plbr.add("GOHAN");
        plbr.add("VEGETA");
        plbr.add( "FREEZER");
        plbr.add( "TRUNKS");
        plbr.add( "CELL");
        plbr.add( "BULMA");
        plbr.add("CHAOZ");
        plbr.add( "KRILIN");
        plbr.add( "YAMCHA");
        plbr.add( "PAN");
        
        elegir = escogerPalabra();
 
    }

    public String escogerPalabra() {
         int pAleatorio=(int)((Math.random()* ((plbr.size()- 1) + 1)));
        return plbr.get(pAleatorio);
         
    } 
    
}
