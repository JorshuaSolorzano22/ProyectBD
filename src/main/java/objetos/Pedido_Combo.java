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

    public Pedido_Combo(int C_Pedido, int C_Combo) {
        this.C_Pedido = C_Pedido;
        this.C_Combo = C_Combo;
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

    @Override
    public String toString() {
        return "Pedido_Combo{" + "C_Pedido=" + C_Pedido + ", C_Combo=" + C_Combo + '}';
    }
    
    
}
