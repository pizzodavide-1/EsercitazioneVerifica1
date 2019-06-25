/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pizzd
 */
public class Es1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        Scanner input=new Scanner(System.in);
        DatiCondivisi ptrDati=new DatiCondivisi();
        ThRazzo1 razzo1=new ThRazzo1(ptrDati);
        ThRazzo2 razzo2=new ThRazzo2(ptrDati);
        ThRoccia1 roccia1=new ThRoccia1(ptrDati);
        ThRoccia2 roccia2=new ThRoccia2(ptrDati);
        char x;
        do{ System.out.println("Inserire p per far partire");
             x= input.next().charAt(0);
        
        }while(x!='p');
              razzo1.start();
            razzo2.start();
            roccia1.start();
            roccia2.start();
            
           
            razzo1.join();
            razzo2.join();
            roccia1.join();
            roccia2.join();
            System.out.println("ROCCE DISTRUTTE");
        }catch(InterruptedException ex){
        Logger.getLogger((Es1.class.getName())).log(Level.SEVERE,null,ex);
        }
    }
    
}
