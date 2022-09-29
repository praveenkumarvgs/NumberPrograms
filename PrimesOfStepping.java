package number.programs;
import java.util.*;
public class PrimesOfStepping {
	/**
	 * This method will check for any numbers whose
     *  difference of value of consecutive digits is 1
	 * @return true or false 
	 */
	  
	 public static boolean consecutiveDigitDiffrence(int num) {
		 int prevDigit = -1;
	      while (num > 0)
	      {
	          int curDigit = num % 10;

	          if (prevDigit != -1)
	          {
	              if (Math.abs(curDigit-prevDigit) != 1)
	                  return false;
	          }
	          num /= 10;
	          prevDigit = curDigit;
	      }
	      return true;
	  }
	 /**
	   * This method will check for any prime from the array of numbers returned from above method 
	   * @return prime of those array of numbers
	   */
	
	  public static void rangeOfPrime(int num) {
			int count=0;
			if(consecutiveDigitDiffrence(num)) {
				for(int j=2;j<=num/2;j++) {
					if(num%j == 0) {
						count++;
						break;
					}
					
				}
				if (count==0 && num>9){
					System.out.println(num+" ");
				}
			 }
		 }
	/**
	 * This is the main method. It is the starting point of our program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the maximum range: ");
		int range=scan.nextInt();
		System.out.println();
		for(int i=0;i<range;i++) {
			rangeOfPrime(i);
		}
		scan.close();

	}	

}
