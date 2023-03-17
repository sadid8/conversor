import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {
  
        // Convertir de moneda
        String[] opcionesMoneda = {"Pesos Colombianos a dólares",  "Dólares a Pesos Colombianos"};
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
            
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
   
        }
    
    }

}
