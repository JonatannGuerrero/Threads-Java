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
public class Tortuga implements Runnable{
    
    static int PosCarreraT=0;
    static boolean Verificar = true;
    @Override
    public void run(){
        
        Random Aleatorio=new Random(); 
        
        int VectorPro[]=new int [10];
          
        Probabilidad(VectorPro, 5,8);
        //0> Avance Rapido
        //1> Avance Lento
        //2> Resbalo         
              
        
        while (Verificar){
            
            int NumAle=Aleatorio.nextInt(10);      
            if (VectorPro[NumAle]==0) {
                PosCarreraT=PosCarreraT+3;                
            } else {
                if (VectorPro[NumAle]==1) {
                    PosCarreraT=PosCarreraT+1;                    
                } else {
                    if (VectorPro[NumAle]==2) {
                        if (PosCarreraT<=6){
                            PosCarreraT=0;                            
                        } else {
                            PosCarreraT=PosCarreraT-6;
                        }                        
                    } else {
                        System.out.println("Error Tortuga!!");
                    }
                }
            }
            
            try {
                Thread.sleep(990);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (Verificar) {
                ImpCarreraT(PosCarreraT);
            }                        
            if (PosCarreraT>=70) {
                Liebre.Verificar=false;
                Verificar=false; 
                Ganadores(PosCarreraT,Liebre.PosCarreraL);                               
                //System.out.println("Gano Tortuga"); 
            }    
        }
//        for (int i = 0; i < VectorPro.length; i++) {
//            System.out.print(VectorPro[i]+" ");            
//        }
    }
    
    public void Probabilidad(int [] VecP, int Pro1, int Pro2){                 
        for (int i = 0; i < Pro1; i++) {
            VecP[i]=0;            
        }        
        for (int i = Pro1; i < Pro2; i++) {
            VecP[i]=1;            
        }        
        for (int i = Pro2; i < VecP.length; i++) {           
              VecP[i]=2;                     
        }        
    }
    
    public void ImpCarreraT(int Pos){
        
        for (int i = 0; i < Pos-1; i++) {  
            System.out.print("-");    
        }
        if (Pos>=70) {
            System.out.println("70T");            
        } else {
            System.out.println(Pos+"T");
        }
        
        
    }
    
    public static void Ganadores(int T, int L){
        
        
        if (T>=70 || L>=70) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
                if (T==L) {
                    System.out.println("****Empatados****");                    
                } else {
                    if (T>=70) {
                        System.out.println("****Gano Tortuga****");                        
                    } else {
                        System.out.println("****Gano Liebre****");
                    }
                }
                Verificar = false;                
            }        
    }
}

