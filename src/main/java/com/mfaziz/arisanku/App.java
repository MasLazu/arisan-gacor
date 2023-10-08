package com.mfaziz.arisanku;

import com.mfaziz.arisanku.view.*;
import com.formdev.flatlaf.FlatLightLaf;
import com.mfaziz.arisanku.entity.Arisan;
import com.mfaziz.arisanku.entity.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
    private final JFrame frame;
    public User currentUser;
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            
            try {
                Store.seed();
            } catch(Exception e) {
                System.out.println("seeding error : " + e.getMessage());
            }
            
            app.showLoginView();
            app.centerFrame();
        });
    }
    
    public App(){
        this.frame = new JFrame("Arisanku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public void centerFrame() {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void showPopupInformation(String message) {
        JOptionPane.showMessageDialog(
                frame,
                message,
                "success",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void showPopupError(String message) {
        JOptionPane.showMessageDialog(
                frame,
                message,
                "error",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    public int showPopupPanel(JPanel panel, String title) {
        return JOptionPane.showConfirmDialog(
                frame,
                panel,
                title,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
    }
    
    private void changeView(JPanel view) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(view);
        frame.revalidate();
        frame.repaint();
    }
    
    public void showArisanDetailView(Arisan arisan) {
        changeView(new ArisanDetailView(this, arisan));
        frame.setSize(850, 550);
    }
    
    public void showExploreView() {
        changeView(new ExploreView(this));
        frame.setSize(850, 550);
    }
    
    public void showYourArisanView() {
        changeView(new YourArisanView(this));
        frame.setSize(850, 550);
    }
    
    public void showProfileView() {
        changeView(new ProfileView(this));
        frame.setSize(850, 550);
    }
    
    public void showLoginView() {
        changeView(new LoginView(this));
        frame.setSize(370, 650);
    }
    
    public void showRegisterView() {
        changeView(new RegisterView(this));
        frame.setSize(370, 650);
    }
    
    public void showLeaderboardView() {
        changeView(new LeaderboardView(this));
        frame.setSize(850, 550);
    }
}
