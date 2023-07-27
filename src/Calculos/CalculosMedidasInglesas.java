/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import Clases.MedidasInglesas;

/**
 *
 * @author Luis
 */
public class CalculosMedidasInglesas {
    
    MedidasInglesas MedIn = new MedidasInglesas();
    
    public double Cambio(double Valor, int Opcion){
        double Total = 0 ;
        switch(Opcion){
            case 1:
                Total = Valor / MedIn.getPulgada();
                break;
            case 2:
                Total = Valor / MedIn.getPie();
                break;
            case 3:
                Total = Valor / MedIn.getYarda();
                break;
            case 4:
                Total = Valor / MedIn.getMilla();
                break;
        }
        
        return Total;
    }
}
