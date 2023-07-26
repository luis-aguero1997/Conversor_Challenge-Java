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
                Total =Valor * Med.getHectometro();
                break;
            case 6: 
                Total = Valor * Med.getKilometro();
                break;
        }

        return Total;
    }

}
