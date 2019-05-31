import java.io.IOException;
public class Maincl {
    public static void main(String[] args) throws IOException {
        Hamburger c = new Hamburger();
        c.eat();
    }
}
//a) funktioniert, da a) gar keine Exception wirft
//b) Fehler, da Exception Oberklasse von der checked Exception IOException ist
//c) geht, da hier die Funktion überladen wird, es findet keine Überschreibung statt
//d) geht, da FileNotFoundException eine Unterklasse von IOException ist
//e) geht, da RuntimeException eine unchecked exception ist

/*
    • exceptions beim Erben bzw. Überschreiben:
        ◦ eine überschreibende methode kann beliebige unchecked exception werfen, egal, ob die überschriebene
            methode diese wirft oder nicht (werfen = “throws”)
        ◦ die überschreibende methode darf keine checked exceptions werfen, die neu oder breiter sind als
            in der überschriebenen Methode, darf auch keine werfen
 */