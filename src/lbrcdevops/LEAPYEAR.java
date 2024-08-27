package lbrcdevops;

public class LEAPYEAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean is_leap_year = false;
		  boolean usleap=true;
		  
	        // If year is divisible by 4
	        if (year % 4 == 0) {
	            is_leap_year = true;
	   
	 
	            // To identify whether it is a
	            // century year or not
	            if (year % 100 == 0) {
	                // Checking if year is divisible by 400
	                // therefore century leap year
	                if (year % 400 == 0)
	                    is_leap_year = true;
	                else
	                    is_leap_year = false;

	}

}
