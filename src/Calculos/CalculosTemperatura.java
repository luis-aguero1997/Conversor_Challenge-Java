/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

/**
 *
 * @author Luis
 *
 * En esta Clase se lleva a cabo la conversion de los valores que se obtienen en
 * la ventana principal, esto dependiendo de la opcion que se seleccione, para
 * despues retornar el resultado de la opcion seleccionada, esto se lleva a cabo
 * utilizando el valor que se recibio pero a diferencia de las otras clases,
 * esta conversion es llevada a cabo a travez de diferentes formulas,
 * dependiendo de la conversion que se llevara a cabo.
 *
 */
public class CalculosTemperatura {

    public double Cambio(double Valor, int Opcion) {
        double Total = 0;
        switch (Opcion) {
            case 1:
                Total = (Valor * 1.8) + 32;
                break;
            case 2:
                Total = Valor + 273.15;
                break;
            case 3:
                Total = (Valor - 32) / 1.8;
                break;
            case 4:
                Total = (Valor + 459.67) * 0.5555556;
                break;
            case 5:
                Total = Valor - 273.15;
                break;
            case 6:
                Total = (Valor * 1.8) - 459.67;
                break;
        }

        return Total;
    }

}
