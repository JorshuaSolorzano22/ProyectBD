package capaPresentacion.Order;

import capaLogica.Conexion;
import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
            saveOrder(txtPedido);
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

    public void saveOrder(JTextArea txtPedido) throws SQLException {
        StringBuilder textBuilder = new StringBuilder("\n");
        // ... (código existente para llenar textBuilder)

        // Crear lista de productos
        List<Producto_Pedido> listaProductos = new ArrayList<>();
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

        // Crear lista de combos
        List<Pedido_Combo> listaCombos = new ArrayList<>();
        String selectedCombo = (String) cmbCombo.getSelectedItem();
        int quantityCombos = (int) spnCombos.getValue();
        if (!selectedCombo.equals("Elegir...") && quantityCombos > 0) {
            listaCombos.add(new Pedido_Combo(selectedCombo, quantityCombos));
        }

        txtPedido.setText(textBuilder.toString());

        // Construir el XML de productos
        StringBuilder sbProductos = new StringBuilder();
        sbProductos.append("<Productos>");
        for (Producto_Pedido producto : listaProductos) {
            sbProductos.append("<Producto>");
            sbProductos.append("<C_Producto>").append(producto.getCodigoProducto()).append("</C_Producto>");
            sbProductos.append("<Q_Producto>").append(producto.getQ_producto()).append("</Q_Producto>");
            sbProductos.append("</Producto>");
        }
        sbProductos.append("</Productos>");

        // Construir el XML de combos
        StringBuilder sbCombos = new StringBuilder();
        sbCombos.append("<Combos>");
        for (Pedido_Combo combo : listaCombos) {
            sbCombos.append("<Combo>");
            sbCombos.append("<C_Combo>").append(combo.getC_Combo()).append("</C_Combo>");
            sbCombos.append("<Q_Combo>").append(combo.getQuantity()).append("</Q_Combo>");
            sbCombos.append("</Combo>");
        }
        sbCombos.append("</Combos>");

        Pedido pedido = new Pedido();
        int C_Pedido = pedido.getC_pedido();
        String D_Num_Mesa = "001";
        String D_Observacion = "Ninguna";
        java.sql.Time F_Duracion_Entrega_Pedido = new java.sql.Time(10, 0, 0); // 10:00:00 (10 minutos)
        java.sql.Date F_Inicio = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date F_Final = null; // Se calculará en el procedimiento almacenado
        java.sql.Date F_Duracion = null; // Se calculará en el procedimiento almacenado
        String C_Sucursal = "01";

        String xmlProductos = sbProductos.toString();
        String xmlCombos = sbCombos.toString();

        // Llamar al procedimiento almacenado
        CallableStatement stmt = conexion.prepareCall("{CALL InsertarPedido(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt(1, C_Pedido);
        stmt.setString(2, D_Num_Mesa);
        stmt.setString(3, D_Observacion);
        stmt.setTime(4, F_Duracion_Entrega_Pedido);
        stmt.setDate(5, F_Inicio);
        stmt.setDate(6, F_Final);
        stmt.setDate(7, F_Duracion);
        stmt.setString(8, C_Sucursal);

        StringReader xmlProductosReader = new StringReader(xmlProductos);
        StringReader xmlCombosReader = new StringReader(xmlCombos);

        stmt.setCharacterStream(9, xmlProductosReader);
        stmt.setCharacterStream(10, xmlCombosReader);

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
