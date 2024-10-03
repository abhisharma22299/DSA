package studentgradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
public static void main(String[] args) {
	System.out.println("Student Grade Calculator ");
	System.out.println("Enter number subjects");
	Scanner sc =new Scanner(System.in);
int studentNumberOfSubjects=sc.nextInt();
float f=studentNumberOfSubjects;
if(studentNumberOfSubjects==0 || studentNumberOfSubjects<0) {
	System.out.println("Something went wrong!");
}
float arr[]=new float[studentNumberOfSubjects];

for(int i=0;i<studentNumberOfSubjects;i++) {
	System.out.println("Enter subject " +(i+1)+" mark ");
	arr[i]=sc.nextFloat();
	if(arr[i]>100) {
		System.out.println("Something went wrong marks !  ");
	}
}
float sum=0;
for(float a:arr) {
	sum=sum+a;
	
}
System.out.println("Total Marks obtained : "+sum);
System.out.println("Average Marks obtained : "+(sum/studentNumberOfSubjects));
float averagePercentage=(sum/studentNumberOfSubjects);
char grade;
if (averagePercentage >= 90) {
    grade = 'A';
} else if (averagePercentage >= 80) {
    grade = 'B';
} else if (averagePercentage >= 70) {
    grade = 'C';
} else if (averagePercentage >= 60) {
    grade = 'D';
} else if (averagePercentage >= 50) {
    grade = 'E';
} else {
    grade = 'F';
}
System.out.println("Grade : " + grade);
}
}
