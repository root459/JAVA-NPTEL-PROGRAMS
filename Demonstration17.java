//WHAT WILL HAPPEN IF i IS PRIVATE
class A{
private int i=555;
protected void msg(){
System.out.println("HELLO JAVA "+i);
}}
class Demonstration17 extends A{
public static void main(String []args){
Demonstration17 obj=new Demonstration17();
obj.msg();}}
