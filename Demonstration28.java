class ThreadId extends Thread{
public void run(){
try{
System.out.println("Thread "+Thread.currentThread().getId()+"in running");
}
catch(Exception e){
System.out.println("excepiton caught");
}}}
public class Demonstration28{
public static void main(String []args){
int n=8;//no. of threads
for (int i=0;i<8;i++){
ThreadId obj =new ThreadId();
obj.start();
}}}