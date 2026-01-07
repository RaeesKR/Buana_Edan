/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.map;

import main.mainFrame;
import ui.menu.*;
import javax.swing.*;
import java.awt.event.*;
import model.Player;
import ui.map.*;

public class mapPanel extends javax.swing.JPanel {

    private Player player;
    private mainFrame mainFrame;
    
    public mapPanel() {
        initComponents();
    }
    
    public mapPanel(mainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }
    
        public void setPlayer(Player player) {
        this.player = player;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLevel1 = new javax.swing.JButton();
        btnLevel2 = new javax.swing.JButton();
        btnLevel3 = new javax.swing.JButton();
        btnLevel4 = new javax.swing.JButton();
        btnLevel5 = new javax.swing.JButton();
        btnLevel6 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLevel1.setText("Level 1");
        btnLevel1.setBorderPainted(false);
        btnLevel1.setContentAreaFilled(false);
        btnLevel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel1ActionPerformed(evt);
            }
        });
        add(btnLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 238, 10, 10));

        btnLevel2.setText("Level 2");
        btnLevel2.setBorderPainted(false);
        btnLevel2.setContentAreaFilled(false);
        btnLevel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel2ActionPerformed(evt);
            }
        });
        add(btnLevel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 313, 10, 10));

        btnLevel3.setText("Level 3");
        btnLevel3.setBorderPainted(false);
        btnLevel3.setContentAreaFilled(false);
        btnLevel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel3ActionPerformed(evt);
            }
        });
        add(btnLevel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 244, 10, 10));

        btnLevel4.setText("Level 4");
        btnLevel4.setBorderPainted(false);
        btnLevel4.setContentAreaFilled(false);
        btnLevel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel4ActionPerformed(evt);
            }
        });
        add(btnLevel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 336, 10, 10));

        btnLevel5.setText("Level 5");
        btnLevel5.setBorderPainted(false);
        btnLevel5.setContentAreaFilled(false);
        btnLevel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel5ActionPerformed(evt);
            }
        });
        add(btnLevel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 258, 10, 10));

        btnLevel6.setText("Level 6");
        btnLevel6.setBorderPainted(false);
        btnLevel6.setContentAreaFilled(false);
        btnLevel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLevel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel6ActionPerformed(evt);
            }
        });
        add(btnLevel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 266, 10, 10));

        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 11, 41, 15));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/background/MAP.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel1ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel1(mainFrame));
    }//GEN-LAST:event_btnLevel1ActionPerformed

    private void btnLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel2ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel2(mainFrame));
    }//GEN-LAST:event_btnLevel2ActionPerformed

    private void btnLevel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel5ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel5(mainFrame));
    }//GEN-LAST:event_btnLevel5ActionPerformed

    private void btnLevel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel3ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel3(mainFrame));
    }//GEN-LAST:event_btnLevel3ActionPerformed

    private void btnLevel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel4ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel4(mainFrame));
    }//GEN-LAST:event_btnLevel4ActionPerformed

    private void btnLevel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel6ActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new mapLevel6(mainFrame));
    }//GEN-LAST:event_btnLevel6ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanel(new menuContinuePanel(mainFrame));
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLevel1;
    private javax.swing.JButton btnLevel2;
    private javax.swing.JButton btnLevel3;
    private javax.swing.JButton btnLevel4;
    private javax.swing.JButton btnLevel5;
    private javax.swing.JButton btnLevel6;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
