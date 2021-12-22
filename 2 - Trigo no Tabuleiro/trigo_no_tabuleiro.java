import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
            long l = Double.valueOf(Math.pow(2, x)/12000).longValue();
			System.out.printf("%d kg\n", l);   //Complete o código aqui.
		}
		sc.close();
	}
}
