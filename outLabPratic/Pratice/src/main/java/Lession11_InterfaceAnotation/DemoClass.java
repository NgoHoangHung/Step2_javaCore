package Lession11_InterfaceAnotation;

public class DemoClass implements Flying{
    @Override
    public void fly(){
        System.out.println("DemoClass.flying");
    }
    @Override
    public void flapwing(){
        System.out.println("DemoClass.flapwing");
    }
}
