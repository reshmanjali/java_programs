public class Box{
	public int l,b,h;
	Box(){
		System.out.println("This is a default constructor");
		l=10;b=20;h=4500;
	}
}
class ObjCreation{
	public static void main(String args[]){
		Box boxObject=new Box();
		System.out.println("Object instantiated");
		System.out.println("l = "+boxObject.l);
		System.out.println("b = "+boxObject.b);
		System.out.println("h = "+boxObject.h);
	}
}
//In all the below 3 observations the instance variables are not specified as either public or private
// Even when the variables are declared as public, same obserations are made.
// Observatioin 1 : working well without any public class in this file
// Observation 2 : giving an error when there are 2 public classes. The error says that there cannot be public Box in this 
// file.
//and that Box class should be in another seperate file as it is public.
// Observation 3 : Giving the same error as "class Box is public, should be declared in a file named Box.java" when the Box 
// class is made public.

// I think there should be no more than 1 public class in a java file.
