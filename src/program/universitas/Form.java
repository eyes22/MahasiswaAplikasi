/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.universitas;

/**
 *
 * @author Nda Edogawa
 */


import java.sql.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

public final class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    private DefaultTableModel model;
    public Form() {
        initComponents();
        
        //membuat tableModel
        model = new DefaultTableModel();
        
        //menambahkan tablemodel ke tabel
        tabelMahasiswa.setModel(model);
        
        model.addColumn("Nim");
        model.addColumn("Nama");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        
        //panggil load data
        loadData();
    }

    public void loadData(){
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM mahasiswa";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                //lakukan penelusuran baris
                Object[] o = new Object[5];
                o[0] = r.getString("nim");
                o[1] = r.getString("nama");
                o[2] = r.getString("tanggal_lahir");
                o[3] = r.getString("jurusan");
                o[4] = r.getString("alamat");
                
                model.addRow(o);
            }
            r.close();
            s.close();
        }catch(SQLException e){
            
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputNim = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputTanggalLahir = new javax.swing.JFormattedTextField();
        inputJurusan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(41, 180, 180));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(45, 170, 170));
        setResizable(false);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Tanggal Lahir");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Alamat");

        inputTanggalLahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMahasiswa);

        jLabel6.setText("SAMPLE APLIKASI MAHASISWA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inputTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(inputTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nim = inputNim.getText();
        String nama = inputNama.getText();
        java.util.Date tanggalLahir = (java.util.Date) inputTanggalLahir.getValue();
        String jurusan = inputJurusan.getText();
        String alamat = inputAlamat.getText();
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = ("INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?)");
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, nim);
            p.setString(2, nama);
            p.setDate(3, new java.sql.Date(tanggalLahir.getTime()));
            p.setString(4, jurusan);
            p.setString(5, alamat);
            
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi error tambah");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = tabelMahasiswa.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
        
        //ambil nim yang terseleksi
        String nim = (String) model.getValueAt(i, 0);
        
        String nama = inputNama.getText();
        java.util.Date tanggalLahir = (java.util.Date) inputTanggalLahir.getValue();
        String jurusan = inputJurusan.getText();
        String alamat = inputAlamat.getText();
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "UPDATE mahasiswa SET nama = ?, tanggal_lahir = ?, jurusan = ?, alamat = ? WHERE nim = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            
            p.setString(1, nama);
            p.setDate(2, new java.sql.Date(tanggalLahir.getTime()));
            p.setString(3, jurusan);
            p.setString(4, alamat);
            p.setString(5, nim);
            
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi error ubah");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = tabelMahasiswa.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
        
        String nim = (String) model.getValueAt(i, 0);
        
         try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM mahasiswa WHERE nim = ? ";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nim);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi error hapus");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        int i = tabelMahasiswa.getSelectedRow();
         if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
         
        String nim = (String) model.getValueAt(i, 0);
        inputNim.setText(nim);
        
        String nama = (String) model.getValueAt(i, 1);
        inputNama.setText(nama);
        
        java.util.Date tanggalLahir = (java.util.Date) model.getValueAt(i, 2);
        inputTanggalLahir.setValue(tanggalLahir);
        
        String jurusan = (String) model.getValueAt(i, 3);
        inputJurusan.setText(jurusan);
        
        String alamat = (String) model.getValueAt(i, 4);
        inputAlamat.setText(alamat);
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JTextField inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNim;
    private javax.swing.JFormattedTextField inputTanggalLahir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMahasiswa;
    // End of variables declaration//GEN-END:variables
}
