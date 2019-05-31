import java.security.spec.ECField;
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) throws NumberTooSmallException/*, Exception*/ {
        Scanner userEingabe = new Scanner(System.in);
        double userZahl = userEingabe.nextDouble();
        if(userZahl > 5)
            throw new NumberTooBigException(userZahl);

        if(userZahl < 5)
            //gibt unhandled exception, da Exception eine checked exception ist
            //verlangt try catch block oder throws
            throw new NumberTooSmallException(userZahl);
    }

    /*Unterschied checked und unchecked:
      checked: müssen auf jeden Fall im Code abgefangen werden durch throws
        oder try catch block, compiler verlangt, dass wenn diese Exceptions auftreten
        können, diese auf jeden Fall behandelt werden, egal was während der
        Laufzeit passiert, Bpws IOExceptions
      unchecked: treten erst während der Laufzeit auf, wie Error oder Runtime Exceptions
        werden von compiler nicht berücksichtigt
      */
}
