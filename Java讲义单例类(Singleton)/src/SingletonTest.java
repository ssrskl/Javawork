class Singleton {
    //使用一个类变量来缓存曾经使用创建过的实例
    private static Singleton instance;
    //对构造器使用private修饰，隐藏该构造器
    private Singleton(){}
    //提供一个静态方法，用于返回Singlenton实例
    public static Singleton getInstance(){
        if (instance == null){
            //创建一个Singlenton对象，将其缓存起来
            instance = new Singleton();
        }
        return instance;
    }
}
public class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
