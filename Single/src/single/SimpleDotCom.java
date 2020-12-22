package single;

public class SimpleDotCom {
	int locationCells[];
	int numOfhits = 0;
	
	public void setLocationCells(int locs[]) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {//
		int guess = Integer.parseInt(stringGuess);//convert the String into an int
		String result = "miss";//make a variable to hold the result we'll return put miss as default
		
		
		for (int cell : locationCells) {//repeat with each cell with locationCells array
			if(guess == cell ) {
				result = "hit";
				numOfhits++;
				break;
			}//end if
		}//end for
		
		if(numOfhits == locationCells.length) {
			result = "kill";		
			}
		System.out.println(result);
		return result;
	}

}
