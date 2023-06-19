package toko;
import com.config.MyConfig;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Fadil
 */
public class Penjualan extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    
    public void clear(){
        box_namaBarang.setText("");
        box_hargaBarang.setText("");
        box_jumlahBarang.setText("");
    }
    
    public void cancel(){
        fbox_total.setText("Rp.");
        fbox_tunai.setText("");
        fbox_kembali.setText("Rp.");
        clear();
    }

    public void getData(){
        int index = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            index += 1,
            box_namaBarang.getText(),
            box_hargaBarang.getText(),
            box_jumlahBarang.getText()
        });
    }
    
    public void hapusData(){
        int index = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
    }
    
    public void dataMasuk(){
        int index = jTable1.getRowCount();
        int harga, total=0, jumlah;

        for(int i=0; i<index; i++){
            harga = Integer.parseInt(jTable1.getValueAt(i,2).toString());
            jumlah = Integer.parseInt(jTable1.getValueAt(i,3).toString());
            total += harga*jumlah;
        }
        fbox_total.setText("Rp. " + String.valueOf(total) + ",-");
        clear();
        box_namaBarang.requestFocus();
    }

    public Penjualan() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        box_namaBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        box_hargaBarang = new javax.swing.JTextField();
        box_jumlahBarang = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fbox_total = new javax.swing.JTextField();
        fbox_tunai = new javax.swing.JTextField();
        fbox_kembali = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DF-SHOP");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(85, 85, 85));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DF-SHOP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        box_namaBarang.setBackground(new java.awt.Color(85, 85, 85));
        box_namaBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        box_namaBarang.setForeground(new java.awt.Color(255, 255, 255));
        box_namaBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nama Barang");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Harga Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Jumlah Barang");

        box_hargaBarang.setBackground(new java.awt.Color(85, 85, 85));
        box_hargaBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        box_hargaBarang.setForeground(new java.awt.Color(255, 255, 255));

        box_jumlahBarang.setBackground(new java.awt.Color(85, 85, 85));
        box_jumlahBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        box_jumlahBarang.setForeground(new java.awt.Color(255, 255, 255));

        btn_tambah.setBackground(new java.awt.Color(85, 85, 85));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit_update.setBackground(new java.awt.Color(0, 204, 255));
        btn_edit_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit_update.setText("Edit");
        btn_edit_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 255, 51));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Clear");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tunai");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kembali");

        fbox_total.setEditable(false);
        fbox_total.setBackground(new java.awt.Color(51, 51, 51));
        fbox_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fbox_total.setForeground(new java.awt.Color(255, 255, 255));
        fbox_total.setText("Rp.");

        fbox_tunai.setBackground(new java.awt.Color(51, 51, 51));
        fbox_tunai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fbox_tunai.setForeground(new java.awt.Color(255, 255, 255));

        fbox_kembali.setEditable(false);
        fbox_kembali.setBackground(new java.awt.Color(51, 51, 51));
        fbox_kembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fbox_kembali.setForeground(new java.awt.Color(255, 255, 255));
        fbox_kembali.setText("Rp.");

        btn_hitung.setBackground(new java.awt.Color(0, 204, 255));
        btn_hitung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(0, 204, 255));
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setEnabled(false);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fbox_total)
                    .addComponent(fbox_tunai)
                    .addComponent(fbox_kembali))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fbox_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fbox_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fbox_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hitung)
                    .addComponent(btn_simpan))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(85, 85, 85));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Jumlah", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btn_edit_update, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(box_namaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(box_hargaBarang)
                            .addComponent(box_jumlahBarang)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(box_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(box_jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_edit_update)
                            .addComponent(btn_delete)
                            .addComponent(btn_cancel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        
        int Error = 0;
        int tmp;
        
        if( box_namaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama Barang belum di input");
            box_namaBarang.requestFocus();
            Error += 1;
        } else if(box_hargaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Harga Barang belum di input");
            box_hargaBarang.requestFocus();
            Error += 1;
        } else if(box_jumlahBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Jumlah Barang belum di input");
            box_jumlahBarang.requestFocus();
            Error += 1;
        } else {
            try{
                tmp = 1 + Integer.valueOf(box_hargaBarang.getText().toString());
                if(Integer.valueOf(box_hargaBarang.getText().toString())<=100){
                    JOptionPane.showMessageDialog(null,"Harga Barang minimal Rp.100,-");
                    Error += 1;
                }
            }catch(Exception e){
                Error += 1;
                JOptionPane.showMessageDialog(null,"Harga Barang harus angka");
                box_hargaBarang.requestFocus();
            }
            
            try{
                tmp = 1 + Integer.valueOf(box_jumlahBarang.getText().toString());
                if(Integer.valueOf(box_jumlahBarang.getText().toString())<=0){
                    JOptionPane.showMessageDialog(null,"Jumlah Barang minimal 1");
                    Error += 1;
                }
            }catch(Exception e){
                Error += 1;
                JOptionPane.showMessageDialog(null,"Jumlah Barang harus angka");
                box_jumlahBarang.requestFocus();
            }
        }
        
        if(Error == 0){
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            getData();
            dataMasuk();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Belum ada data yang di input");
        } else if(fbox_tunai.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Anda belum mengimput jumlah tunai yang diberikan");
        } else {
            
            int total=0, tunai=-1, sisa,harga,jumlah,error=0;
            int index = jTable1.getRowCount();

            try{
                tunai = Integer.valueOf(fbox_tunai.getText());
                int tmp = 1 + Integer.valueOf(fbox_tunai.getText().toString());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Tunai harus angka");
                fbox_tunai.requestFocus();
                error += 1;
            }
            
            if(error == 0){
                for(int i=0; i<index; i++){
                    harga = Integer.parseInt(jTable1.getValueAt(i,2).toString());
                    jumlah = Integer.parseInt(jTable1.getValueAt(i,3).toString());
                    total += harga*jumlah;
                }

                sisa = tunai - total;

                if(sisa < 0){
                    btn_simpan.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Uang Anda kurang Rp. " + (total-tunai) + ",-");
                } else {
                    btn_simpan.setEnabled(true);
                    fbox_kembali.setText("Rp. " + String.valueOf(sisa)+",-");
                }
            }
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        clear();
        cancel();
        hapusData();
        btn_simpan.setEnabled(false);
        box_namaBarang.requestFocus();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Belum ada data yang di input");
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rowTable = jTable1.getSelectedRow();
            
            try{
                model.removeRow(rowTable);
            }catch(Exception e){
                model.removeRow(0);
            }

            dataMasuk();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_edit_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_updateActionPerformed
        // TODO add your handling code here:
        String btn_active = btn_edit_update.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowTable = jTable1.getSelectedRow();

        if(btn_active == "Edit"){
            if(jTable1.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Belum ada data yang di input");

            } else {
                btn_tambah.setEnabled(false);
                btn_delete.setEnabled(false);            
                btn_edit_update.setText("Update");

                box_namaBarang.setText(model.getValueAt(rowTable, 1).toString());
                box_hargaBarang.setText(model.getValueAt(rowTable, 2).toString());
                box_jumlahBarang.setText(model.getValueAt(rowTable, 3).toString());
            }
        } else {
            btn_tambah.setEnabled(true);
            btn_delete.setEnabled(true);            
            btn_edit_update.setText("Edit");
            
            model.setValueAt(box_namaBarang.getText(), rowTable, 1);
            model.setValueAt(box_hargaBarang.getText(), rowTable, 2);
            model.setValueAt(box_jumlahBarang.getText(), rowTable, 3);
            
            clear();
            box_namaBarang.requestFocus();
            dataMasuk();
        }
    }//GEN-LAST:event_btn_edit_updateActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            for(int i=0; i<jTable1.getRowCount();i++){
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.valueOf(model.getValueAt(i, 2).toString());
                int jumlahBarang = Integer.valueOf(model.getValueAt(i, 3).toString());

                MyConfig.insertData(namaBarang, hargaBarang, jumlahBarang);

            }
            int error = MyConfig.error();
            if(error > 0){
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data");
            } else {
                JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
                clear();
                cancel();
                hapusData();
                btn_simpan.setEnabled(false);
                box_namaBarang.requestFocus();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data");
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    
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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_hargaBarang;
    private javax.swing.JTextField box_jumlahBarang;
    private javax.swing.JTextField box_namaBarang;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit_update;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField fbox_kembali;
    private javax.swing.JTextField fbox_total;
    private javax.swing.JTextField fbox_tunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
