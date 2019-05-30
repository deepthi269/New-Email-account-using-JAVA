
public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John","Smith");
		em1.changepassword("abcd");
		System.out.println(em1.getpassowrd());
		
		System.out.println("the Information is\n" +em1.displayinfo());

	}

}
