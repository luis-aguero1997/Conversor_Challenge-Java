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
 *
 * En esta Clase se lleva a cabo la conversion de los valores que se obtienen en
 * la ventana principal, esto dependiendo de la opcion que se seleccione, para
 * despues retornar el resultado de la opcion seleccionada, para despues llevar
 * a cabo el calculo utilizando el valor que se recibio y el que se tiene
 * almacenado en la clase correspondiente, en este caso la clase "Divisas".
 *
 * Esta logica se repite en las demas clases donde se llevaron a cabo los
 * calculos.
 *
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
