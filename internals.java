package cie;
import java.util.Scanner;

class Student {

public String usn = new String();
 public String name = new String();
 public int sem;
Scanner s=new Scanner(System.in);

public void inputStudentDetails() {
 usn=s.nextLine();
 name=s.nextLine();
 sem=s.nextInt();
}

public void displayStudentDetails() {
System.out.println("student name: " + name);
System.out.println("student usn: " + usn);
System.out.println("student semester: " + sem);
  }
}


public class internals extends Student {

protected int marks[] = new int[5];

public void inputCIEmarks()

{
Scanner s = new Scanner(System.in);
for(int i=0;i<5;i++){
System.out.println("enter the CONSOLIDATED CIE marks  of " +(i+1)+"th  subject");
marks[i]=s.nextInt();

    }
  }
}
