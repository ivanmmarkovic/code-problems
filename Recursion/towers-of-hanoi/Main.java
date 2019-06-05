public class Main {

	public static void main(String[] args) {
		
		towers(5, "start", "spare", "end");
		
	}
	
	public static void printMove(String start, String end) {
		System.out.println("Moving from " + start + " to " + end);
	}
	
	public static void towers(int number, String start, String spare, String end) {
		if(number == 1)
			printMove(start, end);
		else {
			towers(number - 1, start, end, spare);
			towers(1, start, spare, end);
			towers(number - 1, spare, start, end);
		}
	}

}
