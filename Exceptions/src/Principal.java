
public class Principal {

	public static void main(String[] args) throws Exception {

		c(100); // try/catch
		 e();
		System.out.println("\n \nNow with throws");
		
		a(100); // throws
		
		System.out.println("Finishing main() execution");
	}

	public static void a(int i) throws Exception { //wait to the next called method, treat the error
		System.out.println("Running a()");
		b(100);
	}
	
	
	public static void b(int i) throws Exception{
		System.out.println("Running b()");
		throw new Exception("b() message"); //treat the error
	}
	
	public static void c(int i ) {
		try {
			b(100);
			d(100); // Will never be called, because there is an exception in b().
		} catch (Exception e) {
			System.out.println("Treating exception: " +e.getMessage());
		}
		System.out.println("Finishing c()");

	}
	
	public static void d(int i) {
		System.out.println("Finish d()");
	}
	
	public static int e() {
		try {
			d(100);
			return 0; //even with return, the finally will execute
		} catch (Exception e1) {
			System.out.println("Treating exception: " +e1.getMessage());
		}finally {
			System.out.println("Finally executed");
		}
		System.out.println("Finish e()");
		return 0;
	}
}
