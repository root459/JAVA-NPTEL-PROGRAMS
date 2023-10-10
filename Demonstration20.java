// If the class provides its own implementation for a method declared in the interface, that implementation takes higher priority over the default implementation provided //by the interface itself.





interface MyInterface {
    void myMethod();
    
    default void defaultMethod() {
        System.out.println("Default implementation of defaultMethod() in MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod() in MyClass");
    }
    
    // This class can choose to override the default implementation or not.
    // If it does, its implementation takes priority.
    @Override
    public void defaultMethod() {
        System.out.println("Custom implementation of defaultMethod() in MyClass");
    }
}
class Demonstration20{
public static void main(String []args){
MyClass myObj = new MyClass();
myObj.myMethod();         // Output: Implementation of myMethod() in MyClass
myObj.defaultMethod();    // Output: Custom implementation of defaultMethod() in MyClass
}}

