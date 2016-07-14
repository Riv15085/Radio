/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radio;

/**
 *
 * Diego Fernando Rivera Escobar 15085
 * Programación orientada a objetos
 */
public class MiRadio implements iRadio {

    private boolean botonP;
    private String frecuencia;
    private String estacionActual;
    private Boton[] memorias;    
    
    public MiRadio(){
        this.botonP = true;
        this.frecuencia = "fm";
        this.estacionActual = "87.9";
        this.memorias = new Boton[12];
    }
    @Override
    public void on() {
       botonP = true;
    }

    @Override
    public void off() {
       botonP = false; 
    }

    @Override
    public boolean isOn() {
        return botonP;
    }

    @Override
    public String getFrecuency() {
        return frecuencia; 
       
    }

    @Override
    public void setFrecuency(String frecuencia) {
        if (getFrecuency().equalsIgnoreCase("am")){
        this.frecuencia = "fm";
    }
        else {
        this.frecuencia = "am";
        }      
    }

    @Override
    public String getStation() {
        return estacionActual;
    }

    @Override
    public void setStation(String Estacion ) {
        this.estacionActual=Estacion;
        }

    @Override
    public void Forward() {
        double Numero=0.0;
        if (frecuencia.equalsIgnoreCase("am")){
            Numero = Double.parseDouble(estacionActual);
            if (Numero<1610){
                Numero = Numero + 10;
            }
            else{
                Numero = 530;
            }
            estacionActual = Double.toString(Numero);
        }
        if (frecuencia.equalsIgnoreCase("fm")){
            Numero = Double.parseDouble(estacionActual);
            if (Numero<107.9){
                Numero = Numero + 0.2;
            }
            else{
                Numero = 87.9;
            }
            estacionActual = Double.toString(Numero);
        }
    }

    @Override
    public void Backward() {
        double Numero=0.0;
        if (frecuencia.equalsIgnoreCase("am")){
            Numero = Double.parseDouble(estacionActual);
            if (Numero>530){
                Numero = Numero - 10;
            }
            else{
                Numero = 1610;
            }
            estacionActual = Double.toString(Numero);
        }
        if (frecuencia.equalsIgnoreCase("fm")){
            Numero = Double.parseDouble(estacionActual);
            if (Numero>87.9){
                Numero = Numero - 0.2;
            }
            else{
                Numero = 107.9;
            }
            estacionActual = Double.toString(Numero);
        }
    }

    public void setMemory(int Position) {
        if (Position > 0 && Position <12){            
            memorias[Position] = new Boton(frecuencia, estacionActual);
        }
    }
    public void getMemory(int position){
        setFrecuency(memorias[position].getFrecuency());
        setStation(memorias[position].getStation());
    }
    
    public String toString(){
        String texto = "El radio esta ";
        if (isOn()){
            texto+= "encendido";
        }
        else{
            texto+= "apagado";
        }
        texto += "\n"+frecuencia+" "+estacionActual;         
        return texto;
    }
}
