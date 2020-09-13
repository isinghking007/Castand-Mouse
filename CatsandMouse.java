import java.io.*;
import java.util.*;
public class CatsandMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the place of 'Cat A'");
		int a=in.nextInt();
		System.out.println("Enter the place of 'Cat B'");
		int b=in.nextInt();
		System.out.println("Enter the place of 'Mouse C'");
		int c=in.nextInt();
		int d1=0,d2=0,d3=0;
		d1=Math.abs(a-c);
		d2=Math.abs(b-c);
		if(d1>d2)
		{
			System.out.println("Cat B");
		}
		else if(d1==d2)
		{
			System.out.println("Mouse C");
		}
		else
		{
			System.out.println("Cat A");
		}
	}

}
