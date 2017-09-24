package examples;

import DynamicProxy.HelloService;
import DynamicProxy.HelloServiceImpl;
import DynamicProxy.HelloServiceProxy;
import jdk.nashorn.internal.ir.BinaryNode;

public class ProxyExample {

    public static void main(String[] args) {
        HelloServiceProxy handler=new HelloServiceProxy();
        HelloService bind = (HelloService) handler.bind(new HelloServiceImpl());
        bind.hello("caohao");
    }

}
