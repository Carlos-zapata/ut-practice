package main;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class age {
	
	public static String requestBirthDate (){
	 String inputString;
	 inputString = JOptionPane.showInputDialog(null, "Introducir fecha (dd/MM/YYYY):");
	 return inputString;
	}
	
	public static void getAge(String date){
	 
	 int cday = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	 int cmonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
	 int cyear = Calendar.getInstance().get(Calendar.YEAR);
	 int myDay = 0, myMonth = 0, myYear = 0;
	 int resultYear = 0, resultDay = 0, resultMonth = 0;
	 

	  myDay = Integer.parseInt(date.substring(0, 2));
	  myMonth = Integer.parseInt(date.substring(3, 5));
	  myYear = Integer.parseInt(date.substring(6, 10));
	  	 
	 if (myYear <= cyear){
		if (myMonth < cmonth){
			resultYear = cyear - myYear;
			if(cday <= myDay){
				resultMonth = cmonth - myMonth;
				resultDay = cday - myDay;
			}
			else {
				resultMonth = cmonth - myMonth - 1;
				switch (myMonth){
			    case 1: resultDay = cday + (31 - myDay);
				case 2: resultDay = cday + (28 - myDay);
				case 3: resultDay = cday + (31 - myDay);
				case 4: resultDay = cday + (30 - myDay);
				case 5: resultDay = cday + (31 - myDay);
				case 6: resultDay = cday + (30 - myDay);
				case 7: resultDay = cday + (31 - myDay);
				case 8: resultDay = cday + (31 - myDay);
				case 9: resultDay = cday + (30 - myDay);
				case 10: resultDay = cday + (31 - myDay);
				case 11: resultDay = cday + (30 - myDay);
				case 12: resultDay = cday + (31 - myDay);
				}
			}
		
		}
		
		else if (myMonth == cmonth){
			if(myDay < cday){
				resultYear = cyear - myYear - 1;
			    resultMonth = 11;
			    resultDay = cday - myDay;}
			else{
				resultYear = cyear - myYear;
		        resultMonth = 0;
		        switch (myMonth){
			    case 1: resultDay = cday + (31 - myDay);
				case 2: resultDay = cday + (28 - myDay);
				case 3: resultDay = cday + (31 - myDay);
				case 4: resultDay = cday + (30 - myDay);
				case 5: resultDay = cday + (31 - myDay);
				case 6: resultDay = cday + (30 - myDay);
				case 7: resultDay = cday + (31 - myDay);
				case 8: resultDay = cday + (31 - myDay);
				case 9: resultDay = cday + (30 - myDay);
				case 10: resultDay = cday + (31 - myDay);
				case 11: resultDay = cday + (30 - myDay);
				case 12: resultDay = cday + (31 - myDay);}
		}
		}
		else
			resultYear = cyear - myYear - 1;
		    if (myDay >= cday){
		    	resultMonth = 12 - (myMonth - cmonth) - 1;
		    	switch (myMonth){
			    case 1: resultDay = cday + (31 - myDay);
				case 2: resultDay = cday + (28 - myDay);
				case 3: resultDay = cday + (31 - myDay);
				case 4: resultDay = cday + (30 - myDay);
				case 5: resultDay = cday + (31 - myDay);
				case 6: resultDay = cday + (30 - myDay);
				case 7: resultDay = cday + (31 - myDay);
				case 8: resultDay = cday + (31 - myDay);
				case 9: resultDay = cday + (30 - myDay);
				case 10: resultDay = cday + (31 - myDay);
				case 11: resultDay = cday + (30 - myDay);
				case 12: resultDay = cday + (31 - myDay);
		    }}
		    else if (myDay < cday){
		    	resultMonth = 12 - (myMonth - cmonth);
		        resultDay = cday - myDay;}
		    
	 }
	 
	 JOptionPane.showMessageDialog(null, "Tienes " + resultDay + " d�as, " + resultMonth + " meses y " + resultYear + " a�os.", "Tu edad", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main (String[] args){
		String myBirthDate = requestBirthDate();
		getAge(myBirthDate);
	}
	

}
