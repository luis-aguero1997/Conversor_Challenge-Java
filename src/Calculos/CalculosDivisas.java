/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import Clases.Divisas;

/**
 *
 * @author Luis
 */
public class CalculosDivisas {

    Divisas Div = new Divisas();

    public double Cambio(double Valor, int Opcion) {
        double Total = 0;
        switch (Opcion) {

            case 1:
                Total = Valor / Div.getDolar();
                break;
            case 2:
                Total = Valor / Div.getEuro();
                break;
            case 3:
                Total = Valor / Div.getLibraE();
                break;
            case 4:
                Total = Valor / Div.getYenJ();
                break;
            case 5:
                Total = Valor / Div.getWonC();
                break;
            case 6:
                Total = Valor * Div.getDolar();
                break;
            case 7:
                Total = Valor * Div.getEuro();
                break;
            case 8:
                Total = Valor * Div.getLibraE();
                break;
            case 9:
                Total = Valor * Div.getYenJ();
                break;
            case 10:
            Total = Valor * Div.getWonC();
        }

        return Total;

    }

}
