
package Harshad_iAssignment_4_Inheritance_Part_A_V1;

public class Rectangle 
{

	// attributes
	private int length;
	private int width;

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	// Get And Set Methods
	public void setLength(int l) {
		length = l;
	}

	public void setWidth(int w) {
		width = w;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	private int computePerimeter() {
		return 2 * (width + length);
	}

	private int computeArea() {
		return width * length;
	}

	public void draw(String drawCharacter) {
		System.out.println("======================Draw=====================  \n\n");
		
		for (int i = 0; i < length; i++) {
	        System.out.print(drawCharacter);
	        for (int k = 1; k < width - 1; k++) {
	            if (i == 0 || i == (length - 1)) {
	                System.out.print(drawCharacter);
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(drawCharacter);
	        System.out.print("\n");
	    }
		
		System.out.println("\n\n ======================Draw===================== \n\n");
		
	}
	
	public void test(String drawCharacter) {
		draw(drawCharacter);
		
		System.out.println("Area --> " + this.computeArea());
		System.out.println("Perimeter --> " + this.computePerimeter());
	}
}
