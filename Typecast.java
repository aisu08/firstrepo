import java.util.*;
public class Typecast{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
long l = sc.nextLong();


float f = l;

System.out.println("Implicit cast: float: "+ f +"Long: " +l);

l=(long)f;
System.out.println("Explicit cast: float: "+ f +"Long: " +l);
}
}

