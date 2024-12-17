import java.util.*;
class Calculator{

public void add(int a, int b){
System.out.println("The sum is: " + (a+b));
}

public void subtract(int a, int b){
System.out.println("The difference is: " + (a-b));
}

public void product(int a, int b){
System.out.println("The product is: " + (a*b));
}

public void divide(int a, int b){
System.out.println("The Quotient is: " + (a/b));
}

public void modulo(int a, int b){
System.out.println("The Remainder is: " + (a%b));
}

public static void main(String[] args){
int a, b;
Calculator c = new Calculator();
Scanner sc = new Scanner(System.in);
System.out.println("Menu");
System.out.println("Choose one option from menu");
System.out.println("1-Add 2-Subtract 3-Multiply 4-Divide 5-Remainder ");
int n = sc.nextInt();
if(n>=1&&n<=5){
System.out.println("Enter first number:");
a = sc.nextInt();
System.out.println("Enter second number:");
b = sc.nextInt();
switch(n){
case 1: c.add(a,b);
	break;
case 2: c.subtract(a,b);
	break;
case 3: c.product(a,b);
	break;
case 4: c.divide(a,b);
	break;
case 5: c.modulo(a,b);
	break;
default:
	System.out.println("Invalid Operation");
}
}
else{
System.out.println("Invalid Operation");
}
}
}	
