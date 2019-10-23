package duck.soundbehaviour;

import duck.flybehaviour.FlyBehaviour;

public class NormalSound implements SoundBehaviour{
    @Override
    public void sound() {
        System.out.println("Sound with Mouth");
    }
}
