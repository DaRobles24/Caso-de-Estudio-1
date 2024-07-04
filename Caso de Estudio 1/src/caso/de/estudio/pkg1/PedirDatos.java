package caso.de.estudio.pkg1;
import javax.swing.JOptionPane;

public class PedirDatos {
    // Atributos
    private String nameClient;
    private int idClient;
    private int ticketCode;
    private double totalMount;
    private int month;

    // Constructor
    public PedirDatos() {
        nameClient = JOptionPane.showInputDialog("Hola Cliente, Ingrese su nombre:");
        idClient = Integer.parseInt(JOptionPane.showInputDialog(nameClient + ", Ingrese su cédula:"));
        ticketCode = Integer.parseInt(JOptionPane.showInputDialog(nameClient + ", Ingrese el código de factura:"));
        totalMount = Double.parseDouble(JOptionPane.showInputDialog(nameClient + ", Ingrese el total de la factura:"));
        month = Integer.parseInt(JOptionPane.showInputDialog(nameClient + ", Ingrese el número del mes en el que compró:"));
    }

    // Getters and Setters 
    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }

    public double getTotalMount() {
        return totalMount;
    }

    public void setTotalMount(double totalMount) {
        this.totalMount = totalMount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
     
}
