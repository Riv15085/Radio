
import java.util.Scanner;
import radio.MiRadio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Diego Fernando Rivera Escobar 15085
 * Programación orientada a objetos
 */
public class Main {
    public static void main (String[] args){
        MiRadio Pikachu = new MiRadio();
        System.out.println("Bienvenido a la Radio");
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(Pikachu.toString());
            System.out.println("ingrese el numero deseado");  
            System.out.println("1. Forward");
            System.out.println("2. Backwards");
            System.out.println("3. Am/Fm");
            System.out.println("4. Guardar memoria");
            System.out.println("5. Ir a memoria");
            System.out.println("6. Apagar radio");       
            
            int opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    Pikachu.Forward();
                    break;
                case 2:
                    Pikachu.Backward();
                    break;
                case 3:
                    Pikachu.setFrecuency(Pikachu.getFrecuency());
                    if (Pikachu.getFrecuency()== "am"){
                        Pikachu.setStation("530");
                    }
                    else{
                        Pikachu.setStation("87.9");
                    }
                    
                    break;
                case 4:
                    System.out.println("Seleccione el numero en memoria donde desea guardar la estacion actual: (1-12)");
                    Scanner sc = new Scanner(System.in);
                    int lugar = sc.nextInt();
                    Pikachu.setMemory( lugar);
                    break;
                
                case 5:
                    System.out.println("Seleccione el numero en memoria al que desea acceder: (1-12)");
                    Scanner sc1 = new Scanner(System.in);
                    int pos = sc1.nextInt();
                    Pikachu.getMemory(pos);
                    
                    break;
                case 6:
                    Pikachu.off();
                    break;
            default: break;
            }
        } while (Pikachu.isOn());    
    }
}
