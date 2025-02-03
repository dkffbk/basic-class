class Modifier {
	String defaultAccess = "Default"; //Same  Package

	public String publicAccess = "Public"; //Anywhere

	private String privateAccess = "Private"; //Within this class

	protected String protectedAccess = "Protected"; //Child class
}

class Access {
	public static void main(String[] args) {
		Modifier m = new Modifier();

		System.out.println(m.defaultAccess);
		System.out.println(m.publicAccess);
	}
}