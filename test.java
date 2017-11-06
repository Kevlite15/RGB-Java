package edu.albany.hw4.problem1;
import java.util.ArrayList;
import java.util.Collection;


public class test {

	public static void main(String[] args) {

		PositiveInteger pInt1, pInt2, pInt3, sum;
		int num1, num2, num3;
		RGBColor color1, color2, color3, colorMix;
		int red1, red2, red3, green1, green2, green3, blue1, blue2, blue3;
		
		Collection <RGBColor> colorList = new ArrayList <RGBColor>();
		Collection <PositiveInteger> intList = new ArrayList <PositiveInteger>();
		
		BinaryWord s = new BinaryWord ("0001000");
		System.out.println(s);
		s = s.getComplement();
		System.out.println(s);
		
		num1 = 2;
		num2 = 5;
		num3 = 7;
			
		pInt1 = new PositiveInteger(num1);
		pInt2 = new PositiveInteger(num2);
		pInt3 = new PositiveInteger(num3);
		
		intList.add(pInt1);
		intList.add(pInt2);
		intList.add(pInt3);
		sum = PositiveInteger.combine(intList);
			
		System.out.printf("\nSum: %d\n", sum.getInt());
		
		
		red1 = 120;
		green1 = 115;
		blue1 = 110;
		
		red2 = 200;
		green2 = 255;
		blue2 = 1;
			
		color1 = new RGBColor(red1, green1, blue1);
		color2 = new RGBColor(red2, green2, blue2);
		
		color3 = color1.operator(color2);
			
		System.out.printf("\nRGB: %d %d %d", color3.getRed(), color3.getGreen(), color3.getBlue());
			
		red3 = 120;
		green3 = 180;
		blue3 = 130;
		
		color3 = new RGBColor(red3, green3, blue3);
		colorList.add(color1);
		colorList.add(color2);
		colorList.add(color3);
		colorMix = RGBColor.combine(colorList);
			
		System.out.printf("\nCombination of the Colors 1, 2, and 3 RGB: %d %d %d\n", colorMix.getRed(), colorMix.getGreen(), colorMix.getBlue());
			
		
		
			
			
		System.exit(0);
	}

}
