//	Sun Certified Java Programmer
//	Chapter 9; P754
//  Threads

class Operator extends Thread {
    Machine machine;        //  assume this gets initialized

    public void run() {
        while (true) {
            Shape shape = getShapeFromUser();
            MachineInstructions job = calculateNewInstructionsFor(shape);
            machine.addJob(job);
        }
    }
}
