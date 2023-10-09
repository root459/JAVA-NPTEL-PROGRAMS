abstract class Geometry{
//we can make a constructor for abstract class
static final double pi=3.144;
abstract void area();
}
class Circle extends Geometry{
double radius;
Circle(double radius){
this.radius=radius;
}
void area(){
System.out.println("the area of the circle is"+(pi*radius*radius));
}}
class Rectangle extends Geometry{
int length,breadth;
Rectangle(int length,int breadth){
this.length=length;
this.breadth=breadth;
}
void area(){
System.out.println("the area of rect is "+(length*breadth));
}
}
class Square extends Geometry{
int side;
Square(int side){
this.side=side;
}
void area(){
System.out.println("the area of square is "+(side*side));
}
}
class Demonstration19{
public static void main(String []args){
Geometry[] geobj=new Geometry[3];
geobj[0]=new Circle(2.22);
geobj[1]=new Rectangle(5,6);
geobj[2]=new Square(3);
for(int i=0;i<3;i++){
geobj[i].area();}}}





