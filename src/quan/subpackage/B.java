package quan.subpackage;

import com.company.*;

public class B extends DemoAccessModifier1{
    public static void main(String[] args) {
        DemoStatic demoStatic;
        Product product;
        DemoAccessModifier1 demoAccessModifier1 = new DemoAccessModifier1();
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
    }
}
