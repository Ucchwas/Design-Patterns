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
public abstract class ResFactory {
    abstract DisplayDriver getDisplay(String Display);
    abstract PrintDriver getPrint(String Print);
}
