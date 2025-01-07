package see;

import cie.*;

import java.util.Scanner;

public class externals extends internals {
int i;
protected int seemarks[]=new int[5];

protected int finalMarks[]=new int[5];

Scanner s=new Scanner(System.in);
public void inputSEEmarks()
  {
for(i=0;i<5;i++)
{
System.out.println("Enter see marks");
seemarks[i]=s.nextInt();
  }
}
public void calculateFinalMarks() {
for(i=0;i<5;i++){
finalMarks[i]=(marks[i]+(seemarks[i]/2));


}

 }

public void displayFinalMarks() {

for (i=0;i<5;i++){
System.out.println("Final marks is"+finalMarks[i]);
}}}
