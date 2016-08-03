package session6.assignment1;

public class PrintSquare implements Printable {
	
	public void print(int num) {
		System.out.println("Square of the number ="+num*num);
	}

	public static void main(String[] args) {
		
		PrintSquare ps = new PrintSquare();
		ps.print(8);

	}

}
