/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline1;

/**
 *
 * @author UcChwas
 */
public class Toy implements Item {

    @Override
    public String name() {
        return "Toy";
    }

    @Override
    public Packing packing() {
        return new Bag();
    }
    
}
