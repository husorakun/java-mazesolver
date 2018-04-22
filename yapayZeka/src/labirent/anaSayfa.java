//EuzubillAhimineşşeydanirracim Bismillahirrahmanirrahim
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirent;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class anaSayfa extends javax.swing.JFrame {
    private final List<Integer> yol=new ArrayList<Integer>();
    /**
     * Creates new form NewJFrame
     */
    public anaSayfa() {
        initComponents();
        setSize(540,480);
        deepSearch derinAlgılama=new deepSearch();
       
        derinAlgılama.yolAra(labirent, 1, 1, yol);
        System.out.println(yol);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int[][] labirent={
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,1,1,0,1,0,0,0,0,0,1},
        {1,1,0,0,0,0,1,0,1,1,1,0,1},
        {1,0,0,0,1,1,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,1,1},
        {1,0,1,0,1,0,0,0,1,0,0,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,1,1},
        {1,0,1,0,0,0,0,0,0,0,0,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    int labirent2[][]=new int[4][4] ;
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.translate(50, 50);
        for(int satir=0;satir<labirent.length;satir++){
            for(int sutun=0;sutun<labirent[0].length;sutun++){
                Color renk;
                switch (labirent[satir][sutun]){
                    case 1:
                        renk=Color.BLACK;
                        break;
                    case 9:
                        renk=Color.RED;
                        break;
                    default:
                        renk=Color.WHITE;
                    }
                g.setColor(renk);
                g.fillRect(30*sutun, 30*satir, 30, 30);
                g.setColor(Color.BLACK);
                g.drawRect(30*sutun, 30*satir, 30, 30);
            }
        }
        for(int y=0;y<yol.size();y+=2){
            int yolX=yol.get(y);
            int yolY=yol.get(y+1);
            g.setColor(Color.GREEN);
            g.fillRect(30*yolX, 30*yolY, 30, 30);
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
            java.util.logging.Logger.getLogger(anaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}