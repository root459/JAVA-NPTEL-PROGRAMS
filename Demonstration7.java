class Demonstration7{
public static void main(String []args){
int j=0;

if(args.length>0){
for(int i=0;i<args.length;i++){
System.out.print(args[i]+" ");}
j=Integer.parseInt(args[0]);//to convert string to integer
System.out.println("j+6="+(j+6));
}
else{
System.out.println("no arguments passed");
System.exit(0);
}}
}