package calculadora;
import java.util.Scanner;
public class operaciones {
int a, b,t;
Scanner sc = new Scanner(System.in);
public void suma() {
	System.out.println("Introdujo la opcion de suma");
	System.out.println("introduzca el primer numero");
    a= sc.nextInt();
    System.out.println("introduzca el segundo numero");
    b = sc.nextInt();
    t=a+b;
    System.out.println("Suma = " + t);
}
public void resta() {
	System.out.println("Introdujo la opcion de resta");
	System.out.println("introduzca el primer numero");
    a= sc.nextInt();
    System.out.println("introduzca el segundo numero");
    b = sc.nextInt();
    t=a-b;
    System.out.println("resta = " + t);
}
public void mult() {
	System.out.println("Introdujo la opcion de Multiplicación");
	System.out.println("introduzca el primer numero");
    a= sc.nextInt();
    System.out.println("introduzca el segundo numero");
    b = sc.nextInt();
    t=a*b;
    System.out.println("multiplicacion = " + t);
}
public void div() {
	System.out.println("Introdujo la opcion de División");
	System.out.println("introduzca el primer numero");
    a= sc.nextInt();
    System.out.println("introduzca el segundo numero");
    b = sc.nextInt();
    t=a/b;
    System.out.println("Division = " + t);
}
}