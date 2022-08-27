package co.edu.cue.proyecto;

import co.edu.cue.proyecto.Calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
        //int  precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio"));
        //float decimal = 2.45f;
        Producto producto1 = new Producto("carne", "comida", 20000);
        Producto producto2 = new Producto("azucar", "comida", 1500);
        Producto producto3 = new Producto("queso", "comida", 3000);
        Producto producto4 = new Producto("chocolate", "dulce", 5500);
        Producto producto5 = new Producto("Helado", "dulce", 2000);
        Factura factura = new Factura();

        int totalDeLasFacturas;

        for (int i = 1; i < 4; i++) {
            int cantidadProducto1 = Integer.parseInt(JOptionPane.showInputDialog(producto1.getNombre() + " " + producto1.getPrecio() + " Ingrese la cantidad del producto"));
            int cantidadProducto2 = Integer.parseInt(JOptionPane.showInputDialog(producto2.getNombre() + " " + producto2.getPrecio() + " Ingrese la cantidad del producto"));
            int cantidadProducto3 = Integer.parseInt(JOptionPane.showInputDialog(producto3.getNombre() + " " + producto3.getPrecio() + " Ingrese la cantidad del producto"));
            int cantidadProducto4 = Integer.parseInt(JOptionPane.showInputDialog(producto4.getNombre() + " " + producto4.getPrecio() + " Ingrese la cantidad del producto"));
            int cantidadProducto5 = Integer.parseInt(JOptionPane.showInputDialog(producto5.getNombre() + " " + producto5.getPrecio() + " Ingrese la cantidad del producto"));

            Factura factura_producto1 = new Factura(producto1.getNombre(), producto1.getPrecio(), cantidadProducto1);
            int factura_producto_1 = factura_producto1.imprimirC(producto1.getNombre(), producto1.getPrecio(), cantidadProducto1);

            Factura factura_producto2 = new Factura(producto2.getNombre(), producto2.getPrecio(), cantidadProducto2);
            int factura_producto_2 = factura_producto2.imprimirC(producto2.getNombre(), producto2.getPrecio(), cantidadProducto2);

            Factura factura_producto3 = new Factura(producto3.getNombre(), producto3.getPrecio(), cantidadProducto3);
            int factura_producto_3 = factura_producto3.imprimirC(producto3.getNombre(), producto3.getPrecio(), cantidadProducto3);

            Factura factura_producto4 = new Factura(producto4.getNombre(), producto4.getPrecio(), cantidadProducto4);
            int factura_producto_4 = factura_producto4.imprimirC(producto4.getNombre(), producto4.getPrecio(), cantidadProducto4);

            Factura factura_producto5 = new Factura(producto5.getNombre(), producto5.getPrecio(), cantidadProducto5);
            int factura_producto_5 = factura_producto5.imprimirC(producto5.getNombre(), producto5.getPrecio(), cantidadProducto5);

            int totalPorFactura = factura_producto_1 + factura_producto_2 + factura_producto_3 + factura_producto_4 + factura_producto_5;
            totalDeLasFacturas = totalPorFactura + totalPorFactura;

            JOptionPane.showMessageDialog(null,
                    "Factura: " + i + "\n" +
                            "Producto: " + producto1.getNombre() + " " + producto1.getPrecio() + " Cantidad: " + cantidadProducto1 + " " + " Total: " + factura_producto_1 + "\n" +
                            "Producto: " + producto2.getNombre() + " " + producto2.getPrecio() + " Cantidad: " + cantidadProducto2 + " " + " Total: " + factura_producto_2 + "\n" +
                            "Producto: " + producto3.getNombre() + " " + producto3.getPrecio() + " Cantidad: " + cantidadProducto3 + " " + " Total: " + factura_producto_3 + "\n" +
                            "Producto: " + producto4.getNombre() + " " + producto4.getPrecio() + " Cantidad: " + cantidadProducto4 + " " + " Total: " + factura_producto_4 + "\n" +
                            "Producto: " + producto5.getNombre() + " " + producto5.getPrecio() + " Cantidad: " + cantidadProducto5 + " " + " Total: " + factura_producto_5 + "\n" +
                            "Total: " + totalPorFactura
            );
        }
    }}