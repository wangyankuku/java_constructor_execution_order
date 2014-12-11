package polymorphism;

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Lettuce l = new Lettuce();
    private Cheese c = new Cheese();
    
    public Sandwich() {
	    System.out.println("Sandwich()");
    }
    
    public static void main(String[] args) {
	    Sandwich s = new Sandwich();
    }
}
