/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControlTransaksi;
import model.Barang;
import model.Detail_Transaksi;
import model.Transaksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class Transaksi_View extends javax.swing.JFrame 
{
    private ControlTransaksi controltransaksi;
    private ArrayList<Detail_Transaksi> arrKeranjang;
    private Integer Total_Harga;
    private Integer Kembalian;
    /**
     * Creates new form Transaksi_View
     */
    public Transaksi_View() throws SQLException {
        initComponents();
        controltransaksi = new ControlTransaksi();
        arrKeranjang = new ArrayList<>();
        Total_Harga = 0;
        Kembalian = 0;
        showComboBoxBarang();
        showTableKeranjang();
        showTableTransaksi();
        showKembalian();
    }
    
    private void showComboBoxBarang() throws SQLException
    {
        DefaultComboBoxModel dcbmBarang = new DefaultComboBoxModel();
        
        for (Barang b : this.controltransaksi.getDataBarang())
        {
            dcbmBarang.addElement(b.getNama_barang() + " ( " + b.getStock_barang() + " )");
        }
        
        this.cbNamaBarang.removeAll();
        this.cbNamaBarang.setModel(dcbmBarang);
        
    }
    
    private void showTableKeranjang()
    {
        DefaultTableModel dtmKeranjang = new DefaultTableModel(new String[] {"Nama Barang", "Harga Barang", "Jumlah"},0);
        
        for (Detail_Transaksi dt : this.arrKeranjang)
        {
            dtmKeranjang.addRow(new String[] {dt.getBarang().getNama_barang(), dt.getBarang().getHarga_barang().toString(), dt.getJumlah_barang().toString()});
        }
        
        this.tblTambah.setModel(dtmKeranjang);
    }
    
    private void showTotalHarga()
    {
        txtTotalHarga.setText(Total_Harga.toString());
    }
    
    private void showKembalian()
    {
        txtKembalian.setText(Kembalian.toString());
    }
    
    private void showTableTransaksi() throws SQLException {
        DefaultTableModel dtmTransaksi = new DefaultTableModel(new String[]{
            "Id Transaksi","Total Item", "Harga Total"},0);
        for (Transaksi TR : controltransaksi.getDataTransaksi()){
            dtmTransaksi.addRow(new String[]{
                TR.getId_transaksi().toString(),TR.getJumlah_barang().toString(), TR.getTotal_harga().toString()
            });
        }
        tblTransaksi.setModel(dtmTransaksi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJumlahBayar = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTambah = new javax.swing.JTable();
        lblKembalian = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnDetailTransaksi = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbNamaBarang = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 216, 216));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOKO ALAT TULIS");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Nama Barang");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Jumlah Bayar");

        btnBayar.setBackground(new java.awt.Color(255, 102, 102));
        btnBayar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Jumlah");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 102, 102));
        btnTambah.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Total Harga");

        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTransaksi);

        tblTambah.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTambah);

        lblKembalian.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblKembalian.setForeground(new java.awt.Color(102, 0, 0));
        lblKembalian.setText("Kembalian");

        btnDetailTransaksi.setBackground(new java.awt.Color(255, 102, 102));
        btnDetailTransaksi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnDetailTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnDetailTransaksi.setText("Detail Transaksi");
        btnDetailTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailTransaksiActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbNamaBarang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetailTransaksi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtJumlah)
                                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbNamaBarang, 0, 212, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(120, 120, 120)
                                        .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(297, 297, 297)
                                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblKembalian)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(22, 22, 22)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBayar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKembalian)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDetailTransaksi)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            Detail_Transaksi dt = new Detail_Transaksi();
            dt.setJumlah_barang(Integer.parseInt(txtJumlah.getText()));
            dt.setBarang(controltransaksi.getDataBarang().get(cbNamaBarang.getSelectedIndex()));
            
            Total_Harga += controltransaksi.getDataBarang().get(cbNamaBarang.getSelectedIndex()).getHarga_barang() * Integer.parseInt(txtJumlah.getText());
           
            showTotalHarga();
            arrKeranjang.add(dt);
            showTableKeranjang();
            
        } catch (SQLException ex) {
            Logger.getLogger(Transaksi_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
       Transaksi t = new Transaksi();
        
        try {
            this.Kembalian = Integer.parseInt(txtJumlahBayar.getText()) - Integer.parseInt(txtTotalHarga.getText());
            
            t.setJumlah_barang(Integer.valueOf(txtJumlah.getText()));
            t.setTotal_harga(this.Total_Harga);
            t.setJumlah_pembayaran(Integer.valueOf(txtJumlahBayar.getText()));
            t.setJumlah_kembalian(this.Kembalian);
            t.setArrDetail_Transaksi(this.arrKeranjang);
            
            this.controltransaksi.insertTransaksi(t);
            this.showTableTransaksi();
            
            this.showTableKeranjang();
            this.showTotalHarga();
            this.showKembalian();
            this.Total_Harga=0;
            this.Kembalian=0;
            this.arrKeranjang = new ArrayList<>();
            this.showComboBoxBarang();
            
            
        }catch(SQLException ex){
            
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnDetailTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailTransaksiActionPerformed
        try{
            Transaksi transaksi = controltransaksi.getDataTransaksi().get(tblTransaksi.getSelectedRow());
            String teks = "================TRANSAKSI===============\n" +
                    "Id_transaksi   : " +transaksi.getId_transaksi()+ "\n\n" +
                    "==================PRODUK================";
            
            ArrayList<Detail_Transaksi> DT = transaksi.getArrDetail_Transaksi();
            for(int i = 0; i < DT.size(); i++){
                teks += "\n\nNama Barang     : " +DT.get(i).getBarang().getNama_barang()+ "\n" +
                        "Harga                   : " +DT.get(i).getBarang().getHarga_barang()+ "\n" +
                        "Jenis Barang     : " +DT.get(i).getBarang().getJenis_barang().getNama_jenis_barang();
            }

            JOptionPane.showMessageDialog(null,teks, null, 0);
    
        }catch(SQLException re){
            
        }
    }//GEN-LAST:event_btnDetailTransaksiActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login_View().show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNamaBarangActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Transaksi_View().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Transaksi_View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnDetailTransaksi;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cbNamaBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblKembalian;
    private javax.swing.JTable tblTambah;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtJumlahBayar;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
