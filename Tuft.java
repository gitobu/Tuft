public class Tuft {
	private String firstName;
	private String lastName;
	private String game;
	private int blocks;

	
	public void showName(){
		System.out.println(firstName + ' ' + lastName + " made " + blocks + " blocks at the " + game + " game!");
		
	}
	
	public static void main(String[] args) {
		Tuft hj = new Tuft();
		hj.firstName = "Nick";
		hj.lastName = "Hardwick";
		hj.game = "Denver";
		hj.blocks = 3;
		hj.showName();
	
	}

}
