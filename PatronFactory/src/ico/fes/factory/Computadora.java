/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

/**
 *
 * @author HERANDI
 */
public class Computadora implements Dispositivo{
    private String Marca;
    private String procesador;
    private String memoria;
    private String almacenamiento;

    public Computadora(String Marca, String procesador, String memoria, String almacenamiento) {
        this.Marca = Marca;
        this.procesador = procesador;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", procesador=" + procesador + ", memoria=" + memoria + ", almacenamiento=" + almacenamiento + '}';
    }

   
}
