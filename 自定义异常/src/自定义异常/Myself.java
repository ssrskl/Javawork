package �Զ����쳣;

import java.time.Year;

class Person {
    private String name;
    private int age;
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("�˵����䲻Ӧ��Ϊ����");
        }
        this.age = age;
    }
 
    public String toString() {
        return "name is " + name + " and age is " + age;
    }
}
 
public class Myself {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setName("Lincoln");
            p.setAge(-1);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println(p);
    }
}
