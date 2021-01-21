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
public class Friend2 extends Friend{

    String name;
    
   public Friend2(Mediator mediator,String name)
{
super(mediator);
this.name = name;
}
public void Send(String msg)
{
mediator.Send(this,msg);
}
public void Notify(String msg)
{
System.out.println("Sohel gets message: "+ msg);
}

    
}
