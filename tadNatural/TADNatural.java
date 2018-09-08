package tadNatural;

public class TADNatural {
	private int n;
	
	public TADNatural(int valor) {
		this.n=valor;
	}
	public int getN() {
		return n;
	}
	public void SetN(int valor) throws Exception {
		if (valor>0)
			this.n=valor;
			else throw new Exception("ERROR");
	}
	//Operaciones
	
	public int Cero() {
		return 0;
	}
	public int Asigna(int valor) throws Exception {
		if (valor>0)
		return valor;
		else throw new Exception("ERROR");
	}
	public int Sucesor(int valor) {
		return valor+1;
	}
	public boolean Escero(int valor) {
		return (valor==0);
	}
	public boolean Igual(int valor,int x) {
		return (valor==x);
	}
	public int Suma(int valor,int x) {
		return (valor+x);
	}
	public int Antecesor(int valor) throws Exception{
		if (valor!=0)
			return (valor-1);
		else throw new Exception("ERROR");
	}
	public int Diferencia(int valor,int x) throws Exception{
		if(valor-x>0)
			return valor-x;
		else throw new Exception("ERROR");
	}
	public int Producto(int valor,int x) {
		return valor*x;
	}
	public boolean Menor(int valor,int x) {
		return (valor>x);
	}
	public int DivisionEntera(int valor,int x) throws Exception{
		if (x==0)
			throw new Exception("Dividir entre cero");
		else return (valor/x);
	}
	public int Modulo(int valor,int x) throws Exception{
		if (x==0) 
			throw new Exception("ERROR");
		else return valor%x;
	}

}
