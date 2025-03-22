import java.util.*;
class myclass{

public static void main(String[]args){	

	int n = 10;
	
	// to print numbers array format

	System.out.print("[");
	for(int i=0;i<n;i++){
	System.out.print(fibo(i));
	if(i<n-1){
		System.out.print(","); // add comma between numbers
	}		
}
	System.out.println("]");
}

// find factorial of num
static int fact(int num){
		int res = 1 , i ;
	for( i =2;i<num;i++){
		res*=i;
		}
	return res;
}


// find out evenodd Numbers
static void evenOdd(int num){
	
	if(num%2==0){
		System.out.println("even");
	}
	else {
		System.out.println("odd");	
	}
}


// find out Armstrong num

/*

Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

*/

static boolean isArmstrong(int num){
		
	int orginalnum =num , sum =0, digits=0;

	// Count no of digits
		int temp = num;
	while(temp>0){
		temp/=10;
		digits++; 
	
		}
	
// compute sum  of the nth power of its digit
	temp = num;
	while(temp>0){

	int digit = temp%10;
	sum+= Math.pow(digit,digits);
	temp/=10;
		}
		return sum==orginalnum ;		
	}


/*
# Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
*/
static int fibo(int num){
	// base case
	if(num <=1){
		return num;		
	}
	return fibo(num-1)+fibo(num-2);
		}





}