package radio;
/* Clase Boton que guarda los valores en memoria
    Jorge Mario Tezen Cristales 15417
    Diego Fernando Rivera 15085
    Juan Pablo Caheque  15396*/
    
public class Boton{

    String frecuency; //guarda la frecuencia
    String station;  //guarda la estacion
    
    
    //metodo constructor de Boton
    public Boton (String frecuency, String station)
    {   this.frecuency= frecuency;
        this.station = station;
    }
    
    //metodo que imprie la frecuencia y esacion del boton
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