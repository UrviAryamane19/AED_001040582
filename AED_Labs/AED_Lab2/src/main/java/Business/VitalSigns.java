/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Urvi
 */
public class VitalSigns {
    private double tempertaure;
    private double bloddPressure;
    private int pulse;
    private String date;

    public double getTempertaure() {
        return tempertaure;
    }

    public void setTempertaure(double tempertaure) {
        this.tempertaure = tempertaure;
    }

    public double getBloddPressure() {
        return bloddPressure;
    }

    public void setBloddPressure(double bloddPressure) {
        this.bloddPressure = bloddPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return date;
    }
}
