package javaHot;
/**
 * 	Identification of Static Members from top to bottom.
	Execution of Static variable assignment and a Static block from top to bottom.
	Execution of the main method.
	Identification of Instance Members from top to bottom.
	Execution of Instance variable assignment and Instance block from top to bottom.
	Execution of Constructor.
	
	NOTE:
	All static blocks are merged together into one block, code is in same order as the blocks are from top to bottom
	Same happens with instance blocks!
 *
 */
public class CallingOrderInJavaClass {
	int i;
    static int j;
    {
        System.out.println(" Instance Block 1. Value of i = "+i);
    }
    static{
        System.out.println(" Static Block 1. Value of j = "+j);
        method_2();
    }
    {
        i = 5;
    }
    static{
        j = 10;
    }
    CallingOrderInJavaClass(){
        System.out.println(" Welcome to InterviewBit ");
    }
    public static void main(String[] args){
    	CallingOrderInJavaClass ib = new CallingOrderInJavaClass();
    }
    public void method_1(){
        System.out.println(" Instance method. ");
    }
    static{
        System.out.println(" Static Block 2. Value of j = "+j);
    }
    {
        System.out.println(" Instance Block 2. Value of i = "+i);
        method_1();
    }
    public static void method_2(){
        System.out.println(" Static method. ");
    }
}
