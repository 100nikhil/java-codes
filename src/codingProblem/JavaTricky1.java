package codingProblem;

/*
 * static members are class-members, They occupy memory only once and don't change it.
 * So when new instance will try to access the value of static member it will be previous old value.
 * 
 * 
 * */

class InterviewBit{
    public int num1;
    static int num2;
    void calculate(int a, int b)
    {
        num1 +=  a ;
        num2 +=  b;
    }        
}    

public class JavaTricky1 {

    public static void main(String args[])
    {
        InterviewBit obj1 = new InterviewBit();
        InterviewBit obj2 = new InterviewBit();   
        
        obj1.num1 = 0;
        obj1.num2 = 0;
        obj1.calculate(1, 2);   //obj1 sets the value of num2 = 2
        
        obj2.num1 = 0;         //for obj2 num2 will be 2, because num2 static, and not recreated for every instance
        obj2.calculate(2, 3);
        
        System.out.println(obj1.num1 + " " + obj2.num2);     
    }

}
