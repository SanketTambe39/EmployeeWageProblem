package com.employeewage;

public class EmployeeWage {

	public static void main(String[] args) {
		int IS_PRESENT=1;
    	
		double empCheck=Math.floor(Math.random() * 10) % 2;
		
    	if(IS_PRESENT == empCheck) {
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
