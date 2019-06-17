package Uebungsblatt08;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
	}
	
	public Main() {
		aufgabe3();
		
	}

	public void aufgabe1() {
		// TierKaefig<Tier> kaefig = new TierKaefig<Katze>(); 		//nicht kompilierbar, da Katze Unterklasse von Tier
		// TierKaefig<Hund> kaefig = new TierKaefig<Tier>(); 		//nicht kompilierbar, da Hund eine Einschränkung von Tier wäre

		
		// TierKaefig<?> kaefig = new TierKaefig<Katze>(); 			//in Eclipse nicht kompilierbar ("The method setInsasse(capture#1-of ?) in the type TierKaefig<capture#1-of ?> is not applicable for the arguments (Katze)") 
	    // kaefig.setInsasse(new Katze()); 							//expected: kompilierbar, Problem: Wildcard abuse, compiler erwartet hier deklarierten Typ, nicht initialisierten
		
        // TierKaefig kaefig = new TierKaefig();					//nicht kompilierbar wegen Typsicherheit
        // kaefig.setInsasse(new Hund());
	}

	public void aufgabe3() {
		Stack<String> stack = new Stack<String>();
		stack.push("Apfel");
		stack.print();
		stack.push("Orange");
		stack.print();
		stack.pop();
		stack.print();
		stack.push("Erdbeere");
		stack.print();
		stack.push("Kiwi");
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		
		
		
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(1);
		stack1.print();
		stack1.push(2);
		stack1.print();
		stack1.pop();
		stack1.print();
		stack1.push(3);
		stack1.print();
		stack1.push(4);
		stack1.print();
		stack1.pop();
		stack1.print();
		stack1.pop();
		stack1.print();
		stack1.pop();
		stack1.print();
		stack1.pop();
		stack1.print();
	}
	
}
