/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pizzd
 */
public class ThRoccia1 extends Thread{
        DatiCondivisi ptrDati;
    public ThRoccia1(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run(){
        try{
        ptrDati.waitSem1();//rimetto a zero 
            
            System.out.println("INIZIO DISINTEGRAZIONE ROCCIA 1");
            Random numRand=new Random();
            int x=numRand.nextInt(1)+2;
            Thread.sleep(x*1000);
            System.out.println("FINE DISINTEGRAZIONE ROCCIA 1");
            ptrDati.signalSem2();//torna a 1
        }catch(InterruptedException ex){
        Logger.getLogger(ThRoccia1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
  
    
    }
}
