package test001;

public class Tesla extends Car {
    protected ChargeBehavior chargeBehavior;

    @Override
    public void logo() {
        System.out.println("logo = 特斯拉");
    }

    public Tesla() {
        super();
        chargeBehavior = new TeslaChargeBehavior();
    }

    public void charge() {
        if (chargeBehavior != null) {
            chargeBehavior.charge();
        }
    }
}