interface Product
{
    double getPrice();
    String getName();
}

/**
 * @author 猫颜
 * @version 1.0
 */
public class AnonymousTest {
    public void test(Product product){
        System.out.println("购买了一个" + product.getName() + "花掉了" + product.getPrice() + "元");
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        anonymousTest.test(new Product() {
            @Override
            public double getPrice() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "神舟战神";
            }
        });
    }
}
