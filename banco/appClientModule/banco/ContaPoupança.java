package banco;

public class ContaPoupan�a extends Conta{
	
	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void imprimirConta() {
	System.out.println("_*** Extrato Conta Poupan�a ***_");
	super.Extrato();
	}
}
