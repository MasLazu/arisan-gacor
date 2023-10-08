package com.mfaziz.arisanku.view;

import com.mfaziz.arisanku.App;
import com.mfaziz.arisanku.Store;
import com.mfaziz.arisanku.entity.TransactionHistory;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ProfileView extends javax.swing.JPanel {
    private App app;
    
    public ProfileView(App app) {
        this.app = app;
        initComponents();
        refrashValue();
    }
    
    private void refrashValue() {
        username.setText(app.currentUser.username);
        balance.setText("Rp. " + app.currentUser.getBalance());
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);
        
        ArrayList<TransactionHistory> transactionHistories = app.currentUser.getTransactionHistorys();
        for(int i = transactionHistories.size() - 1; i >= 0; i--) {
            TransactionHistory histories = transactionHistories.get(i);
            
            model.addRow(new Object[]{
                i + 1,
                histories.getMessage(),
                histories.getAmount()>0 ? "+" + histories.getAmount() : histories.getAmount(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        exploreMenu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        yourArisanMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        leaderboardMenu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        profileMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        balance = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        deposit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        withdraw = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        transfer = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(850, 550));

        jPanel1.setBackground(new java.awt.Color(137, 176, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 500));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Arisanku");

        logout.setBackground(new java.awt.Color(137, 176, 212));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setText("Logout");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\logout.png")); // NOI18N

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(137, 176, 212));
        jPanel15.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

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

        jPanel15.add(exploreMenu);

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

        jPanel15.add(yourArisanMenu);

        leaderboardMenu.setBackground(new java.awt.Color(137, 176, 212));
        leaderboardMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderboardMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaderboardMenuMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 250, 250));
        jLabel17.setText("Leaderboard");

        jLabel183.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\podium.png")); // NOI18N

        javax.swing.GroupLayout leaderboardMenuLayout = new javax.swing.GroupLayout(leaderboardMenu);
        leaderboardMenu.setLayout(leaderboardMenuLayout);
        leaderboardMenuLayout.setHorizontalGroup(
            leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leaderboardMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leaderboardMenuLayout.setVerticalGroup(
            leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leaderboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        jPanel18.setPreferredSize(new java.awt.Dimension(577, 501));

        jPanel17.setBackground(new java.awt.Color(137, 176, 212));
        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 10, 30));

        balance.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balance.setText("Rp. 0");
        balance.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(balance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setLayout(new java.awt.GridLayout(1, 3, 15, 0));

        deposit.setBackground(new java.awt.Color(137, 176, 212));
        deposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\money.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Deposit");

        javax.swing.GroupLayout depositLayout = new javax.swing.GroupLayout(deposit);
        deposit.setLayout(depositLayout);
        depositLayout.setHorizontalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        depositLayout.setVerticalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(deposit);

        withdraw.setBackground(new java.awt.Color(137, 176, 212));
        withdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Withdraw");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\wallet.png")); // NOI18N

        javax.swing.GroupLayout withdrawLayout = new javax.swing.GroupLayout(withdraw);
        withdraw.setLayout(withdrawLayout);
        withdrawLayout.setHorizontalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        withdrawLayout.setVerticalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(withdraw);

        transfer.setBackground(new java.awt.Color(137, 176, 212));
        transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Transfer");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\send.png")); // NOI18N

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(transfer);

        jPanel12.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Profile");
        jPanel12.add(jLabel1);

        username.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        username.setText("Username");
        jPanel12.add(username);

        table.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Message", "Transaction"
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

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {                                      
        GridLayout layout = new GridLayout(2, 1);
        layout.setVgap(5);

        JPanel panel = new JPanel(layout);

        JTextField amountInput = new JTextField();

        panel.add(new JLabel("Amount : "));
        panel.add(amountInput);
        
        amountInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) evt.consume();
            }
        });
        
        try {
            int result = app.showPopupPanel(panel, "Deposit");
            if (
                    result == JOptionPane.CANCEL_OPTION || 
                    result == JOptionPane.CLOSED_OPTION
            ) return;
            
            if (amountInput.getText().equals(""))
                throw new Exception("amount can't be empty");
            
            app.currentUser.deposit(
                    Integer.parseInt(amountInput.getText()), 
                    "Deposit"
            );
            refrashValue();
        } catch(Exception e) {
            app.showPopupError(e.getMessage());
        }
    }                                    

    private void transferMouseClicked(java.awt.event.MouseEvent evt) {                                      
        GridLayout layout = new GridLayout(4, 1);
        layout.setVgap(5);

        JPanel panel = new JPanel(layout);

        JTextField amountInput = new JTextField();
        JTextField usernameInput = new JTextField();

        panel.add(new JLabel("Username : "));
        panel.add(usernameInput);
        panel.add(new JLabel("Amount : "));
        panel.add(amountInput);
        
        amountInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) evt.consume();
            }
        });
        
        try {
            int result = app.showPopupPanel(panel, "Transfer");
            
            if (
                    result == JOptionPane.CANCEL_OPTION || 
                    result == JOptionPane.CLOSED_OPTION
            ) return;
            
            if (amountInput.getText().equals(""))
                throw new Exception("amount can't be empty");
            
            if (usernameInput.getText().equals(""))
                throw new Exception("username can't be empty");
            
            app.currentUser.transfer(
                    Store.getUserByUsername(usernameInput.getText()),
                    Integer.parseInt(amountInput.getText())
            );
            refrashValue();
        } catch(Exception e) {
            app.showPopupError(e.getMessage());
        }
    }
    
    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {                                     
        GridLayout layout = new GridLayout(2, 1);
        layout.setVgap(5);

        JPanel panel = new JPanel(layout);

        JTextField amountInput = new JTextField();

        panel.add(new JLabel("Amount : "));
        panel.add(amountInput);
        
        amountInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) evt.consume();
            }
        });
        
        try {
            int result = app.showPopupPanel(panel, "Withdraw");
            
            if (
                    result == JOptionPane.CANCEL_OPTION || 
                    result == JOptionPane.CLOSED_OPTION
            ) return;
            
            if (amountInput.getText().equals(""))
                throw new Exception("amount can't be empty");
            
            app.currentUser.withdraw(
                    Integer.parseInt(amountInput.getText()), 
                    "Withdraw"
            );
            refrashValue();
        } catch(Exception e) {
            app.showPopupError(e.getMessage());
        }
    }

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {
        app.showLoginView();
        app.centerFrame();
    }

    private void exploreMenuMouseClicked(java.awt.event.MouseEvent evt) {
        app.showExploreView();
    }
    
    private void yourArisanMenuMouseClicked(java.awt.event.MouseEvent evt) {
        app.showYourArisanView();
    }

    private void leaderboardMenuMouseClicked(java.awt.event.MouseEvent evt) {
        app.showLeaderboardView();
    }

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {
        app.showProfileView();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JPanel deposit;
    private javax.swing.JPanel exploreMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel leaderboardMenu;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel profileMenu;
    private javax.swing.JTable table;
    private javax.swing.JPanel transfer;
    private javax.swing.JLabel username;
    private javax.swing.JPanel withdraw;
    private javax.swing.JPanel yourArisanMenu;
    // End of variables declaration//GEN-END:variables
}
