public class Swap{
int a = 100, b=200, c=0;


public void Cal(int a, int b){
c = a;
a = b;
b = c;
System.out.println(a + " "+b);
}

public void CalRef(Swap s){
s.c = s.a;
s.a = s.b;
s.b = s.c;
System.out.println(s.a + " " + s.b);

}

public static void main(String[] args){
Swap s = new Swap();
System.out.println("Value before swapping: Call by value: "+s.a+" "+s.b);
System.out.print("Value after swapping: Call by value: ");
s.Cal(s.a,s.b);
System.out.println("Value before swapping: Call by Reference: "+s.a+" "+s.b);
System.out.print("Value after swapping: Call by Reference: ");
s.CalRef(s);
}
}
