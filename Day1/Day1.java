import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
	private int floor;

	public Day1() {
		floor = 0;
	}

	public void setFloor(char character) {
		switch (character) {
		case '(':
			floor++;
			break;
		default:
			floor--;
			break;

		}

	}
	
	public int getFloor()
	{
		return floor;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("input.txt"));
		Day1 find = new Day1();
		String instructions = file.next();
		int firstBasement=0;
		boolean hasEntered = false;
		for(int i = 0; i < instructions.length(); i++)
		{
			find.setFloor(instructions.charAt(i));
			if(find.getFloor()==-1 && !(hasEntered))
			{
				firstBasement=i+1;
				hasEntered=true;
			}
		}
		System.out.println("Floor: " + find.getFloor());
		System.out.println("Position of first basement: "+ firstBasement);
	}
}
