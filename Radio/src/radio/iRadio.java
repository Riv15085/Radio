package radio;

/**
 * Clase Interfaz Radio
 *Jorge Mario Tezen Cristales 15417
 *Diego Fernando Rivera 15085
 *Juan Pablo Cahueuque 15396
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

