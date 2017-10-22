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
        /*imgs=new ImageIcon[9];
      
        imgs[0] = new ImageIcon(getClass().getResource("/Imagenes/0.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/Imagenes/1.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/Imagenes/2.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/Imagenes/3.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/Imagenes/4.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/Imagenes/5.jpg"));
        imgs[6] = new ImageIcon(getClass().getResource("/Imagenes/6.jpg"));
        imgs[7] = new ImageIcon(getClass().getResource("/Imagenes/7.jpg"));
        imgs[8] = new ImageIcon(getClass().getResource("/Imagenes/8.jpg")); */
  }
  
}
