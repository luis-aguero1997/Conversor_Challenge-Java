/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import Clases.Medidas;

/**
 *
 * @author Luis
 *
 * En esta Clase se lleva a cabo la conversion de los valores que se obtienen en
 * la ventana principal, esto dependiendo de la opcion que se seleccione, para
 * despues retornar el resultado de la opcion seleccionada, para despues llevar
 * a cabo el calculo utilizando el valor que se recibio y el que se tiene
 * almacenado en la clase correspondiente, en este caso la clase "Medidas".
 *
 * Esta logica se repite en las demas clases donde se llevaron a cabo los
 * calculos.
 *
 */
public class CalculosMedidas {

    Medidas Med = new Medidas();

    public double Cambio(double Valor, int Opcion) {
        double Total = 0;
        switch (Opcion) {
            case 1:
                Total = Valor * Med.getMilimetro();
                break;
            case 2:
                Total = Valor * Med.getDecimetro();
                break;
            case 3:
                Total = Valor * Med.getMetro();
                break;
            case 4:
                Total = Valor * Med.getDecametro();
                break;
            case 5:
                Total = Valor * Med.getHectometro();
                break;
            case 6:
                Total = Valor * Med.getKilometro();
                break;
        }

        return Total;
    }

}
