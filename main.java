import see.*;
import cie.*;
class main{
  public static void main(String args[]){
externals e=new externals();
System.out.println(" enter your name , usn and semester");
e.inputStudentDetails();
e.displayStudentDetails();
e.inputCIEmarks();
e.inputSEEmarks();
e.calculateFinalMarks();
e.displayFinalMarks();
}
}
