package day4;

public class WorkoutJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to find prime number from 1 to infinity
		
				int x=83;
				while(x==1) {
					System.out.println("the given number is not a prime");
					break;
				}
				while(x==2) {
					System.out.println("the given number is prime");
					break;
				}
				for(int i=2;i<x;i++) {
				
					if(x%i==0) {
						System.out.println("the given number is not a prime");
						break;
					}
					else {
						System.out.println("the given number is prime");
						break;
					}
				}

	}

}
