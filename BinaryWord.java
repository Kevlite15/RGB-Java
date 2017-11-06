package edu.albany.hw4.problem1;
import java.util.BitSet;


public class BinaryWord implements Complementable<Object>{
	
	//Container For Bits
	private BitSet bits;
	private int len;
	
	//Constructor
	public BinaryWord(String bits) {
		
		this.len = bits.length();
		this.bits = new BitSet(len);
		
		//For loop to iterate though the string
		for (int i = 0; i < len; i++) {
			//Sets the 1's bits
			if (bits.charAt(i) == '1') 
				this.bits.set(i); 
		}
	}
	//Complement Method
	public BinaryWord getComplement() {
		// Container for Complement Bits
		BitSet cBits; 
		BinaryWord comp;
		
		cBits = new BitSet(len);
		cBits.or(bits); 
		cBits.flip(0, len);
		
		comp = new BinaryWord(BitSetToString(cBits));
		
		return comp;	
	}
	
	public String toString() {
		return BitSetToString(bits);
	}
	
	//Method to help display the bit-strings
	private String BitSetToString(BitSet bits) {
		String string = "";
		//For loop to iterate though the string
		for (int i = 0; i < len; i++) {
			if (bits.get(i)) 
				string += "1";
			else { 
				string += "0"; 
			}
		}
		return string;
	}	
	
}
