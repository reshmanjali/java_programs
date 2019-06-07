/*This program sorts the Student Array according to one of its attributes ( attribute : "roll" ).
The class : "Student" has 3 attributes ( name, roll, marks ).
For brevity, The array considered is of length 4 ( contains 4 student  objects )
import java.util.Scanner;
import java.lang.*;
*/
public class SortObjects{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Student objectArray[]=new Student[4];
        for(int i=0;i<4;i++){
            String name=sc.next();
            int roll=sc.nextInt();
            float marks=sc.nextFloat();
            objectArray[i]=new Student(name,roll,marks);
        }
        for(int i=0;i<4;i++){           //sorting the object array according to the attribute "roll"
            for(int j=0;j<4;j++){
                if(objectArray[i].roll < objectArray[j].roll){
                    Student temp=new Student();
                    temp=objectArray[i];
                    objectArray[i]=objectArray[j];
                    objectArray[j]=temp;
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(objectArray[i].name+"  "+objectArray[i].roll+"  "+objectArray[i].marks);
        }

     }
}
 class Student {

    String name;
    int roll;
    float marks;
    Student(){
    }
    Student(String name, int Rollno, float marks){

        this.name=name;
        this.marks=marks;
        roll=Rollno;
}
}
