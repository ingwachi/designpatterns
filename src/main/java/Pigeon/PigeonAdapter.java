package Pigeon;

import quack.Quackable;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.Coo();
        pigeon.Coo();
    }
}
