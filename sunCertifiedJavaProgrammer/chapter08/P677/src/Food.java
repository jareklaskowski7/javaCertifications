//	Sun Certified Java Programmer
//	Chapter 8; P677
//  Inner Classes

class Food {
    Cookable c = new Cookable() {
    public void cook() {
        System.out.println("anonymous cookable implementer");
    }
  };
}
