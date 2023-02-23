package ConversorAluraChallenge;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Conversor {
    private static int cont = 0;
    public void convertir (double valor,String unidades,String cambio){
        double resultado;
        do {
            String input = JOptionPane.showInputDialog("Cantidad");
            Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
            Matcher m = p.matcher(input);
            if (m.find()) {
                JOptionPane.showMessageDialog(null, "Solo numeros");
                cont=0;
            } else {
                double cantidad = Double.parseDouble(input);
                if (cantidad > 0) {
                    resultado = cantidad * valor;
                    JOptionPane.showMessageDialog(null, cantidad +" "+ unidades+" equivalen a " + resultado +" "+ cambio);
                } else {
                    JOptionPane.showMessageDialog(null, "Se requiere una cantidad mayor a Cero (0)");
                }
                cont++;
            }
        }while (cont < 1);
    }
}
