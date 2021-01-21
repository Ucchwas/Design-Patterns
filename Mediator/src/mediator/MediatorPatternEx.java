/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author UcChwas
 */
public class MediatorPatternEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Mediator Pattern Demo***\n");
ConcreteMediator m = new ConcreteMediator();
Friend1 Amit= new Friend1(m,"Amit");
Friend2 Sohel = new Friend2(m,"Sohel");
Boss Raghu = new Boss(m,"Raghu");
m.setFriend1(Amit);
m.setFriend2(Sohel);
m.setBoss(Raghu);
Amit.Send("[Amit here]Good Morrning. Can we discuss the mediator pattern?");
Sohel.Send("[Sohel here]Good Morning.Yes, we can discuss now.");
Raghu.Send("\n[Raghu here]:Please get back to work quickly");
    }
    
}
