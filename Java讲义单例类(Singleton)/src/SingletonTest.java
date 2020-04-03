class Singleton {
    //ʹ��һ�����������������ʹ�ô�������ʵ��
    private static Singleton instance;
    //�Թ�����ʹ��private���Σ����ظù�����
    private Singleton(){}
    //�ṩһ����̬���������ڷ���Singlentonʵ��
    public static Singleton getInstance(){
        if (instance == null){
            //����һ��Singlenton���󣬽��仺������
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
