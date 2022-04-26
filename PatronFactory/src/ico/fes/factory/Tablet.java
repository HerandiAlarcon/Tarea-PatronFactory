/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

/**
 *
 * @author HERANDI
 */
public class Tablet implements Dispositivo{
    private String marca;
    private String Almacenamiento;
    private float tamPantalla;
    private boolean ranuraSim;

    public Tablet(String marca, String Almacenamiento, float tamPantalla, boolean ranuraSim) {
        this.marca = marca;
        this.Almacenamiento = Almacenamiento;
        this.tamPantalla = tamPantalla;
        this.ranuraSim = ranuraSim;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public float getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(float tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public boolean isRanuraSim() {
        return ranuraSim;
    }

    public void setRanuraSim(boolean ranuraSim) {
        this.ranuraSim = ranuraSim;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", Almacenamiento=" + Almacenamiento + ", tamPantalla=" + tamPantalla + ", ranuraSim=" + ranuraSim + '}';
    }
    
    
}
