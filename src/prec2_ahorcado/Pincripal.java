/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prec2_ahorcado;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Pincripal extends javax.swing.JFrame {

    public JButton btns[] = new JButton[27];
    public int error;
    Palabras palabra = new Palabras();
    ImagenAhorcado im = new ImagenAhorcado();
    int contador = 0;
    public String respuesta_final = " ";
    ArrayList<String> user_rspta = new ArrayList<String>();
    public String temp_rspta = "";
    public String res[];
    private String pal[];
    private ArrayList<String> clon = new ArrayList<String>();
    boolean perder = false;
    String respuesta;
    
    public Pincripal() {
        initComponents();
        iniciar();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logo.png")).getImage());
        setLocationRelativeTo(null);
    }
    
    public void  iniciar(){
        asignar_letra_teclado();
        recibir_letra();
        cambiar_img();
        poner_guiones_en_respuesta();
    }
    
    public void desbloquear_botones(){
        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
        }
    }
    
    public void mostrar_mensaje(String header,String texto){
         JOptionPane.showMessageDialog(
                        this,
                        header,
                        texto,
                        JOptionPane.INFORMATION_MESSAGE );
    }
    
    public boolean verificar_si_completo_respuesta(){
        String avanze = "";
        for (int i = 0; i < clon.size(); i++) {
            avanze += clon.get(i);
        }
        if(avanze.equals(respuesta)){
            return true;
        }else{
            return false;
        }
    }
    
    public void recibir_letra(){
        for (int i = 1; i < 27; i++) {
            final int index = i;
            btns[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    System.out.println("click");
                    if(perder == false){
                        String letra = ae.getActionCommand();
                        user_rspta.add(letra);
                        ArrayList<Integer>  validar = verificar_letra(letra);
                        if(validar != null){
                            actualizar_palabra(letra,validar);
                        }else{
                            if(contador < 8){
                                contador++;
                                cambiar_img();
                                System.out.println("contador "+contador);
                                if(contador == 8){
                                    perder = true;
                                    mostrar_mensaje("¡Mala suerte!","Acabas de perder");
                                    reiniciar_juego();
                                    return;
                                }
                            }
                        }
                    }
                    btns[index].setEnabled(false);
                    boolean termino = verificar_si_completo_respuesta();
                    if(termino == true){
                        mostrar_mensaje("¡Ganaste!","Felicidades lo has conseguido");
                        reiniciar_juego();
                        return;
                    }
                } 
            });
        }
    }
    
    public void reiniciar_juego(){
        clon.clear();
        contador = 0;
        cambiar_img();
        poner_guiones_en_respuesta();
        desbloquear_botones();
        perder = false;
    }
    
    public ArrayList<Integer> verificar_letra(String letra ){
       ArrayList<Integer> indices = new ArrayList<Integer>();
       for (int i = 0; i < pal.length ; i++) {
           if(letra.equals(pal[i])){
               indices.add(i);
           }
       }
       if(indices.size() > 0){
           return indices;
       }else{
           return null;
       }
    }
     
    public void poner_guiones_en_respuesta(){
        txtPalabra.setText("");
        respuesta = palabra.escogerPalabra();
        System.out.println(respuesta);
        //split es para trabajar con listas de palabras y darles una separación
        pal = respuesta.split("");
        String rayitas = "";
        for (int i = 0; i < pal.length ; i++) {
            rayitas += "_ ";
            clon.add("_ ");
        }
        txtPalabra.setText(rayitas);
    }
    
    public void actualizar_palabra(String letra, ArrayList<Integer> ind_rsp){
        txtPalabra.setText("");
        String txt_final = "";
        for (int i = 0; i < ind_rsp.size() ; i++) {
            clon.set(ind_rsp.get(i),letra);
        }
        for (int e = 0; e < clon.size() ; e++) {
            txt_final += clon.get(e);
        }
        txtPalabra.setText(txt_final);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAhorcado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPalabra = new javax.swing.JTextPane();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAhorcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAhorcadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 344, 401));

        txtPalabra.setEditable(false);
        txtPalabra.setBackground(new java.awt.Color(255, 255, 204));
        txtPalabra.setFont(new java.awt.Font("hooge 05_53", 1, 18)); // NOI18N
        txtPalabra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtPalabra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 96, 341, 67));

        btnA.setBackground(new java.awt.Color(255, 255, 255));
        btnA.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnA.setText("A");
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 256, -1, -1));

        btnB.setBackground(new java.awt.Color(255, 255, 255));
        btnB.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnB.setText("B");
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 256, -1, -1));

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnC.setText("C");
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 256, -1, -1));

        btnD.setBackground(new java.awt.Color(255, 255, 255));
        btnD.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnD.setText("D");
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 256, -1, -1));

        btnE.setBackground(new java.awt.Color(255, 255, 255));
        btnE.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnE.setText("E");
        jPanel1.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 256, -1, -1));

        btnF.setBackground(new java.awt.Color(255, 255, 255));
        btnF.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnF.setText("F");
        jPanel1.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 256, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 256, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 295, -1, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 295, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 295, -1, -1));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 295, -1, -1));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 295, -1, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 295, -1, -1));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 337, -1, -1));

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 337, -1, -1));

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 337, -1, -1));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 337, -1, -1));

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 337, -1, -1));

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 337, -1, -1));

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 337, -1, -1));

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 374, -1, -1));

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 374, -1, -1));

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 374, -1, -1));

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 374, -1, -1));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 374, -1, -1));

        jButton28.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton28.setText("Reiniciar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 181, 177, 57));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1049, 500, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        jLabel3.setText(" ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 42, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1049, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel6.setText("PESONAJES DE DRAGON BALL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 55, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAhorcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAhorcadoActionPerformed
        // TODO add your handling code here:
        //contador++;
        //btnAhorcado.setIcon(new ImageIcon(getClass().getResource(im.links.get(contador))));
    }//GEN-LAST:event_btnAhorcadoActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       reiniciar_juego();
    }//GEN-LAST:event_jButton28ActionPerformed
    public void asignar_letra_teclado(){
        //Letras
        btns[1] = btnA;
        btns[2] = btnB;
        btns[3] = btnC;
        btns[4] = btnD;
        btns[5] = btnE;
        btns[6] = btnF;
        btns[7] = jButton8;
        btns[8] = jButton9;
        btns[9] = jButton10;
        btns[10] = jButton11;
        btns[11] = jButton12;
        btns[12] = jButton13;
        btns[13] = jButton14;
        btns[14] = jButton15;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;
    }
    
    public void cambiar_img(){
      try{
        //System.out.println(im.links.get(contador));
        btnAhorcado.setIcon(new ImageIcon(getClass().getResource(im.links.get(contador))));
      }catch (Exception e){
          System.out.println(e);
      }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pincripal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    public static javax.swing.JButton btnAhorcado;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtPalabra;
    // End of variables declaration//GEN-END:variables
}
