package radio;
/* Clase principal Boton
    Jorge Mario Tezen Cristales 15417
    Diego Fernando Rivera 15085
    Juan Pablo Caheque  */
    
public class Boton{

    String frecuency;
    String station; 
    
    public Boton (String frecuency, String station)
    {
        this.frecuency= frecuency;
        this.station = station;
    }
    public String Print() {
        return frecuency.concat("|").concat(station);
    }
    
    public void setFrecuency(String frecuency){
        this.frecuency=frecuency;
    }
    public String getFrecuency (){
        return frecuency;
    }
    public void setStation(String station){
        this.station=station;
    }
    public String getStation(){
        return station;
    }
}
