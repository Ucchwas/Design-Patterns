/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstactfactory;

/**
 *
 * @author UcChwas
 */
public class FactoryProducer {
    public static AbstractFactory getfactory(String ch){
        if(ch.equalsIgnoreCase("Coin")){
            return new CoinFactory();
        }
        else if(ch.equalsIgnoreCase("Dress")){
            return new DressFactory();
        }
        return null;
    }
}
