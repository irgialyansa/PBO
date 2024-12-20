
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class PenjualanMotor extends javax.swing.JFrame {
    int bebek, sport, matik, diskon, total, harga, totaldiskon;

    /**
     * Creates new form PenjualanMotor
     */
    public PenjualanMotor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_merk = new javax.swing.JComboBox<>();
        rd_bebek = new javax.swing.JRadioButton();
        rd_sport = new javax.swing.JRadioButton();
        rd_matik = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_diskon = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        cbo_pembayaran = new javax.swing.JComboBox<>();
        btn_hitung = new javax.swing.JButton();
        btn_hitunglagi = new javax.swing.JButton();
        btn_selesai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI PENJUALAN MOTOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("NAMA PEMBELI ");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("DATA MOTOR");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("MERK MOTOR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("JENIS MOTOR");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("HARGA");

        cbo_merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HONDA", "YAMAHA", "SUZUKI", "KAWASAKI" }));
        cbo_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_merkActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_bebek);
        rd_bebek.setText("BEBEK");
        rd_bebek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_bebekActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_sport);
        rd_sport.setText("SPORT");
        rd_sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sportActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_matik);
        rd_matik.setText("MATIK");
        rd_matik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_matikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(rd_bebek)
                                .addGap(18, 18, 18)
                                .addComponent(rd_sport)
                                .addGap(18, 18, 18)
                                .addComponent(rd_matik))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rd_bebek)
                    .addComponent(rd_sport)
                    .addComponent(rd_matik))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("PEMBAYARAN");

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("HARGA MOTOR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("DISKON");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("TOTAL BAYAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(54, 54, 54)
                                .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        cbo_pembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TUNAI", "KREDIT" }));
        cbo_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_pembayaranActionPerformed(evt);
            }
        });

        btn_hitung.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        btn_hitunglagi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_hitunglagi.setText("HITUNG LAGI");
        btn_hitunglagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitunglagiActionPerformed(evt);
            }
        });

        btn_selesai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_selesai.setText("SELESAI");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(cbo_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_hitung))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btn_hitunglagi)
                        .addGap(74, 74, 74)
                        .addComponent(btn_selesai)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbo_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hitung))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hitunglagi)
                    .addComponent(btn_selesai))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_merkActionPerformed
        // TODO add your handling code here:
        if(cbo_merk.getSelectedItem().equals("HONDA"))
        {
            bebek = 12000000;
            sport = 32000000;
            matik = 15000000;
                    
        } else
            
        if(cbo_merk.getSelectedItem().equals("YAMAHA"))
        {
            bebek = 13500000;
            sport = 30000000;
            matik = 14000000;
                    
        } else     
            
        if(cbo_merk.getSelectedItem().equals("SUZUKI"))
        {
            bebek = 14000000;
            sport = 33000000;
            matik = 13000000;
                    
        } else  
        
        if(cbo_merk.getSelectedItem().equals("KAWASAKI"))
        {
            bebek = 12500000;
            sport = 28000000;
            matik = 13500000;
                    
        }
            
            
            
    }//GEN-LAST:event_cbo_merkActionPerformed

    private void rd_bebekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_bebekActionPerformed
        // TODO add your handling code here:
        if(rd_bebek.isSelected())
        {
            txt_harga.setText(String.valueOf(bebek));
        }
    }//GEN-LAST:event_rd_bebekActionPerformed

    private void rd_sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sportActionPerformed
        // TODO add your handling code here:
         if(rd_sport.isSelected())
        {
            txt_harga.setText(String.valueOf(sport));
        }
        
    }//GEN-LAST:event_rd_sportActionPerformed

    private void rd_matikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_matikActionPerformed
        // TODO add your handling code here:
        if(rd_matik.isSelected())
        {
            txt_harga.setText(String.valueOf(matik));
        }
    }//GEN-LAST:event_rd_matikActionPerformed

    private void cbo_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_pembayaranActionPerformed
     
        // Pemilihan pembayaran motor menggunakan tunai atau kredit
        
        if(cbo_merk.getSelectedItem().equals("HONDA"))
        {
            if(cbo_pembayaran.getSelectedItem().equals("TUNAI"))
            {
                diskon = 20;
                txt_diskon.setText(String.valueOf(diskon));
            }
            else
                if(cbo_pembayaran.getSelectedItem().equals("KREDIT"))
                {
                    diskon = 8;
                    txt_diskon.setText(String.valueOf(diskon));
                }
        }
        
         if(cbo_merk.getSelectedItem().equals("YAMAHA"))
        {
            if(cbo_pembayaran.getSelectedItem().equals("TUNAI"))
            {
                diskon = 20;
                txt_diskon.setText(String.valueOf(diskon));
            }
            else
                if(cbo_pembayaran.getSelectedItem().equals("KREDIT"))
                {
                    diskon = 7;
                    txt_diskon.setText(String.valueOf(diskon));
                }
        }
         
         
         if(cbo_merk.getSelectedItem().equals("SUZUKI"))
        {
            if(cbo_pembayaran.getSelectedItem().equals("TUNAI"))
            {
                diskon = 20;
                txt_diskon.setText(String.valueOf(diskon));
            }
            else
                if(cbo_pembayaran.getSelectedItem().equals("KREDIT"))
                {
                    diskon = 6;
                    txt_diskon.setText(String.valueOf(diskon));
                }
        }
         
        if(cbo_merk.getSelectedItem().equals("KAWASAKI"))
        {
            if(cbo_pembayaran.getSelectedItem().equals("TUNAI"))
            {
                diskon = 20;
                txt_diskon.setText(String.valueOf(diskon));
            }
            else
                if(cbo_pembayaran.getSelectedItem().equals("KREDIT"))
                {
                    diskon = 5;
                    txt_diskon.setText(String.valueOf(diskon));
                }
        }
         
        
        
    }//GEN-LAST:event_cbo_pembayaranActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        harga = Integer.parseInt(txt_harga.getText());
        diskon = Integer.parseInt(txt_diskon.getText());
        totaldiskon = (diskon * harga)/100;
        total = harga - totaldiskon;
        txt_diskon.setText(String.valueOf(totaldiskon));
        txt_total.setText(String.valueOf(total));
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_hitunglagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitunglagiActionPerformed
        // TODO add your handling code here:
        txt_diskon.setText("");
        txt_harga.setText("");
        txt_nama.setText("");
        txt_total.setText("");
        cbo_merk.setSelectedItem("HONDA");
        cbo_pembayaran.setSelectedItem("TUNAI");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btn_hitunglagiActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "mau keluar?", "Konfirmasi keluar aplikasi", JOptionPane.OK_OPTION);
        if(konfirmasi == JOptionPane.OK_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_btn_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_hitunglagi;
    private javax.swing.JButton btn_selesai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_merk;
    private javax.swing.JComboBox<String> cbo_pembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rd_bebek;
    private javax.swing.JRadioButton rd_matik;
    private javax.swing.JRadioButton rd_sport;
    private javax.swing.JTextField txt_diskon;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
