package capaPresentacion.Order;

import capaLogica.Conexion;
import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.xml.transform.stream.StreamSource;
import objetos.Combo;
import objetos.Pedido;
import objetos.Pedido_Combo;
import objetos.Product;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbPollo = new javax.swing.JComboBox<>();
        cmbRefrescos = new javax.swing.JComboBox<>();
        cmbAcompañamientos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        setPreferredSize(new java.awt.Dimension(719, 343));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 337));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

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
        jScrollPane1.setViewportView(txtPedido);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Su pedido:");

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPay.setText("Pagar");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPollo, 0, 194, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAcompañamientos, 0, 130, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(331, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveOrder)
                        .addGap(177, 177, 177)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPay)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAcompañamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnRefrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCombos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveOrder)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        
            String D_Num_Mesa = null;
            String D_Observacion = null;
            Time F_Duracion_Entrega_Pedido = null;
            Date F_Inicio = null;
            Date F_Final = null;
            Date F_Duracion = null;
            String C_Sucursal = null;

            int C_Pedido = insertarPedido(D_Num_Mesa, D_Observacion, F_Duracion_Entrega_Pedido, F_Inicio, F_Final, F_Duracion, C_Sucursal);

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

    public int insertarPedido(String D_Num_Mesa, String D_Observacion, Time F_Duracion_Entrega_Pedido, Date F_Inicio, Date F_Final, Date F_Duracion, String C_Sucursal) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{EXEC InsertarPedido(?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setString(1, D_Num_Mesa);
        stmt.setString(2, D_Observacion);
        stmt.setTime(3, F_Duracion_Entrega_Pedido);
        stmt.setDate(4, F_Inicio);
        stmt.setDate(5, F_Final);
        stmt.setDate(6, F_Duracion);
        stmt.setString(7, C_Sucursal);
        stmt.registerOutParameter(8, Types.INTEGER);
        stmt.execute();

        int C_Pedido = stmt.getInt(8);

        stmt.close();
        con.close();

        return C_Pedido;
    }

    private int getProductoId(String nombreProducto) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{EXEC ObtenerIdProducto(?)}");
        stmt.setString(1, nombreProducto);
        stmt.execute();

        ResultSet rs = stmt.getResultSet();
        int C_Producto = 0;
        if (rs.next()) {
            C_Producto = rs.getInt(1);
        }

        rs.close();
        stmt.close();
        con.close();

        return C_Producto;
    }

    private void insertarProductoPedido(int IdPedido, int IdProducto, int Cantidad) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{EXEC InsertarProductoPedido(?, ?, ?)}");
        stmt.setInt(1, IdPedido);
        stmt.setInt(2, IdProducto);
        stmt.setInt(3, Cantidad);
        stmt.execute();
        stmt.close();
        con.close();
    }

    private int getComboId(String NombreCombo) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{EXEC ObtenerIdCombo(?)}");
        stmt.setString(1, NombreCombo);
        stmt.execute();

        ResultSet rs = stmt.getResultSet();
        int C_Combo = 0;
        if (rs.next()) {
            C_Combo = rs.getInt(1);
        }

        rs.close();
        stmt.close();
        con.close();

        return C_Combo;
    }

    private void insertarPedidoCombo(int IdPedido, int IdCombo, int Cantidad) throws SQLException {
        Connection con = Conexion.getInstance().getConnection();
        CallableStatement stmt = con.prepareCall("{EXEC InsertarPedidoCombo(?, ?, ?)}");
        stmt.setInt(1, IdPedido);
        stmt.setInt(2, IdCombo);
        stmt.setInt(3, Cantidad);
        stmt.execute();
        stmt.close();
        con.close();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAcompañamientos;
    private javax.swing.JSpinner spnCombos;
    private javax.swing.JSpinner spnPollo;
    private javax.swing.JSpinner spnRefrescos;
    private javax.swing.JTextArea txtPedido;
    // End of variables declaration//GEN-END:variables
}
