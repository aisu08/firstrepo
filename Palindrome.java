import java.util.*;
class Palindrome{
static int n, r, sum =0 , temp;

static void isPalindrome(){
	temp = n;
	while(n>0){
	  r = n%10;
	  sum = (sum*10)+r;
	   n = n/10;
	  }

	if(temp == sum ){
		System.out.println(temp + "is a Palindrome");
	}
	else{
		System.out.println(temp + "is not a Palindrome");
	}
}
public static void main(String[] args){
System.out.println("Enter n: ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
isPalindrome();
System.out.println("New request from sts to git.");
}
}





		
	  