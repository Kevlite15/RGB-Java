package edu.albany.hw4.problem1;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	private int red, green, blue;
	
	//Constructor
	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	//Getter
	public int getRed() {
		return red;
	}
	public int getGreen() {
		return green;
	}
	public int getBlue() {
		return blue;
	}
	
	//Complement Method
	public RGBColor getComplement() {
		return new RGBColor(255 - red, 255 - green, 255 - blue);
	}
	
	//RGB Color Operator Method
	public RGBColor operator(RGBColor color) {
		
		RGBColor colorBlend;
		int red, green, blue;
		
		red = ((color.getRed() + this.red) / 2);
		green = ((color.getGreen() + this.green) / 2);
		blue = ((color.getBlue() + this.blue) / 2);
		
		colorBlend = new RGBColor(red, green, blue);
		
		return colorBlend;
	}
}