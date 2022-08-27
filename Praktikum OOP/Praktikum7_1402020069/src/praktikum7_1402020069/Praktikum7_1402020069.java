/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikum7_1402020069;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridho Gymnastiar Al Rasyid 1402020069
 */
public class Praktikum7_1402020069 extends javax.swing.JFrame {

    /**
     * Creates new form Praktikum7_1402020069
     */
    private Random random = new Random();
    public Connection con;
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    private String captcha = "";

    private void koneksi() {
        try {
            String url = "jdbc:mysql://localhost/praktikumpbo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            JOptionPane.showMessageDialog(this, "Koneksi Berhasil");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Koneksi Gagal");
            System.err.println("" + e);
        }
    }

    public Praktikum7_1402020069() {
        initComponents();
        koneksi();
        randomCaptcha();
        jLabel_SetCaptcha.setText(captcha);
        this.setLocationRelativeTo(null);
    }

    public void insertData() {
        try {
            String insert = "INSERT INTO `ojekonlinefti` (`nama_depan`, `nama_belakang`, `jenis_kelamin`, `jenis_pengemudi`) VALUES(?, ?, ?, ?)";
            pst = con.prepareStatement(insert);
            pst.setString(1, jTextField_NamaDepan.getText());
            pst.setString(2, jTextField_NamaBelakang.getText());
            pst.setString(3, pilihKelamin());
            pst.setString(4, jComboBox_JenisPengemudi.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
            clear();
            randomCaptcha();
            jLabel_SetCaptcha.setText(captcha);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showData(DefaultTableModel model, JTable table) {
        try {
            String query = "SELECT * FROM ojekonlinefti;";
            rs = stm.executeQuery(query);
            int i = 0;
            while (rs.next()) {
                int id = rs.getInt("ID");
                String namaDepan = rs.getString("nama_depan");
                String namaBelakang = rs.getString("nama_belakang");
                String jeniskelamin = rs.getString("jenis_kelamin");
                String jenisPengemudi = rs.getString("jenis_pengemudi");
                model.addRow(new Object[]{id, namaDepan, namaBelakang, jeniskelamin, jenisPengemudi});
                table.setModel(model);
                model.isCellEditable(i, i);
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public String pilihKelamin() {
        String kelamin = "";
        if (jRadioButton_Pria.isSelected()) {
            kelamin = "Pria";
        } else if (jRadioButton_Wanita.isSelected()) {
            kelamin = "Wanita";
        }
        return kelamin;
    }

    private void randomCaptcha() {
        String pattern = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String z = "";
        for (int i = 0; i < 4; i++) {
            z += pattern.charAt(random.nextInt(pattern.length() - 1));
        }
        captcha = z;
    }

    public boolean isEqualsCaptcha() {
        boolean cek = false;
        if (jTextField_Captcha.getText().equals(captcha)) {
            cek = true;
        }
        return cek;
    }

    public boolean isEmptyForm() {
        if (jTextField_NamaDepan.getText().equals("") || jTextField_NamaBelakang.getText().equals("")
                || jTextField_Captcha.getText().equals("") || jComboBox_JenisPengemudi.getSelectedIndex() == 0
                || (!jCheckBox_Persetujuan.isSelected()) || (!jRadioButton_Pria.isSelected() && !jRadioButton_Wanita.isSelected())) {
            return true;
        }
        return false;
    }

    public void clear() {
        jTextField_NamaDepan.setText(null);
        jTextField_NamaBelakang.setText(null);
        jTextField_Captcha.setText(null);
        jCheckBox_Persetujuan.setSelected(false);
        buttonGroup_JenisKelamin.clearSelection();
        jComboBox_JenisPengemudi.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_JenisKelamin = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel_Container = new javax.swing.JPanel();
        jLabel_OjolFTI = new javax.swing.JLabel();
        jLabel_DaftarSekarang = new javax.swing.JLabel();
        jLabel_NamaDepan = new javax.swing.JLabel();
        jTextField_NamaDepan = new javax.swing.JTextField();
        jLabel_NamaBelakang = new javax.swing.JLabel();
        jTextField_NamaBelakang = new javax.swing.JTextField();
        jLabel_JenisKelamin = new javax.swing.JLabel();
        jRadioButton_Pria = new javax.swing.JRadioButton();
        jRadioButton_Wanita = new javax.swing.JRadioButton();
        jComboBox_JenisPengemudi = new javax.swing.JComboBox<>();
        jCheckBox_Persetujuan = new javax.swing.JCheckBox();
        jPanel_Captcha = new javax.swing.JPanel();
        jLabel_SetCaptcha = new javax.swing.JLabel();
        jLabel_MasukanCaptcha = new javax.swing.JLabel();
        jTextField_Captcha = new javax.swing.JTextField();
        jButton_GantiCaptcha = new javax.swing.JButton();
        jButton_LihatPendaftar = new javax.swing.JButton();
        jButton_DaftarSekarang = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Tampilan Tabel");
        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setResizable(false);

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
        setTitle("Praktikum7_1402020069");
        setResizable(false);

        jPanel_Container.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_OjolFTI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel_OjolFTI.setText("Ojek Online FTI");
        jPanel_Container.add(jLabel_OjolFTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel_DaftarSekarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel_DaftarSekarang.setText("Daftar Sekarang !");
        jPanel_Container.add(jLabel_DaftarSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel_NamaDepan.setText("Nama Depan");
        jPanel_Container.add(jLabel_NamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel_Container.add(jTextField_NamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 30));

        jLabel_NamaBelakang.setText("Nama Belakang");
        jPanel_Container.add(jLabel_NamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));
        jPanel_Container.add(jTextField_NamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 180, 30));

        jLabel_JenisKelamin.setText("Jenis Kelamin");
        jPanel_Container.add(jLabel_JenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttonGroup_JenisKelamin.add(jRadioButton_Pria);
        jRadioButton_Pria.setText("Pria");
        jRadioButton_Pria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Container.add(jRadioButton_Pria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        buttonGroup_JenisKelamin.add(jRadioButton_Wanita);
        jRadioButton_Wanita.setText("Wanita");
        jRadioButton_Wanita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Container.add(jRadioButton_Wanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jComboBox_JenisPengemudi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Pengemudi", "Pengemudi Motor", "Pengemudi Mobil" }));
        jComboBox_JenisPengemudi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Container.add(jComboBox_JenisPengemudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 380, 30));

        jCheckBox_Persetujuan.setText("Saya menyetujui peraturan yang berlaku");
        jCheckBox_Persetujuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Container.add(jCheckBox_Persetujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jPanel_Captcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Captcha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_SetCaptcha.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel_SetCaptcha.setForeground(new java.awt.Color(0, 153, 255));
        jLabel_SetCaptcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_Captcha.add(jLabel_SetCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 66));

        jLabel_MasukanCaptcha.setText("Masukan Captcha");
        jPanel_Captcha.add(jLabel_MasukanCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
        jPanel_Captcha.add(jTextField_Captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, 30));

        jButton_GantiCaptcha.setText("Ganti Captcha");
        jButton_GantiCaptcha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GantiCaptcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GantiCaptchaActionPerformed(evt);
            }
        });
        jPanel_Captcha.add(jButton_GantiCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 30));

        jPanel_Container.add(jPanel_Captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 90));

        jButton_LihatPendaftar.setText("Lihat Pendaftar");
        jButton_LihatPendaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_LihatPendaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LihatPendaftarActionPerformed(evt);
            }
        });
        jPanel_Container.add(jButton_LihatPendaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, 40));

        jButton_DaftarSekarang.setText("Daftar Sekarang");
        jButton_DaftarSekarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DaftarSekarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DaftarSekarangActionPerformed(evt);
            }
        });
        jPanel_Container.add(jButton_DaftarSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DaftarSekarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DaftarSekarangActionPerformed
        // TODO add your handling code here:
        if (isEqualsCaptcha() && jCheckBox_Persetujuan.isSelected() && !isEmptyForm()) {
            insertData();
        } else if (isEmptyForm()) {
            JOptionPane.showMessageDialog(null, "Data Tidak Lengkap!", "Warning", JOptionPane.ERROR_MESSAGE);
            jTextField_Captcha.setText("");
        } else if (!isEqualsCaptcha()) {
            JOptionPane.showMessageDialog(null, "Captcha tidak valid silakan isi ulang!");
            jTextField_Captcha.setText("");
        }
        randomCaptcha();
        jLabel_SetCaptcha.setText(captcha);
    }//GEN-LAST:event_jButton_DaftarSekarangActionPerformed

    private void jButton_GantiCaptchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GantiCaptchaActionPerformed
        // TODO add your handling code here:
        randomCaptcha();
        jLabel_SetCaptcha.setText(captcha);
    }//GEN-LAST:event_jButton_GantiCaptchaActionPerformed

    private void jButton_LihatPendaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LihatPendaftarActionPerformed
        DefaultTableModel dtm = new DefaultTableModel(new String[]{"ID", "Nama Depan", "Nama Belakang", "Jenis Kelamin", "Jenis Pengemudi"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable table = new JTable();
        showData(dtm, table);
        JPanel panel = new JPanel();
        JScrollPane sp = new JScrollPane(table);
        panel.add(sp);
        panel.setBackground(Color.WHITE);
        sp.setBackground(Color.WHITE);
        table.setBackground(Color.WHITE);
        jDialog1.setBackground(Color.WHITE);
        jDialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jDialog1.setContentPane(panel);
        jDialog1.pack();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton_LihatPendaftarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum7_1402020069.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Praktikum7_1402020069().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_JenisKelamin;
    private javax.swing.JButton jButton_DaftarSekarang;
    private javax.swing.JButton jButton_GantiCaptcha;
    private javax.swing.JButton jButton_LihatPendaftar;
    private javax.swing.JCheckBox jCheckBox_Persetujuan;
    private javax.swing.JComboBox<String> jComboBox_JenisPengemudi;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel_DaftarSekarang;
    private javax.swing.JLabel jLabel_JenisKelamin;
    private javax.swing.JLabel jLabel_MasukanCaptcha;
    private javax.swing.JLabel jLabel_NamaBelakang;
    private javax.swing.JLabel jLabel_NamaDepan;
    private javax.swing.JLabel jLabel_OjolFTI;
    private javax.swing.JLabel jLabel_SetCaptcha;
    private javax.swing.JPanel jPanel_Captcha;
    private javax.swing.JPanel jPanel_Container;
    private javax.swing.JRadioButton jRadioButton_Pria;
    private javax.swing.JRadioButton jRadioButton_Wanita;
    private javax.swing.JTextField jTextField_Captcha;
    private javax.swing.JTextField jTextField_NamaBelakang;
    private javax.swing.JTextField jTextField_NamaDepan;
    // End of variables declaration//GEN-END:variables
}
