package day4;

public class Homeowork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Swapped value
		 int a=10,b=20;
		System.out.println("The Value of a and b is " +a+ " "+b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("The swapped value of a and b is " +a+ " "+b);
		
		//Reverse a number
		int number=12345;
		int num=12345,rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;//rev=5
			num/=10;
		}
		
		
		System.out.println(rev);
		
		if(number==rev)
		{
			System.out.println(number + " The number is Palindrome ");
		}
		else
		{
		System.out.println(number + " The number is not Palindrome ");
		}
		
		//count the value
		int i=12345;
		int count=0;
		while(i!=0)
		{
		i/=10;//1234
		count++;
		}
		System.out.println("the number of digit in the value is "+ count);
		
		//Count number of even and odd
		int x=18438808,even=0,odd=0;
		while(x!=0) {
			int rem=x%10;
			if(rem%2==0){
				even++;
			}
			else {
				odd++;
			}
			x/=10;
		}
		System.out.println("count of even is " +even+ " count of odd is " +odd);
		//sum of digits in a number
		int y=8438808,add=0;
		while(y!=0) {
			add=add+y%10;//sum=5,9
			y/=10;//n=1234
		}
		System.out.println(" the sum of didgits is "+add);
		
		
				
	}

	}
