package com.mfaziz.arisanku.view;

import com.mfaziz.arisanku.App;
import com.mfaziz.arisanku.entity.Arisan;
import com.mfaziz.arisanku.entity.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ArisanDetailView extends javax.swing.JPanel {
    private App app;
    private Arisan arisan;

    public ArisanDetailView(App app, Arisan arisan) {
        this.app = app;
        this.arisan = arisan;
        initComponents();
        fillData();
    }

    private void fillData() {
        idLabel.setText(": " + arisan.getId());
        nameLabel.setText(": " + arisan.name);
        totalMemberLabel.setText(": " + arisan.getTotalMember());
        prizeLabel.setText(": " + arisan.getPrize());
        priceLabel.setText(": " + arisan.getPrice());
        statusLabel.setText(": " + (arisan.getDuringSession()? "during seasion" : "not in season"));

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);

        boolean isMember = false;
        for (User member : arisan.getMembers()) {
            if (member.equals(app.currentUser)) {
                isMember = true;
            }

            String status = "don't know why you ask me";
            if (!arisan.getDuringSession()) {
                status = "not in season";
            } else {
                try {
                    boolean haveWon = arisan.isUserWon(member);
                    if (haveWon) {
                        status = "have won";
                    } else {
                        status = "not won yet";
                    }
                } catch (Exception e) {
                    app.showPopupError(e.getMessage());
                }
            }

            model.addRow(new Object[]{
                member.username,
                arisan.getAdmin().equals(member) ? "admin" : "member",
                status,});
        }

        if (arisan.getAdmin().equals(app.currentUser)) {
            if (arisan.getDuringSession()) {
                actionButton.setText("Draw");
            } else {
                actionButton.setText("Start Season");
            }

            actionButton.setBackground(new Color(224, 223, 130));
        } else if (isMember) {
            actionButton.setText("Leave");
            actionButton.setBackground(new Color(224, 133, 130));
        } else {
            actionButton.setText("Join");
            actionButton.setBackground(new Color(139, 224, 160));
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
        jPanel20 = new javax.swing.JPanel();
        exploreMenu = new javax.swing.JPanel();
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
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        totalMemberLabel = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        prizeLabel = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        actionButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(137, 176, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

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

        jPanel20.setBackground(new java.awt.Color(137, 176, 212));
        jPanel20.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        exploreMenu.setBackground(new java.awt.Color(137, 176, 212));
        exploreMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exploreMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exploreMenuMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("Explore Arisan");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\compass.png")); // NOI18N

        javax.swing.GroupLayout exploreMenuLayout = new javax.swing.GroupLayout(exploreMenu);
        exploreMenu.setLayout(exploreMenuLayout);
        exploreMenuLayout.setHorizontalGroup(
            exploreMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exploreMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exploreMenuLayout.setVerticalGroup(
            exploreMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exploreMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exploreMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.add(exploreMenu);

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

        jPanel20.add(yourArisanMenu);

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

        jPanel20.add(leaderboardMenu);

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

        jPanel20.add(profileMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(logoutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel13.setBackground(new java.awt.Color(137, 176, 212));
        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel13.setLayout(new java.awt.GridLayout(0, 2));

        jPanel15.setBackground(new java.awt.Color(137, 176, 212));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Id");

        idLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText(": 312345");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel15);

        jPanel14.setBackground(new java.awt.Color(137, 176, 212));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");

        nameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText(": RT10");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14);

        jPanel16.setBackground(new java.awt.Color(137, 176, 212));

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Member");

        totalMemberLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        totalMemberLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalMemberLabel.setText(": 10");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalMemberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(totalMemberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(137, 176, 212));

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Prize");

        prizeLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        prizeLabel.setForeground(new java.awt.Color(255, 255, 255));
        prizeLabel.setText(": 1000000");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(137, 176, 212));

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Price");

        priceLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText(": 5000");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(137, 176, 212));

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Status");

        statusLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText(": In session");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel19);

        jLabel16.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Arisan Detail");

        actionButton.setBackground(new java.awt.Color(137, 176, 212));
        actionButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        actionButton.setForeground(new java.awt.Color(255, 255, 255));
        actionButton.setText("action");
        actionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actionButtonMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Member");

        table.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        table.setDefaultRenderer(Object.class, (JTable t, Object value, boolean isSelected, boolean hasFocus, int row, int column) -> {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            return renderer.getTableCellRendererComponent(t, value, isSelected, hasFocus, row, column);
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionButton))
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(actionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionButtonMouseClicked
        String action = actionButton.getText();
        boolean inSeason = arisan.getDuringSession();
        try {
            if (action.equals("Join")) {
                arisan.addMember(app.currentUser);
            } else if (action.equals("Leave")) {
                arisan.removeMember(app.currentUser);
            } else if (action.equals("Start Season")) {
                arisan.startSeason();
            } else if (action.equals("Draw")) {
                String winnerName = arisan.draw();
                GridLayout layout = new GridLayout(2, 1);
                layout.setVgap(3);

                JPanel panel = new JPanel(layout);

                JLabel imageLabel = new JLabel(
                        new ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\open-box.png")
                );

                JLabel messageLabel = new JLabel("Gacor " + winnerName + "! Max Win!");
                messageLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 16));
                messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

                panel.add(imageLabel, BorderLayout.CENTER);
                panel.add(messageLabel, BorderLayout.SOUTH);

                JOptionPane.showMessageDialog(
                        null,
                        panel,
                        "Draw",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        } catch(Exception e) {
            app.showPopupError(e.getMessage());
        }
        fillData();
    }//GEN-LAST:event_actionButtonMouseClicked

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        app.showLoginView();
        app.centerFrame();
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void exploreMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMenuMouseClicked
        app.showExploreView();
    }//GEN-LAST:event_exploreMenuMouseClicked

    private void leaderboardMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardMenuMouseClicked
        app.showLeaderboardView();
    }//GEN-LAST:event_leaderboardMenuMouseClicked

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMenuMouseClicked
        app.showProfileView();
    }//GEN-LAST:event_profileMenuMouseClicked

    private void yourArisanMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yourArisanMenuMouseClicked
        app.showYourArisanView();
    }//GEN-LAST:event_yourArisanMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JPanel exploreMenu;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leaderboardMenu;
    private javax.swing.JPanel logoutMenu;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel prizeLabel;
    private javax.swing.JPanel profileMenu;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable table;
    private javax.swing.JLabel totalMemberLabel;
    private javax.swing.JPanel yourArisanMenu;
    // End of variables declaration//GEN-END:variables
}
