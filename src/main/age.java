package main;



import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class age {
	
	public static String requestBirthDate (){
		 String inputString;
		 return inputString = JOptionPane.showInputDialog(null, "Introducir fecha (dd/MM/YYYY):");
		 

		 }
	public static String Validate(String input){
		 
		 try{
	 if(input.length() == 10)
		 if(input.charAt(2) == '/' && input.charAt(5) == '/'){
			 if(Integer.parseInt(input.substring(0, 2)) < 0 || Integer.parseInt(input.substring(0, 2)) > 31 ){
				 JOptionPane.showMessageDialog(null,"Fecha inv�lida, d�a fuera de rango.", "Fecha inv�lida", JOptionPane.ERROR_MESSAGE);
				 return " ";}
			 
			 if(Integer.parseInt(input.substring(3, 5)) < 0 || Integer.parseInt(input.substring(3, 5)) > 12 ){
				 JOptionPane.showMessageDialog(null,"Fecha inv�lida, mes fuera de rango.", "Fecha inv�lida", JOptionPane.ERROR_MESSAGE);
				 return " ";} 
			if(Integer.parseInt(input.substring(6, 10)) < 0 || Integer.parseInt(input.substring(6, 10)) > 2016 ){
				 JOptionPane.showMessageDialog(null,"Fecha inv�lida, a�o fuera de rango.", "Fecha inv�lida", JOptionPane.ERROR_MESSAGE);
				 return " ";}
			}
		 else
			 {
			 JOptionPane.showMessageDialog(null,"Formato inv�lido", "Formato inv�lido", JOptionPane.ERROR_MESSAGE);
			 return " ";
			 }
	 else{
		 JOptionPane.showMessageDialog(null,"Formato inv�lido", "Formato inv�lido", JOptionPane.ERROR_MESSAGE);
		 return " ";
	 }
	 }catch(Exception e){
		 JOptionPane.showMessageDialog(null,"Formato inv�lido", "Formato inv�lido", JOptionPane.ERROR_MESSAGE);
		 return " ";
	 }
	 return input;
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
		String Valid=Validate (myBirthDate);
		
		
		if (Valid.length() == 10){
		 getAge(Valid);}
	}
}