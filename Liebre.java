/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosConcurrencia;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JonatannGuerrero
 */
public class Liebre implements Runnable{
    
    static int PosCarreraL=0;
    static boolean Verificar = true;
    @Override
    public void run(){
        
        Random Aleatorio=new Random();        
        int VectorPro[]=new int [10];
        Probabilidad(VectorPro, 3,5,7,9);
        //0> Pequeño Salto
        //1> Duerme
        //2> Gran Salto
        //3> Resbalon Peuqeño
        //4> Resbalon Grande
        
        
        while (Verificar) {
            
            int NumAle=Aleatorio.nextInt(10); 
            if (VectorPro[NumAle]==0) {
                PosCarreraL=PosCarreraL+1;             
            } else {
                if (VectorPro[NumAle]==1) {
                    PosCarreraL=PosCarreraL+0;                    
                } else {
                    if (VectorPro[NumAle]==2) {
                        PosCarreraL=PosCarreraL+9;                        
                    } else {
                        if (VectorPro[NumAle]==3) {
                            if (PosCarreraL<=2) {
                                PosCarreraL=0; 
                            } else {
                                PosCarreraL=PosCarreraL-2;
                            }                                                        
                        } else {
                            if (VectorPro[NumAle]==4) {
                                if (PosCarreraL<=12) {
                                    PosCarreraL=0;                                    
                                } else {
                                    PosCarreraL=PosCarreraL-12;
                                }                                                                 
                            } else {
                                System.out.println("Error Liebre!!");
                            }
                        }
                    }
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImpCarreraL(PosCarreraL);
            if (PosCarreraL>=70) {
                
                Tortuga.Verificar=false;                
                Verificar=false; 
                Tortuga.Ganadores(Tortuga.PosCarreraT, PosCarreraL);                                               
               // System.out.println("Gano Liebre");                
            }
        }
      
    }
    public void Probabilidad(int [] VecP, int Pro1, int Pro2, int Pro3, int Pro4){                 
        for (int i = 0; i < Pro1; i++) {
            VecP[i]=0;            
        }        
        for (int i = Pro1; i < Pro2; i++) {
            VecP[i]=1;            
        }
        for (int i = Pro2; i < Pro3; i++) {
            VecP[i]=2;            
        }
        for (int i = Pro3; i < Pro4; i++) {
            VecP[i]=3;
        }
        for (int i = Pro4; i < VecP.length; i++) {           
              VecP[i]=4;                     
        }        
    }
    
    public void ImpCarreraL(int Pos){
        
        for (int i = 0; i < Pos-1; i++) {  
            System.out.print("-");    
        }
        if (Pos>=70) {
            System.out.println("70L");            
        } else {
            System.out.println(Pos+"L");
            System.out.println(" ");
        }
    }
}
