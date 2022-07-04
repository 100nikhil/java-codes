package javaHot;

//static methods can't be overrided

class Ancestor{
	public static void play() {
		System.out.println("Lets play!");
	}
}

public class MethodHiding extends Ancestor{
	
	public static void play() {
		System.out.println("Don't play!");
	}
	
	public static void main(String[] args) {
		
		Ancestor m1 = new MethodHiding();  //runtime polymorphism don't take place, method hiding occurs
		m1.play();
		
		MethodHiding m2 = new MethodHiding();
		m2.play();
		
		Ancestor.play();
	}

}
