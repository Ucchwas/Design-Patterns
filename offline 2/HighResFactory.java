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
public class HighResFactory extends ResFactory {

    @Override
    DisplayDriver getDisplay(String Display) {
        System.out.println("High Resolution Factory Display");
        return new HRDD();
    }

    @Override
    PrintDriver getPrint(String Print) {
        System.out.println("High Resolution Factory Print");
        return new HRPD();
    }
    
}
