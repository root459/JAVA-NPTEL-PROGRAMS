//example of super to overcome name hiding 
class A{
int i;}
class B extends A{
int i;//THIS i hides the super class i
B(int a,int b){
super.i=a;//i in A
i=b;
}
void show(){
System.out.println("i in superclass"+super.i);
System.out.println("i in subclass"+i);
}}
class Demonstration14{
public static void main(String []args){
B subObject=new B(1,2);

subObject.show();}}