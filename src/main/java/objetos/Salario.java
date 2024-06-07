/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author solor
 */
public class Salario {
    private int c_salario;
    private double m_salario_hora;
    private double m_salario_hora_extra;
    private double m_rebajo_salarial;

    public Salario(int c_salario, double m_salario_hora, double m_salario_hora_extra, double m_rebajo_salarial) {
        this.c_salario = c_salario;
        this.m_salario_hora = m_salario_hora;
        this.m_salario_hora_extra = m_salario_hora_extra;
        this.m_rebajo_salarial = m_rebajo_salarial;
    }

    public int getC_salario() {
        return c_salario;
    }

    public void setC_salario(int c_salario) {
        this.c_salario = c_salario;
    }

    public double getM_salario_hora() {
        return m_salario_hora;
    }

    public void setM_salario_hora(double m_salario_hora) {
        this.m_salario_hora = m_salario_hora;
    }

    public double getM_salario_hora_extra() {
        return m_salario_hora_extra;
    }

    public void setM_salario_hora_extra(double m_salario_hora_extra) {
        this.m_salario_hora_extra = m_salario_hora_extra;
    }

    public double getM_rebajo_salarial() {
        return m_rebajo_salarial;
    }

    public void setM_rebajo_salarial(double m_rebajo_salarial) {
        this.m_rebajo_salarial = m_rebajo_salarial;
    }

    @Override
    public String toString() {
        return "Salario{" + "c_salario=" + c_salario + ", m_salario_hora=" + m_salario_hora + ", m_salario_hora_extra=" + m_salario_hora_extra + ", m_rebajo_salarial=" + m_rebajo_salarial + '}';
    }
    
    
}
