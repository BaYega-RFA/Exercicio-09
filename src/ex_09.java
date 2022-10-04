import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = sc.nextDouble();
		
		fahrenheit = ( 9 * celsius + 160 ) / 5;

		System.out.print("\nA medida convertida é " + fahrenheit + "ºF\n");

        sc.close();

    }
}
