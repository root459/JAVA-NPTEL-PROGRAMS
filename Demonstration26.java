import java.lang.*;
public class Demonstration26{
public static void main(String []args) throws Exception{
int []array=new int[3];
try{
for(int i=0;i<4;++i){
array[i]=i;
}
System.out.println(array);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("fillin"+e.fillInStackTrace());
System.out.println("cause"+e.getCause());
System.out.println("local"+e.getLocalizedMessage());
System.out.println("messa"+e.getMessage());
System.out.println("trace"+e.getStackTrace
());
System.out.println();
System.out.println();
System.out.println("trace");e.printStackTrace();
System.out.println("");
System.out.println("string");e.toString();
System.out.println("");
System.out.println("");
System.out.println("oops we went too far better go back to 0");
throw(Exception) new Exception().initCause(e);//throws a new exception with "old exception as e"
}
finally{
System.out.println(array);
}}}
