package day3;

public class EmployeWageComputation {
  public static void main(String[] args) {
    System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
    double present = 1;
    int totalWorkingDays = 0;
    int daysWorked = 0;
    while(totalWorkingDays<20) {
    double isPresent = Math.floor(Math.random()*10)%2;
//    System.out.println(isPresent);
    if (isPresent == present) {
//		System.out.println("Employee is Present");
		daysWorked++;
		//System.out.println("working hour "+ totalWorkingHours);
	} 
//		else {
//		System.out.println("Employee is Absent");
//	}
    }
    System.out.println("Total Working Days "+daysWorked);
    int wagePerHour = 20;
    int empHours = 0;
    int empWagePerDay=0;
    int workingDays = 20;
    int checkFullOrPartTime = (int)(Math.floor(Math.random()*10)%3);
    switch (checkFullOrPartTime) {
	case 1: {
		System.out.println("Full Time Employee");
		empHours = 8;
		empWagePerDay = empHours*wagePerHour;

	}
	case 2: {
		System.out.println("Part Time Employee");
		empHours = 4;
		empWagePerDay = empHours*wagePerHour;
	}
  }
    int monthlyWage = empWagePerDay*daysWorked;
    System.out.println("Monthly Wage: "+monthlyWage);
  }
}
  
