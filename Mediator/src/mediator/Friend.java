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
public abstract class Friend {
    protected Mediator mediator;
    public String name;
    

// Constructor
public Friend(Mediator _mediator)
{
mediator = _mediator;
}

}
