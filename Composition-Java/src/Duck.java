import duck.attackbehaviour.AttackBehaviour;
import duck.defendbehaviour.DefendBehaviour;
import duck.flybehaviour.FlyBehaviour;
import duck.soundbehaviour.SoundBehaviour;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private SoundBehaviour soundBehaviour;
    private AttackBehaviour attackBehaviour;
    private DefendBehaviour defendBehaviour;

    public Duck(FlyBehaviour flyBehaviour, SoundBehaviour soundBehaviour, AttackBehaviour attackBehaviour, DefendBehaviour defendBehaviour){
        this.flyBehaviour    = flyBehaviour;
        this.attackBehaviour = attackBehaviour;
        this.defendBehaviour = defendBehaviour;
        this.soundBehaviour  = soundBehaviour;
    }
    public void sound(){
        this.soundBehaviour.sound();
    }
    public void fly(){
        this.flyBehaviour.fly();
    }
    public void attack(){
        this.attackBehaviour.attack();
    }
    public void defend(){
        this.defendBehaviour.defend();
    }

}
