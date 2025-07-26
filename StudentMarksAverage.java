 /*****************************
program no.	:13
programname  	:StudentMarksAverage.java
AUthor		:Lokesh
Date		:25-07-2025
purpose		:Implementation of classes
***********************************/
import java.util.Scanner;
public class StudentMarksAverage
{
	//static variable
	static Scanner console=new Scanner(System.in);
	
	//instance variables
	int[][] marks;
	int numStudents;
	int numSubjects;
	
	public void inputMarks()
	{
		System.out.print("enter number of students:");
		numStudents=console.nextInt();
		
		System.out.print("enter number of subjects:");
		numSubjects=console.nextInt();
		
		marks=new int[numStudents][numSubjects];
		for(int i=0;i<numStudents;i++)
		{
			System.out.println("enter marks for student "+(i+1)+" : ");
			System.out.println();
			for(int j=0;j<numSubjects;j++)
			{
				
				System.out.println("enter subject marks"+(j+1)+ ":");
				marks[i][j]=console.nextInt();
			}
		}
	}
	public void calculateAverages()
	{
		System.out.println("----------Student Performance Summary------");
		for(int i=0; i<numStudents;i++)
		{
			int total=0;
			System.out.print("Student"+(i+1)+"marks");
			for(int j=0;j<numSubjects;j++)
			{
				System.out.print(marks[i][j]+" ");
				total +=marks[i][j];
			}
			double average=(double)(total/numSubjects);
			System.out.print("|Average: "+average);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		StudentMarksAverage obj = new StudentMarksAverage();
		obj.inputMarks();
		obj.calculateAverages();
	}
}
