package duck.attackbehaviour;

import duck.attackbehaviour.AttackBehaviour;

public class GunAttack implements AttackBehaviour {
    @Override
    public void attack() {
        System.out.println("Attack with Gun");
    }
}
