/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline_2;

/**
 *
 * @author UcChwas
 */
public class FactoryPattern{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        AbstractFac abs1=new AbstractFac(3, 8);
        
        abs1.Fac();
        
        AbstractFac abs2=new AbstractFac(1, 1);
        
        abs2.Fac();
    }
    
}
