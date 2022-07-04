package anonymousClassesInJava;

interface Drawable{  
    void draw();  
}  

public class AnonymousClassExample {

    public static void main(String[] args) {  
        int width=10;  
  
        /*
         * Drawable implementation using anonymous class  
         * Here when we write:  new Type(){}
         * 
         * where Type can be an interface that anonymous class implements
         * OR a class that anonymous class extends
         */
        
        Drawable d = new Drawable(){ //Drawable is interface that anonymous class implements
            public void draw(){
            	System.out.println("Drawing "+width);
            }  
        };  
        d.draw();  
    }  

}
