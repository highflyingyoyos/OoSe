public class NumberTooSmallException extends Exception {
    public NumberTooSmallException(double number){
        System.out.println("Fehler, die Zahl " + number + " ist zu klein!");
    }
}
