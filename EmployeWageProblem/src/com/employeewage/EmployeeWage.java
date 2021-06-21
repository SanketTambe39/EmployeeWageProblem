package com.employeewage;

public class EmployeeWage {

	public static void main(String[] args) {
		int IS_PRESENT=1;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		int DAILY_WAGE=0; 
		
		double empCheck=Math.floor(Math.random() * 10) % 2;

			if(IS_PRESENT == empCheck) {

				DAILY_WAGE=WAGE_PER_HOUR*FULL_DAY_HOUR;
				System.out.println("Employee is Present And His/Her Daily wage is :: "+DAILY_WAGE);
			}
			else
			{
				System.out.println("Employee is Absent");
			}

	}

}
