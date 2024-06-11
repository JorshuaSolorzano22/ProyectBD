/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author cesar
 */
public class Pedido_Combo {
    private int C_Pedido;
    private int C_Combo;
    private int q_combo;
    private String selected;
    private int quantity;

    public Pedido_Combo(int C_Pedido, int C_Combo, int q_combo, String selected, int quantity) {
        this.C_Pedido = C_Pedido;
        this.C_Combo = C_Combo;
        this.q_combo = q_combo;
        this.selected = selected;
        this.quantity = quantity;
    }

    public Pedido_Combo(String selected, int quantity) {
        this.selected = selected;
        this.quantity = quantity;
    }

    public int getC_Pedido() {
        return C_Pedido;
    }

    public void setC_Pedido(int C_Pedido) {
        this.C_Pedido = C_Pedido;
    }

    public int getC_Combo() {
        return C_Combo;
    }

    public void setC_Combo(int C_Combo) {
        this.C_Combo = C_Combo;
    }

    public int getQ_combo() {
        return q_combo;
    }

    public void setQ_combo(int q_combo) {
        this.q_combo = q_combo;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pedido_Combo{" + "C_Pedido=" + C_Pedido + ", C_Combo=" + C_Combo + ", q_combo=" + q_combo + ", selected=" + selected + ", quantity=" + quantity + '}';
    }

    

    
}
