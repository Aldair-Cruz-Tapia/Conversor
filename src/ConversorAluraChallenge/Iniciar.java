package ConversorAluraChallenge;

import javax.swing.*;

public class Iniciar {
    public static void main(String[] args) {
        SeleccionInicial inical = new SeleccionInicial();
        CambioMoneda cambioMoneda = new CambioMoneda();
        CambioPesos cambioPesos = new CambioPesos();

        do {
            String seleccion = inical.tipoConversion();
            if ( seleccion!= null){
            switch (seleccion) {
                case "Moneda":
                    cambioMoneda.tipoCambio();
                    continuar();
                    break;
                case "Pesos":
                    cambioPesos.cambioPeso();
                    continuar();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }}else {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                break;
            }
        } while (cont < 1);
    }
    private static int cont = 0;

    public static void continuar() {
        int continuar = JOptionPane.showConfirmDialog(null, "¿Desea usar el programa nuevamente?");
        if (continuar == JOptionPane.NO_OPTION) {
            cont++;
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        } else if (continuar == JOptionPane.CANCEL_OPTION) {
            cont++;
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        }
    }
}