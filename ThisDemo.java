//This program demonstrates the usage of "THIS" keyword(inside a constructor) in java.
//THIS keyword can be used either inside a constructor or a method of the class. 
//It works as reference to current object whose method or constructor is being invoked

class Box{
	int length;
	int breadth;
	int height;
	Box(int length,int breadth,int height){		//Here, parameter variables and instance variables' names are same
		this.length=length;//When we say length,breadth,height in this block(constructor code) parameterised variables take precedence
		this.breadth=breadth;	// so, "this" keyword is used to refer to the variables of the current class.
		this.height=height;
	}
}
public class ThisDemo{
	public static void main(String args[]){
		Box b=new Box(10,200,300);			//creating a Box object
		System.out.println("length : "+b.length);
		System.out.println("breadth : "+b.breadth);
		System.out.println("height : "+b.height);
	}
}

//In this program a Box class is created with 3 instance variables length, breadth and height. A Box object is initialized and its values are displayed. For initializing, constructor is used which demonstrates the usagee of "THIS" keyword.