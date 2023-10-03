class A{
void m(){
System.out.println("hellom");
}
void n(){
System.out.println("hellon");
this.m();//calling other fn using this keyword
}}
class thisfn{
public static void main(String args[]){
A a=new A();
a.n();
}}