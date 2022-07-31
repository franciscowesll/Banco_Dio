package banco;

public class Main {
	public static void main(String args[]) {

		Cliente Carlos = new Cliente();
		Carlos.setCpf(1234567890);
		Carlos.setname("Carlos de Andrade Coelho");
		
		
		
		Conta cc = new ContaCorrente(Carlos);
		Conta cp = new ContaPoupança(Carlos);
		
		cc.depositar(400);
		
		cc.transferir(200, cp);
		cc.imprimirConta();
		cp.imprimirConta();
		
	}
}
