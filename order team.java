package demo;
//import neccessary packages
import java.util.*;
import java.io.*;
//create class named as sanket
class sanket
{
	public static void main(String args[])
	{
		//take number of test from user
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		//check wheather test is greater or not
		while(test>0)
		{
			//create array of three people
			int arr[]=new int[3];
			int brr[]=new int[3];
			int crr[]=new int[3];
			for(int i=0; i<3; i++)
			{
				arr[i]=sc.nextInt();//insert scores to first person
			}
			for(int i=0; i<3; i++)
			{
				brr[i]=sc.nextInt();//insert scores to second person
			}
			for(int i=0; i<3; i++)
			{
				crr[i]=sc.nextInt();//insert scores to third person
			}
			
			boolean flag1=true;
			boolean correct1=false;
			boolean flag2=true;
			boolean correct2=false;
				correct2=false;
				//compare scores of perons
			for(int i=0; i<3; i++)
			{
				if(brr[i]<arr[i])
					flag1=false;
				if(crr[i]<brr[i])
					flag2=false;
				if(brr[i]>arr[i])
					correct1=true;
				if(crr[i]>brr[i])
					correct2=true;
			}
			//condition for checking the flags value
            if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;//decrement the test vale 
				continue;
			}
            //initialize boolean values
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			//compare scores of perons
			for(int i=0; i<3; i++)
			{
				if(brr[i]>arr[i])
					flag1=false;
				if(crr[i]<arr[i])
					flag2=false;
				if(brr[i]<arr[i])
					correct1=true;
				if(crr[i]>arr[i])
					correct2=true;
			}
			//condition for checking the flags value
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
		    flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]>brr[i])
					flag1=false;
				if(arr[i]<brr[i])
					flag2=false;
				if(crr[i]<brr[i])
					correct1=true;
				if(arr[i]>brr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]<brr[i])
					flag1=false;
				if(arr[i]<crr[i])
					flag2=false;
				if(crr[i]>brr[i])
					correct1=true;
				if(arr[i]>crr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(arr[i]<crr[i])
					flag1=false;
				if(brr[i]<arr[i])
					flag2=false;
				if(arr[i]>crr[i])
					correct1=true;
				if(brr[i]>arr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]<arr[i])
					flag1=false;
				if(brr[i]<crr[i])
					flag2=false;
				if(crr[i]>arr[i])
					correct1=true;
				if(brr[i]>crr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			System.out.println("no");
				test--;
		}
	}
}
