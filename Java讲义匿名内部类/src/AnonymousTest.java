interface Product
{
    double getPrice();
    String getName();
}

/**
 * @author è��
 * @version 1.0
 */
public class AnonymousTest {
    public void test(Product product){
        System.out.println("������һ��" + product.getName() + "������" + product.getPrice() + "Ԫ");
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
                return "����ս��";
            }
        });
    }
}
