package ua.artcode.design_patterns.factory_method;

/**
 * Created by serhii on 19.12.15.
 */
public class ComplexObjectFactory {

    public static A create() {
        D d = new D();
        return new A(new B(new C(d)), d);
    }

}

class A {
    B b;
    D d;

    public A(B b, D d) {
        this.b = b;
        this.d = d;
    }
}


class B {
    C c;

    public B(C c) {
        this.c = c;
    }
}

class C{
    D d;

    public C(D d) {
        this.d = d;
    }
}

class D{

}
