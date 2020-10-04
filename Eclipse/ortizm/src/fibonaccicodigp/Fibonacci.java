package fibonaccicodigp;

public class Fibonacci {

	public static void main(String args[])
    {
        int valor1=0;
        int valor2=1;
        int valor3=0;
        int x = 0;
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println("--------------");

        while (x<=5)
        {
            valor3 = valor1 + valor2;
            
            System.out.println(valor3);

            valor1 = valor2;
            valor2 = valor3;

            x++;
        }

    }
	
}
