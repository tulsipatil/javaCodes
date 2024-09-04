class Super{
    public void method1(){
        System.out.println("Super Method 1");
    }
    public void method2(){
        System.out.println("Super Method 2");
    }
}

class SubClass extends Super{
    public void method2(){
        System.out.println("Sub Class Method 2");
    }
    public void method3(){
        System.out.println("Sub Class Method 3");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super s = new SubClass();
        s.method1();
        s.method2();
        //s.method3();//can't call because object of Sub class
    }
}
