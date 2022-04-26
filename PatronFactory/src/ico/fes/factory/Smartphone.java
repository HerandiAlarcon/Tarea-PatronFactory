/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

/**
 *
 * @author HERANDI
 */
public class Smartphone implements Dispositivo{
    private String marca;
    private String Almacenamiento;
    private boolean huella;
    private boolean dobleSim;

    public Smartphone(String marca, String Almacenamiento, boolean huella, boolean dobleSim) {
        this.marca = marca;
        this.Almacenamiento = Almacenamiento;
        this.huella = huella;
        this.dobleSim = dobleSim;
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

    public boolean isHuella() {
        return huella;
    }

    public void setHuella(boolean huella) {
        this.huella = huella;
    }

    public boolean isDobleSim() {
        return dobleSim;
    }

    public void setDobleSim(boolean dobleSim) {
        this.dobleSim = dobleSim;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", Almacenamiento=" + Almacenamiento + ", huella=" + huella + ", dobleSim=" + dobleSim + '}';
    }
    
    
    
    

    
}
