package test001;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        BMW bmw = new BMW();
        bmw.logo();
        bmw.drive();

        System.out.println("---------------------------------");
        Benz benz = new Benz();
        benz.logo();
        benz.drive();

        System.out.println("---------------------------------");
        Tesla tesla = new Tesla();
        tesla.logo();
        tesla.drive();
        tesla.charge();
    }
}
