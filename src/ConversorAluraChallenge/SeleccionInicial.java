package ConversorAluraChallenge;

import javax.swing.*;

public class SeleccionInicial {
    public  String tipoConversion(){
        String[] tipoConversion = {"Moneda","Pesos"};
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige el Tipo de Conversor",
                "Tipo de Conversor",JOptionPane.QUESTION_MESSAGE,null,tipoConversion,tipoConversion[0]);
         return eleccion;
    }
}
