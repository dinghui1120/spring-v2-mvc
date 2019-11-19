package decorator;

public abstract class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return battercake.getMsg();
    }
    @Override
    protected int getPrice() {
        return battercake.getPrice();
    }
}
