/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import Clases.Pesos;

/**
 *
 * @author Luis
 */
public class CalculosPesos {
    
    Pesos Ps = new Pesos();
    public double Cambio(double Valor, int Opcion) {
        double Total = 0;
        switch (Opcion) {
            case 1:
                Total = Valor * Ps.getKilogramo();
                break;
            case 2:
                Total = Valor * Ps.getHectogramo();
                break;
            case 3:
                Total = Valor * Ps.getDecagramo();
                break;
            case 4:
                Total = Valor * Ps.getDecigramo();
                break;
            case 5:
                Total = Valor * Ps.getCentigramo();
                break;
            case 6:
                Total = Valor * Ps.getMiligramo();
                break;
        }
        return Total;
    }
}
