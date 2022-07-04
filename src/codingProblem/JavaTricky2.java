package codingProblem;

class InterviewBit1{
    
	int calculate(int a, int b)
    {
        try{
            return a+b;
        }catch(Exception e){
            return a-b;
        }finally{
            return a*b;   //finally will run even we after returning from try
        }
    }        
}  

public class JavaTricky2 {

	public static void main(String[] args) {
        InterviewBit1 obj1 = new InterviewBit1();
        int result = obj1.calculate(2, 4);
        System.out.println("Result: " + result);
	}

}
