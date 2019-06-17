package Uebungsblatt08;

public class Foo {
	public static <T> T bar(T x, T y) {
		return x;
	}

	public static void main(String[] args) {

		Object o;
		R r = new R();
		E e = new E();
		B b = new B();
		G g = new G();
		U u = new U();
		R[] x;
		E[] y;
		
//		r = bar(r,b);   //akzeptiert, da r vom Typ R und b vom Typ B, wobei B direkt von R erbt
//		r = bar(b,r);   //akzeptiert, da s.o.
//		r = bar(e,g);   //akzeptiert, da e direkt von R erbt und g transitiv von R erbt
//		r = bar(b,g);	//akzeptiert, sa s.o. (nur mit b anstelle von e)
//		e = bar(r,b);   //akzeptiert nicht, da r und b nicht von Typ E sind und nicht von diesem erben
//		u = bar(u,r);   //akzeptiert nicht, da r nicht von Typ U ist und auch nicht von U erben
//		o = bar(e,u);   //akzeptiert, da e und u Unterklassen von Object sind
//		b = bar(e,g);   //akzeptiert nicht, da e weder vom Typ B ist, noch von diesem erbt
//		x = bar(new E[2], new B[4]);		//akzeptiert, da E und B beides Unterklassen von R
//		y = bar(new E[4], new B[11]);		// akzeptiert nicht, da B keine Unteklasse von E	
//		o = bar(new G[8], new U[5]);		//akzeptiert, da G und U Unterklassen von Object
		
	}
}
