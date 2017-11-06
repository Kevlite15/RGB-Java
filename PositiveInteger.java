package edu.albany.hw4.problem1;

public class PositiveInteger extends Semigroup<PositiveInteger>{
	private int pInt;

	//Constructor
	public PositiveInteger() {
		this(0);
	}
	
	public PositiveInteger(int pInt){
		if (pInt >= 0)
			this.pInt = pInt;
		else {
			throw new IllegalArgumentException();
		}
	}
	
	//Getter
	public int getInt() {
		return pInt;
	}

	//Operation Method
	@Override
	PositiveInteger operator(PositiveInteger Int) {
		// TODO Auto-generated method stub
		PositiveInteger nInt;
		int sum;
		
		sum = Int.getInt() + this.pInt;
		nInt = new PositiveInteger(sum);
		
		return nInt;
	}

}
