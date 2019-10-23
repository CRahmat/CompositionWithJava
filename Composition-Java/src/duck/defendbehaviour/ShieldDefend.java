package duck.defendbehaviour;

import duck.defendbehaviour.DefendBehaviour;

public class ShieldDefend implements DefendBehaviour {
    @Override
    public void defend() {
        System.out.println("Defend with Shield");
    }
}
