import java.util.*;

class subject
{
	int subjectMarks,credits,grade;
}

class student
{
	String name,usn;
	double SGPA,totalCredits=0,totalNum=0;
	Scanner s=new Scanner(System.in);
	subject[] subjects;
	student()
	{
		subjects=new subject[8];
		for(int i=0;i<8;i++)
			subjects[i]=new subject();
	}
	void getStudentDetails()
	{
		System.out.println("enter the name");
		name=s.nextLine();
		System.out.println("enter the usn");
		usn=s.nextLine();
	}
	void getMarks()
{
		for(int i=0;i<8;i++)
		{
			System.out.println("enter the marks of "+(i+1)+" subject");
			subjects[i].subjectMarks=s.nextInt();
			System.out.println("enter the credits of "+(i+1)+" subject");
			subjects[i].credits=s.nextInt();
			subjects[i].grade=((subjects[i].subjectMarks)/10)+1;
			if(subjects[i].grade==11)
				subjects[i].grade=10;
			else if(subjects[i].grade==4)
				subjects[i].grade=0;
		}
	}
	void computeSGPA()
	{
		for(int i=0;i<8;i++)
		{
			totalCredits=totalCredits+subjects[i].credits;
			totalNum=totalNum+(subjects[i].grade*subjects[i].credits);
		}
		SGPA=(totalNum/totalCredits);
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("USN:"+usn);
		System.out.println("SGPA:"+SGPA);
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number of students");
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		student[] s1=new student[n];
		for(int i=0;i<n;i++)
		{
			s1[i]=new student();
		}
		
		for(int i=0;i<n;i++)
		{
			s1[i].getStudentDetails();
			s1[i].getMarks();
			s1[i].computeSGPA();
			s1[i].display();
		}
		System.out.println("Name: XXXXXXXXX");
		System.out.println("USN: YYYYYYYY");
	}
}
