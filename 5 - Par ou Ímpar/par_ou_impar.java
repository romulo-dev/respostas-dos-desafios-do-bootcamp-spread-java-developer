import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		int valor = leitor.nextInt();
    		
    		if(valor == 0){
    		  System.out.println("NULL");
    		}
    		else if(valor%2 == 0){
    		  if(valor > 0){
    		    System.out.println("EVEN POSITIVE");
    		  }
    		  else{
    		    System.out.println("EVEN NEGATIVE");
    		  }
    		}
    		else{
    		  if(valor > 0){
    		    System.out.println("ODD POSITIVE");
    		  }
    		  else{
    		    System.out.println("ODD NEGATIVE");
    		  }
    		}
    		
    		
    	}
	}
	
}