package Lession14_InerClass;

public class Main {
    public static void main(String[] args) {
        AnonymousInnerClassDemo demo = new AnonymousInnerClassDemo() {


            @Override
            public void methodInClass() {
                System.out.println("Main.methodInclass");
            };
            demo.methodInClass();
        };
    }
}
