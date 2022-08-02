package abstraction;

public class MachineMain {

	public static void main(String[] args) {
		Juicer j1 = new Juicer();
		j1.crush();
		j1.rotate();
		j1.filter();
		
		Machine m = new Juicer();
		m.crush();
		m.rotate();
		

	}

}
