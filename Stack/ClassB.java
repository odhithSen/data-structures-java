public class ClassB extends ClassA {
    public void methodB(){
        System.out.println("Method B");
    }
    
    public void methodA(){
        super.methodA();
        super.methodC();
        System.out.println("Method A from ClassB");
    }
}
