class A implements Runnable{
public void run(){
for(int i=0;i<10;i++){
System.out.println("A"+i);
}}}
class B implements Runnable{
public void run(){
for(int i=0;i<10;i++){
System.out.println("B"+i);
}}}
class C implements Runnable{
public void run(){
for(int i=0;i<10;i++){
System.out.println("C"+i);
}}}
class Demonstration28{
public static void main(String []args){
Thread a=new Thread(new A());
Thread b=new Thread(new B());
Thread c=new Thread(new C());
a.start();
b.start();
c.start();
}}