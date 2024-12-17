class MethodOverloading
{
 
float sub(float p , float q )
{
return p-q;
}


double sub(int p , float q )
{
return p-q;
}

/*int sub(int s, int t, int x){
	return s-t-x;
}
long sub(int s, int t, int x){
	return s-t-x;
}*/

int sub(long s, long t, long x){
	return s-t-x;
}

public static void main(String ar[])
{
 
MethodOverloading m = new  MethodOverloading();

System.out.println(m.sub(12.0f,45.3f));
System.out.println(m.sub(12,45.3f));
System.out.println(m.sub(12000,45000,57000));



 
 
}
}