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
public class BuilderPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        
        ChildrenMeal childrenMeal=mealBuilder.prepareMeal();
        System.out.println("Children Meal");
        childrenMeal.showItem();
    }
    
}
