class A{
public int x=10;
int y=12;

int sum(){
return x+y;
}

class B{
int a=20,b=45;
int diff(){
return a-b;}
}}
class Demonstration10{
public static void main(String []args){
A obj=new A();
A.B obj1=obj.new B();//require object of outer class
System.out.println("inner accessing outer methods and variables by creating methods in inner class"+obj.sum());
System.out.println(obj1.diff());
//System.out.println(obj1.x);//gives error
}}
//Instance variables: Inner classes can access them, but you need an instance of the outer class.
//Static variables: Inner classes can access them without an instance of the outer class.
//Local variables: Inner classes can access final local variables from the enclosing method.




