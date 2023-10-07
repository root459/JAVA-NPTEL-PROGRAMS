//Float a = new Float(0); // Declares a Float //object "a" and initializes it with the value 0
//use of wrapper classes like Float allows you to work with floating-point values as objects and provides additional utility //methods that are not available for primitive types. 
//, "a" is an object of type Float, and you can use its methods and features specific to the Float class.
import java.io.*;
class Demonstration8{
public static void main(String []args) throws Exception{
Float principalAmount=new Float(0);
Float rateofInterest=new Float(0);
int numberofYears=0;
//instead of try and catch we can use throws also in main method
//try{
DataInputStream in = new DataInputStream(System.in);
String tempString;
System.out.println("enter the prinicpl amount");
System.out.flush();//clear the buffer before taking input
tempString=in.readLine();//read the input by user
principalAmount=Float.valueOf(tempString);//convert string to float
System.out.println("enter the rateof interest");
System.out.flush();
tempString=in.readLine();
rateofInterest=Float.valueOf(tempString);

System.out.println("enter the years");
System.out.flush();
tempString=in.readLine();
numberofYears=Integer.parseInt(tempString);
float Interest=principalAmount*rateofInterest*numberofYears;
System.out.println("Total Interest="+Interest);//}
//catch(Exception ex)
//{}
}
}

