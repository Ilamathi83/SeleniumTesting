package day11;

public class EncapsulationMain {

	public static void main(String[] args) {
	Encapsulation en=new Encapsulation();
	
	en.setProject("ACC");
	System.out.println(en.getProject());
	
	en.setEID(322);
	System.out.println(en.getEID());
	
	en.setTeam('A');
	System.out.println(en.getTeam());
	
	en.setName("Mathi");
	System.out.println(en.getName());

	}

}
