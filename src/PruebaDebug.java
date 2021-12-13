
public class PruebaDebug {

	public static int calcFactorial(int n) {
		
		for(int i=n-1;i>0;i--) {
			n=n*i;
		}
		return n;
	}
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Introduce un numero: ");
		num=Console.readInt();
		
		num=calcFactorial(num);
		System.out.println(num);

	}
}
