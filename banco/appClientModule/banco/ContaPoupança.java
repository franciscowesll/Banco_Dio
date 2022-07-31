package banco;

public class ContaPoupança extends Conta{
	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void imprimirConta() {
	System.out.println("_*** Extrato Conta Poupança ***_");
	super.Extrato();
	}
}
