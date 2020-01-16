package test002;

/**
 * @author bo
 */
public class ApiinterImpl implements Apiinter {
    public void test001() {
        System.out.println("test001 接口");
    }

    public void test002() {
        System.out.println("test002 接口");
    }

    public void test003() {
        test001();
        test002();
        System.out.println("test003 接口");
    }
}
