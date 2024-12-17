import java.util.*;
class Apps{
public static void main(String[] args){
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the App");
s=sc.next();
switch(s)
{
case "WhatsApp","Messages","Telegram":
System.out.println("Messaging App");
break;
case "Amazon","Flipkart","Myntra":
System.out.println("Shopping App");
break;
case "Angry Birds","Subway Surfers","Temple Run":
System.out.println("Gaming App");
break;
case "Coursera","Udemy","Great Learning":
System.out.println("Education App");
break;
case "Swiggy","Zomato":
System.out.println("Food App");
break;
default:
System.out.println("Other Apps");
}
}
}

