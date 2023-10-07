class A{
static int a=0;
int x=10;
int y=12;

int sum(){
a++;
return x+y;
}

public static class B{
int a=20,b=45;
int diff(){
return a-b;}
}}
class Demonstration9{
public static void main(String []args){
A.B obj1=new A.B();//not require object of outer class
System.out.println("the method of inner class called"+obj1.diff());
System.out.println("inner method only able to access static variables and methods"+A.a);
A obj=new A();
System.out.println("outer classmethod "+obj.sum());
System.out.println(obj.a);
System.out.println(obj1.a);//inner variable can be accessed by obj1 and for outer variable use class name as it can access only static memebers
System.out.println(A.a);
}}




