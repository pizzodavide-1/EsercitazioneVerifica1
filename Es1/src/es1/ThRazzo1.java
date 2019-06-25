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
public class ThRazzo1 extends Thread{
     DatiCondivisi ptrDati;
    public ThRazzo1(DatiCondivisi ptrDati)
    {
    this.ptrDati=ptrDati;
    }
    
    public void run()
    {
    try{
    ptrDati.waitSem2(); //Sem2 parte da 1->va a 0
    System.out.println("RAZZO 1 PARTITO");
    
    Random numRand=new Random();
    int x=numRand.nextInt(1)+2;
            Thread.sleep(x*1000); //tempo di attesa casuale
            
       System.out.println("ROCCIA 1 COLPITA"); 
            ptrDati.signalSem1();//sem 1 parte da 0->va 1
    }catch(InterruptedException ex){
    Logger.getLogger(ThRazzo1.class.getName()).log(Level.SEVERE,null,ex);
    }
    }
}
