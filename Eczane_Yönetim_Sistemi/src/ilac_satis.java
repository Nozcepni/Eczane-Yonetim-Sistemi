
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahit
 */
public class ilac_satis extends javax.swing.JFrame {
    
     public Object item = null;
    
    
     public Statement statement = null;
    
     public PreparedStatement preparedstatement= null;
     
     public  ResultSet resultset = null;
     
     Database_Connect islem = new Database_Connect();
        
     public Connection conn = islem.con;

    /**
     * Creates new form ilac_satis
     */
    public ilac_satis() {
        initComponents();
        
        combo_box_doldur();
                 Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setTitle("İlaç Satış Ekranı");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tc_field = new javax.swing.JTextField();
        ilac_combo = new javax.swing.JComboBox();
        adet_field = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        onayla_buton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ilac_sira_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        getir_buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tc Kimlik No");

        jLabel2.setText("İlaç Adı");

        jLabel3.setText("Adet");

        jLabel4.setText("Satış Tarihi");

        tc_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc_fieldActionPerformed(evt);
            }
        });

        onayla_buton.setText("Satış Yap");
        onayla_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onayla_butonActionPerformed(evt);
            }
        });

        jLabel6.setText("Reçete No");

        jButton1.setText("Satış Kaydını Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Satış Kaydını Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getir_buton.setText("Getir");
        getir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getir_butonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tc Kimlik", "Reçete No", "İlaç Adı", "Adet", "Satış Tarihi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Geri");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ilac_sira_field, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ilac_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adet_field)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(onayla_buton)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(getir_buton))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ilac_sira_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ilac_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onayla_buton)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(getir_buton))
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tc_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tc_fieldActionPerformed

    private void onayla_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onayla_butonActionPerformed

    
        String tc=tc_field.getText();

        item = ilac_combo.getSelectedItem();
        String ilac_adi = ((ComboItem)item).getValue();
        
        String adet = adet_field.getText();
        String recete_no=ilac_sira_field.getText();

        Date sk;
        String sk_tarihi;

        sk = jDateChooser1.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //date formatını değişltirmek için
        sk_tarihi = formatter.format(sk);
        
         try 
         {
      
             
            CallableStatement cs = conn.prepareCall("{call satis_kayit(?,?,?,?,?)}");
             
            cs.setString("musteri_tc",tc);
            cs.setString("ilac_kodu",ilac_adi);
            cs.setString("adet",adet);
            cs.setString("satis_tarihi",sk_tarihi);
            cs.setString("recete_no",recete_no);
                 
            cs.executeQuery();
             
         } 
         
         
         catch (SQLException ex)
         {
       
            String hata_mesajı = ex.getMessage();
            
            boolean pk_kontrol = hata_mesajı.contains("PK");    //Primary Key
              
            boolean null_kontrol = hata_mesajı.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Girdiğiniz ilaç kodu kayitlarda mevcuttur!","UYARI",JOptionPane.WARNING_MESSAGE);


             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "İlaç türü kodu ve ilaç adı boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             return;
                       
            }
             
         }
         
         JOptionPane.showMessageDialog(this, "İlaç satışı başarıyla  gerçekleşmiştir","UYARI",JOptionPane.WARNING_MESSAGE);
        
        
    }//GEN-LAST:event_onayla_butonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String tc=tc_field.getText();

        item = ilac_combo.getSelectedItem();
        String ilac_adi = ((ComboItem)item).getValue();
        
        String adet = adet_field.getText();
        String recete_no=ilac_sira_field.getText();

        Date sk;
        String sk_tarihi;

        sk = jDateChooser1.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //date formatını değişltirmek için
        sk_tarihi = formatter.format(sk);
        
         try 
         {
      
             
            CallableStatement cs = conn.prepareCall("{call satis_guncelle(?,?,?,?,?)}");
             
            cs.setString("musteri_tc",tc);
            cs.setString("ilac_kodu",ilac_adi);
            cs.setString("adet",adet);
            cs.setString("satis_tarihi",sk_tarihi);
            cs.setString("recete_no",recete_no);
                 
            cs.executeQuery();
             
         } 
         
         
         catch (SQLException ex)
         {
             Logger.getLogger(ilac_satis.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         JOptionPane.showMessageDialog(this, "Satış güncelleme işlemi başarıyla gerçekleşmiştir","UYARI",JOptionPane.WARNING_MESSAGE);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String tc=tc_field.getText();

        item = ilac_combo.getSelectedItem();
        String ilac_adi = ((ComboItem)item).getValue();
        
        String recete_no=ilac_sira_field.getText();

      
        
         try 
         {
      
             
            CallableStatement cs = conn.prepareCall("{call satis_sil(?,?,?)}");
             
            cs.setString("musteri_tc",tc);
            cs.setString("ilac_kodu",ilac_adi);
            cs.setString("recete_no",recete_no);
                 
            cs.executeQuery();
             
         } 
         
         
         catch (SQLException ex)
         {
             Logger.getLogger(ilac_satis.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         JOptionPane.showMessageDialog(this, "Satış kaydı silme işlemi başarıyla gerçekleşmiştir","UYARI",JOptionPane.WARNING_MESSAGE);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void getir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getir_butonActionPerformed

        String tc;
        String ilac_adi;
        String satis_tarihi;
        String adet;
        String recete_no;
        
        String sorgu="Select musteri_tc_no,b.ilac_adi,adet,satis_tarihi,recete_no from ilac_satis a,ilac_detay b where a.ilac_kodu=b.ilac_kodu";
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
         try 
         {
             
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               tc=resultset.getString("musteri_tc_no");
               ilac_adi=resultset.getString("ilac_adi");         
               satis_tarihi=resultset.getString("satis_tarihi");
               adet=resultset.getString("adet");
               recete_no=resultset.getString("recete_no");
               
               Object [] eklenecek = {tc,recete_no,ilac_adi,adet,satis_tarihi};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
             
            
             
         } 
         
         
         catch (SQLException ex)
         {
             Logger.getLogger(ilac_satis.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
        
    }//GEN-LAST:event_getir_butonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.dispose();
        ilac_islem_ekrani ekran = new ilac_islem_ekrani();
        ekran.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
     public void combo_box_doldur()
     {
         
        //Uretici COMBOBOX DOLDURMA İŞLEMLERİ
        String ilac_satis ="Select ilac_kodu,ilac_adi"
                      + " from ilac_detay order by ilac_kodu";
    
      
    
        resultset = Getir(ilac_satis );
        
         try 
        {
            while (resultset.next())
            { 
                
                ilac_combo.addItem(new ComboItem(resultset.getString("ilac_adi"),resultset.getString("ilac_kodu")));
            }

        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
     
         

     }
     
    public ResultSet Getir(String sorgu)
    {


      try 
      {
          statement = conn.createStatement();

          resultset = statement.executeQuery(sorgu);
          return resultset;

      }

      catch (SQLException ex)
      {
          ex.printStackTrace();
      } 

      return resultset;

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
            java.util.logging.Logger.getLogger(ilac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilac_satis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adet_field;
    private javax.swing.JButton getir_buton;
    private javax.swing.JComboBox ilac_combo;
    private javax.swing.JTextField ilac_sira_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton onayla_buton;
    private javax.swing.JTextField tc_field;
    // End of variables declaration//GEN-END:variables
}
