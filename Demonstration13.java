class Box{
int width,height,depth;
Box(){
width=height=depth=0;}
Box(int width,int height,int depth){
this.width=width;
this.height=height;
this.depth=depth;}
int volume(){
return width*height*depth;}
}
class Boxweight extends Box{
int weight;
Boxweight(int width,int height,int depth,int weight){
super(width,height,depth);
this.weight=weight;
}
}
class Demonstration13{
public static void main(String []args){
Box plainbox=new Box();
Boxweight weightbox=new Boxweight(10,12,11,5);
int vol;
vol=weightbox.volume();
System.out.println("the volume of weightbox is"+vol);
System.out.println("the weight is"+weightbox.weight);

vol=plainbox.volume();
System.out.println("vol of plain box is"+vol);
//System.out.println("weight of plainbox is "+plainbox.weight);//gives error because weight is not in superclass
}}
