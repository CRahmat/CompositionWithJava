package duck.attackbehaviour;

import duck.attackbehaviour.AttackBehaviour;

public class SwordAttack implements AttackBehaviour {
    @Override
    public void attack() {
        System.out.println("Attack with Sword");
    }
}
