/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Luis En esta clase fue donde se almacenaron los valores equivalentes
 * de cada una de las medidas, que posteriormente seran utilizadas para llevar a
 * cabo las conversiones necesarias, estos valores seran llamados por la clase
 * de Calculos correspondiente. Esta logica es la misma que se uso en las
 * diferentes clases usadas.
 */
public class Medidas {

    double Centmetro, Milimetro, Decimetro, Metro, Decametro, Hectometro, Kilometro;

    public Medidas() {
        this.Centmetro = 1;
        this.Milimetro = 10;
        this.Decimetro = 0.1;
        this.Metro = 0.01;
        this.Decametro = 0.001;
        this.Hectometro = 0.0001;
        this.Kilometro = 0.00001;
    }

    public double getCentmetro() {
        return Centmetro;
    }

    public void setCentmetro(double Centmetro) {
        this.Centmetro = Centmetro;
    }

    public double getMilimetro() {
        return Milimetro;
    }

    public void setMilimetro(double Milimetro) {
        this.Milimetro = Milimetro;
    }

    public double getDecimetro() {
        return Decimetro;
    }

    public void setDecimetro(double Decimetro) {
        this.Decimetro = Decimetro;
    }

    public double getMetro() {
        return Metro;
    }

    public void setMetro(double Metro) {
        this.Metro = Metro;
    }

    public double getDecametro() {
        return Decametro;
    }

    public void setDecametro(double Decametro) {
        this.Decametro = Decametro;
    }

    public double getHectometro() {
        return Hectometro;
    }

    public void setHectometro(double Hectometro) {
        this.Hectometro = Hectometro;
    }

    public double getKilometro() {
        return Kilometro;
    }

    public void setKilometro(double Kilometro) {
        this.Kilometro = Kilometro;
    }

}
