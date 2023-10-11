import java.lang.Exception;
class MyException extends Exception{
MyException(String message){
super(message);
}}
class Demonstration23{
public static void main(String [] args){
int x=5,y=1000;
try{
float z=(float) x/(float) y;
if(z<0.01) throw new MyException("given data not proper");
}
catch(MyException e){
System.out.println(e.getMessage());
}
finally{
System.out.println("it prints  always");}}}