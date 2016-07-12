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
    boolean ison();
    String getFrecuency(String Frecuencia);
    void setFrecuency();
    String getStation(String Estacion);
    void setStation();
    void Forward();
    void Backward();
    void setMemory(String station, String Frecuency, int Position);
    
}

