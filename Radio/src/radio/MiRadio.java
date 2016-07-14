package radio;

/**
 * Clase que implement la interfaz 
 * Juan Pablo Cahueque 15396
 * Jorge Mario Tezen Cristales 15417
 * Diego Fernando Rivera Escobar 15085
 * Programación orientada a objetos
 */
public class MiRadio implements iRadio {

    private boolean botonP;  // boton de Encendido y Apagado
    private String frecuencia; // Am o Fm
    private String estacionActual; // Muestra la estacion actual am o fm 
    private Boton[] memorias;   //array de estaciones guardadas en memoria
    
    //metodo Constructor se inicializan los atributos
    public MiRadio(){
        this.botonP = true;
        this.frecuencia = "fm";
        this.estacionActual = "87.9";
        this.memorias = new Boton[12];
    }
    
    // metodo enciende radio
    @Override
    public void on() {
       botonP = true;
    }

//metodo apaga la radio
    @Override
    public void off() {
       botonP = false; 
    }

//metodo que devuelve el estado del radio, si esta on o off
    @Override
    public boolean isOn() {
        return botonP;
    }

//metodo que devuleve el estado de la frecuencia
    @Override
    public String getFrecuency() {
        return frecuencia; 
       
    }

//metodo que cambia el estado de la frecuencia 
    @Override
    public void setFrecuency(String frecuencia) {
        if (getFrecuency().equalsIgnoreCase("am")){
        this.frecuencia = "fm";
    }
        else {
        this.frecuencia = "am";
        }      
    }

//imprime el contenido de la variable estacion actual 
    @Override
    public String getStation() {
        return estacionActual;
    }

    @Override
    public void setStation(String Estacion ) {
        this.estacionActual=Estacion;
        }

//metodo que avanza la estacion 
    @Override
    public void Forward() {
        double Numero=0.0;
        
        //si la frecuancia es am suma 10 hasta llegar a 1630 y vuelve a empezar
        if (frecuencia.equalsIgnoreCase("am")){
            //convierte estacionActual a Double 
            Numero = Double.parseDouble(estacionActual);
            if (Numero<1610){
                Numero = Numero + 10;
            }
            else{
                Numero = 530;
            }
            //regresa estacionActual a String
            estacionActual = Double.toString(Numero);
        }
        
        //si es fm suma 0.2 hasta llegar a 107.9
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
    // metodo que regresa la estacion 
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
    
    // metodo que guarda estacion en frecuancia actuales en una posicion del array
    public void setMemory(int Position) {
        //verifica que el dato ingresado sea valido por la caantidad de botones 
        if (Position > 0 && Position <12){      
            //instancia un boton donde se guarda la frecuencia y estacion actual 
            memorias[Position] = new Boton(frecuencia, estacionActual);
        }
    }
    
    //muestra la frecuancia y estacion de la posicion del array que se ingrese
    public void getMemory(int position){
        setFrecuency(memorias[position].getFrecuency());
        setStation(memorias[position].getStation());
    }
    
    //metodo que muestra en pantalla el estado del radio,on/off y frecuanca con estacion
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
