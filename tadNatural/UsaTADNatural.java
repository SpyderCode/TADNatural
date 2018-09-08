package tadNatural;
import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class UsaTADNatural {

	public static void main(String[] args) throws Exception {
		TADNatural n=new TADNatural(6);
		
		//Axiomas
		System.out.println("Cero "+n.Cero());
		System.out.println("0==0? "+n.Escero(n.Cero()));
		System.out.println("n==0? "+n.Escero(n.Sucesor(n.getN())));
		System.out.println("Suma 0+n "+n.Suma(n.Cero(), n.getN()));
		System.out.println("suma succ(x),6==succ(suma(x,y)) "+n.Igual(n.Suma(n.Sucesor(n.getN()), 6),/*==*/ n.Sucesor(n.Suma(n.getN(), 6))));
		System.out.println("Succ(x)==suma(x,1) "+n.Igual(n.Sucesor(n.getN()), n.Suma(n.getN(), 1)));
		System.out.print("Igual(x,0)=If escero(x) then true else false: "+n.Igual(n.getN(), n.Cero()));
		if (n.Escero(n.getN())) {
			System.out.println(" True");
		} else System.out.println(" False");
		
		System.out.println("Igual(0,succ(x))=false "+n.Igual(n.Cero(), n.Sucesor(n.getN())));
		System.out.println("Igual(succ(x),succ(y))=Igual(x,y) "+n.Igual(n.Sucesor(n.getN()), 8)+"=="+n.Igual(n.getN(), 8));
	}

}
