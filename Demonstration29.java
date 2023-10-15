class A extends Thread{
public void run(){
System.out.println("start thread A...");
for(int i=1;i<5;i++){
if(i==1)
yield();
System.out.println("A i"+i);
}
System.out.println("Exit A");
}}class B extends Thread{
public void run(){
System.out.println("start thread b...");
for(int i=1;i<5;i++){
if(i==2)
stop();
System.out.println("B i"+i);
}
System.out.println("Exit B");
}}

class C extends Thread{
public void run(){
System.out.println("start thread c...");
for(int i=1;i<5;i++){
System.out.println("C i"+i);
if(i==3){
try{
sleep(1000);
}catch(Exception e){}
}}



System.out.println("Exit C");
}}
class Demonstration29{
public static void main(String []args){
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
System.out.println("end of execution");
}}
