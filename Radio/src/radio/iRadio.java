/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author diego
 */
public interface iRadio {

    void on();
    void off();
    boolean isOn();
    String getFrecuency();
    void setFrecuency(String frecuencia);
    String getStation();
    void setStation(String Estacion);
    void Forward();
    void Backward();
    void setMemory( int Position);
}

