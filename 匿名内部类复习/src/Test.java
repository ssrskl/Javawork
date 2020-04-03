//new 实现接口() | 父类构造器(实参列表)
//        {
//
//        }
abstract class Person{
    public abstract void eat();
}
public class Test {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void eat() {
                System.out.println("me");
            }
        };
        person.eat();
        }
}
