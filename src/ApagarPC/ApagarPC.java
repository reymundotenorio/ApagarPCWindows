/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApagarPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

/**
 *
 * @author Reymundo
 */
public class ApagarPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
//        String sSistemaOperativo = System.getProperty("os.name");
//        String Arquit = System.getProperty("os.arch");
//        String Versi = System.getProperty("os.version");
//        
//        Set<String> a = System.getProperties().stringPropertyNames();
//        
//        Object[] b = a.toArray();
//        
//        System.out.println("Tamano: "+b.length);
//        
//        for (Object b1 : b) {
//            System.out.println("** = " + b1);
//        }
//        
//        System.out.println("Sistema Operativo: "+sSistemaOperativo);
//        System.out.println("Arquitectura: "+Arquit);


         String Comando = "shutdown -p";
        try {  
            Process p = Runtime.getRuntime().exec(Comando);    
            BufferedReader in = new BufferedReader(  
                                new InputStreamReader(p.getInputStream()));  
            String line = "";  
            while ((line = in.readLine()) != null) {  
                System.out.println(line);  
            }  
        } catch (IOException e) {  
        }
        
        
    }
    
}
