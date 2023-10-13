class A extends Thread{
public void run(){//work for thread
for(int i=0;i<10;i++){
System.out.println("class A"+i);}
}}

class B extends Thread{
public void run(){//work for thread
for(int i=0;i<10;i++){
System.out.println("class B"+i);}
}}

class C extends Thread{
public void run(){//work for thread
for(int i=0;i<10;i++){
System.out.println("class C"+i);}
}}
class Demonstration27{
public static void main(String [] args){
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
}}