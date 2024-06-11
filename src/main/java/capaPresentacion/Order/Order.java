package capaPresentacion.Order;

import capaLogica.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import objetos.Pedido_Combo;
import objetos.Producto_Pedido;

/**
 *
 * @author solor
 */
public class Order extends javax.swing.JInternalFrame {

    private Connection conexion;

    public Order() {
        super("PEDIDO EN KFSUR");
        initComponents();
        
        conexion = Conexion.getInstance().getConnection();
        cmbPollo.setModel(getValues(1));
        cmbRefrescos.setModel(getValues(2));
        cmbAcompañamientos.setModel(getValues(3));
        cmbCombo.setModel(getValues(4));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbPollo = new javax.swing.JComboBox<>();
        cmbRefrescos = new javax.swing.JComboBox<>();
        cmbAcompañamientos = new javax.swing.JComboBox<>();
        txtPedido = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        spnPollo = new javax.swing.JSpinner();
        spnRefrescos = new javax.swing.JSpinner();
        spnAcompañamientos = new javax.swing.JSpinner();
        btnSaveOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbCombo = new javax.swing.JComboBox<>();
        spnCombos = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnPedido = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spnMesa = new javax.swing.JSpinner();
        txtObs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSucur = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(700, 1500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 1500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Pollo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Refrescos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Acompañamientos");

        cmbPollo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", " " }));

        cmbRefrescos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..." }));

        cmbAcompañamientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..." }));

        txtPedido.setColumns(20);
        txtPedido.setRows(5);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Su pedido:");

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPay.setText("Pagar");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        spnPollo.setModel(new javax.swing.SpinnerNumberModel());
        spnPollo.setValue(0);

        btnSaveOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSaveOrder.setText("Guardar pedido");
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Combos");

        cmbCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..." }));

        spnCombos.setModel(new javax.swing.SpinnerNumberModel());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Numero de pedido:");

        spnPedido.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Numero de mesa:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Observaciones:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Sucursal:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(spnCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(cmbRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(spnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtSucur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(spnAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtObs)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(spnRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveOrder)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSucur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(btnPay)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCombos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveOrder)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(txtObs))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
    try {
            List<Producto_Pedido> listaProductos = new ArrayList<>();
            List<Pedido_Combo> listaCombos = new ArrayList<>();
            
            saveOrder(txtPedido, listaProductos, listaCombos);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveOrderActionPerformed

    public DefaultComboBoxModel getValues(int tipoProducto) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
            conexion = Conexion.getInstance().getConnection();
            CallableStatement cs = conexion.prepareCall("EXEC select_products_type ?");
            cs.setInt(1, tipoProducto);
            cs.execute();
            ResultSet resultSet = cs.getResultSet();

            while (resultSet.next()) {
                model.addElement(resultSet.getString(4));
            }

            resultSet.close();
            cs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;

    }

    public void saveOrder(JTextArea txtPedido, List<Producto_Pedido> listaProductos, List<Pedido_Combo> listaCombos) throws SQLException {
        
        StringBuilder textBuilder = new StringBuilder("\n");

        String selectedP = (String) cmbPollo.getSelectedItem();
        int quantityP = (int) spnPollo.getValue();
        if (!selectedP.equals("Elegir...") && quantityP > 0) {
            listaProductos.add(new Producto_Pedido(selectedP, quantityP));
        }
        String selectedR = (String) cmbRefrescos.getSelectedItem();
        int quantityR = (int) spnRefrescos.getValue();
        if (!selectedR.equals("Elegir...") && quantityR > 0) {
            listaProductos.add(new Producto_Pedido(selectedR, quantityR));
        }
        String selectedSalad = (String) cmbAcompañamientos.getSelectedItem();
        int quantitySalad = (int) spnAcompañamientos.getValue();
        if (!selectedSalad.equals("Elegir...") && quantitySalad > 0) {
            listaProductos.add(new Producto_Pedido(selectedSalad, quantitySalad));
        }

        String selectedCombo = (String) cmbCombo.getSelectedItem();
        int quantityCombos = (int) spnCombos.getValue();
        if (!selectedCombo.equals("Elegir...") && quantityCombos > 0) {
            listaCombos.add(new Pedido_Combo(selectedCombo, quantityCombos));
        }

        txtPedido.setText(textBuilder.toString());
        
            int C_Pedido = (int) spnPedido.getValue();
            String D_Num_Mesa = (String) spnMesa.getValue();
            String D_Observacion = txtObs.getText();
            Time F_Duracion_Entrega_Pedido = null;
            Date F_Inicio = Date.valueOf(LocalDate.now());
            Date F_Final = null;
            Date F_Duracion = null;
            String C_Sucursal = txtSucur.getText();

            insertarPedido(C_Pedido, D_Num_Mesa, D_Observacion, F_Duracion_Entrega_Pedido, F_Inicio, F_Final, F_Duracion, C_Sucursal);

            for (Producto_Pedido producto : listaProductos) {
                int productoId = getProductoId(producto.getSelected());
                insertarProductoPedido(C_Pedido, productoId, producto.getQuantity());
            }

            for (Pedido_Combo combo : listaCombos) {
                int comboId = getComboId(combo.getSelected());
                insertarPedidoCombo(C_Pedido, comboId, combo.getQuantity());
            }

            saveOrder(txtPedido, listaProductos, listaCombos);

    }

    public int insertarPedido(int C_Pedido, String D_Num_Mesa, String D_Observacion, Time F_Duracion_Entrega_Pedido, Date F_Inicio, Date F_Final, Date F_Duracion, String C_Sucursal) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{CALL InsertarPedido(?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt(1, C_Pedido );
        stmt.setString(2, D_Num_Mesa);
        stmt.setString(3, D_Observacion);
        stmt.setTime(4, F_Duracion_Entrega_Pedido);
        stmt.setDate(5, F_Inicio);
        stmt.setDate(6, F_Final);
        stmt.setDate(7,F_Duracion);
        stmt.setString(8, C_Sucursal);
        stmt.execute();


        return C_Pedido;
    }

    private int getProductoId(String nombreProducto) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{CALL ObtenerIdProducto(?)}");
        stmt.setString(1, nombreProducto);
        stmt.execute();

        ResultSet rs = stmt.getResultSet();
        int C_Producto = 0;
        if (rs.next()) {
            C_Producto = rs.getInt(1);
        }


        return C_Producto;
    }

    private void insertarProductoPedido(int IdPedido, int IdProducto, int Cantidad) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{CALL InsertarProductoPedido(?, ?, ?)}");
        stmt.setInt(1, IdPedido);
        stmt.setInt(2, IdProducto);
        stmt.setInt(3, Cantidad);
        stmt.execute();

    }

    private int getComboId(String NombreCombo) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{CALL ObtenerIdCombo(?)}");
        stmt.setString(1, NombreCombo);
        stmt.execute();

        ResultSet rs = stmt.getResultSet();
        int C_Combo = 0;
        if (rs.next()) {
            C_Combo = rs.getInt(1);
        }

        rs.close();
        stmt.close();
        

        return C_Combo;
    }

    private void insertarPedidoCombo(int IdPedido, int IdCombo, int Cantidad) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{CALL InsertarPedidoCombo(?, ?, ?)}");
        stmt.setInt(1, IdPedido);
        stmt.setInt(2, IdCombo);
        stmt.setInt(3, Cantidad);
        stmt.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JComboBox<String> cmbAcompañamientos;
    private javax.swing.JComboBox<String> cmbCombo;
    private javax.swing.JComboBox<String> cmbPollo;
    private javax.swing.JComboBox<String> cmbRefrescos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner spnAcompañamientos;
    private javax.swing.JSpinner spnCombos;
    private javax.swing.JSpinner spnMesa;
    private javax.swing.JSpinner spnPedido;
    private javax.swing.JSpinner spnPollo;
    private javax.swing.JSpinner spnRefrescos;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextArea txtPedido;
    private javax.swing.JTextField txtSucur;
    // End of variables declaration//GEN-END:variables
}
