package duck.flybehaviour;

import duck.flybehaviour.FlyBehaviour;

public class WingsFly implements FlyBehaviour {
    @Override
    public void fly(){
        System.out.println("Fly With Wings");
    }
}
