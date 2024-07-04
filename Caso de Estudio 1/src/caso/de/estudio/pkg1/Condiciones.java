/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.de.estudio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Condiciones {

    //Atributos
    private String ProducosElectricos;
    private String ProductosAutomotricies;
    private String ProductosConstruccion;
    private String CantFacturas;
    private String NumFac;

    //constructores
    public Condiciones() {
        CantFacturas = JOptionPane.showInputDialog("Cuantas Facturas vas a ingresar");

        //pasamos de string a int
        int CantFac = Integer.parseInt(CantFacturas);
        int fac = 0;
        for (int i = 0; i < CantFac; i++) {
            
            
     
            
            NumFac = JOptionPane.showInputDialog("Factura #" + fac ++);
            ProducosElectricos = JOptionPane.showInputDialog("En su Factura hay productos electricos");
            ProductosAutomotricies = JOptionPane.showInputDialog("En su Factura hay productos automotrices");
            ProductosConstruccion = JOptionPane.showInputDialog("En su Factura hay productos de construccion");

            if (ProducosElectricos.equals("si")) {
              
            }

            if (ProductosConstruccion.equals("si")) {
               
            }

            if (ProducosElectricos.equals("si")) {
                
            }

            if (ProducosElectricos.equals("si")) {
                
            }

        }

    }

    //getters and setters
    public String getProducosElectricos() {
        return ProducosElectricos;

    }

    public void setProducosElectricos(String ProducosElectricos) {
        this.ProducosElectricos = ProducosElectricos;
    }

    public String getProductosAutomotricies() {
        return ProductosAutomotricies;
    }

    public void setProductosAutomotricies(String ProductosAutomotricies) {
        this.ProductosAutomotricies = ProductosAutomotricies;
    }

    public String getProductosConstruccion() {
        return ProductosConstruccion;
    }

    public void setProductosConstruccion(String ProductosConstruccion) {
        this.ProductosConstruccion = ProductosConstruccion;
    }

    public String getCantFacturas() {
        return CantFacturas;
    }

    public void setCantFacturas(String CantFacturas) {
        this.CantFacturas = CantFacturas;
    }
}
