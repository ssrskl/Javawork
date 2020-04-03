interface Eatable{
    void taste();
}
interface Flyable{
    void fly(String weather);
}
interface Abbable{
    int add(int a,int b);
}
public class Test {
    public void eat(Eatable eatable){
        System.out.println(eatable);
        eatable.taste();
    }

    public void drive(Flyable flyable){
        System.out.println("我正在驾驶: "+ flyable);
        flyable.fly("晴天");
    }

    public void test(Abbable abbable){
        System.out.println("5和3的和为: " + abbable.add(5,3));
    }

    public static void main(String[] args) {
        var lq = new Test();
        lq.eat(()-> System.out.println("苹果味道不错"));
        lq.drive(weather -> {
            System.out.println("今天的天气是: " + weather);
            System.out.println("直升机飞行平稳");
        });
        lq.test(((a, b) -> a+b));
    }
}
