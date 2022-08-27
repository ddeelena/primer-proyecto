package co.edu.cue.proyecto;

import java.sql.SQLOutput;

public class Producto {
    private String nombre;
    private String tipo;
    private int precio;


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto(String nombre, String tipo,int precio){
        this.nombre = nombre;
        this.tipo= tipo;
        this.precio=precio;
    }
}

