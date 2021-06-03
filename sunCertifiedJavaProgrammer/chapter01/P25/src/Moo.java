//	Sun Certified Java Programmer
//	Chapter 1, P25
//  Declarations and Access Control

class Moo {
	public void useAZoo() {
		Zoo z = new Zoo();
		// If the preceding line compiles Moo has access to the Zoo class
		// But...does it have access to the coolMethod()?
		System.out.println("A Zoo says, " + z.coolMethod());
		// The preceding line works because Moo can access the public method
	}
}
