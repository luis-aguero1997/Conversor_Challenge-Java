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
 * de las divisas, que posteriormente seran utilizadas para llevar a cabo las
 * conversiones necesarias, estos valores seran llamados por la clase de
 * Calculos correspondiente. Esta logica es la misma que se uso en las
 * diferentes clases usadas.
 */
public class Divisas {

    public double PesoM, Dolar, Euro, LibraE, WonC, YenJ;

    public Divisas() {
        this.PesoM = PesoM;
        this.Dolar = 16.83;
        this.Euro = 18.64;
        this.LibraE = 21.61;
        this.WonC = 0.013;
        this.YenJ = 0.12;
    }

    public double getPesoM() {
        return PesoM;
    }

    public void setPesoM(double PesoM) {
        this.PesoM = PesoM;
    }

    public double getDolar() {
        return Dolar;
    }

    public void setDolar(double Dolar) {
        this.Dolar = Dolar;
    }

    public double getEuro() {
        return Euro;
    }

    public void setEuro(double Euro) {
        this.Euro = Euro;
    }

    public double getLibraE() {
        return LibraE;
    }

    public void setLibraE(double LibraE) {
        this.LibraE = LibraE;
    }

    public double getWonC() {
        return WonC;
    }

    public void setWonC(double WonC) {
        this.WonC = WonC;
    }

    public double getYenJ() {
        return YenJ;
    }

    public void setYenJ(double YenJ) {
        this.YenJ = YenJ;
    }
}
