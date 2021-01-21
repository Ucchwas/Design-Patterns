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
public abstract class AbstractFactory {
    abstract Coin makeCoin(int coin);
    abstract Dress selectDress(String dress);
}
