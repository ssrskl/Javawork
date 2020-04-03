import java.util.ArrayList;
import java.util.List;

public class Main {
    @Override
    public  String toString(){
        return "22"+this;
    }
    @Deprecated
    public static int add(){
        return 1;
    }
    @SuppressWarnings(value = "all  ")
    public static void test001(){
        List list = new ArrayList();
    }
    public static void main(String[] args) {
        System.out.println(add());
    }

}