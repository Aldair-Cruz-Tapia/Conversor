package ConversorAluraChallenge;

import javax.swing.*;

public class CambioPesos {
    private static int cont = 0;
    ValoresPesos valoresPesos = new ValoresPesos();
    Conversor conversor = new Conversor();

    public void cambioPeso() {
        String[] tipoConversion = {"Gramos a Libras", "Libras a Gramos", "Gramos a Onzas", "Onzas a Gramos"};
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige el Tipo de Cambio",
                "Tipo de Cambio", JOptionPane.QUESTION_MESSAGE, null, tipoConversion, tipoConversion[0]);
        switch (eleccion) {
            case "Gramos a Libras":
                conversor.convertir(valoresPesos.getGramoLibra(), "Gramos", "Libras");
                break;
            case "Libras a Gramos":
                conversor.convertir(valoresPesos.getLibraGramo(), "Libras", "Gramos");
                break;
            case "Gramos a Onzas":
                conversor.convertir(valoresPesos.getGramoOnza(), "Gramos", "Onzas");
                break;
            case "Onzas a Gramos":
                conversor.convertir(valoresPesos.getOnzaGramo(), "Onzas", "Gramos");
                break;
        }
    }
}
