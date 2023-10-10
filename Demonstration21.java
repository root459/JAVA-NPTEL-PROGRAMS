interface  A{
int a=15;
void area();
default void myMethod() {
        int localVar = 10; // This variable can be initialized in a default method.it is not final static
        System.out.println(localVar);
   } }
class Demonstration21 implements A{
public void area(){
System.out.println("the area is 10");}
public static void main(String []args){
//A a;//declaration of object possible 
A a1[]=new A[2];
Demonstration21 obj = new Demonstration21(); // Creating an object of Demonstration21.
        A a = obj; // Treating it as an A reference.
a.myMethod();
a.area();}}

