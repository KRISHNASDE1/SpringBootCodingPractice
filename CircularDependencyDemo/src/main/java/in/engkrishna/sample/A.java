package in.engkrishna.sample;

public class A {
    private  B b;

    public A() {
        System.out.println("A is Created");
        this.b = new B();
    }
}
