package banco;

public class ContaPoupanša extends Conta{
	
	public ContaPoupanša(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void imprimirConta() {
	System.out.println("_*** Extrato Conta Poupanša ***_");
	super.Extrato();
	}
}
