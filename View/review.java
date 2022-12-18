
package doctor.review;

import java.awt.Color;
import java.awt.Component;


public class doctor.review extends javax.swing.JPanel {
    



    public StarRating() {
        initComponents();
        init();
    }
    private void init(){
        setOpaque(false);
        setBackground(new Color(204,204,204));
        setForeground(new Color(238,236,0));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        star1 = new review.Star();
        star2 = new review.Star();
        star3 = new review.Star();
        star4 = new review.Star();
        star5 = new review.Star();

        setLayout(new java.awt.GridLayout(1, 5));

        star1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star1ActionPerformed(evt);
            }
        });
        add(star1);

        star2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star2ActionPerformed(evt);
            }
        });
        add(star2);

        star3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star3ActionPerformed(evt);
            }
        });
        add(star3);

        star4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star4ActionPerformed(evt);
            }
        });
        add(star4);

        star5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star5ActionPerformed(evt);
            }
        });
        add(star5);
    }// </editor-fold>//GEN-END:initComponents

    private void star1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star1ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(false);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star1ActionPerformed

    private void star2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star2ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star2ActionPerformed

    private void star3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star3ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star3ActionPerformed

    private void star4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star4ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(false);
    }//GEN-LAST:event_star4ActionPerformed

    private void star5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star5ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(true);
    }//GEN-LAST:event_star5ActionPerformed


    @Override
    public void setBackground(Color color){
        super.setBackground(color);
        for(Component com : getComponents()){
            com.setBackground(color);
            
        }     
    }
    
    @Override
    public void setForeground(Color color){
        super.setForeground(color);
        for(Component com : getComponents()){
             com.setForeground(color);
        }
        
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private review.Star star1;
    private review.Star star2;
    private review.Star star3;
    private review.Star star4;
    private review.Star star5;
    // End of variables declaration//GEN-END:variables
}
