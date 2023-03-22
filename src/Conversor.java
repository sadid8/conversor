import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {
  
        // Convertir de moneda
        String[] opcionesMoneda = {"Pesos Colombianos a dólares",  "Dólares a Pesos Colombianos", "Pesos Colombianos  a Euros", "Euros a Pesos Colombianos", "Pesos Colombianos a Libras esterlinas ", "libras esterlinas a Pesos Colombianos", "Pesos Colombianos a Yenes japoneses ", "yenes japoneses a Pesos Colombianos", "Pesos Colombianos a Won sur-coreano", "sur-coreano a Pesos Colombianos"};
        JComboBox<String> comboBoxMoneda = new JComboBox<>(opcionesMoneda);
        JOptionPane.showOptionDialog(
                null,
                comboBoxMoneda,
                "Convertir de moneda",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                null);
        String entradaMoneda = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero:");
        double cantidad = Double.parseDouble(entradaMoneda);
        switch (comboBoxMoneda.getSelectedIndex()) {
            case 0:
                // Pesos a dólares
                double dolares = cantidad / 4700;
                JOptionPane.showMessageDialog(null, cantidad + " pesos son " + dolares + " dólares.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                // Dólares a pesos
                double pesos = cantidad * 4700;
                JOptionPane.showMessageDialog(null, cantidad + " dólares son " + pesos + " pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
                case 2:
                // Pesos a Euros
                double euros = cantidad / 5100;
                JOptionPane.showMessageDialog(null,  cantidad + " Pesos son " + euros + " Euros.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                // Dólares a euros
                double pesos1 = cantidad * 5100;
                JOptionPane.showMessageDialog(null, cantidad + " Euros son " + pesos1 + " Pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;  
            case 4:
                // Pesos a Libras esterlinas 
                double Lesterlina = cantidad / 5678;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos son " + Lesterlina + " libras esterlinas.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                // libras esterlinas a pesos.
                double pesos2 = cantidad * 5768;
                JOptionPane.showMessageDialog(null, cantidad + " libras esterlinas son " + pesos2 + " Pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                // Pesos a Yenes japoneses
                double yenes = cantidad / 35.3;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos son " + yenes + " Yenes japoneses.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
                //yenes japoneses a Pesos.
                double pesos3 = cantidad * 35.3;
                JOptionPane.showMessageDialog(null, cantidad + " Yenes japoneses son " + pesos3 + " Pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 8:
                // Pesos  a  Won sul-coreano
                double won = cantidad / 3.64;
                JOptionPane.showMessageDialog(null, cantidad + " pesos  son " + won + "  Won sul-coreano", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 9:
                // Won sul-coreano a pesos 
                double pesos4 = cantidad * 3.64;
                JOptionPane.showMessageDialog(null, cantidad + "Won sul-coreano son " + pesos4+ " pesos .", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
   
        }
    
    }

}
