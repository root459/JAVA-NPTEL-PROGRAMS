import java.util.*;
class Demonstration5{
public static void main(String []args){
int sum=0;
float avg=0;
ArrayList<Integer> a=new ArrayList<Integer>();
System.out.println("enter the input");
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
a.add(sc.nextInt());
}
for(int i=0;i<a.size();i++){
sum=sum+a.get(i);
}
avg=sum/(a.size());
System.out.println("Average is "+avg);}}