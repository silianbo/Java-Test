package test001;

public class TeslaChargeBehavior implements ChargeBehavior {
    @Override
    public void charge() {
        System.out.println("我可以充电的");
    }
}
