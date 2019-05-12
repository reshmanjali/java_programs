class Base{
	static int i;		//making an integer static, assigns its value to 0
	Base(){
		i++;		//i = 1. Incrementing from 0
		System.out.println("Base constructor. i = "+i);
	}
}
class InheritDemo extends Base{
	InheritDemo(){
		i++;		//i = 2. InheritDemo is the derived class of "Base" class and so "i" is accessible from here
		System.out.println("Derived constructor. i = "+i);
	}
	public static void main(String args[]){
		new InheritDemo();		//Creating an onject for the derived class fires the Base class constructor earlier to firing the derived class constructor.(Run and see the output:))
		System.out.println("Main method. i= "+i);	//i = 2. Since i is not declared as private, it is accessible from outside the class 
		
	}
}
