package com.employeewage;

public class EmployeeWage {

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public static void main(String[] args) {

		int WAGE_PER_HOUR=20;
		int EMP_HRs=0;
		int DAILY_WAGE=0; 
		
		double empCheck=Math.floor(Math.random() * 10) % 3;

		switch ((int) empCheck) {
		case IS_FULL_TIME:
				EMP_HRs=8;
				break;
		case IS_PART_TIME:
				EMP_HRs=4;
				break;
		default:
				EMP_HRs=0;
		}
		
			if(empCheck>=1) {

				DAILY_WAGE=WAGE_PER_HOUR*EMP_HRs;
				System.out.println("Employee is Present And His/Her Daily wage is :: "+DAILY_WAGE);
			}
			else
			{
				System.out.println("Employee is Absent ");
			}

	}

}
