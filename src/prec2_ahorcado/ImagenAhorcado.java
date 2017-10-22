/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prec2_ahorcado;

import java.util.ArrayList;
import javax.swing.*;

public class ImagenAhorcado {
  ArrayList<String> links = new ArrayList<String>();
  public ImagenAhorcado(){
        for (int i = 0; i < 9; i++) {
            links.add("/Imagenes/"+i+".jpg");
      }
  }
}
