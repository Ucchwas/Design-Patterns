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
public class AbstactFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory abs=FactoryProducer.getfactory("Coin");
        Coin coin1=abs.makeCoin("Fifty");
        coin1.make();
        Coin coin2=abs.makeCoin("One");
        coin2.make();
        Coin coin3=abs.makeCoin("Hundred");
        coin3.make();
        AbstractFactory fac=FactoryProducer.getfactory("Dress");
        Dress dress1=fac.selectDress("Shirt");
        dress1.select();
        Dress dress2=fac.selectDress("Pant");
        dress2.select();
        Dress dress3=fac.selectDress("Shoe");
        dress3.select();
    }
    
}
