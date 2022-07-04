package serializationDeserialization;

//Java code for serialization and deserialization
//of a Java object
import java.io.*;

class Demo implements java.io.Serializable
{
	/**
	 * SerialVersionUID, is used during Deserialization to verify that sender and receiver of a serialized 
	 * object have loaded classes for that object which are compatible with respect to serialization.
	 * 
	 * Static & Transient data members  are not saved & not serialized
	 * 
	 * a field can not be static and transient at same time: 
	 * ex:-  private static transient int x;    --- this is wrong
	 * 
	 * constructor of a class is not called during serialization
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public int a;
	public String b;
	public transient int c;
	public static int d;

	// Default constructor
	public Demo(int a, String b, int c, int d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

}

public class Program
{
	public static void main(String[] args)
	{
		Demo object = new Demo(1, "geeksforgeeks", 100, 1000);
		String filename = "C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\ser.txt";
		
		// Serialization
		try
		{
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("--- Values before serializtion ---");
			System.out.println("a = " + object.a);
			System.out.println("b = " + object.b);
			System.out.println("c = " + object.c);   // 0 cause transient, value not saved
			System.out.println("d = " + object.d);
			
			System.out.println("Object has been serialized");
			
			Demo.d = 2000;

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		Demo object1 = null;

		// Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (Demo)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized ");
			System.out.println("--- Values after deserializtion ---");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			System.out.println("c = " + object1.c);   // 0 cause transient, value not saved
			System.out.println("d = " + object1.d);	  //value changed cause not saved -> it is static member
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
		
		//------ You can see that object & object1 print different hashCode. Because they are different object
		//------ HENCE DESERIALIZATION CREATES NEW OBJECT IN MEMORY
		System.out.println(object.hashCode()+" "+object1.hashCode());

	}
}

