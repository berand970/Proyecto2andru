/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_andru_bernal;

import java.util.Date;

/**
 *
 * @author Junior Nuñes
 */
public class InfJuego {
     private String oponente;
    private String resultado;
    private Date fecha;

    public InfJuego(String oponente, String resultado, Date fecha) {
        this.oponente = oponente;
        this.resultado = resultado;
        this.fecha = fecha;
    }

    public String getOponente() {
        return oponente;
    }

    public String getResultado() {
        return resultado;
    }

    public Date getFecha() {
        return fecha;
    }
}
