
public class InterfaceDemo {

	public static void main(String[] args) {
		Icalculator calc= new Icalculator() {
			
			@Override
			public void substraction() {
				System.out.println(4-5);
			}
			
			@Override
			public void addition() {
				System.out.println(4+5);
				System.out.println("github upload");			}
		};
		
calc.addition();
calc.substraction();
	}

}
