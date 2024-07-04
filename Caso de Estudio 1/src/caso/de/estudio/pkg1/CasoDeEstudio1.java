/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.de.estudio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class CasoDeEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PedirDatos Pedirdatos1 = new PedirDatos ();
        
        Condiciones condiciones1 = new Condiciones ();
        JOptionPane.showMessageDialog(null,condiciones1.getProducosElectricos());
        JOptionPane.showMessageDialog(null,condiciones1.getProductosAutomotricies());
        JOptionPane.showMessageDialog(null,condiciones1.getProductosConstruccion());
        JOptionPane.showMessageDialog(null,condiciones1.getCantFacturas());
        
        
    }
    
}
