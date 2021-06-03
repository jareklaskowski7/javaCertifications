//	Sun Certified Java Programmer
//	Chapter 3, P184
//  Assignments

class Dog {
    Collar c;       //  instance variable
    String name;    //  instance variable

    public static void main(String[] args) {
        Dog d;                    //  local variable: d
        d = new Dog();
        d.go(d);
        System.out.println(d);
        System.out.println(d.c);
        System.out.println(d.name);
    }

    void go(Dog dog)              //  local variable: dog
    {
        c = new Collar();
        dog.setName("Aiko");
    }

    void setName(String dogName)  //  local var: dogName
    {
        name = dogName;
        //  do more stuff
    }
}
