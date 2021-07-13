package myfirstjava;
import java.util.*;
import java.math.*;
public class Quadratic {

	public static void main(String[] args) {
		double a,b,c,dis,root1,root2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextDouble();
		System.out.println("enter value of b");
		b=sc.nextDouble();
		System.out.println("enter value of c");
		c=sc.nextDouble();
		dis= b*b-4.0*a*c;
		
		if(dis>0.0) {
			root1=(-b + Math.pow(dis,0.5))/(2.0*a);
			root2=(-b - Math.pow(dis,0.5))/(2.0*a);
			System.out.println(root1+" "+root2);
		}
		else if(dis==0.0) {
			root1=-b/(2.0*a);
			root2=-b/(2.0*a);
			System.out.println(root1+" "+root2);
		}
		else {
			System.out.println("roots are not equal");
		}

	}

}
