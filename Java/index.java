import java.util.Scanner;

public class App{
	public static void main(String[] args){
		System.out.println("Hello word.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so.");
		int n = sc.nextInt();
		if(n % 2 == 0){
			System.out.print(n+"La so chan.");
		}else{
			System.out.print(n + "La so le.");
		}

	}
}
