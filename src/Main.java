
public class Main {
    // Class to perform addition
class Adder {
    public int add(int a, int b) {
        return a + b;
    }
}

// Class to perform subtraction
class Subtractor {
    public int subtract(int a, int b) {
        return a - b;
    }
}
    public static void main ( String [] args ) {
        Adder adder = new Adder () ;
        System . out . println ( adder . add (1 , 2) ) ;
        Subtractor subtractor = new Subtractor () ;
        System . out . println ( subtractor . subtract (6 , 3) ) ;
    }
}
