/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemreservasihotelprogram;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class menucrud extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form 
     */
    public menucrud() {
    initComponents();
    setLocationRelativeTo(null);
    // Inisialisasi DefaultTableModel dan menambahkan kolom yang sesuai
    model = new DefaultTableModel();
    model.addColumn("Nama Pelanggan");
    model.addColumn("Nomor Identitas");
    model.addColumn("Nomor Telepon");
    model.addColumn("Tipe Kamar");
    model.addColumn("Jenis Kelamin");
    model.addColumn("Status");

    tabel.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelNamaPelanggan = new javax.swing.JLabel();
        jLabelTipeKamar = new javax.swing.JLabel();
        jLabelJenisKelamin = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldNamaPelanggan = new javax.swing.JTextField();
        jComboButtonTipeKamar = new javax.swing.JComboBox<>();
        jRadioButtonPerempuan = new javax.swing.JRadioButton();
        jRadioButtonLakiLaki = new javax.swing.JRadioButton();
        jCheckBoxCheckIn = new javax.swing.JCheckBox();
        buttontambah = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        buttonbatal = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();
        jLabelNomorIdentitas = new javax.swing.JLabel();
        jTextFieldNomorIdentitas = new javax.swing.JTextField();
        jLabelNomorTelepon = new javax.swing.JLabel();
        jTextFieldNomorTelepon = new javax.swing.JTextField();
        jCheckBoxCheckOut = new javax.swing.JCheckBox();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("MENU CRUD");

        jLabelNamaPelanggan.setText("Nama Pelanggan");

        jLabelTipeKamar.setText("Tipe Kamar");

        jLabelJenisKelamin.setText("Jenis Kelamin");

        jLabelStatus.setText("Status");

        jComboButtonTipeKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Deluxe", "Superior", "Suite", "Executive" }));
        jComboButtonTipeKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboButtonTipeKamarActionPerformed(evt);
            }
        });

        jRadioButtonPerempuan.setText("Perempuan");
        jRadioButtonPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPerempuanActionPerformed(evt);
            }
        });

        jRadioButtonLakiLaki.setText("Laki-laki");

        jCheckBoxCheckIn.setText("Check In");

        buttontambah.setText("Tambah");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });

        buttonedit.setText("Simpan Edit");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });

        buttonhapus.setText("Hapus");
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        buttonbatal.setText("Batal");
        buttonbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbatalActionPerformed(evt);
            }
        });

        buttonkeluar.setText("Keluar");
        buttonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkeluarActionPerformed(evt);
            }
        });

        jLabelNomorIdentitas.setText("Nomor Identitas");

        jTextFieldNomorIdentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomorIdentitasActionPerformed(evt);
            }
        });

        jLabelNomorTelepon.setText("Nomor Telepon");

        jCheckBoxCheckOut.setText("Check Out");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNomorIdentitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNamaPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelNomorTelepon)
                            .addComponent(jLabelTipeKamar)
                            .addComponent(jLabelJenisKelamin)
                            .addComponent(jLabelStatus))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomorIdentitas)
                            .addComponent(jTextFieldNomorTelepon)
                            .addComponent(jComboButtonTipeKamar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonLakiLaki)
                                    .addComponent(jCheckBoxCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(207, 232, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonPerempuan)))
                            .addComponent(jTextFieldNamaPelanggan)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonkeluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttontambah)
                                        .addGap(416, 416, 416))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(buttonedit)
                                        .addGap(159, 159, 159)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonhapus)))
                        .addGap(2, 2, 2)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNamaPelanggan)
                    .addComponent(jTextFieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomorIdentitas)
                    .addComponent(jTextFieldNomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomorTelepon)
                    .addComponent(jTextFieldNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipeKamar)
                    .addComponent(jComboButtonTipeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJenisKelamin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonLakiLaki)
                        .addComponent(jRadioButtonPerempuan)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStatus)
                    .addComponent(jCheckBoxCheckIn)
                    .addComponent(jCheckBoxCheckOut))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttontambah)
                    .addComponent(buttonedit)
                    .addComponent(buttonhapus))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonbatal)
                    .addComponent(buttonkeluar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPerempuanActionPerformed

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        // TODO add your handling code here:                                            
        String namaPelanggan = jTextFieldNamaPelanggan.getText();
        String nomorIdentitas = jTextFieldNomorIdentitas.getText();
        String nomorTelepon = jTextFieldNomorTelepon.getText();
        String tipeKamar = jComboButtonTipeKamar.getSelectedItem().toString();

        // Cek pilihan radio button untuk jenis kelamin
        String jenisKelamin = jRadioButtonLakiLaki.isSelected() ? "Laki-laki" : "Perempuan";

        // Cek status checkbox
        String status = jCheckBoxCheckIn.isSelected() ? "Check In" : "Check Out";

        // Urutan penambahan data ke tabel harus sesuai dengan kolom tabel
        model.addRow(new Object[]{namaPelanggan, nomorIdentitas, nomorTelepon, tipeKamar, jenisKelamin, status});

        // Menampilkan pesan bahwa data telah tersimpan
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        // Mengosongkan inputan setelah disimpan
        jTextFieldNamaPelanggan.setText("");
        jTextFieldNomorIdentitas.setText("");
        jTextFieldNomorTelepon.setText("");
        jComboButtonTipeKamar.setSelectedIndex(0);
        jRadioButtonLakiLaki.setSelected(false); 
        jRadioButtonPerempuan.setSelected(false);
        jCheckBoxCheckIn.setSelected(false);
        jCheckBoxCheckOut.setSelected(false);
    }//GEN-LAST:event_buttontambahActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
        // TODO add your handling code here:
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tabel.getSelectedRow();

        // Cek apakah ada baris yang dipilih
        if (selectedRow != -1) {
            // Mendapatkan nilai dari inputan
            String namaPelanggan = jTextFieldNamaPelanggan.getText();
            String nomorIdentitas = jTextFieldNomorIdentitas.getText();
            String nomorTelepon = jTextFieldNomorTelepon.getText();
            String tipeKamar = jComboButtonTipeKamar.getSelectedItem().toString();
            String jenisKelamin = jRadioButtonLakiLaki.isSelected() ? "Laki-laki" : "Perempuan";
            String status = jCheckBoxCheckIn.isSelected() ? "Check In" : "Check Out";

            // Mengupdate nilai di model tabel
            model.setValueAt(namaPelanggan, selectedRow, 0);
            model.setValueAt(nomorIdentitas, selectedRow, 1);
            model.setValueAt(nomorTelepon, selectedRow, 2);
            model.setValueAt(tipeKamar, selectedRow, 3);
            model.setValueAt(jenisKelamin, selectedRow, 4);
            model.setValueAt(status, selectedRow, 5);

            // Menampilkan pesan bahwa data telah diperbarui
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");

            // Mengosongkan inputan setelah disimpan
            jTextFieldNamaPelanggan.setText("");
            jTextFieldNomorIdentitas.setText("");
            jTextFieldNomorTelepon.setText("");
            jComboButtonTipeKamar.setSelectedIndex(0);
            jRadioButtonPerempuan.setSelected(false); 
            jRadioButtonLakiLaki.setSelected(false);
            jCheckBoxCheckIn.setSelected(false);
            jCheckBoxCheckOut.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan diedit.");
        }
    }//GEN-LAST:event_buttoneditActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabel.getSelectedRow();

        if (selectedRow != -1) {
            // Mengambil nilai dari model tabel
            String namaPelanggan = model.getValueAt(selectedRow, 0).toString();
            String nomorIdentitas = model.getValueAt(selectedRow, 1).toString();
            String nomorTelepon = model.getValueAt(selectedRow, 2).toString();
            String tipeKamar = model.getValueAt(selectedRow, 3).toString();
            String jenisKelamin = model.getValueAt(selectedRow, 4).toString();
            String status = model.getValueAt(selectedRow, 5).toString();

            // Mengisi inputan dengan nilai yang diambil
            jTextFieldNamaPelanggan.setText(namaPelanggan);
            jTextFieldNomorIdentitas.setText(nomorIdentitas);
            jTextFieldNomorTelepon.setText(nomorTelepon);
            jComboButtonTipeKamar.setSelectedItem(tipeKamar);

            if (jenisKelamin.equals("Laki-laki")) {
                jRadioButtonLakiLaki.setSelected(true);
                jRadioButtonPerempuan.setSelected(false);
            } else {
                jRadioButtonLakiLaki.setSelected(false);
                jRadioButtonPerempuan.setSelected(true);
            }

            jCheckBoxCheckIn.setSelected(status.equals("Check In"));
            jCheckBoxCheckOut.setSelected(status.equals("Check Out"));
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabel.getSelectedRow();

        if (selectedRow != -1) {
            // Menghapus baris dari model tabel
            model.removeRow(selectedRow);

            // Menampilkan pesan bahwa data telah dihapus
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang akan dihapus.");
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void buttonbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbatalActionPerformed
        // TODO add your handling code here:
        // Mengosongkan inputan
        jTextFieldNamaPelanggan.setText("");
        jComboButtonTipeKamar.setSelectedIndex(0); // Mengatur pilihan ComboBox ke indeks awal

        // Menghapus pilihan di tabel
        tabel.clearSelection(); // Menghapus pemilihan baris di tabel

        // Menampilkan pesan bahwa tindakan batal telah dilakukan (opsional)
        JOptionPane.showMessageDialog(null, "Tindakan dibatalkan. Inputan telah dikosongkan.");
    }//GEN-LAST:event_buttonbatalActionPerformed

    private void buttonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkeluarActionPerformed
        // TODO add your handling code here:
             // Menampilkan konfirmasi sebelum keluar
    int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Keluar dari aplikasi
        System.exit(0);
    }
    }//GEN-LAST:event_buttonkeluarActionPerformed

    private void jTextFieldNomorIdentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomorIdentitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomorIdentitasActionPerformed

    private void jComboButtonTipeKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboButtonTipeKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboButtonTipeKamarActionPerformed

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
            java.util.logging.Logger.getLogger(menucrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menucrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menucrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menucrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menucrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbatal;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JButton buttontambah;
    private javax.swing.JCheckBox jCheckBoxCheckIn;
    private javax.swing.JCheckBox jCheckBoxCheckOut;
    private javax.swing.JComboBox<String> jComboButtonTipeKamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelJenisKelamin;
    private javax.swing.JLabel jLabelNamaPelanggan;
    private javax.swing.JLabel jLabelNomorIdentitas;
    private javax.swing.JLabel jLabelNomorTelepon;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipeKamar;
    private javax.swing.JRadioButton jRadioButtonLakiLaki;
    private javax.swing.JRadioButton jRadioButtonPerempuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNamaPelanggan;
    private javax.swing.JTextField jTextFieldNomorIdentitas;
    private javax.swing.JTextField jTextFieldNomorTelepon;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
