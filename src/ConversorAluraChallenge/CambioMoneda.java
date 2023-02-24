package ConversorAluraChallenge;

import javax.swing.*;

public class CambioMoneda {
    private static int cont = 0;
    ValoresMoneda valoresMoneda = new ValoresMoneda();
    Conversor conversor = new Conversor();

    public void tipoCambio() {
        String[] tipoConversion = {"Dolar a Peso(MX)", "Peso(MX) a Dolar", "Peso(MX) a Libras", "Libras a Peso(MX)",
                "Peso(MX) a Euro", "Euro a Peso(MX)", "Peso(MX) a Yen", "Yen a Peso(MX)", "Peso(MX) a Won", "Won a Peso(MX)"};
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige el Tipo de Cambio",
                "Tipo de Cambio", JOptionPane.QUESTION_MESSAGE, null, tipoConversion, tipoConversion[0]);
        if(eleccion!=null) {
            switch (eleccion) {
                case "Dolar a Peso(MX)":
                    conversor.convertir(valoresMoneda.getDolaraPeso(), "Dolares", "Pesos(MX)");
                    break;
                case "Peso(MX) a Dolar":
                    conversor.convertir(valoresMoneda.getPesoaDolar(), "Pesos(MX)", "Dolares");
                    break;
                case "Peso(MX) a Libras":
                    conversor.convertir(valoresMoneda.getPesoaLibra(), "Pesos(MX)", "Libras");
                    break;
                case "Libras a Peso(MX)":
                    conversor.convertir(valoresMoneda.getLibraPeso(), "Libras", "Pesos(MX)");
                    break;
                case "Peso(MX) a Euro":
                    conversor.convertir(valoresMoneda.getPesoaEuro(), "Pesos(MX)", "Euros");
                    break;
                case "Euro a Peso(MX)":
                    conversor.convertir(valoresMoneda.getEuroaPeso(), "Euros", "Pesos(MX)");
                    break;
                case "Peso(MX) a Yen":
                    conversor.convertir(valoresMoneda.getPesoaYen(), "Pesos(MX)", "Yenes");
                    break;
                case "Yen a Peso(MX)":
                    conversor.convertir(valoresMoneda.getYenaPeso(), "Yenes", "Pesos(MX)");
                    break;
                case "Peso(MX) a Won":
                    conversor.convertir(valoresMoneda.getPesoaWon(), "Pesos(MX)", "Wones");
                    break;
                case "Won a Peso(MX)":
                    conversor.convertir(valoresMoneda.getWonaPeso(), "Wones", "Pesos(MX)");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            System.exit(0);
        }
    }
}
