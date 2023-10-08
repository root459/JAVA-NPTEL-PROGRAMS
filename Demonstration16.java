abstract class A{
A(){
System.out.println("A IS CALLED");
}
abstract void run();
}
//class B extends A{
//B(){
//System.out.println("B is called");}
//void run(){
//System.out.println("run is calld");}}

class B extends A{
B(){
super();
System.out.println("B is called");
//super();gives error super must be in first line of constructor 
}
void run(){
System.out.println("run is calld");}}

class Demonstration16{
public static void main(String []args){
B obj=new B();
obj.run();}}




