/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UcChwas
 */
public class ChildrenMeal {
    private List<Item> items=new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void showItem(){
        for(Item item:items){
            System.out.println("Item: "+item.name());
            System.out.println(", Packing :"+item.packing().pack());
        }
    }
}
