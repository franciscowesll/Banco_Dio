package banco;

public class ContaCorrente extends Conta{
	private int numberOperacao;



	public int getNumberOperacao() {
		return numberOperacao;
	}
	@Override
	public void imprimirConta(){
		System.out.println("_*** Extrato Conta Corrente ***_");
		super.Extrato();
	}
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
		
}
