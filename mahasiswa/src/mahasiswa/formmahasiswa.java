/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import database.koneksi;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author msi
 */
public class formmahasiswa extends javax.swing.JFrame {
    
    /**
     * Creates new form formmahasiswa
     */
    public formmahasiswa() {
        initComponents();
    }
    koneksi con = new koneksi();
    
    private void tampilan(){
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("NIM");
        tbl.addColumn("Alamat");
        tbl.addColumn("Telpon");
         tbl.addColumn("Gender");
        tabelmahasiswa.setModel(tbl);
        try {             
            con.res = con.stat.executeQuery("select * from tb_mahasiswa");
            while(con.res.next()){ 
         
            tbl.addRow(new Object[]{
            con.res.getString("nama"),
            con.res.getString("nim"),
            con.res.getString("alamat"),
            con.res.getString("telpon"),
            con.res.getString("gender")
           });
              tabelmahasiswa.setModel(tbl);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Data Kosong : "+e);
        }
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        telpon = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelmahasiswa = new javax.swing.JTable();
        sipan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tampil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FORM MAHASISWA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 13, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 50, -1, -1));

        jLabel3.setText("NIM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 98, -1, -1));

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 146, -1, -1));

        jLabel5.setText("Telpon");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 47, 170, -1));
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 95, 170, -1));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        getContentPane().add(telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 170, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 170, -1));

        tabelmahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelmahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelmahasiswa);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 690, 200));

        sipan.setText("SIMPAN");
        sipan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sipanActionPerformed(evt);
            }
        });
        getContentPane().add(sipan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        tampil.setText("TAMPILKAN");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });
        getContentPane().add(tampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sipanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sipanActionPerformed
        // TODO add your handling code here:
        try {
             String valnama = nama.getText();
            String valnim = nim.getText();
            String valalamat = alamat.getText();
            String valtelpon = telpon.getText();
            String valgender = gender.getSelectedItem().toString();
            
            String query = "INSERT INTO `tb_mahasiswa`(`nama`, `nim`, `alamat`, `telpon`, `gender`)"
                    + " VALUES ('"+valnama+"','"+valnim+"','"+valalamat+"','"+valtelpon+"','"+valgender+"')";
            con.stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambah");
        }
       
        
        
    }//GEN-LAST:event_sipanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
          try {
             String valnama = nama.getText();
            String valnim = nim.getText();
            String valalamat = alamat.getText();
            String valtelpon = telpon.getText();
            String valgender = gender.getSelectedItem().toString();
            
            String query = "UPDATE `tb_mahasiswa` SET "
                    + "`nama`='"+valnama+"',`alamat`='"+valalamat+"',`telpon`='"+valtelpon+"',`gender`='"+valgender+"' WHERE`nim`='"+valnim+"'";
            con.stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            tampilan();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah");
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void tabelmahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelmahasiswaMouseClicked
        // TODO add your handling code here:
        int baris = tabelmahasiswa.rowAtPoint(evt.getPoint());
        String valnama = tabelmahasiswa.getValueAt(baris, 0).toString();
        nama.setText(valnama);
        String valnim = tabelmahasiswa.getValueAt(baris, 1).toString();
        nim.setText(valnim);
        String valalamat = tabelmahasiswa.getValueAt(baris, 2).toString();
        alamat.setText(valalamat);
        String valtelpon = tabelmahasiswa.getValueAt(baris, 3).toString();
        telpon.setText(valtelpon);
        String valgender = tabelmahasiswa.getValueAt(baris, 4).toString();
        gender.setSelectedItem(valgender);
        
        
    }//GEN-LAST:event_tabelmahasiswaMouseClicked

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
        tampilan();
    }//GEN-LAST:event_tampilActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
          try {
             
            String valnim = nim.getText();
            
            String query = "DELETE FROM `tb_mahasiswa` WHERE `nim`='"+valnim+"'";
            con.stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tampilan();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(formmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formmahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JButton sipan;
    private javax.swing.JTable tabelmahasiswa;
    private javax.swing.JButton tampil;
    private javax.swing.JTextField telpon;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
