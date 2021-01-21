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
public class CoinFactory extends AbstractFactory{

    @Override
    Coin makeCoin(String coin) {
        if(coin.equalsIgnoreCase("1")){
            return new OneTaka();
        }
        else if(coin.equalsIgnoreCase("50")){
            return new FiftyTaka();
        }
        else if(coin.equalsIgnoreCase("100")){
            return new HundredTaka();
        }
        return null;
        
    }

    @Override
    Dress selectDress(String dress) {
        return null;
    }
    
}
