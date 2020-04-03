import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(System.clearProperty("user.dir"));
        File file = new File("about.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
    }
}
