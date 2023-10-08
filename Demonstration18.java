class Aa{
protected void msg(){
System.out.println("Class A");
}}


public class Demonstration18 extends Aa{
public void msg(){
System.out.println("class B:");
}

public static void main(String []args){
Demonstration18 obj=new Demonstration18();
obj.msg();
}}
