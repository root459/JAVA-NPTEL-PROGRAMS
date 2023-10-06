public class Demonstration6{
public static void main(String []args
){
int x=10;
System.out.printf("PRINT USING FORMATTED PRINT %d",x);
float n=3.2f;
System.out.printf(" \n formatted to specific width %.2f",n);

System.out.printf(" \n formatted to specific width %.4f",n);
n=2334342.3f;
System.out.printf(" \n formatted from right margin and takes width of 20 characters  width %20.4f",n);
System.out.printf(" \n formatted from right margin and takes width of 20 characters  width %5.2f",n);

}}