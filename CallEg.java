package Uebungsblatt05;

class CallEg {
	/**
	 * Ausgaben:
	 * 
	 * Division in methodA:
	 * 
	 * java.lang.ArithmeticException: / by zero at
	 * Uebungsblatt05.CallEg.methodA(CallEg.java:7) at
	 * Uebungsblatt05.TestTrace.main(TestTrace.java:7)
	 * 
	 * Division in methodC:
	 * 
	 * java.lang.ArithmeticException: / by zero at
	 * Uebungsblatt05.CallEg.methodC(CallEg.java:27) at
	 * Uebungsblatt05.CallEg.methodB(CallEg.java:21) at
	 * Uebungsblatt05.CallEg.methodA(CallEg.java:17) at
	 * Uebungsblatt05.TestTrace.main(TestTrace.java:7)
	 * 
	 * Division überall:
	 * 
	 * java.lang.ArithmeticException: / by zero at
	 * Uebungsblatt05.CallEg.methodC(CallEg.java:56) at
	 * Uebungsblatt05.CallEg.methodB(CallEg.java:36) at
	 * Uebungsblatt05.CallEg.methodA(CallEg.java:24) at
	 * Uebungsblatt05.TestTrace.main(TestTrace.java:7)
	 * java.lang.ArithmeticException: / by zero at
	 * Uebungsblatt05.CallEg.methodB(CallEg.java:42) at
	 * Uebungsblatt05.CallEg.methodA(CallEg.java:24) at
	 * Uebungsblatt05.TestTrace.main(TestTrace.java:7)
	 * java.lang.ArithmeticException: / by zero at
	 * Uebungsblatt05.CallEg.methodA(CallEg.java:30) at
	 * Uebungsblatt05.TestTrace.main(TestTrace.java:7)
	 * 
	 */
	public void methodA() throws ArithmeticException {
		try {
			methodB();
		} catch (ArithmeticException err) {
			err.printStackTrace();

			int a = 2;
			int b = 0;
			int c = a / b;
		}
	}

	public void methodB() throws ArithmeticException {
		try {
			methodC();
		} catch (ArithmeticException err) {
			err.printStackTrace();

			int a = 2;
			int b = 0;
			int c = a / b;
		}
	}

	public void methodC() throws ArithmeticException {
		try {
			int a = 2;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException err) {
			err.printStackTrace();

			int a = 2;
			int b = 0;
			int c = a / b;

		}
	}
}