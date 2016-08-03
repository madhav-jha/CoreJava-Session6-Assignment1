package session6.assignment1;

public class PrintNumber implements Printable {
	
	public void print(int num) {
		System.out.println("Number ="+num);
	}
	
	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		pn.print(5);
	}

}
