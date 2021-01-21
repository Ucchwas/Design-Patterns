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
public class DressFactory extends AbstractFactory{

    @Override
    Coin makeCoin(String coin) {
        return null;
    }

    @Override
    Dress selectDress(String dress) {
        if(dress.equalsIgnoreCase("Shirt")){
            return new Shirt();
        }
        else if(dress.equalsIgnoreCase("Pant")){
            return new Pant();
        }
        else if(dress.equalsIgnoreCase("Shoe")){
            return new Shoe();
        }
        return null;
    }
    
}
