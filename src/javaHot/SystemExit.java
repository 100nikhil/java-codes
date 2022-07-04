package javaHot;

/**
 * 
 * The java.lang.System.exit() method exits current program by terminating
 * running Java virtual machine. This method takes a status code. A non-zero
 * value of status code is generally used to indicate abnormal termination.
 * 
 * exit(0) : Generally used to indicate successful termination.
   exit(1) or exit(-1) or any other non-zero value – Generally indicates unsuccessful termination.
 *
 */

public class SystemExit {

	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                System.out.println("exit...");
  
                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                                  arr[i]);
        }
        System.out.println("End of Program");
	}

}
