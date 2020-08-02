
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahit
 */
public class Giris_Ekrani extends javax.swing.JFrame {

    /**
     * Creates new form Giris_Ekrani
     */
    public Giris_Ekrani() {
        initComponents();
        
        setTitle("Giriş Ekranı");
        
        
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        tc_label = new javax.swing.JLabel();
        sifre_label = new javax.swing.JLabel();
        tc_field = new javax.swing.JTextField();
        sifre_field = new javax.swing.JTextField();
        giris_buton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tc_label.setText("Tc");

        sifre_label.setText("Şifre");

        tc_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tc_fieldKeyTyped(evt);
            }
        });

        sifre_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sifre_fieldKeyTyped(evt);
            }
        });

        giris_buton.setText("Giriş Yap");
        giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Çam Eczanesi");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nahit\\Documents\\NetBeansProjects\\Eczane_Yönetim_Sistemi\\iconlar\\pharmacy-logo-4729C66E18-seeklogo.com.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tc_label)
                                    .addComponent(sifre_label))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(giris_buton)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tc_label)
                    .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre_label)
                    .addComponent(sifre_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(giris_buton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Database_Connect islem = new Database_Connect();
        
    public Connection conn = islem.con;
    
    
    
    private void tc_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tc_fieldKeyTyped

        
        
        String metin = tc_field.getText();
        int uzunluk = metin.length();

        char karakter = evt.getKeyChar();
               
        
        
        if( !(Character.isDigit(karakter)) )
        {
            evt.consume();
        }
        
        if(uzunluk>=11)
        {
          evt.consume();
        }    
        
        
    }//GEN-LAST:event_tc_fieldKeyTyped

    private void sifre_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifre_fieldKeyTyped
       
        String metin = sifre_field.getText();
        int uzunluk = metin.length();

        char karakter = evt.getKeyChar();
               
        
        
        if( !(Character.isDigit(karakter)) )
        {
            evt.consume();
        }
        
        if(uzunluk>=4)
        {
          evt.consume();
        }    
        
        
    }//GEN-LAST:event_sifre_fieldKeyTyped

    private void giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonActionPerformed
        
        
        
        String tc=tc_field.getText();
        String sifre=sifre_field.getText();
        
        int tc_uzunluk=tc.length();
        
        int sifre_uzunluk=sifre.length();
        
        
        if(tc_uzunluk!=11 || sifre_uzunluk!=4)
        {
            JOptionPane.showMessageDialog(this,"Tc kimlik numaranızı veya şifrenizi eksik tuşladınız!","UYARI",JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        
        boolean giris_kontrol=GirisYapTc(tc,sifre);
        
     
        if(!(giris_kontrol))
        {
            
           JOptionPane.showMessageDialog(this,"Sistemde böyle bir kullanıcı bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE);
            
           return; 
            
        }    
        
        ilac_islem_ekrani ekran = new ilac_islem_ekrani();
        
        this.dispose();
        
        ekran.setVisible(true);
        
    }//GEN-LAST:event_giris_butonActionPerformed

    
    public boolean GirisYapTc(String tc,String sifre)
    {
        
        String sorgu= " Select per_tc_no,per_sifre from "
                + "eys_per_kimlik_bilgileri"
                + " where Per_tc_no =? and per_sifre=?";
        
        
        
        try
        {
            PreparedStatement st = conn.prepareStatement(sorgu);

           
            st.setString(1,tc); //Soru işareti yerine tc gönderiyoruz
            st.setString(2,sifre);
            
            ResultSet rs = st.executeQuery();
            
           
            if(rs.next())
            {
                return true;
            }    
            
        } 
        
        
        
        catch (SQLException ex)
        {
             Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        
        return false;
        
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
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_buton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sifre_field;
    private javax.swing.JLabel sifre_label;
    private javax.swing.JTextField tc_field;
    private javax.swing.JLabel tc_label;
    // End of variables declaration//GEN-END:variables
}
