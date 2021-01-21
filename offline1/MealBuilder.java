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
public class MealBuilder {
    public ChildrenMeal prepareMeal(){
        ChildrenMeal meal=new ChildrenMeal();
        meal.addItem(new Chickenburger());
        meal.addItem(new Drink());
        meal.addItem(new SideItem());
        meal.addItem(new Toy());
        return meal;
    }
}
