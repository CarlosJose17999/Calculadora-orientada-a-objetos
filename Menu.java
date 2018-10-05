package calculadora;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	operaciones proceso= new operaciones();
	operaciones proceso2= new operaciones();
	operaciones proceso3= new operaciones();
	operaciones proceso4= new operaciones();
	int op;
	Scanner sc = new Scanner(System.in);
	 System.out.println("introduzca la opcion");
     op= sc.nextInt();
     switch (op){
     case(1): proceso.suma();
     break;
     case(2): proceso2.resta();
     break;
     case(3): proceso3.mult();
     break;
     case(4):proceso4.div();
     break;
     }
	sc.close();
	}

}