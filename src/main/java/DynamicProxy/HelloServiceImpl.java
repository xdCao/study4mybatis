package DynamicProxy;

public class HelloServiceImpl implements HelloService {
    public void hello(String name) {
        System.out.println("Hello, "+name);
    }
}
