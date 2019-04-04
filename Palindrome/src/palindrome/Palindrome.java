package palindrome;

import java.util.Scanner;

public class Palindrome {

	
	public Palindrome() {}
		
		//This method takes an input of String and sees if its even or odd and sends to the correct method.
	    // Since odd palindromes and even ones are calculated differently.
	public void palindromeCheck() {
		
	
		System.out.println("Enter a string to check if it is a palindrome");
		System.out.println("");
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		in.close();
		System.out.println("You chose the string of ...  " + string);

			int strLength = string.length();
			System.out.println("Length of  " + strLength);
			System.out.println(" ");
			System.out.println("Lets now see if this string is even or odd...");


			//Sends to even or odd method.
			if (strLength%2==0) {
				evenPalindrome(string,strLength);
				}
					else {
						oddPalindrome(string,strLength);}
					}

	
	
	// If string length is odd run ODD palindrome method.
	private void oddPalindrome(String string,int strLength) {
		System.out.println("Ruuning Odd Palindrome Method.");
		
		int oddMid = (strLength/2);
		int oddMidLow =  ((strLength/2)-1);
		int oddMidHigh =  ((strLength/2)+1);

		System.out.println("Middle point = " + string.charAt(oddMid));
		
		while(oddMidHigh >=0 && oddMidHigh <= strLength) {
		if (string.charAt(oddMidLow)==string.charAt(oddMidHigh)) {
				oddMidLow--;
				oddMidHigh++;
		}
		else {
			 System.out.println("This is NOT a Palindrome! " + string );
			 break;
		}
		 System.out.println("This is an ODD AND A Palindrome! " + string );
		 break;
		}
	}

		
	

	// If string length is even run even palindrome method.
	private void evenPalindrome(String string,int strLength) {
		System.out.println("Ruuning Even Palindrome Method.");
		 int lowMid =strLength/2 -1;
		 int highMid =strLength/2;
		System.out.println("Middle points = " + string.charAt(lowMid) + string.charAt(highMid));
			while(lowMid >=0 && highMid <= strLength) {
			 if(string.charAt(lowMid) == string.charAt(highMid) ) {
					lowMid--;
					highMid++;	
				}	
			else {
				 System.out.println("This is NOT a Palindrome! " + string );
				 break;
			}
			 System.out.println("This is an EVEN AND A Palindrome! " + string );
			 break;

			}}}

	

		



