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
public class AbstractFac {
    public int speed;
    public int ramsize;

    public AbstractFac() {
        this.speed=speed;
        this.ramsize=ramsize;
    }
    public AbstractFac(int sp,int ram){
        speed=sp;
        ramsize=ram;
    }
    public void Fac(){
        if(speed>2 && ramsize>4){
            ResFactory ab=ApControl.getResFactory("High");
            DisplayDriver dp=ab.getDisplay("High");
            dp.draw();
            
            PrintDriver pd=ab.getPrint("High");
            pd.print();
            
            System.out.println("HighResolution");
    }
        if(speed<2 && ramsize<4){
            ResFactory rf=ApControl.getResFactory("LOW");
            DisplayDriver dd=rf.getDisplay("LOW");
            dd.draw();
            
            PrintDriver pp=rf.getPrint("LOW");
            pp.print();
            
            System.out.println("LowResolution");
        }
    }
}


