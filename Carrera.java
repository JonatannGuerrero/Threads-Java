/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosConcurrencia;

/**
 *
 * @author JonatannGuerrero
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tortuga Tor=new Tortuga();
        Thread Tortu=new Thread(Tor);
        
        Liebre Lie=new Liebre();
        Thread Lieb=new Thread(Lie);
        
        System.out.println("****Comienza Carrera***");
        Tortu.start();        
        Lieb.start();
        
    }
}
    

