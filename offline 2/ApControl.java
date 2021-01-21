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
public class ApControl {
    public static ResFactory getResFactory(String ch){
        if(ch.equalsIgnoreCase("High")){
            return new HighResFactory();
        }
        if(ch.equalsIgnoreCase("Low")){
            return new LowResFactory();
        }
        return null;  
    }
}
