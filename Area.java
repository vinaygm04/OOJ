import java.util.*;
abstract class shape{
double x,y,area;

void accept(){
Scanner s=new Scanner(System.in);
x=s.nextDouble();
y=s.nextDouble();
}
abstract void printArea();
}

class rectangle extends shape{
void printArea(){
area = x*y;
System.out.println(" area of rectangle is"+ area);

}}
class triangle extends shape{
void printArea(){
area=0.5*x*y;
System.out.println(" area of triangle is"+ area);

}}
class circle extends shape{
void printArea(){
area = 3.14*x*y;
System.out.println(" area of circle is"+ area);

}}
class Area{
public static void main(String args[]){
 rectangle r= new rectangle();
System.out.println(" \n enter the length and breadth of rectangle\n ");
r.accept();
r.printArea();
 triangle t= new triangle();
System.out.println("\n enter the base and height of triangle \n");
t.accept();
t.printArea();
 circle c= new circle();
System.out.println("\n enter the radius of circle(enter the same value twice)");
c.accept();
c.printArea();

}}
