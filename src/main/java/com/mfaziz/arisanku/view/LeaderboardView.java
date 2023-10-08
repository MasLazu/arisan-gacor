package com.mfaziz.arisanku.view;

import com.mfaziz.arisanku.App;
import com.mfaziz.arisanku.Store;
import com.mfaziz.arisanku.entity.User;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class LeaderboardView extends javax.swing.JPanel {
    private App app;

    public LeaderboardView(App app) {
        this.app = app;
        initComponents();
        refreshData();
    }
    
    private void refreshData() {
        ArrayList<User> rank = Store.getRank();
        
        firstName.setText(rank.get(0).username);
        secondName.setText(rank.get(1).username);
        thirdName.setText(rank.get(2).username);
        
        firstBalance.setText("Rp. " + rank.get(0).getBalance());
        secondBalance.setText("Rp. " + rank.get(1).getBalance());
        thirdBalance.setText("Rp. " + rank.get(2).getBalance());
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);
        
        for(int i=3; i<rank.size(); i++) {
            model.addRow(new Object[]{
                i+1,
                rank.get(i).username,
                "Rp. " + rank.get(i).getBalance(),
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutMenu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        exporeMenu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        yourArisanMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        leaderboardMenu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        profileMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        secondBalance = new javax.swing.JLabel();
        secondName = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        firstBalance = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        thirdBalance = new javax.swing.JLabel();
        thirdName = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(137, 176, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 500));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Arisanku");

        logoutMenu.setBackground(new java.awt.Color(137, 176, 212));
        logoutMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setText("Logout");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\logout.png")); // NOI18N

        javax.swing.GroupLayout logoutMenuLayout = new javax.swing.GroupLayout(logoutMenu);
        logoutMenu.setLayout(logoutMenuLayout);
        logoutMenuLayout.setHorizontalGroup(
            logoutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logoutMenuLayout.setVerticalGroup(
            logoutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(137, 176, 212));
        jPanel15.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        exporeMenu.setBackground(new java.awt.Color(137, 176, 212));
        exporeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exporeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exporeMenuMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("Explore Arisan");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\compass.png")); // NOI18N

        javax.swing.GroupLayout exporeMenuLayout = new javax.swing.GroupLayout(exporeMenu);
        exporeMenu.setLayout(exporeMenuLayout);
        exporeMenuLayout.setHorizontalGroup(
            exporeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exporeMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exporeMenuLayout.setVerticalGroup(
            exporeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exporeMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exporeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(exporeMenu);

        yourArisanMenu.setBackground(new java.awt.Color(137, 176, 212));
        yourArisanMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yourArisanMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yourArisanMenuMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Your Arisan");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\lottery.png")); // NOI18N

        javax.swing.GroupLayout yourArisanMenuLayout = new javax.swing.GroupLayout(yourArisanMenu);
        yourArisanMenu.setLayout(yourArisanMenuLayout);
        yourArisanMenuLayout.setHorizontalGroup(
            yourArisanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yourArisanMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        yourArisanMenuLayout.setVerticalGroup(
            yourArisanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yourArisanMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yourArisanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(yourArisanMenu);

        leaderboardMenu.setBackground(new java.awt.Color(137, 176, 212));
        leaderboardMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderboardMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaderboardMenuMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 250, 250));
        jLabel14.setText("Leaderboard");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\podium.png")); // NOI18N

        javax.swing.GroupLayout leaderboardMenuLayout = new javax.swing.GroupLayout(leaderboardMenu);
        leaderboardMenu.setLayout(leaderboardMenuLayout);
        leaderboardMenuLayout.setHorizontalGroup(
            leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leaderboardMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leaderboardMenuLayout.setVerticalGroup(
            leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(leaderboardMenu);

        profileMenu.setBackground(new java.awt.Color(137, 176, 212));
        profileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMenuMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 250, 250));
        jLabel9.setText("Profile");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\profile-user.png")); // NOI18N

        javax.swing.GroupLayout profileMenuLayout = new javax.swing.GroupLayout(profileMenu);
        profileMenu.setLayout(profileMenuLayout);
        profileMenuLayout.setHorizontalGroup(
            profileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        profileMenuLayout.setVerticalGroup(
            profileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.add(profileMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(577, 501));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Leaderboard");

        table.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Rank", "Name", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);
        table.setDefaultRenderer(Object.class, (JTable t, Object value, boolean isSelected, boolean hasFocus, int row, int column) -> {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            return renderer.getTableCellRendererComponent(t, value, isSelected, hasFocus, row, column);
        });

        jPanel8.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        jPanel11.setBackground(new java.awt.Color(224, 223, 128));

        secondBalance.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        secondBalance.setForeground(new java.awt.Color(255, 255, 255));
        secondBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondBalance.setText("Rp. 2147483647");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        secondName.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        secondName.setForeground(new java.awt.Color(51, 51, 51));
        secondName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondName.setText("Elon Musk");
        secondName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(secondName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondName, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.add(jPanel9);

        jPanel7.setBackground(new java.awt.Color(224, 143, 132));

        firstBalance.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        firstBalance.setForeground(new java.awt.Color(255, 255, 255));
        firstBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstBalance.setText("Rp. 2147483647");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        firstName.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        firstName.setForeground(new java.awt.Color(51, 51, 51));
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstName.setText("Elon Musk");
        firstName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(jPanel12);

        jPanel10.setBackground(new java.awt.Color(141, 235, 171));

        thirdBalance.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        thirdBalance.setForeground(new java.awt.Color(255, 255, 255));
        thirdBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdBalance.setText("Rp. 2147483647");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thirdBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thirdBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        thirdName.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        thirdName.setForeground(new java.awt.Color(51, 51, 51));
        thirdName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdName.setText("Elon Musk");
        thirdName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(thirdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thirdName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.add(jPanel13);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMenuMouseClicked
        app.showProfileView();
    }//GEN-LAST:event_profileMenuMouseClicked

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        app.showLoginView();
        app.centerFrame();
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void leaderboardMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardMenuMouseClicked
        app.showLeaderboardView();
    }//GEN-LAST:event_leaderboardMenuMouseClicked

    private void exporeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exporeMenuMouseClicked
        app.showExploreView();
    }//GEN-LAST:event_exporeMenuMouseClicked

    private void yourArisanMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yourArisanMenuMouseClicked
        app.showYourArisanView();
    }//GEN-LAST:event_yourArisanMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exporeMenu;
    private javax.swing.JLabel firstBalance;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leaderboardMenu;
    private javax.swing.JPanel logoutMenu;
    private javax.swing.JPanel profileMenu;
    private javax.swing.JLabel secondBalance;
    private javax.swing.JLabel secondName;
    private javax.swing.JTable table;
    private javax.swing.JLabel thirdBalance;
    private javax.swing.JLabel thirdName;
    private javax.swing.JPanel yourArisanMenu;
    // End of variables declaration//GEN-END:variables
}
