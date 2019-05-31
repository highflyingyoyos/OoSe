public class NumberTooBigException extends RuntimeException {

    public NumberTooBigException(double number){
        System.out.println("Fehler: die Zahl " + number +
                " ist zu groß!");
    }
}
