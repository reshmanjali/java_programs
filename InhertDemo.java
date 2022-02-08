class A{
    int i=1;
    A(){
        System.out.println("cons in A ");
    }
    void show(){
        System.out.println("i in A= "+i);
    }

}

class B extends A{
    int i=2;
    B(){
        System.out.println("cons in B ");
    }
    void show(){
        System.out.println("i in B= "+i);
    }

}

class C extends B{
    int i=3;
    C(){
        System.out.println("cons in C ");
    }
    void show(){
        System.out.println("i in C= "+i);
        //super.show(); 1
        //System.out.println("suoer i from C= "+super.i); 2
    }

}
public class InhertDemo {
    public static void main(String[] args) {
        C obC = new C();
        obC.show();
        A obA = new A();
        obA = obC;//legally possible
        obA.show();
        //obC = obA;//not possible
       //(obA.super).show();//not possible

    }
    
}
