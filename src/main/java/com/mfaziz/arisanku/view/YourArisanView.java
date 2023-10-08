package com.mfaziz.arisanku.view;

import com.mfaziz.arisanku.App;
import com.mfaziz.arisanku.Store;
import com.mfaziz.arisanku.entity.Arisan;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class YourArisanView extends javax.swing.JPanel {
    private App app;
    
    public YourArisanView(App app) {
        this.app = app;
        initComponents();
        refreshTable();
    }
    
    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);
        
        for(Arisan arisan: Store.getUserArisan(app.currentUser)) {
            String role = arisan.getAdmin().equals(app.currentUser)? "admin" : "member";
            model.addRow(new Object[]{
                arisan.getId(),
                arisan.name,
                arisan.getPrize(),
                arisan.getTotalMember(),
                role,
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        createBtn = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutMenu = new javax.swing.JPanel();
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

        setPreferredSize(new java.awt.Dimension(850, 550));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(577, 501));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Your Arisan");

        table.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Prize", "Member", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(137, 176, 212));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.setDefaultRenderer(Object.class, (JTable t, Object value, boolean isSelected, boolean hasFocus, int row, int column) -> {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            return renderer.getTableCellRendererComponent(t, value, isSelected, hasFocus, row, column);
        });

        createBtn.setBackground(new java.awt.Color(137, 176, 212));
        createBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\mfazi\\OneDrive\\Documents\\NetBeansProjects\\Arisanku\\src\\main\\assets\\add.png")); // NOI18N
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createBtn))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseClicked
        GridLayout layout = new GridLayout(4, 1);
        layout.setVgap(5);

        JPanel panel = new JPanel(layout);

        JTextField priceInput = new JTextField();
        JTextField nameInput = new JTextField();

        panel.add(new JLabel("Name : "));
        panel.add(nameInput);
        panel.add(new JLabel("Price : "));
        panel.add(priceInput);
        
        priceInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) evt.consume();
            }
        });
        
        try {
            int result = app.showPopupPanel(panel, "Create Arisan");
            
            if (
                    result == JOptionPane.CANCEL_OPTION || 
                    result == JOptionPane.CLOSED_OPTION
            ) return;
            
            if (nameInput.getText().equals(""))
                throw new Exception("name can't be empty");
            if (priceInput.getText().equals(""))
                throw new Exception("price can't be empty");

            Arisan arisan = new Arisan(
                    nameInput.getText(), 
                    Integer.parseInt(priceInput.getText()), 
                    app.currentUser
            );
            
            Store.addArisan(arisan);
            refreshTable();
        } catch(NumberFormatException e) {
            app.showPopupError("price must be a number");
        } catch(Exception e) {
            app.showPopupError(e.getMessage());
        }
    }//GEN-LAST:event_createBtnMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        String arisanId = (String) table.getValueAt(table.getSelectedRow(), 0);
        try {
            app.showArisanDetailView(Store.getArisanById(arisanId));
        } catch(Exception e) {
            app.showPopupError("something went wrong : " + e.getMessage());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        app.showLoginView();
        app.centerFrame();
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void exploreMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exploreMenuMouseClicked
        app.showExploreView();
    }//GEN-LAST:event_exploreMenuMouseClicked

    private void yourArisanMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yourArisanMenuMouseClicked
        app.showYourArisanView();
    }//GEN-LAST:event_yourArisanMenuMouseClicked

    private void leaderboardMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardMenuMouseClicked
        app.showLeaderboardView();
    }//GEN-LAST:event_leaderboardMenuMouseClicked

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMenuMouseClicked
        app.showProfileView();
    }//GEN-LAST:event_profileMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton createBtn;
    private javax.swing.JPanel exploreMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leaderboardMenu;
    private javax.swing.JPanel logoutMenu;
    private javax.swing.JPanel profileMenu;
    private javax.swing.JTable table;
    private javax.swing.JPanel yourArisanMenu;
    // End of variables declaration//GEN-END:variables
}
