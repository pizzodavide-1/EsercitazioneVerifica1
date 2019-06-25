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
public class ThRazzo2 extends Thread{
    DatiCondivisi ptrDati;
    public ThRazzo2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    public void run()
    {
    try{
    ptrDati.waitSem4();//inizializato a 1->va 0
    System.out.println("RAZZO 2 PARTITO");
    
    Random numRand=new Random();
    int x=numRand.nextInt(1)+2;
    
    Thread.sleep(x*1000);
    
    System.out.println("ROCCIA 2 COLPITA");
    ptrDati.signalSem3();//da 0 va a 1
    }catch(InterruptedException ex){
    Logger.getLogger(ThRazzo2.class.getName()).log(Level.SEVERE,null,ex);
    }
    }
}
