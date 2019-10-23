import duck.attackbehaviour.GunAttack;
import duck.attackbehaviour.SwordAttack;
import duck.defendbehaviour.ArmorDefend;
import duck.defendbehaviour.ShieldDefend;
import duck.flybehaviour.RocketFly;
import duck.flybehaviour.WingsFly;
import duck.soundbehaviour.NormalSound;
import duck.soundbehaviour.ToaSound;

public class Main {
        public static void main(String[] args) {
            Duck BrutalDuck = new Duck(new RocketFly(), new ToaSound(), new GunAttack(), new ShieldDefend());
            System.out.println("================================");
            System.out.println("     This is a Brutal Duck");
            System.out.println("================================");
            BrutalDuck.fly();
            BrutalDuck.sound();
            BrutalDuck.attack();
            BrutalDuck.defend();
            Duck CalmDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefend());
            System.out.println("================================");
            System.out.println("      This is a Calm Duck");
            System.out.println("================================");
            CalmDuck.fly();
            CalmDuck.sound();
            CalmDuck.attack();
            CalmDuck.defend();
        }
    }
