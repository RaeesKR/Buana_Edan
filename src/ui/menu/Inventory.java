/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.menu;

/**
 *
 * @author Dhenis
 */
import main.mainFrame;
import model.Player;
import model.Weapon;
import model.Armor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Inventory extends javax.swing.JPanel {

    /**
     * Creates new form Inventory
     */
    private mainFrame mainFrame;
    private Player player;

    private DefaultListModel<Object> listModel;

    public Inventory() {
        initComponents();
    }
    
    public Inventory(mainFrame mainFrame) {
    this.mainFrame = mainFrame;
    this.player = (mainFrame != null) ? mainFrame.getPlayer() : null;

    initComponents();
    initLogic();
    refreshAll();
    }
    
    private void initLogic() {
    listModel = new DefaultListModel<>();
    listItems.setModel(listModel);
    listItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    listItems.setCellRenderer(new DefaultListCellRenderer() {
        @Override
        public Component getListCellRendererComponent(
                JList<?> list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {

            JLabel lbl = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);

            if (value instanceof Weapon w) {
                lbl.setText(w.getName() +
                        " (+" + w.getAttack() + " atk)" +
                        ((player != null && w.equals(player.getEquippedWeapon())) ? "  [EQUIPPED]" : ""));
            } else if (value instanceof Armor a) {
                lbl.setText(a.getName() +
                        " (+" + a.getDefense() + " HP)" +
                        ((player != null && a.equals(player.getEquippedArmor())) ? "  [EQUIPPED]" : ""));
            }
            return lbl;
        }
    });

    listItems.addListSelectionListener(e -> updateDetail());

    btnEquip.addActionListener(e -> onEquip());
    btnDrop.addActionListener(e -> onDrop());
    btnBack.addActionListener(e -> onBack());
    }
    
    private void refreshAll() {
        if (player == null) {
            lblStats.setText("Stats: (no player)");
            listModel.clear();
            lblDetail.setText("");
            return;
        }
        lblStats.setText("HP: " + player.getHp() + " / " + player.getMaxHp() + "   Attack: " + player.getAttack());
        listModel.clear();
        for (Object it : player.getInventory()) {
            listModel.addElement(it);
        }
        updateDetail();
    }
    
    private void updateDetail() {
        Object sel = listItems.getSelectedValue();
        if (sel == null) {
            lblDetail.setText("Pilih item untuk melihat detail.");
            return;
        }
        if (sel instanceof Weapon) {
            Weapon w = (Weapon) sel;
            lblDetail.setText("Weapon: " + w.getName() + " - Attack: +" + w.getAttack());
        } else if (sel instanceof Armor) {
            Armor a = (Armor) sel;
            lblDetail.setText("Armor: " + a.getName() + " - HP Bonus: +" + a.getDefense());
            lblDetail.getIcon();
        } else {
            lblDetail.setText(sel.toString());
        }
    }

    private void onEquip() {
        Object sel = listItems.getSelectedValue();
        if (player == null) return;
        if (sel == null) {
            JOptionPane.showMessageDialog(this, "Pilih item terlebih dahulu.");
            return;
        }
        if (sel instanceof Weapon || sel instanceof Armor) {
            boolean wasEquipped = (sel instanceof Weapon && sel.equals(player.getEquippedWeapon())) || (sel instanceof Armor && sel.equals(player.getEquippedArmor()));
            if (wasEquipped) {
                player.unequipItem(sel);
                JOptionPane.showMessageDialog(this, "Item dilepas dari equip.");
            } else {
                player.equipItem(sel);
                JOptionPane.showMessageDialog(this, "Item di-equip.");
            }
            refreshAll();
        } else {
            JOptionPane.showMessageDialog(this, "Item ini tidak dapat di-equip.");
        }
    }

    private void onDrop() {
        Object sel = listItems.getSelectedValue();
        if (player == null) return;
        if (sel == null) {
            JOptionPane.showMessageDialog(this, "Pilih item terlebih dahulu.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin membuang item ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        boolean removed = player.removeItem(sel);
        if (removed) {
            JOptionPane.showMessageDialog(this, "Item dibuang dari inventory.");
            refreshAll();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal membuang item.");
        }
    }

    private void onBack() {
        if (mainFrame != null) {
            mainFrame.showPanel(new menuPanel(mainFrame));
        }
    }

    // Public API so callers can update the player or force a refresh
    public void setPlayer(Player player) {
        this.player = player;
        refreshAll();
    }

    public void refresh() {
        refreshAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblStats = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItems = new javax.swing.JList<>();
        panelRight = new javax.swing.JPanel();
        btnEquip = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDetail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/background/UI BACKGROUND.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStats.setBackground(new java.awt.Color(255, 0, 0));
        lblStats.setForeground(new java.awt.Color(255, 0, 0));
        lblStats.setText("HP : - / - Attack : -");
        add(lblStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/background/UI BACKGROUND.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setEnabled(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 760, 460));

        listItems.setBackground(new java.awt.Color(204, 204, 204));
        listItems.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(listItems);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 780, 480));

        panelRight.setBackground(new java.awt.Color(153, 153, 153));
        panelRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEquip.setText("Equip / Unequip");

        btnDrop.setText("Delete");

        btnBack.setText("Back");

        lblDetail.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRightLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnEquip)
                .addGap(18, 18, 18)
                .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRightLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRightLayout.createSequentialGroup()
                        .addGroup(panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEquip)
                            .addComponent(btnDrop)
                            .addComponent(btnBack))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRightLayout.createSequentialGroup()
                        .addComponent(lblDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        add(panelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 780, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/background/UI BACKGROUND.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnEquip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetail;
    private javax.swing.JLabel lblStats;
    private javax.swing.JList<Object> listItems;
    private javax.swing.JPanel panelRight;
    // End of variables declaration//GEN-END:variables
}
