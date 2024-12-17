import java.util.*;
class Detail{
static String name;
static String dept;
static float m1, m2,m3;
static float avg;
static void print(){
System.out.println("Name: "+name);
System.out.println("Department: "+ dept);
System.out.println("Mark1: "+ m1);
System.out.println("Mark2: "+ m2);
System.out.println("Mark3: "+ m3);
avg = (m1+m2+m3)/3;
System.out.println("Average:"+ String.format("%.2f",avg));
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
name = sc.next();
System.out.println("Enter your department:");
dept = sc.next();
System.out.println("Enter mark1:");
m1 = sc.nextFloat();
System.out.println("Enter mark2:");
m2 = sc.nextFloat();
System.out.println("Enter mark3:");
m3 = sc.nextFloat();
print();
if(avg<50)
System.out.println("Fail");
else
if(avg>=50&&avg<60)
System.out.println("Grade:D");
else
if(avg>=60&&avg<70)
System.out.println("Grade:C");
else
if(avg>=70&&avg<80)
System.out.println("Grade:B");
else
if(avg>=80&&avg<90)
System.out.println("Grade:A");
else
System.out.println("Grade:0");
}
}



