//	Sun Certified Java Programmer
//	Chapter 7, 543_2
//  Generics and Collections

class Bob {
    int shoeSize;
    String nickName;
    Bob(String nickName, int shoeSize) {
        this.shoeSize = shoeSize;
        this.nickName = nickName;
    }
    public String toString() {
        return ("I am a Bob, but you can call me " + nickName +
                ".  My shoe size is " + shoeSize);
    }
}
