//	Sun Certified Java Programmer
//	Chapter 4, P304_2
//  Operators

class AssignmentOps {
    public static void main(String[] args) {
        int sizeOfYard = 10;
        int numOfPets = 3;
        String status = (numOfPets < 4) ? "Pet count OK"
                : (sizeOfYard > 8) ? "Pet limit on the edge"
                : "too many pets";
        System.out.println("Pet status is " + status);
    }
}