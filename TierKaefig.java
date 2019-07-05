public class TierKaefig<E> {
    private E insasse;
    public void setInsasse(E x){
        insasse= x;
    }
    public E getInsasse(){
        return insasse;
    }

    public static void main(String argv[]){
    
        //Vererbungsbeziehungen können nicht auf generische Typen übertragen werden
        //Subtyping nicht erlaubt
        //TierKaefig<Tier> kaefig = new TierKaefig<Katze>(); //geht nicht
        
        //Beispiel für Subtyping mit Generics mit Wildcards:
        TierKaefig<Katze> kaefig1 = new TierKaefig<>();
        TierKaefig<? extends Katze> kaefig2 = kaefig1;
        TierKaefig<? extends Tier> kaefig3 = kaefig2;
        

        //TierKaefig<Hund> kaefig = new TierKaefig<Tier>(); //geht nicht
        
        //es dürfen keine Methoden aufgerufen werden, die den Typparameter als Methodenparameter enthalten, da Compiler nicht weiß, was in den Kaefig darf (schreiben geht nicht, aber lesen würde gehen (mit getInsasse()))
        //TierKaefig<?> kaefig = new TierKaefig<Katze>();
        //kaefig.setInsasse(new Katze()); //geht nicht

        //TierKaefig kaefig = new TierKaefig();
        //kaefig.setInsasse(new Hund()); //geht mit Warnung
    }
}
//Typprüfung bereits zur compilezeit (Generics existieren auch nur zur CompileZeit)
//verbessert lesbarkeit und robustheit von Programmen

//Wildcards: <?> steht für einen unbekannten Typ (<?> entspricht <? extends Object>)
