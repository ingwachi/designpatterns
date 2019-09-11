package quack;
public class QuackEcho implements Quackable{

    Quackable duck;
    public QuackEcho (Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        echo();
    }

    private void echo(){
        System.out.print("Echo : ");
        duck.quack();
    }
}
