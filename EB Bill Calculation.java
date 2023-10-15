import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble(),b=0;
		if(n<=50)
		{
		    System.out.print("Free");
		}
		else if(n>=51 && n<=150)
		{
		    b=(n-50)*3;
		}
		else if(n>=151 && n<=250)
		{
		    b=300+(n-150)*5;
		}
		else if(n>=251)
		{
		    b=800+(n-250)*7;
		}
		b=b+b*0.20;
		if(b==(int)b){
		    System.out.print((int)b);
		}
		else if(b!=0){
		    System.out.print(b);
		}
	}
}
