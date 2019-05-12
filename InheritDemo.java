class Base{
	static int i;
	Base(){
		i++;		//1
		System.out.println("Base constructor. i = "+i);
	}
}
class InheritDemo extends Base{
	InheritDemo(){
		i++;		//2
		System.out.println("Derived constructor. i = "+i);
	}
	public static void main(String args[]){
		new InheritDemo();
		System.out.println("Main method. i= "+i);		//2
	}
}