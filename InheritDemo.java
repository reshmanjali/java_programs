//This is a simple Java program that demonstrates single inheritance in Java.

class Base{
	static int i;		//making an integer static, assigns its value to 0
	Base(){
		i++;		//i = 1. Incrementing from 0
		System.out.println("Base constructor. i = "+i);
	}
}
class InheritDemo extends Base{		//INHERITING A CLASS USING "EXTENDS" 
	InheritDemo(){
		i++;		//i = 2. InheritDemo is the derived class of "Base" class and so "i" is accessible from here
		System.out.println("Derived constructor. i = "+i);
	}
	public static void main(String args[]){
		new InheritDemo();		//Creating an object for the derived class fires the Base class constructor earlier to firing the derived class constructor.(Run and see the output:))
		System.out.println("Main method. i= "+i);	//i = 2. Since i is not declared as private, it is accessible from outside the class 
		
	}
}

//Observations:
//1. usage of "extends" keyword
//2. making an integer staic, will initialize its value to 0
//3. Creating an object for the derived class fires the Base class constructor earlier to firing the derived class constructor
