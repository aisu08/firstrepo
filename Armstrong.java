import java.util.*;
import java.lang.Math;
class Armstrong{
int n, r, sum =0, temp;

public void isArmstrong(){
	int length = String.valueOf(n).length();
	System.out.println(length);
	temp = n;
	sum = 0;
	while(n>0){
	 r = n%10;
	 sum += Math.pow(r,length);
	 n = n/10;
        }
    if(temp == sum)
	System.out.println(temp +" "+ "is a Armstrong Number");
    else
	System.out.println(temp +" "+ "is not a Armstrong number");
}

public static void main(String[] args){
Armstrong a = new Armstrong();
System.out.println("Enter n: ");
Scanner sc = new Scanner(System.in);
a.n = sc.nextInt();
a.isArmstrong();
}
}

