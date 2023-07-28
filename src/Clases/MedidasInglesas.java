/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Luis
 *
 * En esta clase fue donde se almacenaron los valores equivalentes de cada una
 * de las medidas Inglesas en centimetros, que posteriormente seran utilizadas
 * para llevar a cabo las conversiones necesarias, estos valores seran llamados
 * por la clase de Calculos correspondiente. Esta logica es la misma que se uso
 * en las diferentes clases usadas.
 */
public class MedidasInglesas {

    double Pulgada, Pie, Yarda, Milla;

    public MedidasInglesas() {
        this.Pulgada = 2.54;
        this.Pie = 30.5;
        this.Yarda = 91.44;
        this.Milla = 160934;
    }

    public double getPulgada() {
        return Pulgada;
    }

    public void setPulgada(double Pulgada) {
        this.Pulgada = Pulgada;
    }

    public double getPie() {
        return Pie;
    }

    public void setPie(double Pie) {
        this.Pie = Pie;
    }

    public double getYarda() {
        return Yarda;
    }

    public void setYarda(double Yarda) {
        this.Yarda = Yarda;
    }

    public double getMilla() {
        return Milla;
    }

    public void setMilla(double Milla) {
        this.Milla = Milla;
    }

}
