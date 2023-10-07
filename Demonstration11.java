class A{
void display(){
System.out.println("CLASS A");
}}
class B extends A{
void display(){
System.out.println("class B");
}}

class Demonstration11{
public static void main(String []args){
B ob1=new B();
A ob2=new A();
A x=(A) ob1;
x.display();
}}