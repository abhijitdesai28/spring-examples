package service;

public class HelloService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello "+name+"");
    }
}
